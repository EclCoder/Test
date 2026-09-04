package com.facebook.ads.redexgen.core;

import android.util.Log;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ct, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1192Ct implements InterfaceC2164gA {
    public static byte[] A01;
    public final InterfaceC2165gB A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{108, -114, -114, -112, -101, -97, 88, 110, -109, -116, -99, -98, -112, -97, -42, -11, 7, -3, -9, -26, -7, 5, 9, -7, 7, 8, -36, -11, 2, -8, 0, -7, 6, -62, 3, 2, -39, 6, 6, 3, 6, -126, -82, -83, -77, -92, -83, -77, 108, -109, -72, -81, -92, -126, -127, 115, 90, 101};
    }

    public AbstractC1192Ct(InterfaceC2165gB interfaceC2165gB) {
        this.A00 = interfaceC2165gB;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2164gA
    public final boolean ADs(C2162g8 c2162g8) {
        InterfaceC2148fu interfaceC2148fuA00 = c2162g8.A00();
        if (this.A00.AAZ()) {
            Log.e(AbstractC1192Ct.class.getSimpleName(), A00(14, 27, Sdk$SDKError.b.INVALID_RI_ENDPOINT_VALUE), c2162g8);
        }
        if (interfaceC2148fuA00 != null && interfaceC2148fuA00.A9C() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2164gA
    public final HttpURLConnection AGl(String str, Proxy proxy) throws IOException {
        URL url = new URL(str);
        if (proxy == null) {
            return (HttpURLConnection) url.openConnection();
        }
        return (HttpURLConnection) url.openConnection(proxy);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2164gA
    public final InputStream AGm(HttpURLConnection httpURLConnection) throws IOException {
        return httpURLConnection.getInputStream();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2164gA
    public final OutputStream AGn(HttpURLConnection httpURLConnection) throws IOException {
        return httpURLConnection.getOutputStream();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2164gA
    public final void AH6(HttpURLConnection httpURLConnection, EnumC2160g6 enumC2160g6, String str) throws IOException {
        httpURLConnection.setRequestMethod(enumC2160g6.A03());
        httpURLConnection.setDoOutput(enumC2160g6.A05());
        httpURLConnection.setDoInput(enumC2160g6.A04());
        if (str != null) {
            httpURLConnection.setRequestProperty(A00(41, 12, 38), str);
        }
        httpURLConnection.setRequestProperty(A00(0, 14, 18), A00(53, 5, 20));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2164gA
    public final byte[] AHT(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[16384];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 != -1) {
                byteArrayOutputStream.write(bArr, 0, i10);
            } else {
                byteArrayOutputStream.flush();
                byte[] data = byteArrayOutputStream.toByteArray();
                return data;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2164gA
    public final void AL8(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(bArr);
    }
}
