package mf;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import lg.x;
import nh.f0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    lg.a f46237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Context f46238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    x f46239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList f46240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList f46241e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(ArrayList arrayList);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(ArrayList arrayList);
    }

    public l() {
        AzRecorderApp.d().C(this);
    }

    public static /* synthetic */ void a(l lVar, ok.d dVar) {
        lVar.getClass();
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        ArrayList arrayList = new ArrayList(Arrays.asList("_id", "_data", "_display_name", "date_modified", "_size"));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            arrayList.add("volume_name");
        }
        if (i10 >= 30) {
            arrayList.add("resolution");
        }
        Cursor cursorQuery = lVar.f46238b.getContentResolver().query(uri, (String[]) arrayList.toArray(new String[0]), "_data LIKE ? OR _data LIKE ? OR _data LIKE ?", new String[]{"%AzScreenRecorder/%", "%AzRecorderFree/%", "%com.hecorat.screenrecorder.free/%"}, "date_modified DESC");
        if (cursorQuery != null) {
            cursorQuery.moveToFirst();
            while (!cursorQuery.isAfterLast()) {
                long j10 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id"));
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
                long j11 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("date_modified"));
                long j12 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_size"));
                Uri contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 29) {
                    contentUri = MediaStore.Images.Media.getContentUri(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("volume_name")));
                }
                lVar.f46241e.add(new pg.c(string.endsWith(".gif") ? 3 : 2, j10, string, string2, j11, ContentUris.withAppendedId(contentUri, j10), j12, i11 >= 30 ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("resolution")) : null));
                cursorQuery.moveToNext();
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        Collections.sort(lVar.f46241e, new Comparator() { // from class: mf.j
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((pg.c) obj2).c(), ((pg.c) obj).c());
            }
        });
        dVar.onNext(1);
    }

    public static /* synthetic */ void b(l lVar, ok.d dVar) {
        lVar.getClass();
        Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        ArrayList arrayList = new ArrayList(Arrays.asList("_id", "_data", "_display_name", "date_modified", "resolution", "duration", "_size"));
        if (Build.VERSION.SDK_INT >= 29) {
            arrayList.add("volume_name");
        }
        lVar.f46239c.j();
        Map mapO = lVar.f46239c.o();
        Cursor cursorQuery = lVar.f46238b.getContentResolver().query(uri, (String[]) arrayList.toArray(new String[0]), "_data LIKE ? OR _data LIKE ? OR _data LIKE ?", new String[]{"%AzScreenRecorder/%", "%AzRecorderFree/%", "%com.hecorat.screenrecorder.free/%"}, "date_modified DESC");
        if (cursorQuery != null) {
            cursorQuery.moveToFirst();
            while (!cursorQuery.isAfterLast()) {
                long j10 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id"));
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
                long j11 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("date_modified"));
                String string3 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("resolution"));
                long j12 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("duration"));
                long j13 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_size"));
                Uri contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                if (Build.VERSION.SDK_INT >= 29) {
                    contentUri = MediaStore.Video.Media.getContentUri(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("volume_name")));
                }
                Uri uriWithAppendedId = ContentUris.withAppendedId(contentUri, j10);
                pg.e eVar = new pg.e(0, j10, string, string2, j11, uriWithAppendedId, j13, string3, j12);
                eVar.v((String) mapO.get(string));
                if (j12 == 0 || string3 == null) {
                    f0.I(lVar.f46238b, eVar, uriWithAppendedId);
                }
                lVar.f46240d.add(eVar);
                cursorQuery.moveToNext();
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        Collections.sort(lVar.f46240d, new Comparator() { // from class: mf.k
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((pg.e) obj2).c(), ((pg.e) obj).c());
            }
        });
        dVar.onNext(1);
    }

    public static /* synthetic */ void f(Throwable th2) {
        wp.a.e(th2);
        com.google.firebase.crashlytics.a.b().d(th2);
    }

    public static /* synthetic */ void g(Throwable th2) {
        wp.a.e(th2);
        com.google.firebase.crashlytics.a.b().d(th2);
    }

    public void i(final a aVar) {
        this.f46241e = new ArrayList();
        ok.c.c(new ok.e() { // from class: mf.g
            @Override // ok.e
            public final void a(ok.d dVar) {
                l.a(this.f46234a, dVar);
            }
        }).i(dl.a.a()).d(qk.a.a()).f(new tk.c() { // from class: mf.h
            @Override // tk.c
            public final void accept(Object obj) {
                aVar.a(this.f46235a.f46241e);
            }
        }, new tk.c() { // from class: mf.i
            @Override // tk.c
            public final void accept(Object obj) {
                l.f((Throwable) obj);
            }
        });
    }

    public void j(final b bVar) {
        this.f46240d = new ArrayList();
        ok.c.c(new ok.e() { // from class: mf.d
            @Override // ok.e
            public final void a(ok.d dVar) {
                l.b(this.f46231a, dVar);
            }
        }).i(dl.a.a()).d(qk.a.a()).f(new tk.c() { // from class: mf.e
            @Override // tk.c
            public final void accept(Object obj) {
                bVar.a(this.f46232a.f46240d);
            }
        }, new tk.c() { // from class: mf.f
            @Override // tk.c
            public final void accept(Object obj) {
                l.g((Throwable) obj);
            }
        });
    }
}
