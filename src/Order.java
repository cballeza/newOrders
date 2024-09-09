public class Order {
            private String customerName;
            private String time;
            private Sandwich sandwich;
            
            public Order(String customerName, String time, Sandwich sandwich) {
                
                this.customerName = customerName;
                this.time = time;
                this.sandwich = sandwich;
            }
            public String getName() {
                
                return customerName;
            }
            public String getTime() {
                
                return time;
            }
            public Sandwich getSandwich() {
                
                return sandwich;
            }
            public String getOrder() {
                
                String order = "";
                order = time +"\t"+ customerName +"\t"+ sandwich.getBread() +"\t"+ sandwich.getVeggies() +"\t"+ sandwich.getMeat() +"\t$"+ sandwich.getTotalPrice();
                return order;
            }
        }