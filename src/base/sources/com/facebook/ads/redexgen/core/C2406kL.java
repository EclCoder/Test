package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.File;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@MetaExoPlayerCustomization(type = {"NON_FINAL"}, value = "D54147219: For usage in Hero Simple Cache")
public final class C2406kL extends MZ {
    public static byte[] A00;
    public static String[] A01 = {"OfRtwvXctRBBw9gKY8TWbFYEyrfTWUJ5", "O6KpU7VzQb47vbeRDg05X09dlcjSdrsx", "cGvb3Ixjw9glBryIXlKjYbTfS5Fhfs8X", "N3q9w52q7yAs4MQ92KFgaGGqaH957eGg", "tjYOyBogfVGQWArOceKhNo0cgBZwypsu", "xmSgRcjNSrQyzCd8Uu5cYZa5hRrGr9a8", "10tums6VyruOnAjrgpE7eJ8", "dQkd96lx4iAtJg2k9NqdAtWwc5SxpqrB"};
    public static final Pattern A02;
    public static final Pattern A03;
    public static final Pattern A04;

    /* JADX WARN: Code duplicated, block: B:26:0x00aa A[PHI: r8
      0x00aa: PHI (r8v2 long) = (r8v0 long), (r8v3 long) binds: [B:30:0x00d7, B:25:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2406kL A01(File file, long j10, long j11, C1439Mi c1439Mi) {
        String strA0F;
        long j12;
        long j13 = j11;
        long length = j10;
        String name = file.getName();
        if (!name.endsWith(A07(1, 7, 86))) {
            file = A06(file, c1439Mi);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        Matcher matcher = A04.matcher(name);
        if (!matcher.matches() || (strA0F = c1439Mi.A0F(Integer.parseInt((String) AbstractC09823y.A01(matcher.group(1))))) == null) {
            return null;
        }
        if (length == -1) {
            length = file.length();
        }
        String[] strArr = A01;
        if (strArr[0].charAt(16) == strArr[2].charAt(16)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[0] = "3kLuDF7WddxsAuj74YBqy147zLEiHTF0";
        strArr2[2] = "yBKAMqN1ItuNGOhP7OCxzG9BVSMF66iW";
        if (length == 0) {
            return null;
        }
        String strGroup = matcher.group(2);
        if (A01[7].charAt(17) != 'N') {
            String[] strArr3 = A01;
            strArr3[4] = "3kqdJGKw3CP8mm7UdAcKh0LFQ5WJAflS";
            strArr3[3] = "ycjOreuQW9uSgeP7cymbjNDk2aBjdnIT";
            j12 = Long.parseLong((String) AbstractC09823y.A01(strGroup));
            if (j13 == C.TIME_UNSET) {
                j13 = Long.parseLong((String) AbstractC09823y.A01(matcher.group(3)));
            }
        } else {
            A01[7] = "aSANG9oSWduq5GFK5NdZXfdN35yUyqYg";
            j12 = Long.parseLong((String) AbstractC09823y.A01(strGroup));
            if (j13 == C.TIME_UNSET) {
                j13 = Long.parseLong((String) AbstractC09823y.A01(matcher.group(3)));
            }
        }
        return new C2406kL(strA0F, j12, length, j13, file);
    }

    public static String A07(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 31);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{93, -93, -21, -88, -93, -38, -19, -28, -28, -82, -76, -79, -81, -30, -76, -82, -30, -22, -79, -81, -30, -76, -82, -30, -22, -79, -81, -30, -76, -4, -73, -30, -76, -21, -2, -11, -86, -13, -67, -61, -64, -66, -15, -61, -67, -15, -7, -64, -66, -15, -61, -67, -15, -7, -64, -66, -15, -61, 11, -57, -15, -61, -6, 13, 4, -71, -40, -94, -42, -34, -91, -93, -42, -88, -94, -42, -34, -91, -93, -42, -88, -94, -42, -34, -91, -93, -42, -88, -16, -83, -42, -88, -33, -14, -23, -98};
    }

    static {
        A08();
        A02 = Pattern.compile(A07(8, 29, 103), 32);
        A03 = Pattern.compile(A07(37, 29, Sdk$SDKError.b.PROTOBUF_SERIALIZATION_ERROR_VALUE), 32);
        A04 = Pattern.compile(A07(66, 30, 91), 32);
    }

    public C2406kL(String str, long j10, long j11, long j12, File file) {
        super(str, j10, j11, j12, file);
    }

    public static C2406kL A02(File file, long j10, C1439Mi c1439Mi) {
        return A01(file, j10, C.TIME_UNSET, c1439Mi);
    }

    public static C2406kL A03(String str, long j10) {
        return new C2406kL(str, j10, -1L, C.TIME_UNSET, null);
    }

    public static C2406kL A04(String str, long j10, long j11) {
        return new C2406kL(str, j10, j11, C.TIME_UNSET, null);
    }

    public static File A05(File file, int i10, long j10, long j11) {
        StringBuilder sbAppend = new StringBuilder().append(i10);
        String strA07 = A07(0, 1, 16);
        return new File(file, sbAppend.append(strA07).append(j10).append(strA07).append(j11).append(A07(1, 7, 86)).toString());
    }

    public static File A06(File file, C1439Mi c1439Mi) {
        String strA0l = null;
        String name = file.getName();
        Matcher matcher = A03.matcher(name);
        if (matcher.matches()) {
            String key = matcher.group(1);
            strA0l = C5C.A0l((String) AbstractC09823y.A01(key));
        } else {
            matcher = A02.matcher(name);
            if (matcher.matches()) {
                String key2 = matcher.group(1);
                Object objA01 = AbstractC09823y.A01(key2);
                String[] strArr = A01;
                String filename = strArr[0];
                if (filename.charAt(16) == strArr[2].charAt(16)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[0] = "SH9gvm8hJK4XlSeUgFI9DN0CGl9RiOAn";
                strArr2[2] = "6Y4JW5a7TLCjGmr1nVotQhjybpiv9cHJ";
                strA0l = (String) objA01;
            }
        }
        if (strA0l == null) {
            return null;
        }
        File file2 = (File) AbstractC09823y.A02(file.getParentFile());
        int iA0B = c1439Mi.A0B(strA0l);
        String key3 = matcher.group(2);
        long j10 = Long.parseLong((String) AbstractC09823y.A01(key3));
        String key4 = matcher.group(3);
        File fileA05 = A05(file2, iA0B, j10, Long.parseLong((String) AbstractC09823y.A01(key4)));
        if (!file.renameTo(fileA05)) {
            return null;
        }
        return fileA05;
    }

    public final C2406kL A09(File file, long j10) {
        AbstractC09823y.A08(this.A05);
        return new C2406kL(this.A04, this.A02, this.A01, j10, file);
    }
}
