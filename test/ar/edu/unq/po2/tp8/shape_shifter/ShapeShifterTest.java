package ar.edu.unq.po2.tp8.shape_shifter;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShapeShifterTest {
    IShapeShifter a;
    IShapeShifter b;
    IShapeShifter c;
    IShapeShifter d;
    IShapeShifter e;
    IShapeShifter f;

    @BeforeEach
    void setUp() {
        a = new ShapeShifterLeaf(1);
        b = new ShapeShifterLeaf(2);
        c = a.compose(b);
        d = new ShapeShifterLeaf(3);
        e = d.compose(c);
        f = e.compose(c);
    }

    @Test
    void testComposeCreatesNewComposite() {
        IShapeShifter result = a.compose(b);
        assertTrue(result instanceof ShapeShifterNode);
        assertEquals(0, a.deepest());
        assertEquals(1, result.deepest());
    }

    @Test
    void testComposeIsSymmetricInStructure() {
        IShapeShifter ab = a.compose(b);
        IShapeShifter ba = b.compose(a);
        assertEquals(ab.values().size(), ba.values().size());
        assertTrue(ab.values().containsAll(ba.values()));
    }

    @Test
    void testDeepestLevels() {
        assertEquals(0, a.deepest(), "Hoja debería tener profundidad 0");
        assertEquals(1, c.deepest(), "a.compose(b) debería tener profundidad 1");
        assertEquals(2, e.deepest(), "d.compose(c) debería tener profundidad 2");
        assertEquals(3, f.deepest(), "f debería tener profundidad 3");
    }

    @Test
    void testValuesOnLeaf() {
        assertEquals(List.of(1), a.values());
    }

    @Test
    void testValuesOnComposite() {
        List<Integer> vals = e.values();
        assertTrue(vals.containsAll(List.of(1, 2, 3)));
        assertEquals(3, vals.size());
    }

    @Test
    void testValuesOnDeepComposite() {
        List<Integer> vals = f.values();
        assertTrue(vals.containsAll(List.of(1, 2, 3)));
        assertEquals(5, vals.size());
    }

    @Test
    void testFlatOnLeaf() {
        assertSame(a, a.flat(), "Una hoja ya está achatada");
    }

    @Test
    void testFlatReducesDepthToOne() {
        IShapeShifter flatF = f.flat();
        assertEquals(1, flatF.deepest(), "flat() debe dejar profundidad máxima 1");
    }

    @Test
    void testFlatContainsAllValues() {
        IShapeShifter flatF = f.flat();
        List<Integer> vals = flatF.values();
        assertTrue(vals.containsAll(f.values()), "flat() debe contener los mismos valores");
        assertEquals(f.values().size(), vals.size(), "flat() debe tener igual cantidad de valores");
    }
}