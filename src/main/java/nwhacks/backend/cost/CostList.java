package nwhacks.backend.cost;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.Conversation;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

import nwhacks.backend.employee.EditableEmployee;
import nwhacks.backend.employee.Employee;

//import nwhacks.backend.cost.EditableEmployee;
//import nwhacks.backend.cost.Employee;
//import nwhacks.backend.cost.EmployeeManager;

public class CostList implements Serializable {

    @Inject @Dependent private MaterialManager materialManager;
    @Inject @Dependent private WageManager wageManager;
    
    private List<EditableCost> list;
        
    @Inject Conversation conversation;
    
    public List<EditableCost> getList() {
        if(!conversation.isTransient()) {
            conversation.end();
        }
        conversation.begin();
        if (list == null) {
            refreshList();
        }
        return list;
    }

//    public List<EditableEmployee> refreshList() {
//        
//        MaterialCost[] materialCost = materialManager.getAll();
//        
////        WageCost wageCost[] = WageCostManager.getAll();
//        
//        MaterialList = new ArrayList<EditableCost>();
//        WageList = new ArrayList<EditableCost>();
//        
//        for (int i = 0; i < materialCost.length; i++) {
//            MaterialList.add(new EditableCost(materialCost[i]));
//        }
//
//        for (int i = materialCost.length; i < (materialCost.length + wageCost.length); i++) {
//            WageList.add(new EditableCost(wageCost[i]));
//        }
//        
//        System.out.println("running");
//        return list;
//    }
    
    public List<EditableCost> refreshList() {
        MaterialCost[] materialCosts = materialManager.getAll();
        WageCost wageCosts[] = wageManager.getAll();
        
        list = new ArrayList<EditableCost>();
        
//        for (int i = 0; i < materialCosts.length; i++) {
//            list.add(new EditableCost(materialCosts[i]));
//        }
//        for (int i = 0; i < (materialCosts.length + wageCosts.length); i++) {
//            list.add(new EditableCost(wageCosts[i]));
//        }
        
        System.out.println("running");
        return list;
    }
    
//    public Cost search() {
//        Cost c = materialManager.search(searchTerm);
//        System.out.println("employees search: " + c);
//        return c;
//    }

}
