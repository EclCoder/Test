// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 701-720
// ============================================================

// ============================================================
// Function #701
// Name: FUN_0009f610
// Address: 0009f610
// JNI: NO
// ============================================================


void FUN_0009f610(undefined4 *param_1)

{
  int iVar1;
  char *pcVar2;
  undefined4 *puVar3;
  undefined4 uVar4;
  undefined1 *puVar5;
  int iVar6;
  undefined4 uVar7;
  
  iVar1 = DAT_0009f734;
  iVar6 = *(int *)(DAT_0009f734 + 0x9f634);
  if (iVar6 != 0) {
    pcVar2 = (char *)FUN_00025e6c(DAT_0009f738 + 0x9f638);
    if (*pcVar2 == '\x01') {
      puVar3 = (undefined4 *)FUN_00025e6c(DAT_0009f73c + 0x9f650);
      uVar4 = *puVar3;
    }
    else {
      puVar3 = (undefined4 *)FUN_00025e6c(DAT_0009f740 + 0x9f6cc);
      uVar4 = FUN_00076fc0();
      iVar6 = DAT_0009f744;
      *puVar3 = uVar4;
      puVar5 = (undefined1 *)FUN_00025e6c(iVar6 + 0x9f6e8);
      iVar6 = *(int *)(iVar1 + 0x9f634);
      *puVar5 = 1;
    }
    uVar4 = FUN_0009ba5c(uVar4,*(undefined4 *)(iVar1 + 0x9f630),iVar6);
    pcVar2 = (char *)FUN_00025e6c(DAT_0009f748 + 0x9f670);
    if (*pcVar2 == '\x01') {
      puVar3 = (undefined4 *)FUN_00025e6c(DAT_0009f74c + 0x9f688);
      uVar7 = *puVar3;
    }
    else {
      puVar3 = (undefined4 *)FUN_00025e6c(DAT_0009f750 + 0x9f70c);
      uVar7 = FUN_00076fc0();
      iVar1 = DAT_0009f754;
      *puVar3 = uVar7;
      puVar5 = (undefined1 *)FUN_00025e6c(iVar1 + 0x9f728);
      *puVar5 = 1;
    }
    iVar1 = DAT_0009f758;
    *param_1 = uVar4;
    param_1[3] = uVar7;
    param_1[2] = iVar1 + 0x9f6a8;
    param_1[6] = param_1 + 2;
    return;
  }
  param_1[6] = 0;
  *param_1 = 0;
  return;
}




// ============================================================
// Function #702
// Name: FUN_0009f75c
// Address: 0009f75c
// JNI: NO
// ============================================================


uint FUN_0009f75c(int *param_1,undefined4 *param_2,undefined4 *param_3,undefined8 *param_4)

