package com.facebook.ads.redexgen.core;

import com.google.common.base.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public abstract class CB extends AbstractC2405kK {
    public static int A00(@CheckForNull Object... objects) {
        return Arrays.hashCode(objects);
    }

    public static boolean A01(@CheckForNull Object a10, @CheckForNull Object b10) {
        return a10 == b10 || (a10 != null && a10.equals(b10));
    }
}
