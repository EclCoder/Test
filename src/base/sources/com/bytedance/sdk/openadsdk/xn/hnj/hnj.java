package com.bytedance.sdk.openadsdk.xn.hnj;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj implements Cursor {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    String[] f14811hn;
    Map<String, List<String>> hnj;
    int qor = 0;

    public hnj(Map<String, List<String>> map) {
        if (map == null || map.keySet() == null) {
            this.hnj = new HashMap();
            return;
        }
        this.hnj = map;
        try {
            this.f14811hn = (String[]) map.keySet().toArray(new String[map.keySet().size()]);
        } catch (Exception unused) {
        }
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int i10) {
        return new byte[0];
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
        String[] strArr = this.f14811hn;
        if (strArr != null) {
            return strArr.length;
        }
        return 0;
    }

    @Override // android.database.Cursor
    public int getColumnIndex(String str) {
        String[] strArr = this.f14811hn;
        if (strArr == null || strArr.length == 0) {
            return -1;
        }
        int i10 = 0;
        while (true) {
            String[] strArr2 = this.f14811hn;
            if (i10 >= strArr2.length) {
                return 0;
            }
            if (str.equals(strArr2[i10])) {
                return i10;
            }
            i10++;
        }
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(String str) {
        return 0;
    }

    @Override // android.database.Cursor
    public String getColumnName(int i10) {
        if (i10 < 0) {
            return "";
        }
        String[] strArr = this.f14811hn;
        return i10 < strArr.length ? strArr[i10] : "";
    }

    @Override // android.database.Cursor
    public String[] getColumnNames() {
        return this.f14811hn;
    }

    @Override // android.database.Cursor
    public int getCount() {
        try {
            String[] strArr = this.f14811hn;
            if (strArr != null && strArr.length != 0) {
                return this.hnj.get(strArr[0]).size();
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.database.Cursor
    public double getDouble(int i10) {
        try {
            return Double.parseDouble(getString(i10));
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    @Override // android.database.Cursor
    public Bundle getExtras() {
        return null;
    }

    @Override // android.database.Cursor
    public float getFloat(int i10) {
        try {
            return Float.parseFloat(getString(i10));
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    @Override // android.database.Cursor
    public int getInt(int i10) {
        try {
            return Integer.parseInt(getString(i10));
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.database.Cursor
    public long getLong(int i10) {
        try {
            return Long.parseLong(getString(i10));
        } catch (Exception unused) {
            return 0L;
        }
    }

    @Override // android.database.Cursor
    public Uri getNotificationUri() {
        return null;
    }

    @Override // android.database.Cursor
    public int getPosition() {
        return this.qor;
    }

    @Override // android.database.Cursor
    public short getShort(int i10) {
        try {
            return Short.parseShort(getString(i10));
        } catch (Exception unused) {
            return (short) 0;
        }
    }

    @Override // android.database.Cursor
    public String getString(int i10) {
        return (i10 < 0 || i10 >= getColumnCount()) ? "" : this.hnj.get(this.f14811hn[i10]).get(getPosition());
    }

    @Override // android.database.Cursor
    public int getType(int i10) {
        return 0;
    }

    @Override // android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isAfterLast() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isBeforeFirst() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isClosed() {
        return false;
    }

    @Override // android.database.Cursor
    public boolean isFirst() {
        return this.qor == 0;
    }

    @Override // android.database.Cursor
    public boolean isLast() {
        return this.qor == getCount() - 1;
    }

    @Override // android.database.Cursor
    public boolean isNull(int i10) {
        return getString(i10) == null;
    }

    @Override // android.database.Cursor
    public boolean move(int i10) {
        if (this.qor + i10 >= getCount()) {
            return false;
        }
        this.qor += i10;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToFirst() {
        if (getCount() <= 0) {
            return false;
        }
        this.qor = 0;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToLast() {
        if (getCount() <= 0) {
            return false;
        }
        this.qor = this.hnj.get(this.f14811hn[0]).size() - 1;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToNext() {
        if (this.qor + 1 >= getCount()) {
            return false;
        }
        this.qor++;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToPosition(int i10) {
        if (i10 >= getCount()) {
            return false;
        }
        this.qor = i10;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToPrevious() {
        int i10 = this.qor;
        if (i10 - 1 < 0) {
            return false;
        }
        this.qor = i10 - 1;
        return true;
    }

    @Override // android.database.Cursor
    public boolean requery() {
        return false;
    }

    @Override // android.database.Cursor
    public Bundle respond(Bundle bundle) {
        return null;
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // android.database.Cursor
    public void deactivate() {
    }

    @Override // android.database.Cursor
    public void registerContentObserver(ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // android.database.Cursor
    public void setExtras(Bundle bundle) {
    }

    @Override // android.database.Cursor
    public void unregisterContentObserver(ContentObserver contentObserver) {
    }

    @Override // android.database.Cursor
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int i10, CharArrayBuffer charArrayBuffer) {
    }

    @Override // android.database.Cursor
    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
    }
}