{
  bool bVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  uint uVar4;
  void *pvVar5;
  undefined1 *puVar6;
  int *piVar7;
  undefined1 *puVar8;
  undefined4 uVar9;
  uint uVar10;
  undefined8 *extraout_r3;
  undefined8 *extraout_r3_00;
  int iVar11;
  uint uVar12;
  uint uVar13;
  undefined4 *puVar14;
  undefined8 *puVar15;
  uint uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  
  if (param_3 == (undefined4 *)0x0) {
    puVar14 = (undefined4 *)FUN_00025e6c(DAT_0009f9f8 + 0x9f968);
    uVar9 = 0x16;
LAB_0009f994:
    *puVar14 = uVar9;
    return 0xffffffff;
  }
  puVar15 = (undefined8 *)param_3[0x101];
  if (*param_1 == 0) {
    *param_2 = 0;
  }
  puVar2 = (undefined8 *)(param_3 + 1);
  uVar13 = 0;
  do {
    puVar3 = (undefined8 *)param_3[0x102];
    if (puVar15 == puVar3) {
      uVar16 = FUN_00019718(3,*param_3,puVar2,0x400);
      if (0xfffff000 < uVar16) {
        piVar7 = (int *)FUN_00025e6c(DAT_0009f9fc + 0x9f9b8);
        *piVar7 = -uVar16;
        break;
      }
      if ((int)uVar16 < 1) break;
      param_3[0x101] = puVar2;
      puVar3 = (undefined8 *)((int)puVar2 + uVar16);
      param_3[0x102] = puVar3;
      uVar16 = (int)puVar3 - (int)puVar2;
      bVar1 = true;
      param_4 = extraout_r3;
      puVar15 = puVar2;
      if (puVar3 != puVar2) goto LAB_0009f828;
    }
    else {
      uVar16 = (int)puVar3 - (int)puVar15;
      bVar1 = true;
      if (puVar3 != puVar15) {
LAB_0009f828:
        bVar1 = true;
        uVar12 = 0;
        do {
          if (*(char *)((int)puVar15 + uVar12) == '\n') {
            bVar1 = false;
            uVar16 = uVar12 + 1;
            break;
          }
          uVar12 = uVar12 + 1;
        } while (uVar16 != uVar12);
      }
    }
    uVar12 = uVar16 + uVar13;
    if ((uVar12 ^ 0x7fffffff) <= uVar12 >> 1) {
      puVar14 = (undefined4 *)FUN_00025e6c(DAT_0009fa00 + 0x9f97c);
      uVar9 = 0x4b;
      goto LAB_0009f994;
    }
    puVar14 = (undefined4 *)(uVar12 + (uVar12 >> 1) + 1);
    if (puVar14 < (undefined4 *)0x81) {
      puVar14 = (undefined4 *)0x80;
    }
    if ((undefined4 *)*param_2 < puVar14) {
      uVar4 = (int)puVar14 - 1;
      if (((uint)puVar14 & uVar4) != 0) {
        uVar4 = uVar4 | uVar4 >> 1;
        uVar4 = uVar4 | uVar4 >> 2;
        uVar4 = uVar4 | uVar4 >> 4;
        uVar4 = uVar4 | uVar4 >> 8;
        puVar14 = (undefined4 *)((uVar4 | uVar4 >> 0x10) + 1);
      }
      pvVar5 = realloc((void *)*param_1,(size_t)puVar14);
      if (pvVar5 == (void *)0x0) {
        puVar14 = (undefined4 *)FUN_00025e6c(DAT_0009fa04 + 0x9f990);
        uVar9 = 0xc;
        goto LAB_0009f994;
      }
      *param_1 = (int)pvVar5;
      puVar15 = (undefined8 *)param_3[0x101];
      *param_2 = puVar14;
      puVar14 = param_2;
      param_4 = extraout_r3_00;
    }
    else {
      pvVar5 = (void *)*param_1;
      puVar14 = (undefined4 *)*param_2;
    }
    if (uVar16 != 0) {
      uVar4 = 0;
      if (0xf < uVar16) {
        param_4 = (undefined8 *)((int)pvVar5 + uVar13);
        puVar14 = (undefined4 *)((int)param_4 - (int)puVar15);
      }
      if (0xf < uVar16 && (undefined4 *)0xf < puVar14) {
        uVar4 = uVar16 & 0xfffffff0;
        puVar3 = puVar15;
        uVar10 = uVar4;
        do {
          uVar17 = *puVar3;
          uVar18 = puVar3[1];
          puVar3 = puVar3 + 2;
          uVar10 = uVar10 - 0x10;
          *param_4 = uVar17;
          param_4[1] = uVar18;
          param_4 = param_4 + 2;
        } while (uVar10 != 0);
        if (uVar16 == uVar4) goto LAB_0009f7a4;
      }
      iVar11 = uVar16 - uVar4;
      puVar6 = (undefined1 *)((int)pvVar5 + uVar4 + uVar13);
      puVar8 = (undefined1 *)((int)puVar15 + uVar4);
      do {
        iVar11 = iVar11 + -1;
        *puVar6 = *puVar8;
        puVar6 = puVar6 + 1;
        puVar8 = puVar8 + 1;
      } while (iVar11 != 0);
      param_4 = (undefined8 *)0x0;
    }
LAB_0009f7a4:
    puVar15 = (undefined8 *)(param_3[0x101] + uVar16);
    param_3[0x101] = puVar15;
    uVar13 = uVar12;
  } while (bVar1);
  if (uVar13 == 0) {
    return 0xffffffff;
  }
  *(undefined1 *)(*param_1 + uVar13) = 0;
  return uVar13;
}




