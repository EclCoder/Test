package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzrq extends zzso {
    private final List zza;

    private zzrq(OutputStream outputStream, List list) {
        super(outputStream);
        this.zza = list;
    }

    public static zzrq zza(List list, Uri uri, OutputStream outputStream) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzta zztaVarZzb = ((zztb) it.next()).zzb();
            if (zztaVarZzb != null) {
                arrayList.add(zztaVarZzb);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzrq(outputStream, arrayList);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            try {
                ((zzta) it.next()).close();
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i10) throws IOException {
        ((FilterOutputStream) this).out.write(i10);
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzta) it.next()).zza();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzso, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        ((FilterOutputStream) this).out.write(bArr);
        for (zzta zztaVar : this.zza) {
            int length = bArr.length;
            zztaVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzso, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i10, i11);
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzta) it.next()).zza();
        }
    }
}
