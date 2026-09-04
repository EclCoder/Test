package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.p001authapi.zbbc;
import com.google.api.client.http.UrlEncodedParser;
import com.mbridge.msdk.playercommon.PHx.jyeoXJ;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zbb implements Runnable {
    private static final Logger zba = new Logger("RevokeAccessOperation", new String[0]);
    private final String zbb;
    private final StatusPendingResult zbc = new StatusPendingResult((GoogleApiClient) null);

    public zbb(String str) {
        this.zbb = Preconditions.checkNotEmpty(str);
    }

    public static PendingResult zba(String str) {
        if (str == null) {
            return PendingResults.immediateFailedResult(new Status(4), null);
        }
        zbb zbbVar = new zbb(str);
        new Thread(zbbVar).start();
        return zbbVar.zbc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.RESULT_INTERNAL_ERROR;
        try {
            String str = this.zbb;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 50);
            sb2.append("https://accounts.google.com/o/oauth2/revoke?token=");
            sb2.append(str);
            URL url = new URL(sb2.toString());
            int i10 = zbbc.zbb;
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty("Content-Type", UrlEncodedParser.CONTENT_TYPE);
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.RESULT_SUCCESS;
            } else {
                zba.e("Unable to revoke access!", new Object[0]);
            }
            Logger logger = zba;
            StringBuilder sb3 = new StringBuilder(String.valueOf(responseCode).length() + 15);
            sb3.append("Response Code: ");
            sb3.append(responseCode);
            logger.d(sb3.toString(), new Object[0]);
        } catch (IOException e10) {
            zba.e("IOException when revoking access: ".concat(String.valueOf(e10.toString())), new Object[0]);
        } catch (Exception e11) {
            zba.e(jyeoXJ.uMQVskOkHJeYo.concat(String.valueOf(e11.toString())), new Object[0]);
        }
        this.zbc.setResult(status);
    }
}