// ============================================================
// Function #703
// Name: FUN_0009fa08
// Address: 0009fa08
// JNI: NO
// ============================================================


void FUN_0009fa08(undefined8 *param_1,undefined8 *param_2,uint param_3,uint param_4)

{
  undefined1 *puVar1;
  int iVar2;
  undefined8 *puVar3;
  undefined1 *puVar4;
  uint uVar5;
  uint uVar6;
  undefined8 *puVar7;
  bool bVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  
  if (param_3 == 0) {
    return;
  }
  bVar8 = param_3 == 0x10;
  uVar6 = 0;
  if (0xf < param_3) {
    param_4 = (int)param_1 - (int)param_2;
    bVar8 = param_4 == 0xf;
  }
  if ((0xf < param_3 && 0xe < param_4) && !bVar8) {
    uVar6 = param_3 & 0xfffffff0;
    puVar3 = param_1;
    uVar5 = uVar6;
    puVar7 = param_2;
    do {
      uVar9 = *puVar7;
      uVar10 = puVar7[1];
      puVar7 = puVar7 + 2;
      uVar5 = uVar5 - 0x10;
      *puVar3 = uVar9;
      puVar3[1] = uVar10;
      puVar3 = puVar3 + 2;
    } while (uVar5 != 0);
    if (param_3 == uVar6) {
      return;
    }
  }
  iVar2 = param_3 - uVar6;
  puVar1 = (undefined1 *)((int)param_2 + uVar6);
  puVar4 = (undefined1 *)((int)param_1 + uVar6);
  do {
    iVar2 = iVar2 + -1;
    *puVar4 = *puVar1;
    puVar1 = puVar1 + 1;
    puVar4 = puVar4 + 1;
  } while (iVar2 != 0);
  return;
}




// ============================================================
// Function #704
// Name: FUN_0009fa74
// Address: 0009fa74
// JNI: NO
// ============================================================


void FUN_0009fa74(undefined8 *param_1,undefined8 *param_2)

