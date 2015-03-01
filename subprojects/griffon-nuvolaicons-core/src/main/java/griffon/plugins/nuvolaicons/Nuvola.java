/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package griffon.plugins.nuvolaicons;

import javax.annotation.Nonnull;

import static griffon.util.GriffonClassUtils.requireState;
import static griffon.util.GriffonNameUtils.isBlank;
import static griffon.util.GriffonNameUtils.requireNonBlank;

/**
 * @author Andres Almiray
 */
public enum Nuvola {
    ACTIONS_1DOWNARROW("actions", "1downarrow"),
    ACTIONS_1LEFTARROW("actions", "1leftarrow"),
    ACTIONS_1RIGHTARROW("actions", "1rightarrow"),
    ACTIONS_1UPARROW("actions", "1uparrow"),
    ACTIONS_2DOWNARROW("actions", "2downarrow"),
    ACTIONS_2LEFTARROW("actions", "2leftarrow"),
    ACTIONS_2RIGHTARROW("actions", "2rightarrow"),
    ACTIONS_2UPARROW("actions", "2uparrow"),
    ACTIONS_ABOUT_KDE("actions", "about_kde"),
    ACTIONS_APPLY("actions", "apply"),
    ACTIONS_ARTSAUDIOMANAGER("actions", "artsaudiomanager"),
    ACTIONS_ARTSENVIRONMENT("actions", "artsenvironment"),
    ACTIONS_ARTSMEDIATYPES("actions", "artsmediatypes"),
    ACTIONS_ARTSMIDIMANAGER("actions", "artsmidimanager"),
    ACTIONS_ATTACH("actions", "attach"),
    ACTIONS_BACK("actions", "back"),
    ACTIONS_BLEND("actions", "blend"),
    ACTIONS_BOOKMARK("actions", "bookmark"),
    ACTIONS_BOOKMARK_ADD("actions", "bookmark_add"),
    ACTIONS_BOOKMARK_FOLDER("actions", "bookmark_folder"),
    ACTIONS_BOOKMARK_TOOLBAR("actions", "bookmark_toolbar"),
    ACTIONS_BOOKMARKS_LIST_ADD("actions", "bookmarks_list_add"),
    ACTIONS_BOTTOM("actions", "bottom"),
    ACTIONS_BUTTON_ACCEPT("actions", "button_accept"),
    ACTIONS_BUTTON_CANCEL("actions", "button_cancel"),
    ACTIONS_BUTTON_OK("actions", "button_ok"),
    ACTIONS_CAMERA_TEST("actions", "camera_test"),
    ACTIONS_CANCEL("actions", "cancel"),
    ACTIONS_CD("actions", "cd"),
    ACTIONS_COLOR_FILL("actions", "color_fill"),
    ACTIONS_COLOR_LINE("actions", "color_line"),
    ACTIONS_COLORIZE("actions", "colorize"),
    ACTIONS_COMPFILE("actions", "compfile"),
    ACTIONS_CONFIGURE("actions", "configure"),
    ACTIONS_CONNECT_CREATING("actions", "connect_creating"),
    ACTIONS_CONNECT_ESTABLISHED("actions", "connect_established"),
    ACTIONS_CONNECT_NO("actions", "connect_no"),
    ACTIONS_CUT("actions", "cut"),
    ACTIONS_DECRYPTED("actions", "decrypted"),
    ACTIONS_DOWN("actions", "down"),
    ACTIONS_EDIT("actions", "edit"),
    ACTIONS_EDIT_ADD("actions", "edit_add"),
    ACTIONS_EDIT_REMOVE("actions", "edit_remove"),
    ACTIONS_EDITCOPY("actions", "editcopy"),
    ACTIONS_EDITCUT("actions", "editcut"),
    ACTIONS_EDITDELETE("actions", "editdelete"),
    ACTIONS_EDITPASTE("actions", "editpaste"),
    ACTIONS_EDITSHRED("actions", "editshred"),
    ACTIONS_EDITTRASH("actions", "edittrash"),
    ACTIONS_ENCRYPTED("actions", "encrypted"),
    ACTIONS_ENDTURN("actions", "endturn"),
    ACTIONS_EXIT("actions", "exit"),
    ACTIONS_FILECLOSE("actions", "fileclose"),
    ACTIONS_FILEEXPORT("actions", "fileexport"),
    ACTIONS_FILENEW("actions", "filenew"),
    ACTIONS_FILEOPEN("actions", "fileopen"),
    ACTIONS_FILEPRINT("actions", "fileprint"),
    ACTIONS_FILEQUICKPRINT("actions", "filequickprint"),
    ACTIONS_FILESAVE("actions", "filesave"),
    ACTIONS_FILESAVEAS("actions", "filesaveas"),
    ACTIONS_FILL("actions", "fill"),
    ACTIONS_FIND("actions", "find"),
    ACTIONS_FINISH("actions", "finish"),
    ACTIONS_FOLDER_NEW("actions", "folder_new"),
    ACTIONS_FORWARD("actions", "forward"),
    ACTIONS_FRAMEPRINT("actions", "frameprint"),
    ACTIONS_GOHOME("actions", "gohome"),
    ACTIONS_HELP("actions", "help"),
    ACTIONS_HISTORY("actions", "history"),
    ACTIONS_HISTORY_CLEAR("actions", "history_clear"),
    ACTIONS_IDENTITY("actions", "identity"),
    ACTIONS_IRKICK("actions", "irkick"),
    ACTIONS_IRKICKFLASH("actions", "irkickflash"),
    ACTIONS_IRKICKOFF("actions", "irkickoff"),
    ACTIONS_KABOODLELOOP("actions", "kaboodleloop"),
    ACTIONS_KALARM("actions", "kalarm"),
    ACTIONS_KALARM_DISABLED("actions", "kalarm_disabled"),
    ACTIONS_KDEVELOP_DOWN("actions", "kdevelop_down"),
    ACTIONS_KGPG_EDIT("actions", "kgpg_edit"),
    ACTIONS_KGPG_EXPORT("actions", "kgpg_export"),
    ACTIONS_KGPG_GEN("actions", "kgpg_gen"),
    ACTIONS_KGPG_IDENTITY("actions", "kgpg_identity"),
    ACTIONS_KGPG_IMPORT("actions", "kgpg_import"),
    ACTIONS_KGPG_INFO("actions", "kgpg_info"),
    ACTIONS_KGPG_KEY1("actions", "kgpg_key1"),
    ACTIONS_KGPG_KEY2("actions", "kgpg_key2"),
    ACTIONS_KGPG_KEY3("actions", "kgpg_key3"),
    ACTIONS_KGPG_PHOTO("actions", "kgpg_photo"),
    ACTIONS_KGPG_SHOW("actions", "kgpg_show"),
    ACTIONS_KGPG_SIGN("actions", "kgpg_sign"),
    ACTIONS_KGPG_TERM("actions", "kgpg_term"),
    ACTIONS_KLIPPER_DOCK("actions", "klipper_dock"),
    ACTIONS_KMIXDOCKED("actions", "kmixdocked"),
    ACTIONS_KMIXDOCKED_ERROR("actions", "kmixdocked_error"),
    ACTIONS_KMIXDOCKED_MUTE("actions", "kmixdocked_mute"),
    ACTIONS_LAPTOP_CHARGE("actions", "laptop_charge"),
    ACTIONS_LAPTOP_NOBATTERY("actions", "laptop_nobattery"),
    ACTIONS_LAPTOP_NOCHARGE("actions", "laptop_nocharge"),
    ACTIONS_LAPTOP_POWER("actions", "laptop_power"),
    ACTIONS_LEDBLUE("actions", "ledblue"),
    ACTIONS_LEDGREEN("actions", "ledgreen"),
    ACTIONS_LEDLIGHTBLUE("actions", "ledlightblue"),
    ACTIONS_LEDLIGHTGREEN("actions", "ledlightgreen"),
    ACTIONS_LEDORANGE("actions", "ledorange"),
    ACTIONS_LEDPURPLE("actions", "ledpurple"),
    ACTIONS_LEDRED("actions", "ledred"),
    ACTIONS_LEDYELLOW("actions", "ledyellow"),
    ACTIONS_LOCK("actions", "lock"),
    ACTIONS_MAIL_DELETE("actions", "mail_delete"),
    ACTIONS_MAIL_FIND("actions", "mail_find"),
    ACTIONS_MAIL_FORWARD("actions", "mail_forward"),
    ACTIONS_MAIL_GENERIC("actions", "mail_generic"),
    ACTIONS_MAIL_GET("actions", "mail_get"),
    ACTIONS_MAIL_NEW("actions", "mail_new"),
    ACTIONS_MAIL_POST_TO("actions", "mail_post_to"),
    ACTIONS_MAIL_REPLY("actions", "mail_reply"),
    ACTIONS_MAIL_REPLYALL("actions", "mail_replyall"),
    ACTIONS_MAIL_SEND("actions", "mail_send"),
    ACTIONS_MAKE_KDEVELOP("actions", "make_kdevelop"),
    ACTIONS_MESSAGEBOX_CRITICAL("actions", "messagebox_critical"),
    ACTIONS_MESSAGEBOX_INFO("actions", "messagebox_info"),
    ACTIONS_MESSAGEBOX_WARNING("actions", "messagebox_warning"),
    ACTIONS_MISC("actions", "misc"),
    ACTIONS_MIX_MIDI("actions", "mix_midi"),
    ACTIONS_MIX_RECMON("actions", "mix_recmon"),
    ACTIONS_MIX_UNKNOWN("actions", "mix_unknown"),
    ACTIONS_MIX_VOLUME("actions", "mix_volume"),
    ACTIONS_MOUSE("actions", "mouse"),
    ACTIONS_NEWFONT("actions", "newfont"),
    ACTIONS_NEWS_SUBSCRIBE("actions", "news_subscribe"),
    ACTIONS_NEWS_UNSUBSCRIBE("actions", "news_unsubscribe"),
    ACTIONS_NEXT("actions", "next"),
    ACTIONS_NO("actions", "no"),
    ACTIONS_NOATUNLOOPSONG("actions", "noatunloopsong"),
    ACTIONS_OK("actions", "ok"),
    ACTIONS_OPENTERM("actions", "openterm"),
    ACTIONS_PENCIL("actions", "pencil"),
    ACTIONS_PIANO("actions", "piano"),
    ACTIONS_PLAYER_EJECT("actions", "player_eject"),
    ACTIONS_PLAYER_END("actions", "player_end"),
    ACTIONS_PLAYER_FWD("actions", "player_fwd"),
    ACTIONS_PLAYER_PAUSE("actions", "player_pause"),
    ACTIONS_PLAYER_PLAY("actions", "player_play"),
    ACTIONS_PLAYER_REV("actions", "player_rev"),
    ACTIONS_PLAYER_REW("actions", "player_rew"),
    ACTIONS_PLAYER_START("actions", "player_start"),
    ACTIONS_PLAYER_STOP("actions", "player_stop"),
    ACTIONS_POWER("actions", "power"),
    ACTIONS_PREVIOUS("actions", "previous"),
    ACTIONS_PROJECT_OPEN("actions", "project_open"),
    ACTIONS_QUEUE("actions", "queue"),
    ACTIONS_QUIZ("actions", "quiz"),
    ACTIONS_REBUILD("actions", "rebuild"),
    ACTIONS_REDO("actions", "redo"),
    ACTIONS_RELOAD("actions", "reload"),
    ACTIONS_RELOAD_ALL_TABS("actions", "reload_all_tabs"),
    ACTIONS_RELOAD_PAGE("actions", "reload_page"),
    ACTIONS_REVERT("actions", "revert"),
    ACTIONS_ROLL("actions", "roll"),
    ACTIONS_ROTATE("actions", "rotate"),
    ACTIONS_ROTATE_CCW("actions", "rotate_ccw"),
    ACTIONS_ROTATE_CW("actions", "rotate_cw"),
    ACTIONS_RUN("actions", "run"),
    ACTIONS_SAVE_ALL("actions", "save_all"),
    ACTIONS_SIGNATURE("actions", "signature"),
    ACTIONS_SPELLCHECK("actions", "spellcheck"),
    ACTIONS_START("actions", "start"),
    ACTIONS_STOP("actions", "stop"),
    ACTIONS_TAB_DUPLICATE("actions", "tab_duplicate"),
    ACTIONS_TAB_NEW("actions", "tab_new"),
    ACTIONS_TAB_NEW_RAISED("actions", "tab_new_raised"),
    ACTIONS_TAB_REMOVE("actions", "tab_remove"),
    ACTIONS_THUMBNAIL("actions", "thumbnail"),
    ACTIONS_TOGGLE_LOG("actions", "toggle_log"),
    ACTIONS_TOP("actions", "top"),
    ACTIONS_UNDO("actions", "undo"),
    ACTIONS_UP("actions", "up"),
    ACTIONS_VIEW_BOTTOM("actions", "view_bottom"),
    ACTIONS_VIEW_CHOOSE("actions", "view_choose"),
    ACTIONS_VIEW_DETAILED("actions", "view_detailed"),
    ACTIONS_VIEW_FULLSCREEN("actions", "view_fullscreen"),
    ACTIONS_VIEW_ICON("actions", "view_icon"),
    ACTIONS_VIEW_LEFT_RIGHT("actions", "view_left_right"),
    ACTIONS_VIEW_MULTICOLUMN("actions", "view_multicolumn"),
    ACTIONS_VIEW_NOFULLSCREEN("actions", "view_nofullscreen"),
    ACTIONS_VIEW_REMOVE("actions", "view_remove"),
    ACTIONS_VIEW_RIGHT("actions", "view_right"),
    ACTIONS_VIEW_SIDETREE("actions", "view_sidetree"),
    ACTIONS_VIEW_TEXT("actions", "view_text"),
    ACTIONS_VIEW_TOP_BOTTOM("actions", "view_top_bottom"),
    ACTIONS_VIEW_TREE("actions", "view_tree"),
    ACTIONS_VIEWMAG_MORE("actions", "viewmag+"),
    ACTIONS_VIEWMAG_LESS("actions", "viewmag-"),
    ACTIONS_VIEWMAG("actions", "viewmag"),
    ACTIONS_VIEWMAG1("actions", "viewmag1"),
    ACTIONS_VIEWMAGFIT("actions", "viewmagfit"),
    ACTIONS_WINDOW_NEW("actions", "window_new"),
    ACTIONS_WIZARD("actions", "wizard"),
    APPS_ACCESS("apps", "access"),
    APPS_ACROREAD("apps", "acroread"),
    APPS_AGENT("apps", "agent"),
    APPS_AKTION("apps", "aktion"),
    APPS_AMAROK("apps", "amarok"),
    APPS_AMOR("apps", "amor"),
    APPS_APPLIXWARE("apps", "applixware"),
    APPS_ARK("apps", "ark"),
    APPS_ARTS("apps", "arts"),
    APPS_ARTSBUILDER("apps", "artsbuilder"),
    APPS_ARTSCONTROL("apps", "artscontrol"),
    APPS_ARTSMIDIMANAGER("apps", "artsmidimanager"),
    APPS_ATLANTIK("apps", "atlantik"),
    APPS_BACKGROUND("apps", "background"),
    APPS_BELL("apps", "bell"),
    APPS_BOOKCASE("apps", "bookcase"),
    APPS_BROWSER("apps", "browser"),
    APPS_BUG("apps", "bug"),
    APPS_CACHE("apps", "cache"),
    APPS_CHAT("apps", "chat"),
    APPS_CLANBOMBER("apps", "clanbomber"),
    APPS_CLOCK("apps", "clock"),
    APPS_COLORS("apps", "colors"),
    APPS_COOKIE("apps", "cookie"),
    APPS_CORE("apps", "core"),
    APPS_DATE("apps", "date"),
    APPS_DESIGNER("apps", "designer"),
    APPS_DIGIKAM("apps", "digikam"),
    APPS_DISPLAY("apps", "display"),
    APPS_DOWNLOAD_MANAGER("apps", "download_manager"),
    APPS_EDU_LANGUAGES("apps", "edu_languages"),
    APPS_EDU_MATHEMATICS("apps", "edu_mathematics"),
    APPS_EDU_MISCELLANEOUS("apps", "edu_miscellaneous"),
    APPS_EDU_SCIENCE("apps", "edu_science"),
    APPS_EMACS("apps", "emacs"),
    APPS_EMAIL("apps", "email"),
    APPS_ENERGY("apps", "energy"),
    APPS_ENHANCED_BROWSING("apps", "enhanced_browsing"),
    APPS_ERROR("apps", "error"),
    APPS_EVOLUTION("apps", "evolution"),
    APPS_FILE_MANAGER("apps", "file-manager"),
    APPS_FILETYPES("apps", "filetypes"),
    APPS_FLASHKARD("apps", "flashkard"),
    APPS_FONTS("apps", "fonts"),
    APPS_FSVIEW("apps", "fsview"),
    APPS_GAIM("apps", "gaim"),
    APPS_GALEON("apps", "galeon"),
    APPS_GIMP("apps", "gimp"),
    APPS_GIMP2("apps", "gimp2"),
    APPS_GNOME_APPS("apps", "gnome_apps"),
    APPS_GNOME_APPS2("apps", "gnome_apps2"),
    APPS_GO("apps", "go"),
    APPS_HELP_INDEX("apps", "help_index"),
    APPS_HWINFO("apps", "hwinfo"),
    APPS_ICONS("apps", "icons"),
    APPS_ICONTHEMES("apps", "iconthemes"),
    APPS_IMPORTANT("apps", "important"),
    APPS_INDEXIMG("apps", "indeximg"),
    APPS_INPUT_DEVICES_SETTINGS("apps", "input_devices_settings"),
    APPS_IRKICK("apps", "irkick"),
    APPS_JUK("apps", "juk"),
    APPS_KABOODLE("apps", "kaboodle"),
    APPS_KADDRESSBOOK("apps", "kaddressbook"),
    APPS_KALARM("apps", "kalarm"),
    APPS_KALZIUM("apps", "kalzium"),
    APPS_KAPPFINDER("apps", "kappfinder"),
    APPS_KARM("apps", "karm"),
    APPS_KASTEROIDS("apps", "kasteroids"),
    APPS_KATE("apps", "kate"),
    APPS_KATOMIC("apps", "katomic"),
    APPS_KAUDIOCREATOR("apps", "kaudiocreator"),
    APPS_KBACKGAMMON("apps", "kbackgammon"),
    APPS_KBACKGAMMON_ENGINE("apps", "kbackgammon_engine"),
    APPS_KBLACKBOX("apps", "kblackbox"),
    APPS_KBOUNCE("apps", "kbounce"),
    APPS_KBRUNCH("apps", "kbrunch"),
    APPS_KCALC("apps", "kcalc"),
    APPS_KCHARSELECT("apps", "kcharselect"),
    APPS_KCHART("apps", "kchart"),
    APPS_KCMDEVICE("apps", "kcmdevice"),
    APPS_KCMDEVICES("apps", "kcmdevices"),
    APPS_KCMDF("apps", "kcmdf"),
    APPS_KCMDRKONQI("apps", "kcmdrkonqi"),
    APPS_KCMFONTINST("apps", "kcmfontinst"),
    APPS_KCMKWM("apps", "kcmkwm"),
    APPS_KCMMEMORY("apps", "kcmmemory"),
    APPS_KCMMIDI("apps", "kcmmidi"),
    APPS_KCMPARTITIONS("apps", "kcmpartitions"),
    APPS_KCMPCI("apps", "kcmpci"),
    APPS_KCMPROCESSOR("apps", "kcmprocessor"),
    APPS_KCMSCSI("apps", "kcmscsi"),
    APPS_KCMSYSTEM("apps", "kcmsystem"),
    APPS_KCMX("apps", "kcmx"),
    APPS_KCOLORCHOOSER("apps", "kcolorchooser"),
    APPS_KCOLOREDIT("apps", "kcoloredit"),
    APPS_KCONTROL("apps", "kcontrol"),
    APPS_KDAT("apps", "kdat"),
    APPS_KDF("apps", "kdf"),
    APPS_KDICT("apps", "kdict"),
    APPS_KDISKNAV("apps", "kdisknav"),
    APPS_KDMCONFIG("apps", "kdmconfig"),
    APPS_KEDIT("apps", "kedit"),
    APPS_KEDITBOOKMARKS("apps", "keditbookmarks"),
    APPS_KEY_BINDINGS("apps", "key_bindings"),
    APPS_KEYBINDINGS("apps", "keybindings"),
    APPS_KEYBOARD("apps", "keyboard"),
    APPS_KEYBOARD_LAYOUT("apps", "keyboard_layout"),
    APPS_KFIG("apps", "kfig"),
    APPS_KFIND("apps", "kfind"),
    APPS_KFLOPPY("apps", "kfloppy"),
    APPS_KFM("apps", "kfm"),
    APPS_KFM_HOME("apps", "kfm_home"),
    APPS_KGET("apps", "kget"),
    APPS_KGHOSTVIEW("apps", "kghostview"),
    APPS_KGPG("apps", "kgpg"),
    APPS_KHANGMAN("apps", "khangman"),
    APPS_KHELPCENTER("apps", "khelpcenter"),
    APPS_KHEXEDIT("apps", "khexedit"),
    APPS_KHOTKEYS("apps", "khotkeys"),
    APPS_KIG("apps", "kig"),
    APPS_KITEN("apps", "kiten"),
    APPS_KIVIO("apps", "kivio"),
    APPS_KJOBVIEWER("apps", "kjobviewer"),
    APPS_KJOTS("apps", "kjots"),
    APPS_KLETTRES("apps", "klettres"),
    APPS_KLIPPER("apps", "klipper"),
    APPS_KLPQ("apps", "klpq"),
    APPS_KMAG("apps", "kmag"),
    APPS_KMAHJONG("apps", "kmahjong"),
    APPS_KMAIL("apps", "kmail"),
    APPS_KMENU("apps", "kmenu"),
    APPS_KMENUEDIT("apps", "kmenuedit"),
    APPS_KMESSEDWORDS("apps", "kmessedwords"),
    APPS_KMID("apps", "kmid"),
    APPS_KMINES("apps", "kmines"),
    APPS_KMIX("apps", "kmix"),
    APPS_KMOON("apps", "kmoon"),
    APPS_KMOUSETOOL("apps", "kmousetool"),
    APPS_KMPLOT("apps", "kmplot"),
    APPS_KNEWSTICKER("apps", "knewsticker"),
    APPS_KNODE("apps", "knode"),
    APPS_KNOTES("apps", "knotes"),
    APPS_KNOTIFY("apps", "knotify"),
    APPS_KOLF("apps", "kolf"),
    APPS_KOLOURPAINT("apps", "kolourpaint"),
    APPS_KONQSIDEBAR_MEDIAPLAYER("apps", "konqsidebar_mediaplayer"),
    APPS_KONQUEROR("apps", "konqueror"),
    APPS_KONQUEST("apps", "konquest"),
    APPS_KONSOLE("apps", "konsole"),
    APPS_KONTACT("apps", "kontact"),
    APPS_KOOKA("apps", "kooka"),
    APPS_KOPETE("apps", "kopete"),
    APPS_KORGANIZER("apps", "korganizer"),
    APPS_KORGANIZER_TODO("apps", "korganizer_todo"),
    APPS_KORN("apps", "korn"),
    APPS_KPACKAGE("apps", "kpackage"),
    APPS_KPAGER("apps", "kpager"),
    APPS_KPAINT("apps", "kpaint"),
    APPS_KPDF("apps", "kpdf"),
    APPS_KPERCENTAGE("apps", "kpercentage"),
    APPS_KPILOT("apps", "kpilot"),
    APPS_KPOVMODELER("apps", "kpovmodeler"),
    APPS_KPPP("apps", "kppp"),
    APPS_KPRESENTER("apps", "kpresenter"),
    APPS_KRDC("apps", "krdc"),
    APPS_KREC("apps", "krec"),
    APPS_KREVERSI("apps", "kreversi"),
    APPS_KRFB("apps", "krfb"),
    APPS_KRITA("apps", "krita"),
    APPS_KRULER("apps", "kruler"),
    APPS_KSCD("apps", "kscd"),
    APPS_KSCREENSAVER("apps", "kscreensaver"),
    APPS_KSERVICES("apps", "kservices"),
    APPS_KSHISEN("apps", "kshisen"),
    APPS_KSIG("apps", "ksig"),
    APPS_KSIM("apps", "ksim"),
    APPS_KSIRC("apps", "ksirc"),
    APPS_KSNAPSHOT("apps", "ksnapshot"),
    APPS_KSPLASH("apps", "ksplash"),
    APPS_KSYSV("apps", "ksysv"),
    APPS_KTEATIME("apps", "kteatime"),
    APPS_KTHEMEMGR("apps", "kthememgr"),
    APPS_KTIMER("apps", "ktimer"),
    APPS_KTIP("apps", "ktip"),
    APPS_KTOUCH("apps", "ktouch"),
    APPS_KUGAR("apps", "kugar"),
    APPS_KUICKSHOW("apps", "kuickshow"),
    APPS_KUSER("apps", "kuser"),
    APPS_KVERBOS("apps", "kverbos"),
    APPS_KVIEW("apps", "kview"),
    APPS_KWEATHER("apps", "kweather"),
    APPS_KWIKDISK("apps", "kwikdisk"),
    APPS_KWIN("apps", "kwin"),
    APPS_KWIN4("apps", "kwin4"),
    APPS_KWORD("apps", "kword"),
    APPS_KWORLDCLOCK("apps", "kworldclock"),
    APPS_KWRITE("apps", "kwrite"),
    APPS_KXKB("apps", "kxkb"),
    APPS_LAPTOP_BATTERY("apps", "laptop_battery"),
    APPS_LAPTOP_PCMCIA("apps", "laptop_pcmcia"),
    APPS_LICQ("apps", "licq"),
    APPS_LOCALE("apps", "locale"),
    APPS_LOOKNFEEL("apps", "looknfeel"),
    APPS_MOZILLA_FIREBIRD("apps", "mozilla-firebird"),
    APPS_MOZILLA_THUNDERBIRD("apps", "mozilla-thunderbird"),
    APPS_MOZILLA("apps", "mozilla"),
    APPS_MPLAYER("apps", "mplayer"),
    APPS_MULTIMEDIA("apps", "multimedia"),
    APPS_MYCOMPUTER("apps", "mycomputer"),
    APPS_NETSCAPE("apps", "netscape"),
    APPS_NETWORK("apps", "network"),
    APPS_NOATUN("apps", "noatun"),
    APPS_OOO_GULLS("apps", "ooo_gulls"),
    APPS_OOO_SETUP("apps", "ooo_setup"),
    APPS_OPERA("apps", "opera"),
    APPS_PACKAGE("apps", "package"),
    APPS_PACKAGE_APPLICATIONS("apps", "package_applications"),
    APPS_PACKAGE_DEVELOPMENT("apps", "package_development"),
    APPS_PACKAGE_EDITORS("apps", "package_editors"),
    APPS_PACKAGE_EDUTAINMENT("apps", "package_edutainment"),
    APPS_PACKAGE_FAVORITE("apps", "package_favorite"),
    APPS_PACKAGE_GAMES("apps", "package_games"),
    APPS_PACKAGE_GAMES_ARCADE("apps", "package_games_arcade"),
    APPS_PACKAGE_GAMES_BOARD("apps", "package_games_board"),
    APPS_PACKAGE_GAMES_STRATEGY("apps", "package_games_strategy"),
    APPS_PACKAGE_GRAPHICS("apps", "package_graphics"),
    APPS_PACKAGE_MULTIMEDIA("apps", "package_multimedia"),
    APPS_PACKAGE_NETWORK("apps", "package_network"),
    APPS_PACKAGE_SETTINGS("apps", "package_settings"),
    APPS_PACKAGE_SYSTEM("apps", "package_system"),
    APPS_PACKAGE_TOYS("apps", "package_toys"),
    APPS_PACKAGE_UTILITIES("apps", "package_utilities"),
    APPS_PACKAGE_WORDPROCESSING("apps", "package_wordprocessing"),
    APPS_PASSWORD("apps", "password"),
    APPS_PERSONAL("apps", "personal"),
    APPS_PRINTMGR("apps", "printmgr"),
    APPS_RANDR("apps", "randr"),
    APPS_REALPLAYER("apps", "realplayer"),
    APPS_REMOTE("apps", "remote"),
    APPS_SAMBA("apps", "samba"),
    APPS_SODIPODI("apps", "sodipodi"),
    APPS_STYLE("apps", "style"),
    APPS_STYLESHEET("apps", "stylesheet"),
    APPS_TERMINAL("apps", "terminal"),
    APPS_USB("apps", "usb"),
    APPS_WINDOW_LIST("apps", "window_list"),
    APPS_WINPROPS("apps", "winprops"),
    APPS_X("apps", "x"),
    APPS_XAPP("apps", "xapp"),
    APPS_XCALC("apps", "xcalc"),
    APPS_XCLOCK("apps", "xclock"),
    APPS_XCONFIG("apps", "xconfig"),
    APPS_XEMACS("apps", "xemacs"),
    APPS_XFMAIL("apps", "xfmail"),
    APPS_XMAG("apps", "xmag"),
    DEVICES_3FLOPPY_MOUNT("devices", "3floppy_mount"),
    DEVICES_3FLOPPY_UNMOUNT("devices", "3floppy_unmount"),
    DEVICES_5FLOPPY_MOUNT("devices", "5floppy_mount"),
    DEVICES_5FLOPPY_UNMOUNT("devices", "5floppy_unmount"),
    DEVICES_BLOCKDEVICE("devices", "blockdevice"),
    DEVICES_CAMERA("devices", "camera"),
    DEVICES_CAMERA_MOUNT("devices", "camera_mount"),
    DEVICES_CAMERA_UNMOUNT("devices", "camera_unmount"),
    DEVICES_CDAUDIO_MOUNT("devices", "cdaudio_mount"),
    DEVICES_CDAUDIO_UNMOUNT("devices", "cdaudio_unmount"),
    DEVICES_CDROM_MOUNT("devices", "cdrom_mount"),
    DEVICES_CDROM_UNMOUNT("devices", "cdrom_unmount"),
    DEVICES_CDWRITER_MOUNT("devices", "cdwriter_mount"),
    DEVICES_CDWRITER_UNMOUNT("devices", "cdwriter_unmount"),
    DEVICES_DVD_MOUNT("devices", "dvd_mount"),
    DEVICES_DVD_UNMOUNT("devices", "dvd_unmount"),
    DEVICES_HDD_MOUNT("devices", "hdd_mount"),
    DEVICES_HDD_UNMOUNT("devices", "hdd_unmount"),
    DEVICES_IPOD("devices", "ipod"),
    DEVICES_JOYSTICK("devices", "joystick"),
    DEVICES_KSIM_CPU("devices", "ksim_cpu"),
    DEVICES_MEMORY("devices", "memory"),
    DEVICES_MO_MOUNT("devices", "mo_mount"),
    DEVICES_MO_UNMOUNT("devices", "mo_unmount"),
    DEVICES_MODEM("devices", "modem"),
    DEVICES_MOUSE("devices", "mouse"),
    DEVICES_NFS_MOUNT("devices", "nfs_mount"),
    DEVICES_NFS_UNMOUNT("devices", "nfs_unmount"),
    DEVICES_PDA("devices", "pda"),
    DEVICES_PDA_BLACK("devices", "pda_black"),
    DEVICES_PDA_BLUE("devices", "pda_blue"),
    DEVICES_PRINT_CLASS("devices", "print_class"),
    DEVICES_PRINT_PRINTER("devices", "print_printer"),
    DEVICES_PRINTER("devices", "printer"),
    DEVICES_PRINTER1("devices", "printer1"),
    DEVICES_RAID("devices", "raid"),
    DEVICES_SAMBA_MOUNT("devices", "samba_mount"),
    DEVICES_SAMBA_UNMOUNT("devices", "samba_unmount"),
    DEVICES_SCANNER("devices", "scanner"),
    DEVICES_TABLET("devices", "tablet"),
    DEVICES_TV("devices", "tv"),
    DEVICES_USBPENDRIVE_MOUNT("devices", "usbpendrive_mount"),
    DEVICES_USBPENDRIVE_UNMOUNT("devices", "usbpendrive_unmount"),
    DEVICES_ZIP_MOUNT("devices", "zip_mount"),
    DEVICES_ZIP_UNMOUNT("devices", "zip_unmount"),
    FILESYSTEMS_CAMERA("filesystems", "camera"),
    FILESYSTEMS_CHARDEVICE("filesystems", "chardevice"),
    FILESYSTEMS_DESKTOP("filesystems", "desktop"),
    FILESYSTEMS_EXEC("filesystems", "exec"),
    FILESYSTEMS_FILE_BROKEN("filesystems", "file_broken"),
    FILESYSTEMS_FILE_IMPORTANT("filesystems", "file_important"),
    FILESYSTEMS_FILE_LOCKED("filesystems", "file_locked"),
    FILESYSTEMS_FILE_TEMPORARY("filesystems", "file_temporary"),
    FILESYSTEMS_FOLDER("filesystems", "folder"),
    FILESYSTEMS_FOLDER_BLUE("filesystems", "folder_blue"),
    FILESYSTEMS_FOLDER_BLUE_OPEN("filesystems", "folder_blue_open"),
    FILESYSTEMS_FOLDER_COOL("filesystems", "folder_cool"),
    FILESYSTEMS_FOLDER_CYAN("filesystems", "folder_cyan"),
    FILESYSTEMS_FOLDER_CYAN_OPEN("filesystems", "folder_cyan_open"),
    FILESYSTEMS_FOLDER_DOWNLOAD("filesystems", "folder_download"),
    FILESYSTEMS_FOLDER_FAVORITE("filesystems", "folder_favorite"),
    FILESYSTEMS_FOLDER_FONT("filesystems", "folder_font"),
    FILESYSTEMS_FOLDER_GAMES("filesystems", "folder_games"),
    FILESYSTEMS_FOLDER_GREEN("filesystems", "folder_green"),
    FILESYSTEMS_FOLDER_GREEN_OPEN("filesystems", "folder_green_open"),
    FILESYSTEMS_FOLDER_GREY("filesystems", "folder_grey"),
    FILESYSTEMS_FOLDER_GREY_OPEN("filesystems", "folder_grey_open"),
    FILESYSTEMS_FOLDER_HOME("filesystems", "folder_home"),
    FILESYSTEMS_FOLDER_HTML("filesystems", "folder_html"),
    FILESYSTEMS_FOLDER_IMAGE("filesystems", "folder_image"),
    FILESYSTEMS_FOLDER_IMPORTANT("filesystems", "folder_important"),
    FILESYSTEMS_FOLDER_LOCKED("filesystems", "folder_locked"),
    FILESYSTEMS_FOLDER_MAIL("filesystems", "folder_mail"),
    FILESYSTEMS_FOLDER_MAN("filesystems", "folder_man"),
    FILESYSTEMS_FOLDER_MIDI("filesystems", "folder_midi"),
    FILESYSTEMS_FOLDER_OPEN("filesystems", "folder_open"),
    FILESYSTEMS_FOLDER_ORANGE("filesystems", "folder_orange"),
    FILESYSTEMS_FOLDER_ORANGE_OPEN("filesystems", "folder_orange_open"),
    FILESYSTEMS_FOLDER_PHOTO("filesystems", "folder_photo"),
    FILESYSTEMS_FOLDER_PRINT("filesystems", "folder_print"),
    FILESYSTEMS_FOLDER_PRINT2("filesystems", "folder_print2"),
    FILESYSTEMS_FOLDER_RED("filesystems", "folder_red"),
    FILESYSTEMS_FOLDER_RED_OPEN("filesystems", "folder_red_open"),
    FILESYSTEMS_FOLDER_SOUND("filesystems", "folder_sound"),
    FILESYSTEMS_FOLDER_TAR("filesystems", "folder_tar"),
    FILESYSTEMS_FOLDER_TXT("filesystems", "folder_txt"),
    FILESYSTEMS_FOLDER_VIDEO("filesystems", "folder_video"),
    FILESYSTEMS_FOLDER_VIOLET("filesystems", "folder_violet"),
    FILESYSTEMS_FOLDER_VIOLET_OPEN("filesystems", "folder_violet_open"),
    FILESYSTEMS_FOLDER_YELLOW("filesystems", "folder_yellow"),
    FILESYSTEMS_FOLDER_YELLOW_OPEN("filesystems", "folder_yellow_open"),
    FILESYSTEMS_FTP("filesystems", "ftp"),
    FILESYSTEMS_LINK("filesystems", "link"),
    FILESYSTEMS_LOCKOVERLAY("filesystems", "lockoverlay"),
    FILESYSTEMS_NETWORK("filesystems", "network"),
    FILESYSTEMS_NETWORK_LOCAL("filesystems", "network_local"),
    FILESYSTEMS_PIPE("filesystems", "pipe"),
    FILESYSTEMS_SERVER("filesystems", "server"),
    FILESYSTEMS_SERVICES("filesystems", "services"),
    FILESYSTEMS_SOCKET("filesystems", "socket"),
    FILESYSTEMS_TRASHCAN_EMPTY("filesystems", "trashcan_empty"),
    FILESYSTEMS_TRASHCAN_FULL("filesystems", "trashcan_full"),
    FILESYSTEMS_WWW("filesystems", "www"),
    FILESYSTEMS_ZIP("filesystems", "zip"),
    MIMETYPES_ABIWORD_ABI("mimetypes", "abiword_abi"),
    MIMETYPES_APPLIX("mimetypes", "applix"),
    MIMETYPES_ASCII("mimetypes", "ascii"),
    MIMETYPES_BC("mimetypes", "bc"),
    MIMETYPES_BINARY("mimetypes", "binary"),
    MIMETYPES_CDBO_LIST("mimetypes", "cdbo_list"),
    MIMETYPES_CDIMAGE("mimetypes", "cdimage"),
    MIMETYPES_CDR("mimetypes", "cdr"),
    MIMETYPES_CDTRACK("mimetypes", "cdtrack"),
    MIMETYPES_COLORSCM("mimetypes", "colorscm"),
    MIMETYPES_COLORSET("mimetypes", "colorset"),
    MIMETYPES_CORE("mimetypes", "core"),
    MIMETYPES_DEB("mimetypes", "deb"),
    MIMETYPES_DOCUMENT("mimetypes", "document"),
    MIMETYPES_DVI("mimetypes", "dvi"),
    MIMETYPES_EBUILD("mimetypes", "ebuild"),
    MIMETYPES_EMPTY("mimetypes", "empty"),
    MIMETYPES_ENCRYPTED("mimetypes", "encrypted"),
    MIMETYPES_EXEC_WINE("mimetypes", "exec_wine"),
    MIMETYPES_FILE_LOCKED("mimetypes", "file_locked"),
    MIMETYPES_FILE_TEMPORARY("mimetypes", "file_temporary"),
    MIMETYPES_FONT("mimetypes", "font"),
    MIMETYPES_FONT_BITMAP("mimetypes", "font_bitmap"),
    MIMETYPES_FONT_TRUETYPE("mimetypes", "font_truetype"),
    MIMETYPES_FONT_TYPE1("mimetypes", "font_type1"),
    MIMETYPES_GETTEXT("mimetypes", "gettext"),
    MIMETYPES_GF("mimetypes", "gf"),
    MIMETYPES_GNOME_APP_INFO("mimetypes", "gnome_app_info"),
    MIMETYPES_HTML("mimetypes", "html"),
    MIMETYPES_IMAGE("mimetypes", "image"),
    MIMETYPES_IMAGE_GIMP("mimetypes", "image_gimp"),
    MIMETYPES_INFO("mimetypes", "info"),
    MIMETYPES_INSTALL("mimetypes", "install"),
    MIMETYPES_JAVA_JAR("mimetypes", "java_jar"),
    MIMETYPES_KARBON_KARBON("mimetypes", "karbon_karbon"),
    MIMETYPES_KCHART_CHRT("mimetypes", "kchart_chrt"),
    MIMETYPES_KFORMULA_KFO("mimetypes", "kformula_kfo"),
    MIMETYPES_KGET_LIST("mimetypes", "kget_list"),
    MIMETYPES_KIG_DOC("mimetypes", "kig_doc"),
    MIMETYPES_KIVIO_FLW("mimetypes", "kivio_flw"),
    MIMETYPES_KMULTIPLE("mimetypes", "kmultiple"),
    MIMETYPES_KOFFICE("mimetypes", "koffice"),
    MIMETYPES_KPOVMODELER_DOC("mimetypes", "kpovmodeler_doc"),
    MIMETYPES_KPRESENTER_KPR("mimetypes", "kpresenter_kpr"),
    MIMETYPES_KREC_FILEEMPTY("mimetypes", "krec_fileempty"),
    MIMETYPES_KREC_FILEPLAY("mimetypes", "krec_fileplay"),
    MIMETYPES_KREC_FILEREC("mimetypes", "krec_filerec"),
    MIMETYPES_KRITA_KRA("mimetypes", "krita_kra"),
    MIMETYPES_KSPREAD_KSP("mimetypes", "kspread_ksp"),
    MIMETYPES_KUGAR_KUD("mimetypes", "kugar_kud"),
    MIMETYPES_KUGARDATA("mimetypes", "kugardata"),
    MIMETYPES_KWORD_KWD("mimetypes", "kword_kwd"),
    MIMETYPES_LOG("mimetypes", "log"),
    MIMETYPES_MAKE("mimetypes", "make"),
    MIMETYPES_MAN("mimetypes", "man"),
    MIMETYPES_MESSAGE("mimetypes", "message"),
    MIMETYPES_METAFONT("mimetypes", "metafont"),
    MIMETYPES_MIDI("mimetypes", "midi"),
    MIMETYPES_MIME("mimetypes", "mime"),
    MIMETYPES_MIME_EBUILD("mimetypes", "mime_ebuild"),
    MIMETYPES_MIME_EMPTY("mimetypes", "mime_empty"),
    MIMETYPES_MIME_KOFFICE("mimetypes", "mime_koffice"),
    MIMETYPES_MIME_LYX("mimetypes", "mime_lyx"),
    MIMETYPES_MIME_TEMP("mimetypes", "mime_temp"),
    MIMETYPES_MISC_DOC("mimetypes", "misc_doc"),
    MIMETYPES_MOZILLA_DOC("mimetypes", "mozilla_doc"),
    MIMETYPES_NETSCAPE_DOC("mimetypes", "netscape_doc"),
    MIMETYPES_OOO_CALC("mimetypes", "ooo_calc"),
    MIMETYPES_OOO_CALC_TPL("mimetypes", "ooo_calc_tpl"),
    MIMETYPES_OOO_DRAW("mimetypes", "ooo_draw"),
    MIMETYPES_OOO_DRAW_TPL("mimetypes", "ooo_draw_tpl"),
    MIMETYPES_OOO_IMPRESS("mimetypes", "ooo_impress"),
    MIMETYPES_OOO_IMPRESS_TPL("mimetypes", "ooo_impress_tpl"),
    MIMETYPES_OOO_SETUP("mimetypes", "ooo_setup"),
    MIMETYPES_OOO_WRITER("mimetypes", "ooo_writer"),
    MIMETYPES_OOO_WRITER_TPL("mimetypes", "ooo_writer_tpl"),
    MIMETYPES_PATCH("mimetypes", "patch"),
    MIMETYPES_PDF("mimetypes", "pdf"),
    MIMETYPES_POSTSCRIPT("mimetypes", "postscript"),
    MIMETYPES_QUICKTIME("mimetypes", "quicktime"),
    MIMETYPES_README("mimetypes", "readme"),
    MIMETYPES_REAL("mimetypes", "real"),
    MIMETYPES_REAL_DOC("mimetypes", "real_doc"),
    MIMETYPES_RECYCLED("mimetypes", "recycled"),
    MIMETYPES_RESOURCE("mimetypes", "resource"),
    MIMETYPES_RPM("mimetypes", "rpm"),
    MIMETYPES_SHELLSCRIPT("mimetypes", "shellscript"),
    MIMETYPES_SOFFICE("mimetypes", "soffice"),
    MIMETYPES_SOUND("mimetypes", "sound"),
    MIMETYPES_SOURCE("mimetypes", "source"),
    MIMETYPES_SOURCE_C("mimetypes", "source_c"),
    MIMETYPES_SOURCE_CPP("mimetypes", "source_cpp"),
    MIMETYPES_SOURCE_CSS("mimetypes", "source_css"),
    MIMETYPES_SOURCE_F("mimetypes", "source_f"),
    MIMETYPES_SOURCE_H("mimetypes", "source_h"),
    MIMETYPES_SOURCE_J("mimetypes", "source_j"),
    MIMETYPES_SOURCE_JAVA("mimetypes", "source_java"),
    MIMETYPES_SOURCE_L("mimetypes", "source_l"),
    MIMETYPES_SOURCE_MOC("mimetypes", "source_moc"),
    MIMETYPES_SOURCE_O("mimetypes", "source_o"),
    MIMETYPES_SOURCE_P("mimetypes", "source_p"),
    MIMETYPES_SOURCE_PHP("mimetypes", "source_php"),
    MIMETYPES_SOURCE_PL("mimetypes", "source_pl"),
    MIMETYPES_SOURCE_PY("mimetypes", "source_py"),
    MIMETYPES_SOURCE_S("mimetypes", "source_s"),
    MIMETYPES_SOURCE_Y("mimetypes", "source_y"),
    MIMETYPES_SPREADSHEET("mimetypes", "spreadsheet"),
    MIMETYPES_TAR("mimetypes", "tar"),
    MIMETYPES_TEMPLATE_SOURCE("mimetypes", "template_source"),
    MIMETYPES_TEX("mimetypes", "tex"),
    MIMETYPES_TGZ("mimetypes", "tgz"),
    MIMETYPES_TXT("mimetypes", "txt"),
    MIMETYPES_UNKNOWN("mimetypes", "unknown"),
    MIMETYPES_VCALENDAR("mimetypes", "vcalendar"),
    MIMETYPES_VCARD("mimetypes", "vcard"),
    MIMETYPES_VECTORGFX("mimetypes", "vectorgfx"),
    MIMETYPES_VIDEO("mimetypes", "video"),
    MIMETYPES_WIDGET_DOC("mimetypes", "widget_doc"),
    MIMETYPES_WORDPROCESSING("mimetypes", "wordprocessing");

