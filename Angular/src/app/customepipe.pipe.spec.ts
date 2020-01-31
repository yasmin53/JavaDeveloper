import { CustomepipePipe } from './customepipe.pipe';

function greetings() {
  return 'Good Morning';
}
 
describe('greeting message',() =>{
let expected ='';
beforeEach(() => {
  expected ='Good Morning';
});

afterEach(() => {
  expected = '';
});

it('My GreetingMessage',() =>{
  expect(greetings()).toEqual(expected);

});


it('My GoodBye',() =>{
  expect(greetings()).toEqual(expected);

});




});



















  // it('create an instance', () => {
  //   const pipe = new CustomepipePipe();
  //   expect(pipe).toBeTruthy();
  // });

