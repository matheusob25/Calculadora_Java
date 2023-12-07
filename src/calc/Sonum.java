package calc;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class Sonum extends PlainDocument {
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if (str.equals("/")) {
            str = str.replaceAll("/", "÷");
        } else if (str.equals("*")) {
            str = str.replace('*', 'x');
        } else {
            str = str.replaceAll("[^0-9x%+,^\\-÷√.=/]", "");
        }


        super.insertString(offs, str, a);
    }


}




