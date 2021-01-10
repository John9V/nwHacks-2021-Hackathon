package nwhacks.backend.cost;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

public class editableCost extends Cost {
    
    private boolean editable = false;
    private boolean deletable = false;

    public editableCost() {
        super();
        // TODO Auto-generated constructor stub
    }

    public editableCost(UUID costId, UUID projectId, Date date, BigDecimal amount, boolean inJournal) {
        super(costId, projectId, date, amount, inJournal);
        // TODO Auto-generated constructor stub
    }
    
    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public boolean isDeletable() {
        return deletable;
    }

    public void setDeletable(boolean deletable) {
        this.deletable = deletable;
    }

}
