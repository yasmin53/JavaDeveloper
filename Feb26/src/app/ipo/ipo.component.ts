import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { IPOService } from '../ipo.service';
@Component({
  selector: 'app-ipo',
  templateUrl: './ipo.component.html',
  styleUrls: ['./ipo.component.css']
})
export class IpoComponent implements OnInit {

  registerIPO:FormGroup;

  constructor(private formBuilder:FormBuilder,private ipoService:IPOService) { }

  ngOnInit() {

    this.registerIPO=this.formBuilder.group({

      id:['', Validators.required],
     companyid: ['', Validators.required],
     currentprice:['', Validators.required],
     opendatetime:['', Validators.required]

  });


}
addIPO(){
  this.ipoService.saveIPO(this.registerIPO.value).subscribe(data =>
    {
      console.log('User Inserted Successfully'+data);
    });

}

onSubmit(){
  console.log(this.registerIPO.value);
}

}