{
  uint uVar1;
  undefined8 *puVar2;
  uint uVar3;
  undefined1 *puVar4;
  uint extraout_r2;
  uint uVar5;
  undefined1 *puVar6;
  undefined8 *puVar7;
  int iVar8;
  undefined8 *puVar9;
  uint uVar10;
  uint uVar11;
  uint uVar12;
  bool bVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  
  uVar5 = 0xffffffff;
  do {
    uVar10 = uVar5 + 1;
    iVar8 = uVar5 + 1;
    uVar5 = uVar10;
  } while (*(char *)((int)param_1 + iVar8) != '\0');
  uVar5 = 0xffffffff;
  do {
    uVar11 = uVar5 + 1;
    iVar8 = uVar5 + 1;
    uVar5 = uVar11;
  } while (*(char *)((int)param_2 + iVar8) != '\0');
  uVar12 = (int)((int)param_1 + uVar10) - (int)param_1;
  uVar1 = (int)((int)param_2 + uVar11) - (int)param_2;
  puVar2 = malloc(uVar1 + uVar12 + 1);
  uVar5 = extraout_r2;
  if ((undefined8 *)((int)param_1 + uVar10) != param_1) {
    uVar3 = 0;
    if (0xf < uVar12) {
      uVar5 = (int)puVar2 - (int)param_1;
    }
    if (0xf < uVar12 && 0xf < uVar5) {
      uVar5 = uVar10 & 0xfffffff0;
      uVar3 = uVar12 & 0xfffffff0;
      puVar9 = param_1;
      puVar7 = puVar2;
      do {
        uVar14 = *puVar9;
        uVar15 = puVar9[1];
        puVar9 = puVar9 + 2;
        uVar5 = uVar5 - 0x10;
        *puVar7 = uVar14;
        puVar7[1] = uVar15;
        puVar7 = puVar7 + 2;
      } while (uVar5 != 0);
      if (uVar12 == uVar3) {
        uVar5 = 0;
        goto LAB_0009fb04;
      }
    }
    do {
      uVar5 = (uint)*(byte *)((int)param_1 + uVar3);
      *(byte *)((int)puVar2 + uVar3) = *(byte *)((int)param_1 + uVar3);
      uVar3 = uVar3 + 1;
    } while (uVar10 != uVar3);
  }
LAB_0009fb04:
  if ((undefined8 *)((int)param_2 + uVar11) != param_2) {
    uVar3 = 0;
    if (0xf < uVar1) {
      uVar5 = (int)puVar2 + (uVar12 - (int)param_2);
    }
    if (0xf < uVar1 && 0xf < uVar5) {
      puVar7 = (undefined8 *)((int)puVar2 + uVar10);
      uVar5 = uVar11 & 0xfffffff0;
      uVar3 = uVar1 & 0xfffffff0;
      puVar9 = param_2;
      do {
        uVar14 = *puVar9;
        uVar15 = puVar9[1];
        puVar9 = puVar9 + 2;
        uVar5 = uVar5 - 0x10;
        *puVar7 = uVar14;
        puVar7[1] = uVar15;
        puVar7 = puVar7 + 2;
      } while (uVar5 != 0);
      if (uVar1 == uVar3) goto LAB_0009fb48;
    }
    iVar8 = uVar3 - uVar11;
    puVar4 = (undefined1 *)((int)puVar2 + uVar10 + uVar3);
    puVar6 = (undefined1 *)((int)param_2 + uVar3);
    do {
      bVar13 = iVar8 != -1;
      iVar8 = iVar8 + 1;
      *puVar4 = *puVar6;
      puVar4 = puVar4 + 1;
      puVar6 = puVar6 + 1;
    } while (bVar13);
  }
LAB_0009fb48:
  *(undefined1 *)((int)puVar2 + uVar1 + uVar12) = 0;
  return;
}




// ============================================================
// Function #705
// Name: FUN_0009fbc0
// Address: 0009fbc0
// JNI: NO
// ============================================================


bool FUN_0009fbc0(int param_1,undefined4 param_2,uint param_3,uint param_4)

{
  int *piVar1;
  bool bVar2;
  uint uVar3;
  uint uVar4;
  
  uVar4 = *(uint *)(param_1 + 0x10);
  bVar2 = false;
  uVar3 = *(uint *)(param_1 + 0x14);
  if (param_4 < uVar3 || uVar3 - param_4 < (uint)(param_3 <= uVar4)) {
    *(uint *)(param_1 + 8) = uVar4 - param_3;
    *(uint *)(param_1 + 0xc) = uVar3 - (param_4 + (uVar4 < param_3));
    uVar3 = FUN_00019718(0x13,*(undefined4 *)(param_1 + 4),uVar4 - param_3,0);
    if (0xfffff000 < uVar3) {
      piVar1 = (int *)FUN_00025e6c(DAT_0009fc40 + 0x9fc14);
      *piVar1 = -uVar3;
      uVar3 = 0xffffffff;
    }
    bVar2 = *(uint *)(param_1 + 8) == uVar3 && *(int *)(param_1 + 0xc) == (int)uVar3 >> 0x1f;
  }
  return bVar2;
}




// ============================================================
// Function #706
// Name: FUN_0009fc44
// Address: 0009fc44
// JNI: NO
// ============================================================


void FUN_0009fc44(int *param_1,int param_2,uint param_3,uint param_4)

