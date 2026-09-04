package nh;

import android.content.ContentUris;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import f8.Ygx.FuoITeVPeXAj;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k0 {
    private static String a(Context context, Uri uri, String str, String[] strArr) throws Throwable {
        Throwable th2;
        Cursor cursor = null;
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                        cursorQuery.close();
                        return string;
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    cursor = cursorQuery;
                    if (cursor == null) {
                        throw th2;
                    }
                    cursor.close();
                    throw th2;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    public static int b(Context context, Uri uri) {
        try {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, CampaignEx.JSON_KEY_AD_R);
            try {
                if (assetFileDescriptorOpenAssetFileDescriptor.getLength() == 0) {
                    assetFileDescriptorOpenAssetFileDescriptor.close();
                    return 1;
                }
                assetFileDescriptorOpenAssetFileDescriptor.close();
                return 0;
            } catch (Throwable th2) {
                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                    try {
                        assetFileDescriptorOpenAssetFileDescriptor.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (FileNotFoundException unused) {
            return 2;
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
            return 3;
        }
    }

    private static boolean d(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    private static boolean e(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    private static boolean f(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static Bundle c(Context context, Uri uri) throws Throwable {
        boolean z10;
        boolean z11 = true;
        boolean z12 = false;
        String strA = null;
        Uri uri2 = null;
        strA = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (e(uri)) {
                String documentId = DocumentsContract.getDocumentId(uri);
                String[] strArrSplit = documentId.split(":");
                if ("primary".equalsIgnoreCase(strArrSplit[0])) {
                    String str = pf.a.f50029d;
                    if (strArrSplit.length > 1) {
                        str = str + "/" + strArrSplit[1];
                    }
                    strA = str;
                    z10 = true;
                    z12 = true;
                } else {
                    String strQ = e.q(context);
                    if (strQ != null) {
                        if (strArrSplit.length > 1) {
                            strQ = strQ + "/" + strArrSplit[1];
                        }
                        boolean zExists = new File(strQ).exists();
                        strA = strQ;
                        z10 = false;
                        if (zExists) {
                            z12 = true;
                        }
                    } else {
                        strA = documentId;
                    }
                }
            } else if (d(uri)) {
                strA = a(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.parseLong(DocumentsContract.getDocumentId(uri))), null, null);
            } else if (f(uri)) {
                String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(":");
                String str2 = strArrSplit2[0];
                if (FuoITeVPeXAj.SyowBFTJwHcNxLt.equals(str2)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if (MimeTypes.BASE_TYPE_VIDEO.equals(str2)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if (MimeTypes.BASE_TYPE_AUDIO.equals(str2)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                strA = a(context, uri2, "_id=?", new String[]{strArrSplit2[1]});
            }
            z10 = false;
        } else {
            z10 = false;
        }
        Bundle bundle = new Bundle();
        if (strA == null) {
            strA = "unknown";
            z11 = z12;
        }
        bundle.putBoolean("success", z11);
        bundle.putBoolean("primary", z10);
        bundle.putString(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, strA);
        return bundle;
    }
}
