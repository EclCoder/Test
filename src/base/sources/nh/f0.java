package nh;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.google.android.gms.common.util.GmsVersion;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.activities.ExoVideoViewActivity;
import com.hecorat.screenrecorder.free.activities.HomeActivity;
import com.hecorat.screenrecorder.free.activities.ImageViewActivity;
import com.hecorat.screenrecorder.free.activities.ShareEditedFileActivity;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class f0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void t(boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        void a(d dVar);

        void b(String str, String str2);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum d {
        SUCCESSFUL,
        FAILED,
        PENDING
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface e {
        void a(Uri uri);
    }

    public static void A(Context context, Uri uri, int i10) {
        Intent intent = new Intent(context, (Class<?>) ImageViewActivity.class);
        intent.setData(uri);
        intent.putExtra("from", i10);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    public static void B(Context context, Uri uri, String str) {
        C(context, uri, str, null);
    }

    public static void C(Context context, Uri uri, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) ShareEditedFileActivity.class);
        intent.setData(uri);
        intent.putExtra("mime_type", str);
        intent.putExtra("dedicated_app_promo", str2);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    public static void D(Activity activity, Uri uri, int i10) {
        Intent intent = new Intent(activity, (Class<?>) ExoVideoViewActivity.class);
        intent.setData(uri);
        if (i10 == 1) {
            intent.addFlags(268435456);
        }
        intent.putExtra("from", i10);
        activity.startActivity(intent);
    }

    public static void E(Activity activity, List list, int i10) {
        PendingIntent pendingIntentV;
        if (Build.VERSION.SDK_INT >= 30 && (pendingIntentV = v(activity, list, i10)) != null) {
            try {
                activity.startIntentSenderForResult(pendingIntentV.getIntentSender(), i10, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e10) {
                wp.a.e(e10);
                com.google.firebase.crashlytics.a.b().d(e10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [pg.c] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [pg.e] */
    public static List F(Context context, int i10) {
        ?? cVar;
        Uri uri = i10 == 1 ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 30) {
            ArrayList arrayList2 = new ArrayList(Arrays.asList("_id", "_data", "_display_name", "date_modified", "resolution", "_size", "volume_name", "date_expires", "is_trashed"));
            if (i10 == 1) {
                arrayList2.add("duration");
            }
            Bundle bundle = new Bundle();
            bundle.putInt("android:query-arg-match-trashed", 1);
            bundle.putString("android:query-arg-sql-selection", "is_trashed > ? AND _data LIKE ? OR _data LIKE ? OR _data LIKE ?");
            bundle.putStringArray("android:query-arg-sql-selection-args", new String[]{MBridgeConstans.ENDCARD_URL_TYPE_PL, "%AzScreenRecorder/%", "%AzRecorderFree/%", "%com.hecorat.screenrecorder.free/%"});
            bundle.putString("android:query-arg-sql-sort-order", "date_expires DESC");
            Cursor cursorQuery = context.getContentResolver().query(uri, (String[]) arrayList2.toArray(new String[0]), bundle, null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                while (!cursorQuery.isAfterLast()) {
                    long j10 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id"));
                    String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                    String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_display_name"));
                    long j11 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("date_modified"));
                    String string3 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("resolution"));
                    long j12 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_size"));
                    String string4 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("volume_name"));
                    long j13 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("date_expires"));
                    if (i10 == 1) {
                        long j14 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("duration"));
                        Uri uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Video.Media.getContentUri(string4), j10);
                        cVar = new pg.e(0, j10, string, string2, j11, uriWithAppendedId, j12, string3, j14, j13);
                        if (j14 == 0 || string3 == null) {
                            I(context, cVar, uriWithAppendedId);
                        }
                    } else {
                        cVar = new pg.c(string.endsWith(".gif") ? 3 : 2, j10, string, string2, j11, ContentUris.withAppendedId(MediaStore.Images.Media.getContentUri(string4), j10), j12, string3, j13);
                    }
                    arrayList.add(cVar);
                    cursorQuery.moveToNext();
                }
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    public static d G(Activity activity, final pg.d dVar, String str) {
        d dVar2 = d.FAILED;
        ContentResolver contentResolver = activity.getContentResolver();
        try {
            if (Build.VERSION.SDK_INT < 29) {
                String strE = dVar.e();
                File file = new File(strE);
                String str2 = file.getParent() + "/" + str;
                if (file.renameTo(new File(str2))) {
                    d dVar3 = d.SUCCESSFUL;
                    MediaScannerConnection.scanFile(activity, new String[]{strE}, null, null);
                    MediaScannerConnection.scanFile(activity, new String[]{str2}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: nh.a0
                        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                        public final void onScanCompleted(String str3, Uri uri) {
                            dVar.n(uri);
                        }
                    });
                    return dVar3;
                }
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", str);
                contentValues.put(CampaignEx.JSON_KEY_TITLE, s(str));
                if (contentResolver.update(dVar.f(), contentValues, null, null) > 0) {
                    s.f47752a.b(activity, dVar.f());
                    return d.SUCCESSFUL;
                }
            }
            return dVar2;
        } catch (SecurityException unused) {
            if (Build.VERSION.SDK_INT < 30) {
                return dVar2;
            }
            try {
                activity.startIntentSenderForResult(MediaStore.createWriteRequest(contentResolver, Collections.singletonList(dVar.f())).getIntentSender(), 2024, null, 0, 0, 0, null);
                return d.PENDING;
            } catch (IntentSender.SendIntentException e10) {
                e10.printStackTrace();
                return dVar2;
            }
        }
    }

    public static void H(final Context context, Bitmap bitmap, boolean z10, final e eVar) {
        Uri uriInsert;
        boolean z11 = androidx.preference.j.b(context).getBoolean(context.getString(R.string.pref_use_internal_storage), true);
        String strP = z11 ? pf.a.f50027b : nh.e.p(context, Environment.DIRECTORY_PICTURES);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(nh.e.d(z10 ? "_edited" : null));
        sb2.append(".jpg");
        String string = sb2.toString();
        if (Build.VERSION.SDK_INT < 30 || !z11) {
            if (strP == null) {
                eVar.a(null);
                return;
            }
            File file = new File(strP);
            String str = strP + File.separator + string;
            try {
                if (!file.exists() && !file.mkdirs() && !file.exists()) {
                    eVar.a(null);
                    return;
                }
                FileOutputStream fileOutputStream = new FileOutputStream(str);
                try {
                    boolean zCompress = bitmap.compress(Bitmap.CompressFormat.JPEG, 95, fileOutputStream);
                    fileOutputStream.flush();
                    if (zCompress) {
                        fileOutputStream.close();
                        MediaScannerConnection.scanFile(context, new String[]{str}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: nh.e0
                            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                            public final void onScanCompleted(String str2, Uri uri) {
                                f0.a(context, eVar, str2, uri);
                            }
                        });
                        return;
                    } else {
                        eVar.a(null);
                        fileOutputStream.close();
                        return;
                    }
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
                wp.a.e(e);
                com.google.firebase.crashlytics.a.b().d(e);
                eVar.a(null);
                return;
            } catch (Exception e10) {
                wp.a.e(e10);
                com.google.firebase.crashlytics.a.b().d(e10);
                eVar.a(null);
                return;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", string);
        contentValues.put("mime_type", "image/jpeg");
        contentValues.put("date_added", Long.valueOf(System.currentTimeMillis() / 1000));
        contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("relative_path", "Pictures/AzScreenRecorder/");
        contentValues.put("is_pending", (Integer) 1);
        ContentResolver contentResolver = context.getContentResolver();
        try {
            uriInsert = contentResolver.insert(MediaStore.Images.Media.getContentUri("external_primary"), contentValues);
            try {
                if (uriInsert == null) {
                    eVar.a(null);
                    return;
                }
                OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                try {
                    if (outputStreamOpenOutputStream == null) {
                        contentResolver.delete(uriInsert, null, null);
                        eVar.a(null);
                        if (outputStreamOpenOutputStream == null) {
                            return;
                        }
                    } else {
                        boolean zCompress2 = bitmap.compress(Bitmap.CompressFormat.JPEG, 95, outputStreamOpenOutputStream);
                        outputStreamOpenOutputStream.flush();
                        if (zCompress2) {
                            outputStreamOpenOutputStream.close();
                            contentValues.clear();
                            contentValues.put("is_pending", (Integer) 0);
                            contentResolver.update(uriInsert, contentValues, null, null);
                            l0.A(context, "grant_permission_storage");
                            eVar.a(uriInsert);
                            return;
                        }
                        contentResolver.delete(uriInsert, null, null);
                        eVar.a(null);
                    }
                    outputStreamOpenOutputStream.close();
                } catch (Throwable th4) {
                    if (outputStreamOpenOutputStream != null) {
                        try {
                            outputStreamOpenOutputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                    }
                    throw th4;
                }
            } catch (Exception e11) {
                e = e11;
                wp.a.e(e);
                if (uriInsert != null) {
                    try {
                        contentResolver.delete(uriInsert, null, null);
                    } catch (Exception unused) {
                    }
                }
                com.google.firebase.crashlytics.a.b().d(e);
                eVar.a(null);
            }
        } catch (Exception e12) {
            e = e12;
            uriInsert = null;
        }
    }

    public static void I(Context context, pg.e eVar, Uri uri) {
        try {
            lg.f fVar = new lg.f();
            try {
                fVar.setDataSource(context, uri);
                if ("yes".equals(fVar.extractMetadata(17))) {
                    eVar.b(0);
                    String strExtractMetadata = fVar.extractMetadata(9);
                    String strExtractMetadata2 = fVar.extractMetadata(18);
                    String strExtractMetadata3 = fVar.extractMetadata(19);
                    int i10 = Integer.parseInt(fVar.extractMetadata(24));
                    if (i10 == 90 || i10 == 270) {
                        eVar.p(strExtractMetadata3 + "x" + strExtractMetadata2);
                    } else {
                        eVar.p(strExtractMetadata2 + "x" + strExtractMetadata3);
                    }
                    eVar.u(Long.parseLong(strExtractMetadata));
                } else {
                    eVar.b(1);
                    eVar.u(0L);
                    eVar.p("");
                }
                fVar.close();
            } catch (Throwable th2) {
                try {
                    fVar.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Exception e10) {
            eVar.b(1);
            eVar.u(0L);
            eVar.p("unknown");
            int iB = k0.b(context.getApplicationContext(), uri);
            if (iB == 1 || iB == 2) {
                wp.a.g("Found an empty video file", new Object[0]);
            } else {
                wp.a.e(e10);
                com.google.firebase.crashlytics.a.b().d(e10);
            }
        }
    }

    public static void J(Context context, Uri uri, String str, tg.c cVar) {
        Bundle bundle = new Bundle();
        bundle.putString("file_type", str);
        bundle.putString(CampaignEx.JSON_KEY_PACKAGE_NAME, cVar.d());
        FirebaseAnalytics.getInstance(context).a("share_file", bundle);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setComponent(new ComponentName(cVar.d(), cVar.a()));
        intent.setType(str);
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.addFlags(1);
        String string = Objects.equals(str, "video/*") ? context.getString(R.string.az_share_video_message, context.getString(R.string.app_name), "https://azrecorder.page.link/Best") : context.getString(R.string.az_share_image_message, context.getString(R.string.app_name), "https://azrecorder.page.link/Best");
        if (cVar.d().equals("com.google.android.youtube")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(context.getString(R.string.az_record_hashtag));
            if (!l0.o()) {
                sb2.append(System.lineSeparator());
                sb2.append(string);
            }
            intent.putExtra("android.intent.extra.SUBJECT", sb2.toString());
            intent.putExtra("android.intent.extra.TEXT", context.getString(R.string.app_name));
        } else if (!l0.o()) {
            intent.putExtra("android.intent.extra.TEXT", string);
        }
        context.startActivity(intent);
        nh.e.y(context, str, cVar);
    }

    public static void K(androidx.fragment.app.s sVar, Uri uri, String str) {
        wf.f0 f0Var = new wf.f0();
        Bundle bundle = new Bundle();
        bundle.putParcelable("media_uri", uri);
        bundle.putString("mime_type", str);
        f0Var.setArguments(bundle);
        f0Var.show(sVar.getSupportFragmentManager(), "share_file");
    }

    public static void L(final Activity activity, final pg.d dVar, final c cVar) {
        View viewInflate = LayoutInflater.from(activity).inflate(R.layout.dialog_enter_name, (ViewGroup) null, false);
        final EditText editText = (EditText) viewInflate.findViewById(R.id.et_name);
        String strE = dVar.e();
        final String strSubstring = strE.substring(0, strE.lastIndexOf("/" + dVar.g()));
        final String strG = dVar.g();
        int iLastIndexOf = strG.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            iLastIndexOf = strG.length();
        }
        editText.setText(strG.substring(0, iLastIndexOf));
        final String strSubstring2 = strG.substring(iLastIndexOf);
        editText.requestFocus();
        editText.setSelection(0, iLastIndexOf);
        AlertDialog.Builder builder = activity instanceof HomeActivity ? new AlertDialog.Builder(activity, R.style.GeneralDialogTheme) : new AlertDialog.Builder(activity);
        builder.setTitle(R.string.az_common_rename);
        builder.setView(viewInflate);
        builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: nh.y
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                f0.h(editText, strSubstring2, strSubstring, cVar, strG, activity, dVar, dialogInterface, i10);
            }
        });
        builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: nh.z
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                f0.g(activity, editText, dialogInterface, i10);
            }
        });
        builder.setCancelable(false);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.toggleSoftInput(2, 0);
        }
        editText.addTextChangedListener(new a(alertDialogCreate));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void M(Activity activity, final Uri uri, final b bVar) {
        final ContentResolver contentResolver = activity.getContentResolver();
        final ProgressDialog progressDialog = new ProgressDialog(activity);
        progressDialog.setTitle(R.string.delete_video);
        progressDialog.setMessage(activity.getString(R.string.please_wait));
        progressDialog.show();
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final Handler handler = new Handler(Looper.getMainLooper());
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: nh.c0
            @Override // java.lang.Runnable
            public final void run() {
                f0.b(contentResolver, uri, handler, progressDialog, bVar);
            }
        });
    }

    public static boolean N(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return new lg.a(context).f().getBoolean(context.getString(R.string.pref_use_trash), true);
        }
        return false;
    }

    public static /* synthetic */ void a(Context context, e eVar, String str, Uri uri) {
        l0.A(context, "grant_permission_storage");
        eVar.a(uri);
    }

    public static /* synthetic */ void b(ContentResolver contentResolver, Uri uri, Handler handler, final ProgressDialog progressDialog, final b bVar) {
        final int iUpdate;
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_trashed", Boolean.TRUE);
            iUpdate = contentResolver.update(uri, contentValues, null);
        } catch (SecurityException e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
            iUpdate = 0;
        }
        handler.post(new Runnable() { // from class: nh.v
            @Override // java.lang.Runnable
            public final void run() {
                f0.f(progressDialog, bVar, iUpdate);
            }
        });
    }

    public static /* synthetic */ void c(ProgressDialog progressDialog, b bVar, int i10) {
        progressDialog.dismiss();
        bVar.t(i10 > 0);
    }

    public static /* synthetic */ void f(ProgressDialog progressDialog, b bVar, int i10) {
        progressDialog.dismiss();
        bVar.t(i10 > 0);
    }

    public static /* synthetic */ void g(Activity activity, EditText editText, DialogInterface dialogInterface, int i10) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
        dialogInterface.cancel();
    }

    public static /* synthetic */ void h(EditText editText, String str, String str2, c cVar, String str3, Activity activity, pg.d dVar, DialogInterface dialogInterface, int i10) {
        try {
            String str4 = editText.getText().toString() + str;
            String str5 = str2 + "/" + str4;
            cVar.b(str4, str5);
            if (!str3.equals(str4)) {
                if (new File(str5).exists()) {
                    j0.b(activity, R.string.toast_name_exists);
                } else {
                    cVar.a(G(activity, dVar, str4));
                }
            }
        } catch (Exception e10) {
            j0.b(activity, R.string.toast_can_not_rename_file);
            wp.a.e(e10);
        }
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
        dialogInterface.dismiss();
    }

    public static /* synthetic */ void j(List list, ContentResolver contentResolver, Handler handler, final ProgressDialog progressDialog, final b bVar) {
        final int iDelete = 0;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (uri != null) {
                    iDelete += contentResolver.delete(uri, null, null);
                }
            }
        } catch (SecurityException e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
        }
        handler.post(new Runnable() { // from class: nh.u
            @Override // java.lang.Runnable
            public final void run() {
                f0.c(progressDialog, bVar, iDelete);
            }
        });
    }

    public static void l(final Activity activity, final List list, final b bVar, int i10) {
        String quantityString;
        AlertDialog.Builder builder = new AlertDialog.Builder(new androidx.appcompat.view.d(activity, R.style.GeneralDialogTheme));
        int size = list.size();
        AlertDialog.Builder title = builder.setIcon(R.drawable.ic_delete_grey_32dp).setTitle(i10 == 2022 ? R.string.delete_video : R.string.delete_image);
        if (size == 1) {
            quantityString = activity.getString(i10 == 2022 ? R.string.dialog_delete_video_msg : R.string.dialog_delete_image_msg);
        } else {
            quantityString = activity.getResources().getQuantityString(i10 == 2022 ? R.plurals.dialog_warning_delete_several_videos_msg : R.plurals.dialog_warning_delete_several_screenshots_mgs, size, Integer.valueOf(size));
        }
        title.setMessage(quantityString).setNegativeButton(R.string.f22515no, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() { // from class: nh.t
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                f0.q(activity, list, bVar);
            }
        }).show();
    }

    private static void m(final Activity activity, final Uri uri, final b bVar, int i10) {
        new AlertDialog.Builder(new androidx.appcompat.view.d(activity, R.style.GeneralDialogTheme)).setIcon(R.drawable.ic_delete_grey_32dp).setTitle(R.string.move_to_trash).setMessage(activity.getString(i10 == 2022 ? R.string.dialog_trash_video_msg : R.string.dialog_trash_image_msg)).setNegativeButton(R.string.f22515no, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() { // from class: nh.w
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                f0.M(activity, uri, bVar);
            }
        }).show();
    }

    public static boolean n(Context context, String str) {
        MediaScannerConnection.OnScanCompletedListener onScanCompletedListener = new MediaScannerConnection.OnScanCompletedListener() { // from class: nh.x
            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public final void onScanCompleted(String str2, Uri uri) {
                f0.d(str2, uri);
            }
        };
        boolean zDelete = false;
        try {
            zDelete = new File(str).delete();
            MediaScannerConnection.scanFile(context, new String[]{str}, null, onScanCompletedListener);
            return zDelete;
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
            return zDelete;
        }
    }

    public static void o(Activity activity, List list, b bVar, int i10) {
        if (Build.VERSION.SDK_INT < 30) {
            l(activity, list, bVar, i10);
        } else {
            E(activity, list, i10);
        }
    }

    public static void p(Activity activity, Uri uri, b bVar, int i10) {
        if (Build.VERSION.SDK_INT < 30 || !N(activity)) {
            l(activity, Collections.singletonList(uri), bVar, i10);
        } else {
            m(activity, uri, bVar, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(Activity activity, final List list, final b bVar) {
        final ContentResolver contentResolver = activity.getContentResolver();
        final ProgressDialog progressDialog = new ProgressDialog(activity);
        progressDialog.setTitle(R.string.delete_video);
        progressDialog.setMessage(activity.getString(R.string.please_wait));
        progressDialog.show();
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        final Handler handler = new Handler(Looper.getMainLooper());
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: nh.b0
            @Override // java.lang.Runnable
            public final void run() {
                f0.j(list, contentResolver, handler, progressDialog, bVar);
            }
        });
    }

    public static int r(String str, int i10, int i11, int i12, long j10) {
        return (int) (((j10 / 1000.0f) * ((Objects.equals(str, "image/gif") ? t(i10, i11, i12) : y(i11)) / 8.0f)) / 1048576.0f);
    }

    public static String s(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf == -1 ? str : str.substring(0, iLastIndexOf);
    }

    private static int t(int i10, int i11, int i12) {
        return i10 * i11 * i12;
    }

    public static String u(Context context, Uri uri) {
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
            try {
                String string = cursorQuery.moveToFirst() ? cursorQuery.getString(0) : null;
                cursorQuery.close();
                return string;
            } catch (Throwable th2) {
                if (cursorQuery == null) {
                    throw th2;
                }
                try {
                    cursorQuery.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.app.Activity, android.content.Context] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r10v5, types: [android.app.PendingIntent] */
    private static PendingIntent v(Activity activity, List list, int i10) {
        boolean z10 = N(activity) && (i10 == 2022 || i10 == 2025);
        boolean z11 = i10 == 2027;
        ContentResolver contentResolver = activity.getContentResolver();
        try {
            return (z10 || z11) ? MediaStore.createTrashRequest(contentResolver, list, !z11) : MediaStore.createDeleteRequest(contentResolver, list);
        } catch (IllegalArgumentException e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
            if (i10 == 2027 || i10 == 2026) {
                j0.b(activity, R.string.error);
                com.google.firebase.crashlytics.a.b().d(i10 == 2027 ? new RuntimeException("Failed to restore media from trash") : new RuntimeException("Failed to delete media from trash"));
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < list.size(); i11++) {
                Uri uriX = x(activity, (Uri) list.get(i11), i10 == 2025 ? 2 : 1);
                if (uriX == null) {
                    j0.b(activity, R.string.error);
                    com.google.firebase.crashlytics.a.b().d(new RuntimeException("Failed to convert to new Uri"));
                    return null;
                }
                arrayList.add(uriX);
            }
            try {
                activity = z10 ? MediaStore.createTrashRequest(contentResolver, arrayList, true) : MediaStore.createDeleteRequest(contentResolver, arrayList);
                return activity;
            } catch (Exception e11) {
                j0.b(activity, R.string.error);
                wp.a.e(e11);
                com.google.firebase.crashlytics.a.b().d(e11);
                return null;
            }
        }
    }

    public static Bitmap w(Bitmap bitmap, int i10, int i11) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i11 / width, i10 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static Uri x(Context context, Uri uri, int i10) {
        Uri uriWithAppendedId;
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_id"}, null, null, null);
            try {
                if (cursorQuery.moveToFirst()) {
                    uriWithAppendedId = ContentUris.withAppendedId(i10 == 2 ? MediaStore.Images.Media.getContentUri("external") : MediaStore.Video.Media.getContentUri("external"), Long.parseLong(cursorQuery.getString(0)));
                } else {
                    uriWithAppendedId = null;
                }
                cursorQuery.close();
                return uriWithAppendedId;
            } catch (Throwable th2) {
                if (cursorQuery == null) {
                    throw th2;
                }
                try {
                    cursorQuery.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
            return null;
        }
    }

    public static int y(int i10) {
        if (i10 >= 1440) {
            return 12000000;
        }
        if (i10 >= 1080) {
            return 10000000;
        }
        if (i10 >= 720) {
            return GmsVersion.VERSION_SAGA;
        }
        if (i10 >= 640) {
            return 6500000;
        }
        if (i10 >= 540) {
            return GmsVersion.VERSION_LONGHORN;
        }
        return i10 >= 480 ? 4000000 : 1500000;
    }

    public static List z(List list) {
        return (List) list.stream().map(new Function() { // from class: nh.d0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((pg.d) obj).f();
            }
        }).collect(Collectors.toList());
    }

    public static /* synthetic */ void d(String str, Uri uri) {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AlertDialog f47728a;

        a(AlertDialog alertDialog) {
            this.f47728a = alertDialog;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            this.f47728a.getButton(-1).setEnabled(nh.e.x(editable.toString()));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
