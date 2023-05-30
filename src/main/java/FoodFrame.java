import javax.inject.Inject;
import javax.inject.Named;
import javax.swing.*;


public class FoodFrame extends JFrame{
    private final JTextField getId;
    private final JTextField getSearched;

    @Inject
    public FoodFrame(FoodController controller,
                     @Named("chosenFoodName") JLabel nameOfFood,
                     @Named("ingredientsList") JLabel ingredients,
                     @Named("nutrientsList") JLabel nutrients,
                     @Named("totalsList") JLabel totals,
                     @Named("idsList") JLabel idsList) {

        setSize(1400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JPanel mainPanel = new JPanel();

        getId = new JTextField("534358");
        mainPanel.add(getId);

        JButton select = new JButton("Select");
        select.addActionListener(e -> controller.updateInfo(getId.getText()));
        mainPanel.add(select);
        mainPanel.add(nameOfFood);
        mainPanel.add(ingredients);
        mainPanel.add(nutrients);
        mainPanel.add(totals);

        getSearched = new JTextField("Cheddar Cheese");
        JButton selectSearched = new JButton("Select");
        selectSearched.addActionListener(e -> controller.updateSearchInfo(getSearched.getText()));
        mainPanel.add(getSearched);
        mainPanel.add(selectSearched);
        mainPanel.add(idsList);

        setContentPane(mainPanel);

    }




}
