package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */

public class Main {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        final int FIGURES_COUNT = 6;
        final int HALF = FIGURES_COUNT / 2;

        Figure[] figures = new Figure[FIGURES_COUNT];

        for (int i = 0; i < HALF; i++) {
            figures[i] = supplier.getRandomFigure();
        }
        for (int i = 0; i < FIGURES_COUNT; i++) {
            figures[i] = supplier.getDefaultFigure();
        }
        for (Figure f : figures) {
            f.draw();
        }
    }

}
