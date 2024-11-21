const copy_email = (email) => {
    navigator.clipboard.writeText(email).then(() => {
        showAlert("Copied to clipboard");
    }).catch(err => {
        showAlert("복사 실패");
    });
}

const showAlert = (message) => {
    const alertBox = document.createElement('div');
    alertBox.className = 'alert-box';
    alertBox.textContent = message;

    document.body.appendChild(alertBox);

    // 애니메이션 시작
    requestAnimationFrame(() => {
        alertBox.classList.add('show');
    });

    // 1초 후 제거
    setTimeout(() => {
        alertBox.classList.remove('show');
        setTimeout(() => document.body.removeChild(alertBox), 300);
    }, 1000);
}

async function generatePDF() {
    showAlert("Print to PDF");
    const { jsPDF } = window.jspdf; // jsPDF 라이브러리 로드
    const element = document.documentElement; // 캡처할 대상은 <body>

    try {
        // 요소의 전체 높이 계산
        const bodyHeight = element.scrollHeight; // 스크롤 높이 포함
        const bodyWidth = element.offsetWidth; // 요소의 실제 너비

        // html-to-image로 JPEG 생성
        const asJPEG = await htmlToImage.toJpeg(element, {
            quality: 1, // JPEG 품질
            backgroundColor: '#ffffff', // 배경색 설정
            pixelRatio: 2, // 고해상도 캡처
            width: bodyWidth, // 요소 너비
            height: bodyHeight, // 요소 전체 높이
            useCORS: true, // 외부 리소스 처리
        });

        // Step 3: PDF 생성
        const pdf = new jsPDF({
            orientation: bodyWidth > bodyHeight ? 'landscape' : 'portrait', // 가로/세로 방향 자동 설정
            unit: 'px',
            format: [bodyWidth, bodyHeight], // PDF 크기
        });

        // Step 4: PDF에 JPEG 이미지 추가
        pdf.addImage(asJPEG, 'JPEG', 0, 0, bodyWidth, bodyHeight);

        // Step 5: PDF 저장
        pdf.save('이창의 resume.pdf');
    } catch (error) {
        console.error('Error capturing body as PDF:', error);
    }
}



// 모달 HTML 파일을 동적으로 로드
const modalContainer = document.getElementById('modalContainer');

fetch('component/modal.html')
    .then(response => response.text())
    .then(data => {
        modalContainer.innerHTML = data;

        // 동적으로 로드된 모달 엘리먼트 참조
        const modalOverlay = document.getElementById('modalOverlay');
        const modalContent = modalOverlay.querySelector('.modal'); // 이미지가 들어갈 영역

        // 모달 열기 함수
        window.openModal = (imageUrl) => {
            if (modalContent) {
                modalContent.innerHTML = `<img src="${imageUrl}" alt="Not Found" style="max-width: 100%; height: auto;">`;
            }
            modalOverlay.style.display = 'flex';
        };



        // 모달 열기 함수
        window.openPageModal = (url) => {
            if (modalContent) {
                modalContent.innerHTML = `<a style="text-decoration: none; color: inherit" href="${url}" target="_blank">Open Notion Page</a>`;
            }
            modalOverlay.style.display = 'flex';
        };

        // 모달 닫기 함수
        window.closeModal = () => {
            modalOverlay.style.display = 'none';
        };

        // 모달 바깥 클릭 시 닫기
        modalOverlay.addEventListener('click', (event) => {
            if (event.target === modalOverlay) {
                closeModal();
            }
        });
    })
    .catch(error => console.error('Error loading modal:', error));


// 모바일 환경 감지
function isMobile() {
    return /Mobi|Android|iPhone|iPad/i.test(navigator.userAgent);
}

// 메시지 표시
function showMessage() {
    const messageElement = document.getElementById('mobileMessage');
    messageElement.style.display = 'block';

    // 3초 후 메시지 숨기기
    setTimeout(() => {
        messageElement.style.display = 'none';
    }, 3000);
}

// 메시지를 1회만 표시하기 위한 로직
if (isMobile()) {
    showMessage();
}