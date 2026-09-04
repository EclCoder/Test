package com.bykv.vk.openvk.preload.geckox.statistic;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.Common;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel;
import com.bykv.vk.openvk.preload.geckox.utils.e;
import com.bytedance.sdk.openadsdk.LXL.vHmGJpUTWNVV;
import com.mbridge.msdk.dycreator.baseview.qEqO.QGbBllacZSmHKn;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class c {
    public static void a(com.bykv.vk.openvk.preload.geckox.b bVar, com.bykv.vk.openvk.preload.geckox.buffer.a.a aVar) {
        IStatisticMonitor iStatisticMonitorQ = bVar.q();
        if (iStatisticMonitorQ != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(vHmGJpUTWNVV.pYoFpf, "gecko");
                jSONObject.put("device_id", bVar.r());
                jSONObject.put("os", 0);
                jSONObject.put("app_version", bVar.o());
                jSONObject.put("api_version", "v3");
                jSONObject.put("aid", bVar.k());
                jSONObject.put("x_tt_logid", aVar.f11775e);
                jSONObject.put("http_status", aVar.f11777g);
                jSONObject.put("err_msg", aVar.f11774d);
                if (TextUtils.isEmpty(aVar.f11775e)) {
                    jSONObject.put("deployments_info", aVar.f11772b);
                    jSONObject.put("local_info", aVar.f11771a);
                    jSONObject.put("custom_info", aVar.f11773c);
                } else {
                    jSONObject.put("deployments_info", "");
                    jSONObject.put("local_info", "");
                    jSONObject.put("custom_info", "");
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Build.VERSION.SDK_INT);
                jSONObject.put("os_version", sb2.toString());
                jSONObject.put("device_platform", "android");
                jSONObject.put("device_model", Build.MODEL);
                jSONObject.put(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, aVar.f11776f);
                iStatisticMonitorQ.upload("geckosdk_query_pkgs", jSONObject);
            } catch (Throwable th2) {
                GeckoLogger.w("gecko-debug-tag", "UploadStatistic.upload:", th2);
            }
        }
    }

    private static List<StatisticModel.PackageStatisticModel.DownloadFailRecords> b(List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list;
    }

    private static Integer a(List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return Integer.valueOf(list.size());
    }

    private static void a(com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar, List<StatisticModel.PackageStatisticModel> list) {
        if (aVar.f11890z && aVar.A) {
            StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel);
            packageStatisticModel.statsType = 0;
            packageStatisticModel.accessKey = aVar.f11865a;
            packageStatisticModel.groupName = aVar.f11866b;
            packageStatisticModel.channel = aVar.f11867c;
            packageStatisticModel.f11863ac = aVar.f11878n;
            packageStatisticModel.f11864id = aVar.f11880p;
            packageStatisticModel.downloadRetryTimes = a(aVar.f11885u);
            packageStatisticModel.downloadUrl = aVar.f11884t;
            packageStatisticModel.downloadFailRecords = b(aVar.f11885u);
            packageStatisticModel.downloadDuration = Long.valueOf(aVar.f11887w - aVar.f11886v);
            if (aVar.B) {
                StatisticModel.PackageStatisticModel packageStatisticModel2 = new StatisticModel.PackageStatisticModel();
                list.add(packageStatisticModel2);
                packageStatisticModel2.accessKey = aVar.f11865a;
                packageStatisticModel2.groupName = aVar.f11866b;
                packageStatisticModel2.statsType = 2;
                packageStatisticModel2.f11864id = aVar.f11880p;
                packageStatisticModel2.channel = aVar.f11867c;
                packageStatisticModel2.activeCheckDuration = Long.valueOf(aVar.f11888x - aVar.f11887w);
                packageStatisticModel2.applyDuration = Long.valueOf(aVar.f11889y - aVar.f11888x);
                return;
            }
            StatisticModel.PackageStatisticModel packageStatisticModel3 = new StatisticModel.PackageStatisticModel();
            list.add(packageStatisticModel3);
            packageStatisticModel3.statsType = 3;
            packageStatisticModel3.accessKey = aVar.f11865a;
            packageStatisticModel3.groupName = aVar.f11866b;
            packageStatisticModel3.errCode = "500";
            packageStatisticModel3.f11864id = aVar.f11880p;
            packageStatisticModel3.channel = aVar.f11867c;
            packageStatisticModel3.errMsg = aVar.D;
            return;
        }
        StatisticModel.PackageStatisticModel packageStatisticModel4 = new StatisticModel.PackageStatisticModel();
        list.add(packageStatisticModel4);
        packageStatisticModel4.statsType = 1;
        packageStatisticModel4.accessKey = aVar.f11865a;
        packageStatisticModel4.groupName = aVar.f11866b;
        packageStatisticModel4.channel = aVar.f11867c;
        packageStatisticModel4.f11863ac = aVar.f11878n;
        packageStatisticModel4.f11864id = aVar.f11880p;
        packageStatisticModel4.downloadRetryTimes = a(aVar.f11885u);
        packageStatisticModel4.downloadUrl = aVar.f11884t;
        packageStatisticModel4.downloadFailRecords = b(aVar.f11885u);
        if (!aVar.f11890z) {
            packageStatisticModel4.errCode = "300";
            List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list2 = aVar.f11885u;
            if (list2 == null || list2.isEmpty()) {
                return;
            }
            packageStatisticModel4.errMsg = aVar.f11885u.get(0).reason;
            return;
        }
        if (aVar.A) {
            return;
        }
        packageStatisticModel4.errCode = "450";
        packageStatisticModel4.errMsg = aVar.C;
    }

    public static void a(final com.bykv.vk.openvk.preload.geckox.b bVar, a aVar) {
        StatisticModel statisticModel;
        ArrayList arrayList = new ArrayList();
        for (com.bykv.vk.openvk.preload.geckox.statistic.model.a aVar2 : aVar.a()) {
            if (aVar2.f11868d != null || aVar2.f11870f != 0) {
                if (aVar2.f11872h && aVar2.f11873i) {
                    StatisticModel.PackageStatisticModel packageStatisticModel = new StatisticModel.PackageStatisticModel();
                    arrayList.add(packageStatisticModel);
                    packageStatisticModel.statsType = 100;
                    packageStatisticModel.groupName = aVar2.f11866b;
                    packageStatisticModel.accessKey = aVar2.f11865a;
                    packageStatisticModel.channel = aVar2.f11867c;
                    packageStatisticModel.f11863ac = aVar2.f11878n;
                    packageStatisticModel.f11864id = aVar2.f11880p;
                    packageStatisticModel.patchId = aVar2.f11879o;
                    packageStatisticModel.downloadRetryTimes = a(aVar2.f11869e);
                    packageStatisticModel.downloadUrl = aVar2.f11868d;
                    packageStatisticModel.downloadFailRecords = b(aVar2.f11869e);
                    packageStatisticModel.downloadDuration = Long.valueOf(aVar2.f11871g - aVar2.f11870f);
                    if (!aVar2.f11874j) {
                        StatisticModel.PackageStatisticModel packageStatisticModel2 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel2);
                        packageStatisticModel2.statsType = 100;
                        packageStatisticModel2.channel = aVar2.f11867c;
                        packageStatisticModel2.errCode = "403";
                        packageStatisticModel2.errMsg = aVar2.f11882r;
                        packageStatisticModel2.f11863ac = aVar2.f11878n;
                        packageStatisticModel2.patchId = aVar2.f11879o;
                        packageStatisticModel2.f11864id = aVar2.f11880p;
                        packageStatisticModel2.downloadRetryTimes = a(aVar2.f11869e);
                        packageStatisticModel2.downloadUrl = aVar2.f11868d;
                        packageStatisticModel2.downloadFailRecords = b(aVar2.f11869e);
                    } else if (aVar2.f11875k) {
                        StatisticModel.PackageStatisticModel packageStatisticModel3 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel3);
                        packageStatisticModel3.accessKey = aVar2.f11865a;
                        packageStatisticModel3.groupName = aVar2.f11866b;
                        packageStatisticModel3.statsType = 102;
                        packageStatisticModel3.patchId = aVar2.f11879o;
                        packageStatisticModel3.f11864id = aVar2.f11880p;
                        packageStatisticModel3.channel = aVar2.f11867c;
                        packageStatisticModel3.activeCheckDuration = Long.valueOf(aVar2.f11876l - aVar2.f11871g);
                        packageStatisticModel3.applyDuration = Long.valueOf(aVar2.f11877m - aVar2.f11876l);
                    } else {
                        StatisticModel.PackageStatisticModel packageStatisticModel4 = new StatisticModel.PackageStatisticModel();
                        arrayList.add(packageStatisticModel4);
                        packageStatisticModel4.accessKey = aVar2.f11865a;
                        packageStatisticModel4.groupName = aVar2.f11866b;
                        packageStatisticModel4.statsType = 103;
                        packageStatisticModel4.errCode = "501";
                        packageStatisticModel4.channel = aVar2.f11867c;
                        packageStatisticModel4.patchId = aVar2.f11879o;
                        packageStatisticModel4.f11864id = aVar2.f11880p;
                        packageStatisticModel4.errMsg = aVar2.f11883s;
                        a(aVar2, arrayList);
                    }
                } else {
                    StatisticModel.PackageStatisticModel packageStatisticModel5 = new StatisticModel.PackageStatisticModel();
                    arrayList.add(packageStatisticModel5);
                    packageStatisticModel5.statsType = 101;
                    packageStatisticModel5.accessKey = aVar2.f11865a;
                    packageStatisticModel5.groupName = aVar2.f11866b;
                    packageStatisticModel5.channel = aVar2.f11867c;
                    packageStatisticModel5.f11863ac = aVar2.f11878n;
                    packageStatisticModel5.patchId = aVar2.f11879o;
                    packageStatisticModel5.f11864id = aVar2.f11880p;
                    packageStatisticModel5.downloadRetryTimes = a(aVar2.f11869e);
                    packageStatisticModel5.downloadUrl = aVar2.f11868d;
                    packageStatisticModel5.downloadFailRecords = b(aVar2.f11869e);
                    if (!aVar2.f11872h) {
                        packageStatisticModel5.errCode = "301";
                        List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list = aVar2.f11869e;
                        if (list != null && !list.isEmpty()) {
                            packageStatisticModel5.errMsg = aVar2.f11869e.get(0).reason;
                        }
                    } else if (!aVar2.f11873i) {
                        packageStatisticModel5.errCode = "402";
                        packageStatisticModel5.errMsg = aVar2.f11881q;
                    }
                    a(aVar2, arrayList);
                }
            }
            a(aVar2, arrayList);
        }
        Context contextA = bVar.a();
        arrayList.addAll(com.bykv.vk.openvk.preload.geckox.a.a.a(contextA));
        if (arrayList.isEmpty()) {
            statisticModel = null;
        } else {
            Common common = new Common(bVar.k(), bVar.o(), bVar.r(), com.bykv.vk.openvk.preload.geckox.utils.a.b(contextA), e.a(contextA), bVar.l(), bVar.m());
            statisticModel = new StatisticModel();
            statisticModel.common = common;
            statisticModel.packages = arrayList;
            String string = UUID.randomUUID().toString();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((StatisticModel.PackageStatisticModel) obj).logId = string;
            }
        }
        StatisticModel statisticModel2 = statisticModel;
        if (statisticModel2 == null || statisticModel2.packages == null) {
            return;
        }
        IStatisticMonitor iStatisticMonitorQ = bVar.q();
        if (iStatisticMonitorQ != null) {
            try {
                for (StatisticModel.PackageStatisticModel packageStatisticModel6 : statisticModel2.packages) {
                    Common common2 = statisticModel2.common;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("params_for_special", "gecko");
                    jSONObject.put(TtmlNode.TAG_REGION, common2.region);
                    jSONObject.put("err_code", packageStatisticModel6.errCode);
                    jSONObject.put("err_msg", packageStatisticModel6.errMsg);
                    jSONObject.put("sdk_version", common2.sdkVersion);
                    jSONObject.put("access_key", packageStatisticModel6.accessKey);
                    jSONObject.put("stats_type", packageStatisticModel6.statsType);
                    jSONObject.put("device_id", common2.deviceId);
                    Long l10 = packageStatisticModel6.patchId;
                    jSONObject.put("patch_id", l10 == null ? 0L : l10.longValue());
                    jSONObject.put("group_name", packageStatisticModel6.groupName);
                    jSONObject.put(QGbBllacZSmHKn.UlERxsXAN, common2.os);
                    jSONObject.put("app_version", common2.appVersion);
                    jSONObject.put("device_model", common2.deviceModel);
                    jSONObject.put("channel", packageStatisticModel6.channel);
                    Long l11 = packageStatisticModel6.f11864id;
                    jSONObject.put("id", l11 == null ? 0L : l11.longValue());
                    jSONObject.put(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, common2.f11848ac);
                    Integer num = packageStatisticModel6.downloadRetryTimes;
                    jSONObject.put("download_retry_times", num == null ? 0 : num.intValue());
                    String str = packageStatisticModel6.downloadUrl;
                    Object obj2 = "";
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put(DownloadModel.DOWNLOAD_URL, str);
                    jSONObject.put("download_duration", packageStatisticModel6.downloadDuration);
                    List<StatisticModel.PackageStatisticModel.DownloadFailRecords> list2 = packageStatisticModel6.downloadFailRecords;
                    if (list2 != null) {
                        obj2 = list2;
                    }
                    jSONObject.put("download_fail_records", obj2);
                    jSONObject.put("log_id", packageStatisticModel6.logId);
                    Long l12 = packageStatisticModel6.activeCheckDuration;
                    jSONObject.put("active_check_duration", l12 == null ? 0L : l12.longValue());
                    Long l13 = packageStatisticModel6.applyDuration;
                    jSONObject.put("apply_duration", l13 == null ? 0L : l13.longValue());
                    iStatisticMonitorQ.upload("geckosdk_update_stats", jSONObject);
                }
            } catch (Throwable th2) {
                GeckoLogger.w("gecko-debug-tag", "UploadStatistic.upload:", th2);
            }
        }
        if (bVar.c()) {
            try {
                final String json = statisticModel2.toJson();
                if (TextUtils.isEmpty(json)) {
                    return;
                }
                final String str2 = "https://" + bVar.j() + "/gecko/server/packages/stats";
                com.bykv.vk.openvk.preload.geckox.b.g().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.statistic.c.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        for (int i11 = 0; i11 < 3; i11++) {
                            try {
                                Response responseDoPost = bVar.i().doPost(str2, json);
                                if (responseDoPost.code != 200) {
                                    throw new NetworkErrorException("net work get failed, code: " + responseDoPost.code + ", url:" + str2);
                                }
                                if (new JSONObject(responseDoPost.body).getInt(NotificationCompat.CATEGORY_STATUS) == 0) {
                                    return;
                                }
                            } catch (Exception e10) {
                                GeckoLogger.w("gecko-debug-tag", "upload statistic:", e10);
                            }
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }
}
