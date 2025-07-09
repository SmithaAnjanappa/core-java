//issuing laptop 
//laptop is issued by company.issue(laptop)
//manager.inform(laptop)
//team.process(laptop)
//management.permission(laptop)
//employee.issuelaptop(laptop)
//runner


class Company{
public static void issue(String laptop){
System.out.println("issue started");

System.out.println("issue ended ");
Manager.inform(laptop);
Team.process(laptop);
Management.permission(laptop);
Employee.issueLaptop(laptop);

return;
}
}