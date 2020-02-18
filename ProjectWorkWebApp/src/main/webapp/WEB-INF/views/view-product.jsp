<%@include file="header.jsp"%>

<div class="row">

	<div class="col-sm-5">

		<img src="resources/assets/images/chocolate.png" class="img-responsive" />

	</div>

	<div class="col-sm-6 res">

		<div class="row">
			<div class="col">
				<label class="h3" for="id">Name:</label>
			</div>
			<div class="col lead">Chocolate</div>
		</div>
		<hr>

		<div class="row">
			<div class="col">
				<label class="h3" for="id">Rating:</label>
			</div>
			<div class="col">
				<i class="fa fa-star fa-2x text-warning"></i>
			</div>
		</div>

		<hr>

		<div class="row">
			<div class="col">
				<label class="h3" for="id">Price:</label>
			</div>
			<div class="col">
				<i class="fa fa-inr"></i> <span class="h5 font-italic">1000</span>
			</div>
		</div>

		<hr>

		<div class="row">
			<div class="col">
				<label class="h3" for="id">Quantity:</label>
			</div>
			<div class="col h3">
				<i>2</i>
			</div>
		</div>

		<hr>

		<div class="row">
			<div class="col">
				<label class="h3" for="id">Specification:</label>
			</div>
		</div>

		<div class="row mt-2">
			<div class="col lead">Description</div>
		</div>


			<button class="btn btn-sm btn-secondary m-3 p-1 btn-block w-75">Add to Cart</button>

			<button class="btn btn-sm btn-warning m-3 p-1 btn-block w-75">Add to Wishlist</button>



	</div>


</div>



<%@include file="footer.jsp"%>