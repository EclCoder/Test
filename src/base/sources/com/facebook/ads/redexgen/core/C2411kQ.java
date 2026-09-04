package com.facebook.ads.redexgen.core;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2411kQ implements InterfaceC1438Mh {
    public static byte[] A04;
    public static final String[] A05;
    public String A00;
    public String A01;
    public final SparseArray<C1437Mg> A02 = new SparseArray<>();
    public final C5O A03;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 1);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{55, 43, 106, 103, 35, 74, 77, 87, 70, 68, 70, 81, 35, 83, 81, 74, 78, 66, 81, 90, 35, 72, 70, 90, 35, 77, 76, 87, 35, 77, 86, 79, 79, 47, 104, 102, 122, 35, 87, 70, 91, 87, 35, 77, 76, 87, 35, 77, 86, 79, 79, 47, 110, 102, 119, 98, 103, 98, 119, 98, 35, 65, 79, 76, 65, 35, 77, 76, 87, 35, 77, 86, 79, 79, 42, 46, 63, 40, 44, 57, 40, 77, 57, 44, 47, 33, 40, 77, 6, 16, 13, 18, 98, 22, 3, 0, 14, 7, 98, 11, 4, 98, 7, 26, 11, 17, 22, 17, 98, 41, 20, 3, 60, 0, 13, 21, 9, 30, 47, 13, 15, 4, 9, 37, 2, 8, 9, 20, 88, 85, 18, 31, 91, 70, 91, 68, 79, 65, 93, 109, 101, 116, 97, 100, 97, 116, 97};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1438Mh
    public final void AAs(HashMap<String, C1437Mg> map, SparseArray<String> sparseArray) throws IOException {
        AbstractC09823y.A08(this.A02.size() == 0);
        try {
            if (C5Q.A00(this.A03.getReadableDatabase(), 1, (String) AbstractC09823y.A01(this.A00)) != 1) {
                SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    A04(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            }
            Cursor cursorA00 = A00();
            while (cursorA00.moveToNext()) {
                try {
                    C1437Mg c1437Mg = new C1437Mg(cursorA00.getInt(0), (String) AbstractC09823y.A01(cursorA00.getString(1)), C1439Mi.A02(new DataInputStream(new ByteArrayInputStream(cursorA00.getBlob(2)))));
                    map.put(c1437Mg.A02, c1437Mg);
                    sparseArray.put(c1437Mg.A01, c1437Mg.A02);
                } catch (Throwable th3) {
                    if (cursorA00 != null) {
                        try {
                            cursorA00.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            }
            if (cursorA00 != null) {
                cursorA00.close();
            }
        } catch (SQLiteException e10) {
            map.clear();
            sparseArray.clear();
            throw new C5N(e10);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1438Mh
    public final void AKJ(HashMap<String, C1437Mg> map) throws IOException {
        if (this.A02.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i10 = 0; i10 < this.A02.size(); i10++) {
                try {
                    C1437Mg c1437MgValueAt = this.A02.valueAt(i10);
                    if (c1437MgValueAt == null) {
                        A05(writableDatabase, this.A02.keyAt(i10));
                    } else {
                        A06(writableDatabase, c1437MgValueAt);
                    }
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            }
            writableDatabase.setTransactionSuccessful();
            this.A02.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e10) {
            throw new C5N(e10);
        }
    }

    static {
        A03();
        A05 = new String[]{A01(128, 2, 48), A01(Sdk$SDKError.b.PRIVACY_URL_ERROR_VALUE, 3, 37), A01(139, 8, 1)};
    }

    public C2411kQ(C5O c5o) {
        this.A03 = c5o;
    }

    private Cursor A00() {
        return this.A03.getReadableDatabase().query((String) AbstractC09823y.A01(this.A01), A05, null, null, null, null, null);
    }

    public static String A02(String str) {
        return A01(109, 19, 109) + str;
    }

    private void A04(SQLiteDatabase sQLiteDatabase) throws C5N {
        C5Q.A04(sQLiteDatabase, 1, (String) AbstractC09823y.A01(this.A00), 1);
        A07(sQLiteDatabase, (String) AbstractC09823y.A01(this.A01));
        sQLiteDatabase.execSQL(A01(75, 13, 108) + this.A01 + A01(0, 1, 22) + A01(1, 74, 2));
    }

    private void A05(SQLiteDatabase sQLiteDatabase, int i10) {
        sQLiteDatabase.delete((String) AbstractC09823y.A01(this.A01), A01(130, 6, Sdk$SDKError.b.INVALID_ADS_ENDPOINT_VALUE), new String[]{Integer.toString(i10)});
    }

    private void A06(SQLiteDatabase sQLiteDatabase, C1437Mg c1437Mg) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C1439Mi.A08(c1437Mg.A03(), new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put(A01(128, 2, 48), Integer.valueOf(c1437Mg.A01));
        contentValues.put(A01(Sdk$SDKError.b.PRIVACY_URL_ERROR_VALUE, 3, 37), c1437Mg.A02);
        contentValues.put(A01(139, 8, 1), byteArray);
        sQLiteDatabase.replaceOrThrow((String) AbstractC09823y.A01(this.A01), null, contentValues);
    }

    public static void A07(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL(A01(88, 21, 67) + str);
    }

    public static void A08(C5O c5o, String str) throws C5N {
        try {
            String strA02 = A02(str);
            SQLiteDatabase writableDatabase = c5o.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                C5Q.A03(writableDatabase, 1, str);
                A07(writableDatabase, strA02);
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e10) {
            throw new C5N(e10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1438Mh
    public final void A5p() throws C5N {
        A08(this.A03, (String) AbstractC09823y.A01(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1438Mh
    public final boolean A6S() throws C5N {
        try {
            return C5Q.A00(this.A03.getReadableDatabase(), 1, (String) AbstractC09823y.A01(this.A00)) != -1;
        } catch (SQLException e10) {
            throw new C5N(e10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1438Mh
    public final void AAF(long j10) {
        this.A00 = Long.toHexString(j10);
        this.A01 = A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1438Mh
    public final void AFd(C1437Mg c1437Mg, boolean z10) {
        if (z10) {
            this.A02.delete(c1437Mg.A01);
        } else {
            this.A02.put(c1437Mg.A01, null);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1438Mh
    public final void AGK(C1437Mg c1437Mg) {
        this.A02.put(c1437Mg.A01, c1437Mg);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1438Mh
    public final void AKI(HashMap<String, C1437Mg> map) throws IOException {
        try {
            SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                A04(writableDatabase);
                Iterator<C1437Mg> it = map.values().iterator();
                while (it.hasNext()) {
                    A06(writableDatabase, it.next());
                }
                writableDatabase.setTransactionSuccessful();
                this.A02.clear();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e10) {
            throw new C5N(e10);
        }
    }
}
