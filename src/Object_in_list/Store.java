package Object_in_list;

public class Store {
//    public static void main(String[] args) {


        String storeType;
        int numberOfEmployees;
        String storeBrand;
        String storeName;
        int builtYear;

        public Store(String typeOfTheStore, int employeeQuantity, String nameOfStore, int yearBuilt){
                this.storeType = typeOfTheStore;
                this.numberOfEmployees = employeeQuantity;
                this.storeName = nameOfStore;
                this.builtYear = yearBuilt;
        }

        public void printStoreDetails(){
                System.out.println("Store name: " + this.storeName);
                System.out.println("Type of the Store: " + this.storeType);
                System.out.println("Number of Employees: " + this.numberOfEmployees);
                System.out.println("It was built in: " + this.builtYear);


        }
    }

