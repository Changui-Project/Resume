

const copy_email = () =>{
    navigator.clipboard.writeText("rhljh7410@gmail.com").then(() => {
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



// PDF 생성 함수
async function generatePDF() {
    showAlert("Print to PDF")
    window.print()
}