{
  void *__ptr;
  int *piVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint *puVar5;
  int iVar6;
  
  puVar5 = (uint *)(param_2 + 8);
  uVar4 = *puVar5;
  uVar3 = *(uint *)(param_2 + 0xc);
  uVar2 = uVar3 + param_4 + (uint)CARRY4(uVar4,param_3);
  if ((!CARRY4(uVar3,param_4) && !CARRY4(uVar3 + param_4,(uint)CARRY4(uVar4,param_3))) &&
     (uVar2 < *(uint *)(param_2 + 0x14) ||
      *(uint *)(param_2 + 0x14) - uVar2 < (uint)(uVar4 + param_3 <= *(uint *)(param_2 + 0x10)))) {
    __ptr = malloc(param_3);
    if (__ptr != (void *)0x0) {
      uVar2 = FUN_00019718(3,*(undefined4 *)(param_2 + 4),__ptr,param_3);
      if (uVar2 < 0xfffff001) {
        if (0 < (int)uVar2) {
          if (uVar2 < 0xb) {
            iVar6 = (int)param_1 + 1;
            *(char *)param_1 = (char)(uVar2 << 1);
          }
          else {
            iVar6 = FUN_000a0370((uVar2 | 7) + 1);
            *param_1 = (uVar2 | 7) + 2;
            param_1[1] = uVar2;
            param_1[2] = iVar6;
          }
          __aeabi_memcpy(iVar6,__ptr,uVar2);
          *(undefined1 *)(iVar6 + uVar2) = 0;
          free(__ptr);
          uVar3 = *puVar5;
          *puVar5 = uVar3 + uVar2;
          *(uint *)(param_2 + 0xc) = *(int *)(param_2 + 0xc) + (uint)CARRY4(uVar3,uVar2);
          return;
        }
      }
      else {
        piVar1 = (int *)FUN_00025e6c(DAT_0009fd5c + 0x9fcd4);
        *piVar1 = -uVar2;
      }
      free(__ptr);
    }
    *(undefined2 *)param_1 = 0;
    return;
  }
  *(undefined2 *)param_1 = 0;
  return;
}




// ============================================================
// Function #707
// Name: FUN_0009fd60
// Address: 0009fd60
// JNI: NO
// ============================================================


bool FUN_0009fd60(int param_1,undefined4 param_2,uint param_3,uint param_4)

{
  uint uVar1;
  int *piVar2;
  bool bVar3;
  
  bVar3 = false;
  if (param_4 < *(uint *)(param_1 + 0x14) ||
      *(uint *)(param_1 + 0x14) - param_4 < (uint)(param_3 <= *(uint *)(param_1 + 0x10))) {
    *(uint *)(param_1 + 8) = param_3;
    *(uint *)(param_1 + 0xc) = param_4;
    uVar1 = FUN_00019718(0x13,*(undefined4 *)(param_1 + 4),param_3,0);
    if (0xfffff000 < uVar1) {
      piVar2 = (int *)FUN_00025e6c(DAT_0009fdd4 + 0x9fda8);
      *piVar2 = -uVar1;
      uVar1 = 0xffffffff;
    }
    bVar3 = *(uint *)(param_1 + 8) == uVar1 && *(int *)(param_1 + 0xc) == (int)uVar1 >> 0x1f;
  }
  return bVar3;
}




// ============================================================
// Function #708
// Name: FUN_0009fdec
// Address: 0009fdec
// JNI: NO
// ============================================================


bool FUN_0009fdec(int param_1,undefined4 param_2,uint param_3,uint param_4)

