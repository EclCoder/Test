package com.facebook.ads.redexgen.core;

import android.app.ActivityManager;
import android.content.Context;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1697Wp {
    public static byte[] A00;
    public static String[] A01 = {"vserbkQ71L70HeExkEksLvSV50Js9e5T", "kCtue8tdTX7Ntsd63evdhPLiI5GlGyVZ", "TwC9DE0UkCmO5xuA9ppRryz5QvyD", "4CWs1R6rr7PkkffzytFACCqk28rMKWqF", "DS0L0fcRoHYALrKB9SSkXSb7384LvFtu", "e8tzsRThNax4EAToJhNq21dAKBpwgTLo", "Q0BiPrkB2PSWzVDnLZTkEnIKaCsuaheD", "rbmY91JFcJMC4pCqNbunWn9nQrXHl54t"};

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[6].charAt(20) == strArr[1].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "hlZJhcxljYiKc7UKHZyQNCRGeosS0rVV";
            strArr2[7] = "L6Z1FseRPLChQnX48wkOINplJZHgpjkr";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 49);
            i13++;
        }
    }

    public static void A03() {
        A00 = new byte[]{-37, -35, -18, -29, -16, -29, -18, -13, -1, 12, 2, 16, 13, 7, 2, -52, 7, 12, 18, 3, 12, 18, -52, 1, -1, 18, 3, 5, 13, 16, 23, -52, -22, -33, -13, -20, -31, -26, -29, -16};
    }

    static {
        A03();
    }

    public static EnumC1696Wo A00(Context context) {
        try {
            return A01(context);
        } catch (Exception unused) {
            return EnumC1696Wo.A05;
        }
    }

    public static EnumC1696Wo A01(Context context) {
        if (context == null) {
            return EnumC1696Wo.A0D;
        }
        ActivityManager mgr = (ActivityManager) context.getSystemService(A02(0, 8, 73));
        if (mgr == null) {
            EnumC1696Wo enumC1696Wo = EnumC1696Wo.A08;
            if (A01[0].charAt(27) == 'o') {
                throw new RuntimeException();
            }
            A01[2] = "W800VLcbCNBOE1f9F";
            return enumC1696Wo;
        }
        List<ActivityManager.AppTask> tasks = mgr.getAppTasks();
        if (tasks.isEmpty()) {
            return EnumC1696Wo.A0B;
        }
        Iterator<ActivityManager.AppTask> it = tasks.iterator();
        while (it.hasNext()) {
            ActivityManager.RecentTaskInfo taskInfo = it.next().getTaskInfo();
            if (taskInfo != null && taskInfo.baseIntent != null && taskInfo.baseIntent.getCategories() != null && taskInfo.baseIntent.getCategories().contains(A02(8, 32, 109))) {
                return EnumC1696Wo.A06;
            }
        }
        EnumC1696Wo enumC1696Wo2 = EnumC1696Wo.A09;
        String[] strArr = A01;
        if (strArr[3].charAt(22) == strArr[5].charAt(22)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[4] = "GyHEsdoLJV3XEjiFxTFX6orc2Mvnrd3k";
        strArr2[7] = "nU2m6dMK7qfy4atV1JxTmvIeg7zDsgbu";
        return enumC1696Wo2;
    }
}
