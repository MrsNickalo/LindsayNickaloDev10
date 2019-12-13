/**
 *
 * @author Lindsay Gen10
 * @date Dec 12, 2019
 * Application for the Address Book
 */
import Controller.AddressBookController;
public class App {
    public static void main(String[] args) 
    {
        AddressBookController controller = new AddressBookController();
        controller.intro();
        controller.menu();
        do
        {
            int selection = controller.inputInt();
            switch(selection)
            {
                case 1:
                    controller.addEntity();
                    break;
                case 2:
                    controller.viewEntity();
                    break;
                case 3:
                    controller.removeEntity();
                    break;
                case 4:
                    controller.editEntity();
                    break;
                case 5:
                    controller.viewAll();
                    break;
                case 6:
                    controller.numberEntities();
                    break;
                case 7:
                    controller.saveTo();
                    break;
                case 8:
                    controller.readFrom();
                    break;
                default:
                    controller.exit();
                    return;
            }
        }while(true);
    }
}