{
  bool bVar1;
  int *piVar2;
  uint uVar3;
  uint uVar4;
  uint *puVar5;
  uint uVar6;
  
  uVar6 = *(uint *)(param_1 + 0x14);
  bVar1 = false;
  if (!CARRY4(uVar6,param_4) &&
      !CARRY4(uVar6 + param_4,(uint)CARRY4(*(uint *)(param_1 + 0x10),param_3))) {
    puVar5 = (uint *)(param_1 + 8);
    uVar3 = *puVar5 + param_3;
    uVar4 = *(int *)(param_1 + 0xc) + param_4 + (uint)CARRY4(*puVar5,param_3);
    if (uVar4 < uVar6 || uVar6 - uVar4 < (uint)(uVar3 <= *(uint *)(param_1 + 0x10))) {
      *puVar5 = uVar3;
      *(uint *)(param_1 + 0xc) = uVar4;
      uVar6 = FUN_00019718(0x13,*(undefined4 *)(param_1 + 4),uVar3,0);
      if (0xfffff000 < uVar6) {
        piVar2 = (int *)FUN_00025e6c(DAT_0009fe80 + 0x9fe58);
        *piVar2 = -uVar6;
        uVar6 = 0xffffffff;
      }
      bVar1 = *puVar5 == uVar6 && *(int *)(param_1 + 0xc) == (int)uVar6 >> 0x1f;
    }
  }
  return bVar1;
}




// ============================================================
// Function #709
// Name: FUN_0009fe94
// Address: 0009fe94
// JNI: NO
// ============================================================


undefined4 FUN_0009fe94(int param_1)

{
  return *(undefined4 *)(param_1 + 0x14);
}




// ============================================================
// Function #710
// Name: FUN_0009fecc
// Address: 0009fecc
// JNI: NO
// ============================================================


undefined8 FUN_0009fecc(int param_1)

{
  return *(undefined8 *)(param_1 + 8);
}




// ============================================================
// Function #711
// Name: FUN_0009ff0c
// Address: 0009ff0c
// JNI: NO
// ============================================================


longlong FUN_0009ff0c(int param_1,undefined4 param_2,uint param_3,uint param_4)

{
  bool bVar1;
  uint uVar2;
  uint uVar3;
  int iVar4;
  uint uVar5;
  
  uVar5 = *(uint *)(param_1 + 0x14);
  uVar2 = (uint)CARRY4(param_4,(uint)CARRY4(uVar5,param_3));
  if (uVar2 != 0) {
    return (ulonglong)uVar2 << 0x20;
  }
  uVar2 = *(uint *)(param_1 + 8);
  uVar3 = uVar2 + param_3;
  iVar4 = *(int *)(param_1 + 0xc) + param_4 + (uint)CARRY4(uVar2,param_3);
  bVar1 = (uint)-iVar4 < (uint)(uVar3 <= uVar5);
  if (bVar1) {
    *(uint *)(param_1 + 8) = uVar3;
    *(int *)(param_1 + 0xc) = iVar4;
  }
  return CONCAT44(-(iVar4 + (uint)(uVar3 > uVar5)),(uint)bVar1);
}




// ============================================================
// Function #712
// Name: FUN_0009ff50
// Address: 0009ff50
// JNI: NO
// ============================================================


void FUN_0009ff50(int *param_1,int param_2,uint param_3,uint param_4)

{
  int iVar1;
  uint uVar2;
  uint *puVar3;
  uint uVar4;
  uint uVar5;
  int iVar6;
  
  puVar3 = (uint *)(param_2 + 8);
  uVar5 = *puVar3;
  uVar4 = *(uint *)(param_2 + 0xc);
  if ((CARRY4(uVar4,param_4) || CARRY4(uVar4 + param_4,(uint)CARRY4(uVar5,param_3))) ||
     (uVar2 = *(uint *)(param_2 + 0x14),
     (uint)(uVar5 + param_3 <= uVar2) <= -(uVar4 + param_4 + (uint)CARRY4(uVar5,param_3)))) {
    *(undefined2 *)param_1 = 0;
    return;
  }
  if (uVar2 < uVar5) {
                    /* WARNING: Subroutine does not return */
    FUN_00026994(DAT_000a003c + 0xa0038);
  }
  uVar4 = uVar2 - uVar5;
  if (param_3 <= uVar2 - uVar5) {
    uVar4 = param_3;
  }
  if (0xfffffff7 < uVar4) {
                    /* WARNING: Subroutine does not return */
    FUN_00026b08();
  }
  iVar6 = *(int *)(param_2 + 0x10);
  if (uVar4 < 0xb) {
    iVar1 = (int)param_1 + 1;
    *(char *)param_1 = (char)(uVar4 << 1);
    if (uVar4 == 0) goto LAB_000a000c;
  }
  else {
    iVar1 = FUN_000a0370((uVar4 | 7) + 1);
    param_1[2] = iVar1;
    *param_1 = (uVar4 | 7) + 2;
    param_1[1] = uVar4;
  }
  __aeabi_memmove(iVar1,iVar6 + uVar5,uVar4);
LAB_000a000c:
  *(undefined1 *)(iVar1 + uVar4) = 0;
  uVar4 = *puVar3;
  *puVar3 = uVar4 + param_3;
  *(uint *)(param_2 + 0xc) = *(int *)(param_2 + 0xc) + param_4 + (uint)CARRY4(uVar4,param_3);
  return;
}




