<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="col-4">
	<div class="login-card-light p-3 shadow-lg rounded">
		<div class="pt-3">
			<h2 class="text-danger">Sign In | Light</h2>
		</div>

		<form class="mt-5">
			<div class="form-group">
				<input type="email" class="form-control form-control-sm"
					placeholder="Email Id">
			</div>

			<div class="form-group">
				<input type="password" class="form-control form-control-sm"
					placeholder="Password">
			</div>

			<div class="form-group form-check">
				<input type="checkbox" class="form-check-input"
					id="rememberCheckBox"> <label
					class="form-check-label text-dark" for="rememberCheckBox">Remember
					me?</label>
			</div>

			<div class="mt-5">
				<button class="btn btn-sm btn-danger col">Login</button>
			</div>

			<div class="text-center mt-2">
				<a href="#">Forgot Password?</a>
			</div>

			<div class="mt-5">
				<p class="text-center">
					Don't have an account? <a href="#">Click here to register</a>
				</p>
			</div>
		</form>
	</div>
</div>