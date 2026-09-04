package com.facebook.ads.redexgen.core;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@MetaExoPlayerCustomization(type = {"NON_FINAL"}, value = "D54147219: For usage in Hero Simple Cache")
public final class C1439Mi {
    public static byte[] A06;
    public static String[] A07 = {"1eaMPdLcC8DbZCkn0iIyVPFCZSdDAanS", "Exaxr4PlErBkBzdiwoicKn", "2BC", "jQaYCx7PV0mXn8Zj7H8rC7xxlui6spsC", "wp2nCKHDQcjkZqDMhhhKbFGW7G", "lMJ", "SjVm96go47njO9ADG8uLls", "QdN"};
    public InterfaceC1438Mh A00;
    public InterfaceC1438Mh A01;
    public final SparseArray<String> A02;
    public final SparseBooleanArray A03;
    public final SparseBooleanArray A04;
    public final HashMap<String, C1437Mg> A05;

    public static String A04(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 51);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A06 = new byte[]{20, 16, 6, 122, 22, 23, 22, 122, 5, 30, 22, 6, 96, 5, 20, 17, 17, 28, 27, 18, 32, 33, 66, 101, 125, 106, 103, 98, 111, 43, 125, 106, 103, 126, 110, 43, 120, 98, 113, 110, 49, 43, 127, 125, 127, 116, 121, 120, 67, 127, 115, 114, 104, 121, 114, 104, 67, 117, 114, 120, 121, 100, 50, 121, 100, 117};
    }

    static {
        A07();
    }

    public C1439Mi(C5O c5o, File file, byte[] bArr, boolean z10, boolean z11) {
        AbstractC09823y.A08((c5o == null && file == null) ? false : true);
        this.A05 = new HashMap<>();
        this.A02 = new SparseArray<>();
        this.A04 = new SparseBooleanArray();
        this.A03 = new SparseBooleanArray();
        C2411kQ c2411kQ = c5o != null ? new C2411kQ(c5o) : null;
        InterfaceC1438Mh databaseStorage = file != null ? new C2410kP(new File(file, A04(42, 24, 47)), bArr, z10) : null;
        if (c2411kQ == null || (databaseStorage != null && z11)) {
            InterfaceC1438Mh legacyStorage = (InterfaceC1438Mh) C5C.A0f(databaseStorage);
            this.A01 = legacyStorage;
            this.A00 = c2411kQ;
        } else {
            this.A01 = c2411kQ;
            this.A00 = databaseStorage;
        }
    }

    public static int A00(SparseArray<String> idToKey) {
        int id2;
        int size = idToKey.size();
        if (size == 0) {
            id2 = 0;
        } else {
            int size2 = size - 1;
            id2 = idToKey.keyAt(size2) + 1;
        }
        if (id2 < 0) {
            id2 = 0;
            while (id2 < size) {
                int size3 = idToKey.keyAt(id2);
                if (id2 != size3) {
                    break;
                }
                id2++;
            }
        }
        return id2;
    }

    private C1437Mg A01(String str) {
        int iA00 = A00(this.A02);
        C1437Mg c1437Mg = new C1437Mg(iA00, str);
        this.A05.put(str, c1437Mg);
        this.A02.put(iA00, str);
        this.A03.put(iA00, true);
        this.A01.AGK(c1437Mg);
        return c1437Mg;
    }

    public static C2408kN A02(DataInputStream dataInputStream) throws IOException {
        int i10 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int nextBytesToRead = 0; nextBytesToRead < i10; nextBytesToRead++) {
            String utf = dataInputStream.readUTF();
            int bytesRead = dataInputStream.readInt();
            if (bytesRead >= 0) {
                int valueSize = 0;
                int i11 = Math.min(bytesRead, MediaHttpUploader.DEFAULT_CHUNK_SIZE);
                byte[] bArrCopyOf = C5C.A07;
                while (valueSize != bytesRead) {
                    int size = valueSize + i11;
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    dataInputStream.readFully(bArrCopyOf, valueSize, i11);
                    valueSize += i11;
                    int size2 = bytesRead - valueSize;
                    i11 = Math.min(size2, MediaHttpUploader.DEFAULT_CHUNK_SIZE);
                }
                map.put(utf, bArrCopyOf);
            } else {
                throw new IOException(A04(22, 20, 56) + bytesRead);
            }
        }
        return new C2408kN(map);
    }

    public static Cipher A05() throws NoSuchPaddingException, NoSuchAlgorithmException {
        int i10 = C5C.A02;
        String strA04 = A04(0, 20, 102);
        if (i10 == 18) {
            try {
                return Cipher.getInstance(strA04, A04(20, 2, 81));
            } catch (Throwable unused) {
            }
        }
        Cipher cipher = Cipher.getInstance(strA04);
        String[] strArr = A07;
        if (strArr[6].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[6] = "EBBbD5OLh9DYDBrMigQNtJ";
        strArr2[1] = "xQSZ94mu2vygjBv0Ab9r12";
        return cipher;
    }

    public static void A08(C2408kN c2408kN, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> setA06 = c2408kN.A06();
        dataOutputStream.writeInt(setA06.size());
        for (Map.Entry<String, byte[]> entry : setA06) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public static boolean A0A(String str) {
        return str.startsWith(A04(42, 24, 47));
    }

    public final int A0B(String str) {
        return A0D(str).A01;
    }

    public final C1437Mg A0C(String str) {
        return this.A05.get(str);
    }

    public final C1437Mg A0D(String str) {
        C1437Mg cachedContent = this.A05.get(str);
        return cachedContent == null ? A01(str) : cachedContent;
    }

    public final C2408kN A0E(String str) {
        C1437Mg cachedContent = A0C(str);
        return cachedContent != null ? cachedContent.A03() : C2408kN.A03;
    }

    public final String A0F(int i10) {
        return this.A02.get(i10);
    }

    public final Collection<C1437Mg> A0G() {
        return Collections.unmodifiableCollection(this.A05.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0H() {
        C4C c4cA0N = BO.A07(this.A05.keySet()).A0N();
        while (true) {
            boolean zHasNext = c4cA0N.hasNext();
            String[] strArr = A07;
            if (strArr[7].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[6] = "jpVmrDDiLa6KSoRZ9DaLqT";
            strArr2[1] = "R0FMfILNqJLoUgBryCIaQS";
            if (zHasNext) {
                A0K((String) c4cA0N.next());
            } else {
                return;
            }
        }
    }

    public final void A0I() throws IOException {
        this.A01.AKJ(this.A05);
        int size = this.A04.size();
        for (int i10 = 0; i10 < size; i10++) {
            SparseArray<String> sparseArray = this.A02;
            int removedIdCount = this.A04.keyAt(i10);
            sparseArray.remove(removedIdCount);
        }
        this.A04.clear();
        this.A03.clear();
    }

    public final void A0J(long j10) throws IOException {
        this.A01.AAF(j10);
        if (this.A00 != null) {
            this.A00.AAF(j10);
        }
        if (!this.A01.A6S() && this.A00 != null && this.A00.A6S()) {
            this.A00.AAs(this.A05, this.A02);
            this.A01.AKI(this.A05);
        } else {
            this.A01.AAs(this.A05, this.A02);
        }
        if (this.A00 != null) {
            InterfaceC1438Mh interfaceC1438Mh = this.A00;
            String[] strArr = A07;
            if (strArr[6].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[6] = "sHyLaDKMqWdH53QwNCQNuy";
            strArr2[1] = "kZIq1iKkwSA0yGMJ22HAvZ";
            interfaceC1438Mh.A5p();
            this.A00 = null;
        }
    }

    public final void A0K(String str) {
        C1437Mg c1437Mg = this.A05.get(str);
        if (c1437Mg != null && c1437Mg.A09() && c1437Mg.A0A()) {
            this.A05.remove(str);
            int i10 = c1437Mg.A01;
            boolean z10 = this.A03.get(i10);
            this.A01.AFd(c1437Mg, z10);
            if (z10) {
                this.A02.remove(i10);
                this.A03.delete(i10);
            } else {
                this.A02.put(i10, null);
                this.A04.put(i10, true);
            }
        }
    }

    public final void A0L(String str, C1442Ml c1442Ml) {
        C1437Mg c1437MgA0D = A0D(str);
        if (c1437MgA0D.A0E(c1442Ml)) {
            this.A01.AGK(c1437MgA0D);
        }
    }
}
