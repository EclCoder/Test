package com.googlecode.mp4parser.util;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.AbstractContainerBox;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class Path {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static Pattern component = Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");

    private Path() {
    }

    public static String createPath(Box box) {
        return createPath(box, "");
    }

    public static <T extends Box> T getPath(Box box, String str) {
        List paths = getPaths(box, str, true);
        if (paths.isEmpty()) {
            return null;
        }
        return (T) paths.get(0);
    }

    public static <T extends Box> List<T> getPaths(Box box, String str) {
        return getPaths(box, str, false);
    }

    public static boolean isContained(Box box, String str) {
        return getPaths(box, str).contains(box);
    }

    private static String createPath(Box box, String str) {
        Container parent = box.getParent();
        int i10 = 0;
        for (Box box2 : parent.getBoxes()) {
            if (box2.getType().equals(box.getType())) {
                if (box2 == box) {
                    break;
                }
                i10++;
            }
        }
        String str2 = String.format("/%s[%d]", box.getType(), Integer.valueOf(i10)) + str;
        return parent instanceof Box ? createPath((Box) parent, str2) : str2;
    }

    public static <T extends Box> List<T> getPaths(Container container, String str) {
        return getPaths(container, str, false);
    }

    public static <T extends Box> T getPath(Container container, String str) {
        List paths = getPaths(container, str, true);
        if (paths.isEmpty()) {
            return null;
        }
        return (T) paths.get(0);
    }

    private static <T extends Box> List<T> getPaths(AbstractContainerBox abstractContainerBox, String str, boolean z10) {
        return getPaths((Object) abstractContainerBox, str, z10);
    }

    private static <T extends Box> List<T> getPaths(Container container, String str, boolean z10) {
        return getPaths((Object) container, str, z10);
    }

    public static <T extends Box> T getPath(AbstractContainerBox abstractContainerBox, String str) {
        List paths = getPaths(abstractContainerBox, str, true);
        if (paths.isEmpty()) {
            return null;
        }
        return (T) paths.get(0);
    }

    private static <T extends Box> List<T> getPaths(Box box, String str, boolean z10) {
        return getPaths((Object) box, str, z10);
    }

    private static <T extends Box> List<T> getPaths(Object obj, String str, boolean z10) {
        String strSubstring;
        if (str.startsWith("/")) {
            String strSubstring2 = str.substring(1);
            while (obj instanceof Box) {
                obj = ((Box) obj).getParent();
            }
            str = strSubstring2;
        }
        if (str.length() == 0) {
            if (obj instanceof Box) {
                return Collections.singletonList((Box) obj);
            }
            throw new RuntimeException("Result of path expression seems to be the root container. This is not allowed!");
        }
        int i10 = 0;
        if (str.contains("/")) {
            strSubstring = str.substring(str.indexOf(47) + 1);
            str = str.substring(0, str.indexOf(47));
        } else {
            strSubstring = "";
        }
        Matcher matcher = component.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            if ("..".equals(strGroup)) {
                if (obj instanceof Box) {
                    return getPaths(((Box) obj).getParent(), strSubstring, z10);
                }
                return Collections.EMPTY_LIST;
            }
            if (obj instanceof Container) {
                int i11 = matcher.group(2) != null ? Integer.parseInt(matcher.group(3)) : -1;
                LinkedList linkedList = new LinkedList();
                for (Box box : ((Container) obj).getBoxes()) {
                    if (box.getType().matches(strGroup)) {
                        if (i11 == -1 || i11 == i10) {
                            linkedList.addAll(getPaths(box, strSubstring, z10));
                        }
                        i10++;
                    }
                    if (z10 || i11 >= 0) {
                        if (!linkedList.isEmpty()) {
                            break;
                        }
                    }
                }
                return linkedList;
            }
            return Collections.EMPTY_LIST;
        }
        throw new RuntimeException(String.valueOf(str) + " is invalid path.");
    }
}