// ============================================================
// Function #713
// Name: FUN_000a0040
// Address: 000a0040
// JNI: NO
// ============================================================


void FUN_000a0040(int *param_1,int *param_2)

{
  ushort uVar1;
  short sVar2;
  int iVar3;
  uint uVar4;
  int *piVar5;
  int *piVar6;
  int *piVar7;
  int iVar8;
  uint uVar9;
  int iVar10;
  bool bVar11;
  undefined8 uVar12;
  longlong lVar13;
  uint local_40;
  uint local_3c;
  undefined4 local_38;
  uint local_34;
  uint local_30;
  int *local_2c;
  int local_28;
  
  local_28 = **(int **)(DAT_000a02a4 + 0xa005c);
  uVar12 = (**(code **)(*param_2 + 0x1c))(param_2);
  uVar9 = (uint)uVar12 - 0x16;
  iVar10 = (int)((ulonglong)uVar12 >> 0x20) - (uint)((uint)uVar12 < 0x16);
  if (uVar9 != 0 || iVar10 != 0) {
    do {
      iVar3 = (**(code **)(*param_2 + 0xc))(param_2,*(code **)(*param_2 + 0xc),uVar9,iVar10);
      if (iVar3 == 0) break;
      (**(code **)(*param_2 + 8))(&local_34,param_2,0x16,0);
      uVar4 = local_30;
      if ((local_34 & 1) == 0) {
        uVar4 = local_34 >> 1 & 0x7f;
      }
      if (uVar4 == 0) {
        bVar11 = false;
        *(undefined1 *)(param_1 + 3) = 0;
        *(undefined1 *)param_1 = 0;
      }
      else {
        if (uVar4 < 4) {
LAB_000a011c:
          bVar11 = false;
          *(undefined1 *)param_1 = 0;
        }
        else {
          piVar6 = local_2c;
          if ((local_34 & 1) == 0) {
            piVar6 = (int *)((uint)&local_34 | 1);
          }
          if (*piVar6 != 0x6054b50) goto LAB_000a011c;
          if (uVar4 < 0xc) {
LAB_000a0298:
                    /* WARNING: Subroutine does not return */
            FUN_00026994((int)&DAT_000a02a4 + DAT_000a02ac);
          }
          piVar6 = local_2c + 3;
          if ((local_34 & 1) == 0) {
            piVar6 = (int *)((int)&local_28 + 1);
          }
          if (uVar4 < 0x10) goto LAB_000a0298;
          piVar7 = local_2c + 4;
          if ((local_34 & 1) == 0) {
            piVar7 = (int *)&stack0xffffffdd;
          }
          if (uVar4 < 0x14) goto LAB_000a0298;
          piVar5 = local_2c + 5;
          if ((local_34 & 1) == 0) {
            piVar5 = (int *)&stack0xffffffe1;
          }
          iVar3 = *piVar6;
          sVar2 = (short)*piVar5;
          iVar8 = *piVar7;
          if (sVar2 == 0) {
LAB_000a0248:
            *param_1 = iVar3;
            param_1[1] = iVar8;
            bVar11 = true;
            *(short *)(param_1 + 2) = sVar2;
          }
          else {
            (**(code **)(*param_2 + 8))(&local_40,param_2,sVar2,0);
            uVar4 = local_3c;
            if ((local_40 & 1) == 0) {
              uVar4 = local_40 >> 1 & 0x7f;
            }
            else {
              FUN_00023f68(local_38,local_40 & 0xfffffffe);
            }
            if (uVar4 != 0) goto LAB_000a0248;
            bVar11 = false;
            *(undefined1 *)param_1 = 0;
          }
        }
        *(bool *)(param_1 + 3) = bVar11;
      }
      if ((local_34 & 1) != 0) {
        FUN_00023f68(local_2c,local_34 & 0xfffffffe);
      }
      if ((bVar11) &&
         (uVar1 = *(ushort *)(param_1 + 2), lVar13 = (**(code **)(*param_2 + 0x1c))(param_2),
         lVar13 == CONCAT44(iVar10 + (uint)CARRY4(uVar9,uVar1 + 0x16),uVar9 + uVar1 + 0x16)))
      goto LAB_000a0274;
      bVar11 = uVar9 == 0;
      uVar9 = uVar9 - 1;
      iVar10 = iVar10 - (uint)bVar11;
    } while (uVar9 != 0 || iVar10 != 0);
  }
  *(undefined1 *)(param_1 + 3) = 0;
  *(undefined1 *)param_1 = 0;
LAB_000a0274:
  if (**(int **)(DAT_000a02a8 + 0xa0284) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}




// ============================================================
// Function #714
// Name: FUN_000a0370
// Address: 000a0370
// JNI: NO
// ============================================================


void * FUN_000a0370(uint param_1)

{
  void *pvVar1;
  code *pcVar2;
  
  if (param_1 < 2) {
    param_1 = 1;
  }
  while( true ) {
    pvVar1 = malloc(param_1);
    if (pvVar1 != (void *)0x0) {
      return pvVar1;
    }
    pcVar2 = (code *)FUN_0001b2fc();
    if (pcVar2 == (code *)0x0) break;
    (*pcVar2)();
  }
  FUN_00023f34();
  return (void *)0x0;
}




// ============================================================
// Function #715
// Name: FUN_000a0398
// Address: 000a0398
// JNI: NO
// ============================================================


void FUN_000a0398(void)

{
  FUN_000a0370();
  return;
}




// ============================================================
// Function #716
// Name: FUN_000a03a4
// Address: 000a03a4
// JNI: NO
// ============================================================


int FUN_000a03a4(uint param_1,uint param_2)

{
  int iVar1;
  code *pcVar2;
  
  if (param_2 < 5) {
    param_2 = 4;
  }
  if (param_1 < 2) {
    param_1 = 1;
  }
  while( true ) {
    iVar1 = FUN_00023f80(param_2,param_1);
    if (iVar1 != 0) {
      return iVar1;
    }
    pcVar2 = (code *)FUN_0001b2fc();
    if (pcVar2 == (code *)0x0) break;
    (*pcVar2)();
  }
  FUN_00023f34();
  return 0;
}




// ============================================================
// Function #717
// Name: FUN_000a03de
// Address: 000a03de
// JNI: NO
// ============================================================


void FUN_000a03de(void)

{
  FUN_000a03a4();
  return;
}




// ============================================================
// Function #718
// Name: dl_unwind_find_exidx
// Address: 000a0440
// JNI: NO
// ============================================================


void dl_unwind_find_exidx(void)

{
  (*(code *)PTR_dl_unwind_find_exidx_000a5ea0)();
  return;
}




// ============================================================
// Function #719
// Name: dlsym
// Address: 000a0450
// JNI: NO
// ============================================================


void dlsym(void)

{
  (*(code *)PTR_dlsym_000a5ea4)();
  return;
}




// ============================================================
// Function #720
// Name: dl_iterate_phdr
// Address: 000a0460
// JNI: NO
// ============================================================


void dl_iterate_phdr(void)

{
  (*(code *)PTR_dl_iterate_phdr_000a5ea8)();
  return;
}




