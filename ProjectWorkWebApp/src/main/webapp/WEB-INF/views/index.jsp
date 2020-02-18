<%@include file="header.jsp" %>



<div class="row">
	<h5 class="main text-center w-100">
		<strong>Welcome to E-Commerce Shopping</strong>
	</h5>
</div>

<div class="row">

	<!-- Inside For Loop -->
	<div class="col-sm-4 col-md-5 m-3">
		<div class="card my-card border border-curved text-center">
			<div class="card-body">
				<h4 class="card-title card-text">Chocolate</h4>
				<p class="mt-2"><i class="fa fa-star fa-2x text-warning"></i></p>
				<p><i class="fa fa-inr"></i> <span class="h5 font-italic ">1000</span><i class="ml-5">x2</i></p>
				<p><img src="resources/assets/images/chocolate.png" class="img-responsive-small" /></p>
				
				<button class="btn btn-sm btn-primary m-1">View</button>
				<button class="btn btn-sm btn-secondary m-1">Add to Cart</button>
				<button class="btn btn-sm btn-warning m-1">Add to Wishlist</button>
			</div>
		</div>
	</div>

</div>

<%@include file="footer.jsp" %>