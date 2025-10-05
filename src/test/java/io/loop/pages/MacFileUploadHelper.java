package io.loop.pages;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class MacFileUploadHelper {

    public static void uploadFileWithRobot(String filePath) throws Exception {
        // 1) Put the path onto the clipboard (robust for spaces/special chars)
        copyToClipboard(filePath);

        Robot robot = new Robot();
        robot.setAutoDelay(120); // small default delay between events

        // 2) Open "Go to the folder…" in the file dialog: ⌘ + ⇧ + G
        robot.keyPress(KeyEvent.VK_META);      // Command
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_G);
        robot.keyRelease(KeyEvent.VK_G);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_META);

        // 3) Give the OS a moment to show the mini path dialog
        Thread.sleep(350);

        // 4) Paste the file path: ⌘ + V
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_META);

        // 5) Confirm path (Enter), then confirm the picker (Enter)
        Thread.sleep(200);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(300);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    private static void copyToClipboard(String text) {
        Toolkit.getDefaultToolkit()
                .getSystemClipboard()
                .setContents(new StringSelection(text), null);
    }
}