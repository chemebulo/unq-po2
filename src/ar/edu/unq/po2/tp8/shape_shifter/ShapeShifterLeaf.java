package ar.edu.unq.po2.tp8.shape_shifter;

import java.util.Collections;
import java.util.List;

public class ShapeShifterLeaf implements IShapeShifter {
	private int value;
	
	public ShapeShifterLeaf(int value) {
        this.value = value;
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
		return 0;
	}

	@Override
	public IShapeShifter flat() {
		return this;
	}

	@Override
	public List<Integer> values() {
		return Collections.singletonList(value);
	}
}