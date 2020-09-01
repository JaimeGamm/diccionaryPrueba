package view;

import java.awt.Color;

public class Constants{
	
	public static final Color BLACK = Color.decode("#282E33");
	

	public static final String MESSAGE_READ_MENU = "1. Crear almacen\n"
            + "2. Ver lista de almacenes\n"
            + "3. Eliminar almacen\n"
            + "4. Eliger un almacen para ver detalles y modificar\n"
    		+ "5. Terminar\n";;
	
	public static final String MESSAGE_READ_MENU_PRODUCT = "1. Ver la lista de productos del almacen\n"
            + "2. ver detalles de un producto del almacen\n"
            + "3. Eliminar algun producto del almacen\n"
            + "4. Ingresar un producto en el almacen\n"
            + "5. vende unidades de un producto\n"
            + "6. Regresar a la lista de almacenes\n";
	
	public static final String MESSAGE_SPACE = "----------------------";
	public static final String MESSAGE_SPACE_N ="----------------------\n";
	
	public static final String MESSAGE_LIST_WAREHOUSE ="                              LISTA DE ALMACENES";
	
	public static final String MESSAGE_ERROR ="ERROR";
	public static final String MESSAGE_NAME_DIRECTION ="Nombre          Direcion\n";
	public static final String MESSAGE_ENDING ="Finalización";
	public static final String MESSAGE_OPTION_INCORRECT ="Opcion incorrecta";
	public static final String MESSAGE_ENTER_A_NUMBER ="Debe ingresar un numero entero";
	public static final String MESSAGE_NO_PRODUCT ="No hay productos en el almacen";
	public static final String MESSAGE_DIRECTION_NOT_EXISTS ="La direcion no existe";
	public static final String MESSAGE_ENTER_WAREHOUSE_DATA ="Ingrese los datos del almacen";
	public static final String MESSAGE_ENTER_NAME ="Ingrese el nombre";
	public static final String MESSAGE_ENTER_DIRECTION ="Ingrese la direcion";
	public static final String MESSAGE_REMOVE_WAREHOUSE ="Ingrese la direcion del almacen que desea eliminar";
	public static final String MESSAGE_DIRECTION ="La direcion:  ";
	public static final String MESSAGE_NO_EXISTS ="  no existe";
	public static final String MESSAGE_ENTER_NAME_PRODUCT ="Ingrese el nombre del producto";
	public static final String MESSAGE_ENTER_QUANTITY_PRODUCT ="Ingrese la cantidad del producto";
	public static final String MESSAGE_ENTER_VALUE_PRODUCT ="Ingrese el valor del producto $";
	public static final String MESSAGE_ENTER_ID_PRODUCT ="Ingrese el id del producto para ver detalles";
	public static final String MESSAGE_REMOVE_ID_PRODUCT ="Ingrese el id del producto que va eliminar";
	public static final String MESSAGE_SALE_ID_PRODUCT ="Ingrese el id del producto que vendio";
	public static final String MESSAGE_SALE_ID_PRODUCT_QUANTYTI ="Ingrese el numero de unidades que vendio";
	public static final String MESSAGE_SALE_NOT_QUANTYTI_PRODUCT ="Las unidades vendidas son mayores que las unidades que se disponen";
	public static final String MESSAGE_PRODUCT_ID ="El producto con el id: ";
	public static final String MESSAGE_DIRECTION_WAREHOUSE_SEE ="Ingrese la direcion del almacen que desea ver";
}