 public string BuyerName { get; set; }
    
   public string PropertyTypeName { get; set; }




  <div>
                        <input type="number" [(ngModel)]="emiPlan" (input)="multiplyValues()">
                        <input type="number" [(ngModel)]="termInMonths" (input)="multiplyValues()">
                        <p>Result: {{ result }}</p>
                      </div>   
 emiPlan: number = 0;
  termInMonths: number = 0;
  result: number = 0;

  multiplyValues() {
    this.result = this.emiPlan * this.termInMonths;
  }
