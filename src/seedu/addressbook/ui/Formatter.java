package seedu.addressbook.ui;

import static seedu.addressbook.common.Messages.MESSAGE_PROGRAM_LAUNCH_ARGS_USAGE;
import static seedu.addressbook.common.Messages.MESSAGE_WELCOME;

import java.util.List;

public class Formatter {
 
	 /** A decorative prefix added to the beginning of lines printed by AddressBook */
    private static final String LINE_PREFIX = "|| ";

    /** A platform independent line separator. */
    private static final String LS = System.lineSeparator();

    private static final String DIVIDER = "===================================================";

    /** Format of indexed list item */
    private static final String MESSAGE_INDEXED_LIST_ITEM = "\t%1$d. %2$s";

    
    private static String displayFormat(String... string) {
		String displayString = "";
		
		for(String s: string) {
			displayString = displayString + LINE_PREFIX + s.replace("\n", LS + LINE_PREFIX) + LS;
		}
		 
		 return displayString; 
	}
	
	/** Formats a list of strings as a viewable indexed list. */
    public static String indexedListForViewingFormat(int displayIndex, String listItem) {
            return displayFormat(getIndexedListItem(displayIndex, listItem));     
    }

    /**
     * Formats a string as a viewable indexed list item.
     *
     * @param visibleIndex visible index for this listing
     */
    private static String getIndexedListItem(int visibleIndex, String listItem) {
        return String.format(MESSAGE_INDEXED_LIST_ITEM, visibleIndex, listItem);
    }


	public static String getUserCommandFormat(String string) {
		return LINE_PREFIX + string;
	}
	
	public static String welcomeMessageFormat(String welcomeMsg, String version, String usage, 
			                                  String storageFileInfo) {
		return displayFormat(DIVIDER, 
							 DIVIDER,
							 welcomeMsg,
							 version,
							 usage,
                             storageFileInfo,
                             DIVIDER);
	}
	
	public static String doubleDividerFormat(String string) {
		return displayFormat(string, DIVIDER, DIVIDER);
	}

	public static String echoCommandFormat(String fullInputLine) {
		return displayFormat("[Command entered:" + fullInputLine + "]");
	}

	public static String singleDividerFormat(String string) {
		return displayFormat(string, DIVIDER);
	}

	public static String listFormat(String string) {
		return string + LINE_PREFIX + LS;
	}

}
