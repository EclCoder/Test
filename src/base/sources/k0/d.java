package k0;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final n f42778a = new n(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Comparator f42779b = new Comparator() { // from class: k0.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return d.a((byte[]) obj, (byte[]) obj2);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface a {
        static a a(Context context, Uri uri) {
            return new b(context, uri);
        }

        Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentProviderClient f42780a;

        b(Context context, Uri uri) {
            this.f42780a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // k0.d.a
        public Cursor b(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f42780a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e10) {
                Log.w("FontsProvider", "Unable to query the content provider", e10);
                return null;
            }
        }

        @Override // k0.d.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f42780a;
            if (contentProviderClient != null) {
                contentProviderClient.close();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f42781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f42782b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        List f42783c;

        c(String str, String str2, List list) {
            this.f42781a = str;
            this.f42782b = str2;
            this.f42783c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Objects.equals(this.f42781a, cVar.f42781a) && Objects.equals(this.f42782b, cVar.f42782b) && Objects.equals(this.f42783c, cVar.f42783c);
        }

        public int hashCode() {
            return Objects.hash(this.f42781a, this.f42782b, this.f42783c);
        }
    }

    public static /* synthetic */ int a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            byte b11 = bArr2[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        return 0;
    }

    private static List b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private static List d(e eVar, Resources resources) {
        return eVar.b() != null ? eVar.b() : d0.e.c(resources, eVar.c());
    }

    static i.a e(Context context, List list, CancellationSignal cancellationSignal) {
        String strH;
        Typeface typefaceH;
        s4.a.a("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                e eVar = (e) list.get(i10);
                if (Build.VERSION.SDK_INT < 31 || (typefaceH = e0.j.h((strH = eVar.h()))) == null || e0.j.j(typefaceH) == null) {
                    ProviderInfo providerInfoF = f(context.getPackageManager(), eVar, context.getResources());
                    if (providerInfoF == null) {
                        return i.a.b(1, null);
                    }
                    arrayList.add(g(context, eVar, providerInfoF.authority, cancellationSignal));
                } else {
                    arrayList.add(new i.b[]{new i.b(strH, eVar.i())});
                }
            }
            return i.a.a(0, arrayList);
        } finally {
            s4.a.b();
        }
    }

    static ProviderInfo f(PackageManager packageManager, e eVar, Resources resources) {
        s4.a.a("FontProvider.getProvider");
        try {
            List listD = d(eVar, resources);
            c cVar = new c(eVar.e(), eVar.f(), listD);
            ProviderInfo providerInfo = (ProviderInfo) f42778a.get(cVar);
            if (providerInfo != null) {
                s4.a.b();
                return providerInfo;
            }
            String strE = eVar.e();
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strE, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + strE);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(eVar.f())) {
                throw new PackageManager.NameNotFoundException("Found content provider " + strE + ", but package was not " + eVar.f());
            }
            List listB = b(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
            Collections.sort(listB, f42779b);
            for (int i10 = 0; i10 < listD.size(); i10++) {
                ArrayList arrayList = new ArrayList((Collection) listD.get(i10));
                Collections.sort(arrayList, f42779b);
                if (c(listB, arrayList)) {
                    f42778a.put(cVar, providerInfoResolveContentProvider);
                    s4.a.b();
                    return providerInfoResolveContentProvider;
                }
            }
            s4.a.b();
            return null;
        } catch (Throwable th2) {
            s4.a.b();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2, types: [k0.d$a] */
    /* JADX WARN: Type inference failed for: r19v7 */
    static i.b[] g(Context context, e eVar, String str, CancellationSignal cancellationSignal) {
        ?? r19;
        a aVar;
        s4.a.a("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            a aVarA = a.a(context, uriBuild);
            Cursor cursorB = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                s4.a.a("ContentQueryWrapper.query");
                try {
                    try {
                        cursorB = aVarA.b(uriBuild, strArr, "query = ?", new String[]{eVar.g()}, null, cancellationSignal);
                        s4.a.b();
                        if (cursorB == null || cursorB.getCount() <= 0) {
                            aVar = aVarA;
                        } else {
                            int columnIndex = cursorB.getColumnIndex("result_code");
                            ArrayList arrayList2 = new ArrayList();
                            int columnIndex2 = cursorB.getColumnIndex("_id");
                            int columnIndex3 = cursorB.getColumnIndex("file_id");
                            int columnIndex4 = cursorB.getColumnIndex("font_ttc_index");
                            int columnIndex5 = cursorB.getColumnIndex("font_weight");
                            int columnIndex6 = cursorB.getColumnIndex("font_italic");
                            while (cursorB.moveToNext()) {
                                int i10 = columnIndex != -1 ? cursorB.getInt(columnIndex) : 0;
                                arrayList2.add(new i.b(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorB.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorB.getLong(columnIndex3)), columnIndex4 != -1 ? cursorB.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorB.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorB.getInt(columnIndex6) == 1, eVar.i(), i10));
                                aVarA = aVarA;
                            }
                            aVar = aVarA;
                            arrayList = arrayList2;
                        }
                        if (cursorB != null) {
                            cursorB.close();
                        }
                        aVar.close();
                        return (i.b[]) arrayList.toArray(new i.b[0]);
                    } finally {
                        s4.a.b();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r19 = context;
                    if (cursorB != null) {
                        cursorB.close();
                    }
                    r19.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                r19 = aVarA;
            }
        } catch (Throwable th4) {
            s4.a.b();
            throw th4;
        }
    }
}