    private static final String ERROR_DESCRIPTION_BLANK = "Argument 'description' must not be blank";

    private final String category;
    private final String description;

    Nuvola(@Nonnull String category, @Nonnull String description) {
        this.category = category;
        this.description = description;
    }

    @Nonnull
    public String getCategory() {
        return category;
    }

    @Nonnull
    public String getDescription() {
        return description;
    }

    @Nonnull
    public String formatted() {
        return category + ":" + description;
    }

    @Nonnull
    public String asResource(int size) {
        requireValidSize(size);
        if ("actions".equals(category) && size > 48) {
            throw new IllegalArgumentException("Category " + category + " is not available for size " + size);
        }
        return "nuvola/icons/" + size + "x" + size + "/" + category + "/" + description + ".png";
    }

    @Nonnull
    public static String asResource(@Nonnull String description) {
        int size = 16;
        checkDescription(description);

        String[] parts = description.split(":");
        if (parts.length == 3) {
            try {
                size = Integer.parseInt(parts[2]);
            } catch (NumberFormatException e) {
                throw invalidDescription(description, e);
            }
        }

        Nuvola nuvola = findByDescription(description, size);
        return nuvola.asResource(size);
    }

    @Nonnull
    public static Nuvola findByDescription(@Nonnull String description) {
        checkDescription(description);

        Nuvola nuvola = null;
        String[] parts = description.split(":");
        for (Nuvola n : values()) {
            if (n.category.equalsIgnoreCase(parts[0]) && n.description.equalsIgnoreCase(parts[1])) {
                nuvola = n;
                break;
            }
        }

        if (nuvola == null) {
            throw invalidDescription(description);
        }

        if (parts.length == 3) {
            int size = 16;
            try {
                size = Integer.parseInt(parts[2]);
            } catch (NumberFormatException e) {
                throw invalidDescription(description, e);
            }
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            if (classLoader.getResource(nuvola.asResource(size)) != null) {
                return nuvola;
            }
        }

        return nuvola;
    }

