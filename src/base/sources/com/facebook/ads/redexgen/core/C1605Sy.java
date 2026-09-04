package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.inmobi.media.core.config.models.AdConfig;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1605Sy {
    public static byte[] A03;
    public static String[] A04 = {"hUOGynEtmSUNsKdJkghkOGNAWtryygzy", "wzPRxUupX2XKUl6NSNI9kT750batbohw", "Jhw1FAiFO5yEDnp58HFyVFkAnHcYvwe5", "TOMeOtqGrF4uQ0cY9hasq1ESWlFY5vR9", "yYpnUvpVzVqKhRvrciBHRtLUwNGFzaUs", "hHaB", "31TBXmQRr4tlfWcucEg5Ko3P35yO7", "Q2"};
    public static final String A05;
    public static volatile C1605Sy A06;
    public final C2194ge A00;
    public final Map<String, C1602Sv> A02 = Collections.synchronizedMap(new HashMap());
    public final Map<String, Float> A01 = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private Bitmap A02(T8 t10, C1602Sv c1602Sv, String str) throws Throwable {
        Bitmap bitmapA01;
        String str2 = c1602Sv.A08;
        int i10 = c1602Sv.A04;
        int i11 = c1602Sv.A05;
        long jCurrentTimeMillis = System.currentTimeMillis();
        IOException e10 = null;
        String strA08 = A08(Sdk$SDKError.b.STALE_CACHED_RESPONSE_VALUE, 9, 68);
        boolean zStartsWith = str2.startsWith(strA08);
        String strA09 = A08(239, 22, Sdk$SDKError.b.JSON_ENCODE_ERROR_VALUE);
        if (zStartsWith || str2.startsWith(strA09)) {
            String strSubstring = str2.startsWith(strA08) ? str2.substring(strA08.length()) : str2.substring(strA09.length());
            InputStream inputStreamOpen = null;
            try {
                try {
                    inputStreamOpen = this.A00.getAssets().open(strSubstring);
                    if (A0D(i10, i11)) {
                        try {
                            bitmapA01 = T2.A01(inputStreamOpen, i10, i11);
                        } catch (IOException e11) {
                            e = e11;
                            A0C(e);
                            if (inputStreamOpen != null) {
                                A0A(inputStreamOpen);
                            }
                            return null;
                        } catch (OutOfMemoryError e12) {
                            e = e12;
                            A0C(e);
                            if (inputStreamOpen != null) {
                                A0A(inputStreamOpen);
                            }
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (inputStreamOpen != null) {
                                A0A(inputStreamOpen);
                            }
                            throw th;
                        }
                    } else {
                        bitmapA01 = BitmapFactory.decodeStream(inputStreamOpen);
                    }
                    if (inputStreamOpen != null) {
                        A0A(inputStreamOpen);
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e13) {
                e = e13;
            } catch (OutOfMemoryError e14) {
                e = e14;
            } catch (Throwable th4) {
                th = th4;
            }
        } else if (A0D(i10, i11)) {
            try {
                bitmapA01 = A05(str2, i10, i11);
            } catch (IOException e15) {
                e10 = e15;
                A0C(e10);
                bitmapA01 = A03(str2);
            }
        } else {
            bitmapA01 = A03(str2);
        }
        String string = e10 != null ? e10.toString() : null;
        if (bitmapA01 == null) {
            T0.A03(t10, c1602Sv, str, T0.A03, string, null, null);
            return null;
        }
        long jA00 = A00(str2, bitmapA01);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (jA00 > 0) {
            T0.A03(t10, c1602Sv, str, T0.A02, string, Long.valueOf(jA00), Long.valueOf(jCurrentTimeMillis2));
            return bitmapA01;
        }
        T0.A03(t10, c1602Sv, str, T0.A01, string, null, null);
        if (C1648Up.A11(t10)) {
            return null;
        }
        return bitmapA01;
    }

    public static String A08(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 67);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A03 = new byte[]{3, 4, 119, 41, 55, 62, 58, 25, 28, 88, 23, 13, 12, 8, 13, 12, 88, 28, 29, 11, 12, 17, 22, 25, 12, 17, 23, 22, 88, 80, 30, 17, 20, 29, 69, 122, 81, 76, 85, 89, 72, 24, 75, 81, 66, 93, 24, 93, 64, 91, 93, 93, 92, 75, 24, 85, 89, 64, 24, 75, 81, 66, 93, 24, 94, 87, 74, 24, 75, 76, 87, 74, 89, 95, 93, 2, 24, 18, 48, 50, 57, 52, 113, 52, 35, 35, 62, 35, 127, 113, 19, 56, 37, 60, 48, 33, 113, 56, 34, 113, 63, 36, 61, 61, 127, 125, 90, 82, 87, 94, 95, 27, 79, 84, 27, 88, 84, 75, 66, 27, 87, 84, 88, 90, 87, 27, 82, 86, 90, 92, 94, 27, 82, 85, 79, 84, 27, 88, 90, 88, 83, 94, 27, 19, 78, 73, 87, 6, 38, 29, 18, 17, 31, 22, 83, 7, 28, 83, 4, 1, 26, 7, 22, 83, 17, 26, 7, 30, 18, 3, 83, 7, 28, 83, 21, 26, 31, 22, 83, 91, 6, 1, 31, 78, 70, 125, 114, 113, 127, 118, 51, 103, 124, 51, 100, 97, 122, 103, 118, 51, 113, 122, 103, 126, 114, 99, 51, 103, 124, 51, 124, 102, 103, 99, 102, 103, 51, 96, 103, 97, 118, 114, 126, 102, 116, 116, 98, 115, 61, 40, 40, 40, 85, 90, 95, 86, 9, 28, 28, 82, 93, 88, 81, 14, 27, 27, 27, 85, 90, 80, 70, 91, 93, 80, 107, 85, 71, 71, 81, 64, 27, 115, 119, 123, 125, 127, 10, 9, 7, 2, 42, 49, 52, 49, 48, 40, 49};
    }

    static {
        A09();
        A05 = C1605Sy.class.getSimpleName();
    }

    public C1605Sy(C2194ge c2194ge) {
        this.A00 = c2194ge;
    }

    private int A00(String str, Bitmap bitmap) {
        String strA08 = A08(0, 2, 105);
        if (bitmap == null) {
            A0C(null);
            return 0;
        }
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 26));
        ByteArrayOutputStream bOut = null;
        FileOutputStream fileOutputStream = null;
        try {
            bOut = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, bOut);
            int size = bOut.size();
            if (size >= C1648Up.A0H(this.A00)) {
                A0C(new Throwable(A08(35, 42, Sdk$SDKError.b.INVALID_RI_ENDPOINT_VALUE) + size));
                return 0;
            }
            fileOutputStream = new FileOutputStream(file);
            bOut.writeTo(fileOutputStream);
            fileOutputStream.flush();
            return size;
        } catch (OutOfMemoryError e10) {
            A0C(e10);
            Log.e(A05, A08(184, 39, 80), e10);
            return 0;
        } catch (FileNotFoundException e11) {
            Log.e(A05, A08(6, 29, 59) + file.getPath() + strA08, e11);
            A0C(e11);
            return 0;
        } catch (IOException e12) {
            A0C(e12);
            Log.e(A05, A08(148, 36, 48) + str + strA08, e12);
            return 0;
        } finally {
            A0A(bOut);
            A0A(fileOutputStream);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00b8  */
    private final Bitmap A01(T8 t10, C1602Sv c1602Sv, int i10, int i11, String str) throws Throwable {
        Bitmap bitmapDecodeFile;
        Bitmap bitmapA02;
        if (T0.A06(t10) && A08(266, 4, 37).equals(str)) {
            this.A02.put(c1602Sv.A08, c1602Sv);
        }
        String str2 = c1602Sv.A08;
        C1606Sz c1606Sz = new C1606Sz(c1602Sv.A06, c1602Sv.A07, A08(261, 5, 89), str, str2);
        File fileA07 = A07(this.A00);
        StringBuilder sbAppend = new StringBuilder().append(str2.hashCode());
        String url = A08(2, 4, 26);
        File file = new File(fileA07, sbAppend.append(url).toString());
        if (!file.exists()) {
            T0.A04(t10, c1606Sz, false);
            String url2 = A08(232, 7, Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE);
            if (!str2.startsWith(url2)) {
                bitmapA02 = A02(t10, c1602Sv, str);
            } else {
                if (A04[4].charAt(22) == 'U') {
                    throw new RuntimeException();
                }
                A04[4] = "1yvOkimt2rWPU4mmWW1HHQmjZRsiMbmk";
                String url3 = A08(239, 22, Sdk$SDKError.b.JSON_ENCODE_ERROR_VALUE);
                if (!str2.startsWith(url3)) {
                    bitmapA02 = A04(str2, i11, i10);
                } else {
                    bitmapA02 = A02(t10, c1602Sv, str);
                }
            }
            String str3 = c1602Sv.A08;
            if (A04[0].charAt(7) != 'l') {
                A04[5] = "mvVz";
                A0B(str3, bitmapA02);
                return bitmapA02;
            }
            A04[4] = "ZqrwEo7e3gbOTkHDiv52cvZJTxj52IUd";
            A0B(str3, bitmapA02);
            return bitmapA02;
        }
        T0.A04(t10, c1606Sz, true);
        try {
            if (A0D(i11, i10)) {
                bitmapDecodeFile = T2.A02(file.getCanonicalPath(), i11, i10, this.A00);
            } else {
                String url4 = file.getCanonicalPath();
                bitmapDecodeFile = BitmapFactory.decodeFile(url4);
            }
            String url5 = c1602Sv.A08;
            A0B(url5, bitmapDecodeFile);
            return bitmapDecodeFile;
        } catch (IOException e10) {
            A0C(e10);
            return null;
        }
    }

    private Bitmap A03(String str) {
        byte[] bArrA72;
        InterfaceC2148fu interfaceC2148fuAGw = C2167gD.A00(this.A00).AGw(str, new C2163g9());
        if (interfaceC2148fuAGw == null || (bArrA72 = interfaceC2148fuAGw.A72()) == null) {
            return null;
        }
        int length = bArrA72.length;
        if (A04[4].charAt(22) == 'U') {
            throw new RuntimeException();
        }
        A04[2] = "99IwdndnBnCK07hgvsXqxjXsnHcettbD";
        return BitmapFactory.decodeByteArray(bArrA72, 0, length);
    }

    private Bitmap A04(String str, int i10, int i11) {
        Bitmap bitmapDecodeStream;
        try {
            boolean zA0D = A0D(i10, i11);
            String strA08 = A08(232, 7, Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE);
            if (zA0D) {
                bitmapDecodeStream = T2.A02(str.substring(strA08.length()), i10, i11, this.A00);
            } else {
                bitmapDecodeStream = BitmapFactory.decodeStream(new FileInputStream(str.substring(strA08.length())), null, null);
            }
            int iA00 = A00(str, bitmapDecodeStream);
            if (C1648Up.A11(this.A00) && iA00 <= 0) {
                return null;
            }
            return bitmapDecodeStream;
        } catch (IOException e10) {
            Log.e(A05, A08(105, 43, AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL) + str + A08(0, 2, 105), e10);
        }
    }

    private Bitmap A05(String str, int i10, int i11) throws IOException {
        URL urlObj = new URL(str);
        HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
        connection.setDoInput(true);
        connection.connect();
        InputStream inputStream = connection.getInputStream();
        Bitmap bitmapA01 = T2.A01(inputStream, i10, i11);
        A0A(inputStream);
        return bitmapA01;
    }

    public static C1605Sy A06(C2194ge c2194ge) {
        if (A06 == null) {
            synchronized (C1605Sy.class) {
                if (A06 == null) {
                    A06 = new C1605Sy(c2194ge);
                }
            }
        }
        return A06;
    }

    public static File A07(T8 t10) {
        return t10.getCacheDir();
    }

    public static void A0A(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    private void A0B(String str, Bitmap bitmap) {
        if (!this.A01.containsKey(str) && bitmap != null && bitmap.getHeight() > 0) {
            float width = bitmap.getWidth() / bitmap.getHeight();
            if (width > 0.0f) {
                this.A01.put(str, Float.valueOf(width));
            }
        }
    }

    private void A0C(Throwable th2) {
        String strA08 = A08(261, 5, 89);
        if (th2 != null) {
            this.A00.A08().ABC(strA08, AbstractC1610Td.A1f, new C1611Te(th2));
        } else {
            this.A00.A08().ABC(strA08, AbstractC1610Td.A1f, new C1611Te(A08(77, 28, 18)));
        }
    }

    private boolean A0D(int i10, int i11) {
        return i10 > 0 && i11 > 0;
    }

    public final float A0E(String str) {
        if (this.A01.containsKey(str) && this.A01.get(str) != null) {
            return this.A01.get(str).floatValue();
        }
        if (A04[6].length() == 28) {
            throw new RuntimeException();
        }
        A04[6] = "EtgkjkQAQYyyMgrrXA05VcKpExUV0Ywa";
        return -1.0f;
    }

    public final Bitmap A0F(C1602Sv c1602Sv) {
        return A01(this.A00, c1602Sv, c1602Sv.A05, c1602Sv.A04, c1602Sv.A02);
    }

    public final Bitmap A0G(T8 t10, String str, int i10, int i11, String str2) {
        C1602Sv c1602Sv = this.A02.get(str);
        return (!T0.A06(t10) || c1602Sv == null) ? A01(t10, new C1602Sv(str, i10, i11, A08(270, 7, 28), A08(270, 7, 28)), i11, i10, str2) : A01(t10, c1602Sv, i11, i10, str2);
    }

    public final File A0H(String str) {
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 26));
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public final String A0I(String str) {
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 26));
        return file.exists() ? file.getPath() : str;
    }
}
