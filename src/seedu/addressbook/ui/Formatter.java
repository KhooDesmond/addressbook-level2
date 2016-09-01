package seedu.addressbook.ui;

/**
 * Format strings into intended format
 */
public class Formatter {
 
	 /** A decorative prefix added to the beginning of lines printed by AddressBook */
    private static final String LINE_PREFIX = "|| ";

    /** A platform independent line separator. */
    private static final String LS = System.lineSeparator();

    private static final String DIVIDER = "===================================================";

    /** Format of indexed list item */
    private static final String MESSAGE_INDEXED_LIST_ITEM = "\t%1$d. %2$s";

    /**
     * Formats a string to be in display format
     * @param String to be displayed
     * @return Formatted string
     */
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

    /**
     * Formats a string to get user command format
     * @param string
     * @return Formatted string
     */
	public static String getUserCommandFormat(String string) {
		return LINE_PREFIX + string;
	}
	
	/**
	 * Formats the welcome message 
	 * @param welcomeMsg
	 * @param version
	 * @param usage
	 * @param storageFileInfo
	 * @return Formatted welcome message
	 */
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
	
	/**
	 * Formats a string to append two dividers 
	 * @param string
	 * @return Formatted string
	 */
	public static String doubleDividerFormat(String string) {
		return displayFormat(string, DIVIDER, DIVIDER);
	}

	/**
	 * Formats the echo command message
	 * @param fullInputLine
	 * @return Formatted string
	 */
	public static String echoCommandFormat(String fullInputLine) {
		return displayFormat("[Command entered:" + fullInputLine + "]");
	}

	/**
	 * Formats a string to append one dividers
	 * @param string
	 * @return Formatted string
	 */
	public static String singleDividerFormat(String string) {
		return displayFormat(string, DIVIDER);
	}

	/**
	 * Formats a list string
	 * @param string
	 * @return Formatted list string
	 */
	public static String listFormat(String string) {
		return string + LINE_PREFIX + LS;
	}
}
