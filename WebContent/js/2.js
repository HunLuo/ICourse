
			$(function() {
				$('.title').ready(function() {
					var $ul = $(this).next('ul');
					$('dd').find('ul').hide();
				})
				$('#box1').ready(function() {

					$('#pla').hide();
					$('#pwa').hide();
					$('#pea').hide();
					$('#pra').hide();

				})

				$('.title').click(function() {
					var $ul = $(this).next('ul');
					$('dd').find('menuson').slideUp();
					if($ul.is(':visible')) {
						$(this).next('ul').slideUp();
					} else {
						$(this).next('ul').slideDown();
					}
				});
				$('.titl').click(function() {
					var $ul = $(this).next('ul');
					$('dd').find('menuson1').slideUp();
					if($ul.is(':visible')) {
						$(this).next('ul').slideUp();
					} else {
						$(this).next('ul').slideDown();
					}
				});

				$('#all').click(function() {
					$('#pra').hide();
					$('#pea').hide();
					$('#pwa').hide();
					$('#pla').show();
				});
				$('#asd').click(function() {
					$('#pra').hide();
					$('#pea').hide();
					$('#pla').hide();
					$('#pwa').show();
				});
				$('#aed').click(function() {
					$('#pra').hide();
					$('#pwa').hide();
					$('#pla').hide();
					$('#pea').show();
				});
				$('#ard').click(function() {
					$('#pea').hide();
					$('#pwa').hide();
					$('#pla').hide();
					$('#pra').show();
				});

			})
		