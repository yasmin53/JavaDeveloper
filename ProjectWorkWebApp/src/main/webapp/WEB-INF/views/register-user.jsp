<%@include file="header.jsp" %>



<h3 class="main text-center w-100">
            <strong>Register User</strong>
        </h3>
          <div class="form-group">
            <label for="uname">Username</label>
            <input type="text" class="form-control" id="uname" placeholder="Enter Username" name="uname">
          </div>

          <div class="form-group">
              <label for="password">Password</label>
              <input type="password" class="form-control" id="pwd" placeholder="Enter Password" name="pwd">
          </div>

          <div class="form-group">
              <label for="confirmpassword">Confirm Password</label>
              <input type="password" class="form-control" id="cpwd" placeholder="Confirm Password" name="cpwd">
          </div>
                    
          <button type="submit" class="btn btn-block btn-outline-success">Submit</button>


<%@include file="footer.jsp" %>