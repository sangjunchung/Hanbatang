document.addEventListener("DOMContentLoaded", function() {
	// 페이지 로딩 시 등심 데이터를 불러와서 출력합니다.
	fetchProducts('등심');

	const tabs = document.querySelectorAll('.goods_kinds');
	tabs.forEach(tab => {
		tab.addEventListener('click', function() {
			const target = this.getAttribute('data-target');
			fetchProducts(target);

			// Remove 'active' class from all tabs
			tabs.forEach(tab => tab.classList.remove('active'));

			// Add 'active' class to the clicked tab
			this.classList.add('active');
		});
	});

	function fetchProducts(goods_kinds) {
		fetch('/api/product/' + goods_kinds)
			.then(response => response.json())
			.then(data => {
				const tabContent = document.querySelector('.tab-content');
				tabContent.innerHTML = ''; // 기존 내용 초기화

				data.forEach(product => {
					tabContent.innerHTML += `
	                            <div class="product">
	                                <h2>${product.goods_name}</h2>
	                                <a href="/productPage/${product.goods_no}">
	                                <img src="${product.img_path}" alt="${product.goods_kinds}">
	                                <h4>상품 설명</h4><p>${product.goods_text}</p>
	                                <p>가격: ${product.goods_price}원</p>
	                                </a>
	                            </div>
	                        `;
				});
			})
			.catch(error => console.error('문제 발생:', error));
	}
});