    @Nonnull
    public static Nuvola findByDescription(@Nonnull String description, int size) {
        checkDescription(description);

        Nuvola nuvola = null;
        String[] parts = description.split(":");
        for (Nuvola n : values()) {
            if (n.category.equalsIgnoreCase(parts[0]) && n.description.equalsIgnoreCase(parts[1])) {
                nuvola = n;
                break;
            }
        }

        if (nuvola == null) {
            throw invalidDescription(description);
        }

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        if (classLoader.getResource(nuvola.asResource(size)) != null) {
            return nuvola;
        }

        throw invalidDescription(description);
    }

    public static int requireValidSize(int size) {
        requireState(size == 16 || size == 22 || size == 32 || size == 48 || size == 64 || size == 128, "Argument 'size' must be one of [16, 22, 32, 48, 64, 128].");
        return size;
    }

    private static void checkDescription(String description) {
        if (isBlank(description)) {
            throw invalidDescription(description);
        }
    }

    @Nonnull
    public static IllegalArgumentException invalidDescription(@Nonnull String description) {
        requireNonBlank(description, ERROR_DESCRIPTION_BLANK);
        throw new IllegalArgumentException("Description " + description + " is not a valid Nuvola icon description");
    }

    @Nonnull
    public static IllegalArgumentException invalidDescription(@Nonnull String description, Exception e) {
        requireNonBlank(description, ERROR_DESCRIPTION_BLANK);
        throw new IllegalArgumentException("Description " + description + " is not a valid Nuvola icon description", e);
    }
}
