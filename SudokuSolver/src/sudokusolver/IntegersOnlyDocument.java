package sudokusolver;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
import java.math.BigInteger;
import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo
 */
public class IntegersOnlyDocument extends PlainDocument {

  private final int limit;

  public IntegersOnlyDocument(int limit) {
    this.limit = limit;
  }

  @Override
  public void insertString(int offs, String str, AttributeSet a)
      throws BadLocationException {
    if (str == null)
      return;
    
    StringBuilder sb = new StringBuilder();

    if (((getLength() + str.length()) <= limit)) {
        if (test(str)){
            super.insertString(offs, str, a);
        }
        else {
            JOptionPane.showMessageDialog(null, "Apenas numeros podem ser inseridos nesse campo!");
        }
    }
    else{
        JOptionPane.showMessageDialog(null, "Limite de Caracteres: " + limit);
    }
  }

    private boolean test(String text) {
      try {
         BigInteger teste = new BigInteger(text);
         return true;
      } catch (NumberFormatException e) {
         return false;
      }
   }
}

