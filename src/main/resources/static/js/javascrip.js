

$(document).ready(function() {
	$("#userId").on("input", function() {
		const 유저아이디 = $(this).val();
		const regularEx = /^[a-zA-Z0-9]{6,12}$/;

		if (regularEx.test(유저아이디)) {
			$("#msg1").text("아이디 형식이 올바릅니다.").css("color", "green");
		} else {
			$("#msg1").text("아이디 형식이 올바르지않습니다.").css("color", "red");
		}
	});
});

$(document).ready(function() {
	$("#userPw").on("input", function() {
		const 유저비밀번호 = $(this).val();
		const regularEx = /^[a-zA-Z0-9\W_]{8,15}$/;

		if (regularEx.test(유저비밀번호)) {
			$("#msg2").text("비밀번호 형식이 올바릅니다.").css("color", "green");
		} else {
			$("#msg2").text("비밀번호 형식이 올바르지 않습니다.").css("color", "red");
		}
	});
});

$(document).ready(function() {
	$("#nickName").on("input", function() {
		const 유저닉네임 = $(this).val();
		const regularEx = /^[a-zA-Z\d가-힇]{2,12}$/;

		if (regularEx.test(유저닉네임)) {
			$("#msg3").text("닉네임 형식이 올바릅니다.").css("color", "green");
		} else {
			$("#msg3").text("닉네임 형식이 올바르지 않습니다.").css("color", "red");
		}
	});
});

$(document).ready(function() {
	$("#userEmail").on("input", function() {
		const 유저이메일 = $(this).val();
		const regularEx = /^[a-zA-Z\d._%+-]+@[a-zA-Z\d.-]+\.[a-zA-Z]{2,}$/;

		if (regularEx.test(유저이메일)) {
			$("#msg4").text("이메일 형식이 올바릅니다.").css("color", "green");
		} else {
			$("#msg4").text("이메일 형식이 올바르지 않습니다.").css("color", "red");
		}
	});
});

$(document).ready(function() {
	$("#userName").on("input", function() {
		const 유저이름 = $(this).val();
		const regularEx = /^[가-힇]{2,5}$/;

		if (regularEx.test(유저이름)) {
			$("#msg5").text("이름 형식이 올바릅니다.").css("color", "green");
		} else {
			$("#msg5").text("이름 형식이 올바르지않습니다.").css("color", "red");
		}
	});
});

$(document).ready(function() {
	$("#userSsn").on("input", function() {
		const 유저주민번호 = $(this).val();
		const regularEx = /^[0-9]{13}$/;

		if (regularEx.test(유저주민번호)) {
			$("#msg6").text("주민번호 형식이 올바릅니다.").css("color", "green");
		} else {
			$("#msg6").text("주민번호 형식이 올바르지않습니다.").css("color", "red");
		}
	});
});

$(document).ready(function() {
	$("#userPhone").on("input", function() {
		const 유저전화번호 = $(this).val();
		const regularEx = /^\d{3}\d{3,4}\d{4}$/;

		if (regularEx.test(유저전화번호)) {
			$("#msg7").text("전화번호 형식이 올바릅니다.").css("color", "green");
		} else {
			$("#msg7").text("전화번호 형식이 올바르지 않습니다.").css("color", "red");
		}
	});
});

function 비밀번호확인() {

}
