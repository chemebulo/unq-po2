package ar.edu.unq.po2.tp8.shape_shifter;

import java.util.ArrayList;
import java.util.List;


public class ShapeShifterNode implements IShapeShifter {
	private List<IShapeShifter> children;
	
	public ShapeShifterNode() {
		this.children = new ArrayList<IShapeShifter>();
	}
	
    public void add(IShapeShifter shapeShifter) {
        children.add(shapeShifter);
    }
	
	@Override
	public IShapeShifter compose(IShapeShifter shapeShifter) {
		ShapeShifterNode composite = new ShapeShifterNode();
        composite.add(this);
        composite.add(shapeShifter);
        return composite;
	}

	@Override
	public int deepest() {
        int max = 0;
        
        for (IShapeShifter s : children) {
            max = Math.max(max, s.deepest());
        }
        
        return max + 1;
	}

	@Override
	public IShapeShifter flat() {
        List<IShapeShifter> leaves = this.getLeaves();

        if (leaves.size() == children.size() && deepest() <= 1) {
            return this;
        }

        ShapeShifterNode flatComposite = new ShapeShifterNode();
        
        for (IShapeShifter leaf : leaves) {
            flatComposite.add(leaf);
        }
        
        return flatComposite;
	}
	
    private List<IShapeShifter> getLeaves() {
        List<IShapeShifter> leaves = new ArrayList<>();
        
        for (IShapeShifter s : children) {
            if (s instanceof ShapeShifterLeaf) {
                leaves.add(s);
            } else {
                leaves.addAll(((ShapeShifterNode) s).getLeaves());
            }
        }
        
        return leaves;
    }

	@Override
	public List<Integer> values() {
        List<Integer> values = new ArrayList<>();
        
        for (IShapeShifter s : children) {
        	values.addAll(s.values());
        }
        
        return values;
	}
}