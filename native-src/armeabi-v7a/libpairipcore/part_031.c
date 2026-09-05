// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 601-620
// ============================================================

// ============================================================
// Function #601
// Name: FUN_0005f8f8
// Address: 0005f8f8
// JNI: NO
// ============================================================


void FUN_0005f8f8(void)

{
  return;
}




// ============================================================
// Function #602
// Name: FUN_0005f8fc
// Address: 0005f8fc
// JNI: NO
// ============================================================


/* WARNING: Type propagation algorithm not settling */

void FUN_0005f8fc(int *param_1)

{
  undefined4 ****ppppuVar1;
  pthread_key_t *ppVar2;
  pthread_key_t __key;
  undefined4 *******pppppppuVar3;
  undefined4 ******ppppppuVar4;
  undefined4 ******ppppppuVar5;
  undefined4 ******ppppppuVar6;
  int iVar7;
  undefined4 uVar8;
  void *__pointer;
  int iVar9;
  undefined4 ******ppppppuVar10;
  undefined4 ****ppppuVar11;
  undefined4 ******ppppppuVar12;
  undefined4 *****pppppuVar13;
  undefined4 *****pppppuVar14;
  undefined4 ******ppppppuVar15;
  int iVar16;
  undefined4 ******ppppppuVar17;
  uint uVar18;
  undefined4 ******ppppppuVar19;
  undefined4 *******pppppppuVar20;
  bool bVar21;
  undefined4 ******local_d4;
  undefined4 *******local_cc;
  undefined4 *******local_c8;
  undefined4 *******local_c4;
  undefined4 ****local_a0;
  undefined1 local_98 [40];
  undefined4 ****local_70;
  undefined4 *******local_68;
  char local_64;
  undefined4 ******local_60 [2];
  undefined4 local_58;
  uint local_48;
  uint local_44;
  undefined4 local_40;
  undefined4 ****local_38;
  byte local_30;
  int local_28;
  
  local_28 = **(int **)(DAT_000601d8 + 0x5f914);
  ppVar2 = (pthread_key_t *)FUN_0001aee0();
  __pointer = (void *)*param_1;
  __key = *ppVar2;
  *param_1 = 0;
  pthread_setspecific(__key,__pointer);
  pppppppuVar20 = (undefined4 *******)param_1[1];
  iVar16 = 0;
  pppppppuVar3 = pppppppuVar20 + 1;
LAB_0005f958:
  do {
    if (iVar16 == 1) break;
    if (iVar16 == 0) {
      local_64 = '\x01';
      local_68 = pppppppuVar3;
      FUN_0001ae24();
      ppppppuVar4 = pppppppuVar20[7];
      while (ppppppuVar4 == (undefined4 ******)0x0) {
        FUN_0001ade0(pppppppuVar20,&local_68);
        ppppppuVar4 = pppppppuVar20[7];
      }
      ppppppuVar4 = pppppppuVar20[6];
      local_38 = (undefined4 ****)0xffffffff;
      local_60[0] = (undefined4 ******)((uint)local_60[0] & 0xffffff00);
      ppppuVar11 = pppppppuVar20[3][(uint)ppppppuVar4 / 0x55][((uint)ppppppuVar4 % 0x55) * 0xc + 10]
      ;
      if (ppppuVar11 == (undefined4 ****)0xffffffff) {
        pppppuVar14 = pppppppuVar20[3][(uint)ppppppuVar4 / 0x55] +
                      ((uint)ppppppuVar4 % 0x55) * 0xc + 10;
        local_30 = 1;
      }
      else {
        local_cc = local_60;
        (**(code **)(DAT_000601dc + 0x5fa00 + (int)ppppuVar11 * 4))(&local_cc);
        ppppppuVar4 = pppppppuVar20[6];
        pppppuVar14 = pppppppuVar20[3][(uint)ppppppuVar4 / 0x55] +
                      ((uint)ppppppuVar4 % 0x55) * 0xc + 10;
        local_30 = 1;
        local_38 = ppppuVar11;
        if (*pppppuVar14 != (undefined4 ****)0xffffffff) {
          (**(code **)(DAT_000601e0 + 0x5fa50 + (int)*pppppuVar14 * 4))(&local_cc);
          ppppppuVar4 = pppppppuVar20[6];
        }
      }
      *pppppuVar14 = (undefined4 ****)0xffffffff;
      pppppppuVar20[6] = (undefined4 ******)((int)ppppppuVar4 + 1U);
      pppppppuVar20[7] = (undefined4 ******)((int)pppppppuVar20[7] + -1);
      if ((undefined4 ******)0xa9 < (undefined4 ******)((int)ppppppuVar4 + 1U)) {
        FUN_00023f68(*pppppppuVar20[3],0xff0);
        pppppppuVar20[3] = pppppppuVar20[3] + 1;
        pppppppuVar20[6] = (undefined4 ******)((int)pppppppuVar20[6] + -0x55);
      }
      ppppuVar11 = local_38;
      if (local_30 == 0) {
        FUN_000289c4();
      }
      else {
        local_a0 = (undefined4 ****)0xffffffff;
        local_c8 = (undefined4 *******)((uint)local_c8 & 0xffffff00);
        if (local_38 != (undefined4 ****)0xffffffff) {
          local_cc = &local_c8;
          (**(code **)(DAT_000601e4 + 0x5faf4 + (int)local_38 * 4))(&local_cc,local_60);
          local_a0 = ppppuVar11;
          bVar21 = (local_30 & 1) != 0;
          ppppuVar1 = (undefined4 ****)(uint)local_30;
          if (bVar21) {
            ppppuVar1 = local_38;
          }
          if (bVar21 && ppppuVar1 != (undefined4 ****)0xffffffff) {
            (**(code **)(DAT_000601e8 + 0x5fc68 + (int)ppppuVar1 * 4))(&local_cc,local_60);
          }
        }
        if (local_64 == '\x01') {
          FUN_0001ae3c(local_68);
        }
        ppppuVar11 = local_a0;
        local_38 = (undefined4 ****)0xffffffff;
        local_60[0] = (undefined4 ******)((uint)local_60[0] & 0xffffff00);
        if (local_a0 == (undefined4 ****)0xffffffff) {
          local_30 = 1;
        }
        else {
          local_68 = local_60;
          (**(code **)(DAT_000601ec + 0x5fb4c + (int)local_a0 * 4))(&local_68,&local_c8);
          local_38 = ppppuVar11;
          local_30 = 1;
          if (local_a0 != (undefined4 ****)0xffffffff) {
            (**(code **)(DAT_000601f0 + 0x5fb7c + (int)local_a0 * 4))(&local_68,&local_c8);
            iVar16 = 0;
            if ((local_30 & 1) == 0) goto LAB_0005f958;
          }
        }
        ppppuVar11 = local_38;
        local_70 = (undefined4 ****)0xffffffff;
        local_98[0] = 0;
        if (local_38 != (undefined4 ****)0xffffffff) {
          local_c8 = (undefined4 *******)local_98;
          (**(code **)(DAT_000601f4 + 0x5fbd0 + (int)local_38 * 4))(&local_c8,local_60);
          local_c8 = pppppppuVar20;
          local_c4 = pppppppuVar20;
          local_70 = ppppuVar11;
          local_68 = &local_c8;
          iVar16 = (**(code **)(DAT_000601f8 + 0x5fbec + (int)ppppuVar11 * 4))(&local_68,local_98);
          if (local_70 != (undefined4 ****)0xffffffff) {
            (**(code **)(DAT_000601fc + 0x5fc1c + (int)local_70 * 4))(&local_c8,local_98);
          }
          local_70 = (undefined4 ****)0xffffffff;
          bVar21 = (local_30 & 1) != 0;
          ppppuVar11 = (undefined4 ****)(uint)local_30;
          if (bVar21) {
            ppppuVar11 = local_38;
          }
          if (bVar21 && ppppuVar11 != (undefined4 ****)0xffffffff) {
            (**(code **)(DAT_00060200 + 0x5fc4c + (int)ppppuVar11 * 4))(&local_c8,local_60);
          }
          goto LAB_0005f958;
        }
      }
      local_c8 = pppppppuVar20;
      local_c4 = pppppppuVar20;
                    /* WARNING: Subroutine does not return */
      FUN_0006022c();
    }
  } while( true );
  FUN_0001ae24(pppppppuVar3);
  ppppppuVar4 = pppppppuVar20[7];
  FUN_0001ae3c(pppppppuVar3);
  if (ppppppuVar4 == (undefined4 ******)0x0) {
    local_d4 = (undefined4 ******)0x0;
    ppppppuVar5 = (undefined4 ******)0x0;
    iVar16 = DAT_00060204 + 0x5fd00;
  }
  else {
    iVar16 = DAT_00060208 + 0x5fcc4;
    if ((undefined4 ******)0x5555555 < ppppppuVar4) {
LAB_000601c0:
      FUN_0005eb64();
LAB_000601c4:
                    /* WARNING: Subroutine does not return */
      FUN_00026984();
    }
    ppppppuVar5 = (undefined4 ******)FUN_000a0370((int)ppppppuVar4 * 0x30);
    local_d4 = ppppppuVar5 + (int)ppppppuVar4 * 0xc;
  }
  FUN_0001ae24(pppppppuVar3);
  ppppppuVar4 = pppppppuVar20[7];
  if (ppppppuVar4 == (undefined4 ******)0x0) {
    FUN_0001ae3c(pppppppuVar3);
    if (ppppppuVar5 == (undefined4 ******)0x0) goto LAB_0006013c;
  }
  else {
    ppppppuVar6 = pppppppuVar20[6];
    ppppppuVar12 = (undefined4 ******)0x0;
    ppppppuVar10 = ppppppuVar5;
    ppppppuVar19 = ppppppuVar5;
    do {
      pppppuVar14 = pppppppuVar20[3][(uint)ppppppuVar6 / 0x55] +
                    ((uint)ppppppuVar6 / 0x55) * -0x3fc + (int)ppppppuVar6 * 0xc;
      if (ppppppuVar10 < local_d4) {
        ppppppuVar10[10] = (undefined4 *****)0xffffffff;
        *(undefined1 *)ppppppuVar10 = 0;
        pppppuVar13 = (undefined4 *****)pppppuVar14[10];
        ppppppuVar5 = ppppppuVar19;
        if (pppppuVar13 != (undefined4 *****)0xffffffff) {
          local_60[0] = ppppppuVar10;
          (**(code **)(DAT_0006020c + 0x5fd9c + (int)pppppuVar13 * 4))(local_60,pppppuVar14);
          ppppppuVar10[10] = pppppuVar13;
        }
      }
      else {
        iVar16 = (int)ppppppuVar10 - (int)ppppppuVar19 >> 4;
        uVar18 = iVar16 * -0x55555555 + 1;
        if (0x5555555 < uVar18) goto LAB_000601c0;
        iVar9 = (int)local_d4 - (int)ppppppuVar19;
        iVar7 = iVar9 >> 4;
        if (uVar18 < (uint)(iVar7 * 0x55555556)) {
          uVar18 = iVar7 * 0x55555556;
        }
        if (0x2aaaaa9 < (uint)(iVar7 * -0x55555555)) {
          uVar18 = 0x5555555;
        }
        if (uVar18 == 0) {
          iVar7 = 0;
        }
        else {
          if (0x5555555 < uVar18) goto LAB_000601c4;
          iVar7 = FUN_000a0370(uVar18 * 0x30);
        }
        ppppppuVar6 = (undefined4 ******)(iVar7 + iVar16 * 0x10);
        *(undefined1 *)ppppppuVar6 = 0;
        ppppppuVar6[10] = (undefined4 *****)0xffffffff;
        pppppuVar13 = (undefined4 *****)pppppuVar14[10];
        if (pppppuVar13 != (undefined4 *****)0xffffffff) {
          local_60[0] = ppppppuVar6;
          (**(code **)(DAT_00060210 + 0x5fe64 + (int)pppppuVar13 * 4))(local_60,pppppuVar14);
          ppppppuVar6[10] = pppppuVar13;
        }
        ppppppuVar5 = (undefined4 ******)
                      ((int)ppppppuVar6 - ((int)ppppppuVar10 - (int)ppppppuVar19));
        iVar16 = DAT_00060214 + 0x5fe8c;
        ppppppuVar15 = ppppppuVar5;
        ppppppuVar17 = ppppppuVar19;
        if (ppppppuVar19 != ppppppuVar10) {
          do {
            ppppppuVar15[10] = (undefined4 *****)0xffffffff;
            *(undefined1 *)ppppppuVar15 = 0;
            pppppuVar14 = ppppppuVar17[10];
            if (pppppuVar14 != (undefined4 *****)0xffffffff) {
              local_60[0] = ppppppuVar15;
              (**(code **)(DAT_00060218 + 0x5fed8 + (int)pppppuVar14 * 4))(local_60,ppppppuVar17);
              ppppppuVar15[10] = pppppuVar14;
            }
            ppppppuVar17 = ppppppuVar17 + 0xc;
            ppppppuVar15 = ppppppuVar15 + 0xc;
          } while (ppppppuVar17 != ppppppuVar10);
          iVar16 = DAT_0006021c + 0x5fefc;
          ppppppuVar15 = ppppppuVar19;
          do {
            if (ppppppuVar15[10] != (undefined4 *****)0xffffffff) {
              (**(code **)(iVar16 + (int)ppppppuVar15[10] * 4))(local_60,ppppppuVar15);
            }
            ppppppuVar15[10] = (undefined4 *****)0xffffffff;
            ppppppuVar15 = ppppppuVar15 + 0xc;
          } while (ppppppuVar15 != ppppppuVar10);
        }
        local_d4 = (undefined4 ******)(iVar7 + uVar18 * 0x30);
        ppppppuVar10 = ppppppuVar6;
        if (ppppppuVar19 != (undefined4 ******)0x0) {
          FUN_00023f68(ppppppuVar19,iVar9);
        }
      }
      ppppppuVar10 = ppppppuVar10 + 0xc;
      ppppppuVar6 = pppppppuVar20[6];
      pppppuVar14 = pppppppuVar20[3][(uint)ppppppuVar6 / 0x55] +
                    ((uint)ppppppuVar6 / 0x55) * -0x3fc + (int)ppppppuVar6 * 0xc;
      if (pppppuVar14[10] != (undefined4 ****)0xffffffff) {
        (**(code **)(iVar16 + (int)pppppuVar14[10] * 4))(local_60,pppppuVar14);
        ppppppuVar6 = pppppppuVar20[6];
      }
      pppppuVar14[10] = (undefined4 ****)0xffffffff;
      ppppppuVar6 = (undefined4 ******)((int)ppppppuVar6 + 1);
      pppppppuVar20[6] = ppppppuVar6;
      pppppppuVar20[7] = (undefined4 ******)((int)pppppppuVar20[7] + -1);
      if ((undefined4 ******)0xa9 < ppppppuVar6) {
        FUN_00023f68(*pppppppuVar20[3],0xff0);
        pppppppuVar20[3] = pppppppuVar20[3] + 1;
        ppppppuVar6 = (undefined4 ******)((int)pppppppuVar20[6] - 0x55);
        pppppppuVar20[6] = ppppppuVar6;
      }
      ppppppuVar12 = (undefined4 ******)((int)ppppppuVar12 + 1);
      ppppppuVar19 = ppppppuVar5;
    } while (ppppppuVar12 != ppppppuVar4);
    FUN_0001ae3c(pppppppuVar3);
    if (ppppppuVar5 != ppppppuVar10) {
      iVar16 = DAT_00060220 + 0x6001c;
      ppppppuVar4 = ppppppuVar5;
      do {
        if (ppppppuVar4[10] == (undefined4 *****)0xffffffff) {
                    /* WARNING: Subroutine does not return */
          FUN_0006022c();
        }
        local_c8 = &local_68;
        (**(code **)(iVar16 + (int)ppppppuVar4[10] * 4))(local_60,&local_c8,ppppppuVar4);
        uVar18 = local_44;
        if ((local_48 & 1) == 0) {
          uVar18 = local_48 >> 1 & 0x7f;
        }
        if (uVar18 != 0) {
          (*(code *)(*pppppppuVar20[8])[2])(pppppppuVar20[8],local_60);
        }
        if ((local_48 & 1) != 0) {
          FUN_00023f68(local_40,local_48 & 0xfffffffe);
        }
        if (((uint)local_60[0] & 1) != 0) {
          FUN_00023f68(local_58,(uint)local_60[0] & 0xfffffffe);
        }
        ppppppuVar4 = ppppppuVar4 + 0xc;
      } while (ppppppuVar4 != ppppppuVar10);
    }
    if (ppppppuVar5 == (undefined4 ******)0x0) goto LAB_0006013c;
    if (ppppppuVar5 != ppppppuVar10) {
      do {
        ppppppuVar4 = ppppppuVar10 + -0xc;
        if (ppppppuVar10[-2] != (undefined4 *****)0xffffffff) {
          (**(code **)(DAT_00060224 + 0x60104 + (int)ppppppuVar10[-2] * 4))(local_60,ppppppuVar4);
        }
        ppppppuVar10[-2] = (undefined4 *****)0xffffffff;
        ppppppuVar10 = ppppppuVar4;
      } while (ppppppuVar4 != ppppppuVar5);
    }
  }
  FUN_00023f68(ppppppuVar5,(int)local_d4 - (int)ppppppuVar5);
LAB_0006013c:
  FUN_0001ae24(pppppppuVar20 + 0xb);
  DataMemoryBarrier(0xb);
  *(undefined1 *)(pppppppuVar20 + 0xc) = 1;
  FUN_0001add0(pppppppuVar20 + 10);
  FUN_0001ae3c(pppppppuVar20 + 0xb);
  iVar16 = *param_1;
  *param_1 = 0;
  if (iVar16 != 0) {
    uVar8 = FUN_0001b008();
    FUN_00023f68(uVar8,4);
  }
  FUN_00023f68(param_1,8);
  if (**(int **)(DAT_00060228 + 0x601a4) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(local_28);
  }
  return;
}




// ============================================================
// Function #603
// Name: FUN_0006022c
// Address: 0006022c
// JNI: NO
// ============================================================


void FUN_0006022c(void)

{
                    /* WARNING: Subroutine does not return */
  FUN_0001ad48((int)&DAT_00060238 + DAT_00060238);
}




// ============================================================
// Function #604
// Name: FUN_0006023c
// Address: 0006023c
// JNI: NO
// ============================================================


void FUN_0006023c(undefined8 *param_1,undefined4 param_2,byte *param_3)

{
  byte bVar1;
  undefined8 uVar2;
  
  if ((*param_3 & 1) == 0) {
    uVar2 = *(undefined8 *)param_3;
    *(undefined4 *)(param_1 + 1) = *(undefined4 *)(param_3 + 8);
    *param_1 = uVar2;
  }
  else {
    FUN_000289d4(param_1,*(undefined4 *)(param_3 + 8),*(undefined4 *)(param_3 + 4));
  }
  bVar1 = param_3[0x18];
  *(undefined4 *)(param_1 + 2) = *(undefined4 *)(param_3 + 0x10);
  *(undefined4 *)((int)param_1 + 0x14) = *(undefined4 *)(param_3 + 0x14);
  if ((bVar1 & 1) == 0) {
    uVar2 = *(undefined8 *)(param_3 + 0x18);
    *(undefined4 *)(param_1 + 4) = *(undefined4 *)(param_3 + 0x20);
    param_1[3] = uVar2;
    return;
  }
  FUN_000289d4(param_1 + 3,*(undefined4 *)(param_3 + 0x20),*(undefined4 *)(param_3 + 0x1c));
  return;
}




// ============================================================
// Function #605
// Name: FUN_000602c0
// Address: 000602c0
// JNI: NO
// ============================================================


void FUN_000602c0(undefined8 *param_1,undefined4 param_2,byte *param_3)

{
  byte bVar1;
  undefined8 uVar2;
  
  if ((*param_3 & 1) == 0) {
    uVar2 = *(undefined8 *)param_3;
    *(undefined4 *)(param_1 + 1) = *(undefined4 *)(param_3 + 8);
    *param_1 = uVar2;
  }
  else {
    FUN_000289d4(param_1,*(undefined4 *)(param_3 + 8),*(undefined4 *)(param_3 + 4));
  }
  bVar1 = param_3[0x18];
  *(undefined4 *)(param_1 + 2) = *(undefined4 *)(param_3 + 0x10);
  *(undefined4 *)((int)param_1 + 0x14) = *(undefined4 *)(param_3 + 0x14);
  if ((bVar1 & 1) == 0) {
    uVar2 = *(undefined8 *)(param_3 + 0x18);
    *(undefined4 *)(param_1 + 4) = *(undefined4 *)(param_3 + 0x20);
    param_1[3] = uVar2;
    return;
  }
  FUN_000289d4(param_1 + 3,*(undefined4 *)(param_3 + 0x20),*(undefined4 *)(param_3 + 0x1c));
  return;
}




// ============================================================
// Function #606
// Name: FUN_00060368
// Address: 00060368
// JNI: NO
// ============================================================


void FUN_00060368(undefined4 *param_1,uint *param_2)

{
  uint uVar1;
  uint uVar2;
  int *piVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  uint uVar11;
  undefined1 uStack_89;
  uint local_88;
  uint uStack_84;
  uint local_80;
  uint local_78;
  uint local_74;
  uint local_70;
  uint uStack_6c;
  uint local_68;
  int local_60;
  ulonglong local_58;
  uint local_50;
  uint local_48;
  uint local_44;
  ulonglong local_40;
  uint local_38;
  int local_2c;
  
  local_2c = **(int **)(DAT_0006058c + 0x60384);
  piVar3 = (int *)*param_1;
  uVar7 = *param_2;
  uVar4 = param_2[1];
  uVar6 = param_2[2];
  uVar11 = param_2[6];
  uVar5 = param_2[7];
  uVar10 = param_2[8];
  *param_2 = 0;
  param_2[1] = 0;
  param_2[2] = 0;
  param_2[6] = 0;
  param_2[7] = 0;
  param_2[8] = 0;
  uVar9 = param_2[4];
  uVar8 = param_2[5];
  piVar3 = *(int **)(*piVar3 + 0x20);
  uVar1 = uVar7;
  uVar2 = uVar6;
  if ((uVar7 & 1) != 0) {
    FUN_000289d4(&local_88,uVar6);
    uVar1 = local_88;
    uVar4 = uStack_84;
    uVar2 = local_80;
  }
  local_80 = uVar2;
  uStack_84 = uVar4;
  local_88 = uVar1;
  local_78 = uVar9;
  local_74 = uVar8;
  uVar1 = uVar11;
  uVar4 = uVar10;
  if ((uVar11 & 1) != 0) {
    FUN_000289d4(&local_70,uVar10,uVar5);
    uVar1 = local_70;
    uVar5 = uStack_6c;
    uVar4 = local_68;
  }
  local_68 = uVar4;
  uStack_6c = uVar5;
  local_70 = uVar1;
  local_60 = 0;
  if ((local_88 & 1) == 0) {
    local_58 = CONCAT44(uStack_84,local_88);
    local_50 = local_80;
  }
  else {
    FUN_000289d4(&local_58,local_80,uStack_84);
  }
  local_48 = local_78;
  local_44 = local_74;
  if ((local_70 & 1) == 0) {
    local_40 = CONCAT44(uStack_6c,local_70);
    local_38 = local_68;
  }
  else {
    FUN_000289d4(&local_40,local_68,uStack_6c);
  }
  (**(code **)(*piVar3 + 8))(piVar3,&local_58);
  if ((local_40 & 1) != 0) {
    FUN_00023f68(local_38,(uint)local_40 & 0xfffffffe);
  }
  if ((local_58 & 1) != 0) {
    FUN_00023f68(local_50,(uint)local_58 & 0xfffffffe);
  }
  if (local_60 != -1) {
    (**(code **)(DAT_00060590 + 0x604f0 + local_60 * 4))(&uStack_89,&local_88);
  }
  if ((uVar11 & 1) != 0) {
    FUN_00023f68(uVar10,uVar11 & 0xfffffffe);
  }
  if ((uVar7 & 1) != 0) {
    FUN_00023f68(uVar6,uVar7 & 0xfffffffe);
  }
  if (**(int **)(DAT_00060594 + 0x60538) != local_2c) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(local_2c);
  }
  return;
}




// ============================================================
// Function #607
// Name: FUN_00060598
// Address: 00060598
// JNI: NO
// ============================================================


void FUN_00060598(int *param_1,uint *param_2)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  int *piVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  uint uVar11;
  uint uVar12;
  undefined1 uStack_89;
  uint local_88;
  uint uStack_84;
  uint local_80;
  uint local_78;
  uint local_74;
  uint local_70;
  uint uStack_6c;
  uint local_68;
  int local_60;
  ulonglong local_58;
  uint local_50;
  uint local_48;
  uint local_44;
  ulonglong local_40;
  uint local_38;
  int local_2c;
  
  local_2c = **(int **)(DAT_000607bc + 0x605b4);
  iVar3 = *param_1;
  uVar8 = *param_2;
  uVar5 = param_2[1];
  uVar7 = param_2[2];
  uVar12 = param_2[6];
  uVar6 = param_2[7];
  uVar11 = param_2[8];
  *param_2 = 0;
  param_2[1] = 0;
  param_2[2] = 0;
  param_2[6] = 0;
  param_2[7] = 0;
  param_2[8] = 0;
  uVar10 = param_2[4];
  uVar9 = param_2[5];
  piVar4 = *(int **)(*(int *)(iVar3 + 4) + 0x20);
  uVar1 = uVar8;
  uVar2 = uVar7;
  if ((uVar8 & 1) != 0) {
    FUN_000289d4(&local_88,uVar7);
    uVar1 = local_88;
    uVar5 = uStack_84;
    uVar2 = local_80;
  }
  local_80 = uVar2;
  uStack_84 = uVar5;
  local_88 = uVar1;
  local_78 = uVar10;
  local_74 = uVar9;
  uVar1 = uVar12;
  uVar5 = uVar11;
  if ((uVar12 & 1) != 0) {
    FUN_000289d4(&local_70,uVar11,uVar6);
    uVar1 = local_70;
    uVar6 = uStack_6c;
    uVar5 = local_68;
  }
  local_68 = uVar5;
  uStack_6c = uVar6;
  local_70 = uVar1;
  local_60 = 1;
  if ((local_88 & 1) == 0) {
    local_58 = CONCAT44(uStack_84,local_88);
    local_50 = local_80;
  }
  else {
    FUN_000289d4(&local_58,local_80,uStack_84);
  }
  local_48 = local_78;
  local_44 = local_74;
  if ((local_70 & 1) == 0) {
    local_40 = CONCAT44(uStack_6c,local_70);
    local_38 = local_68;
  }
  else {
    FUN_000289d4(&local_40,local_68,uStack_6c);
  }
  (**(code **)(*piVar4 + 8))(piVar4,&local_58);
  if ((local_40 & 1) != 0) {
    FUN_00023f68(local_38,(uint)local_40 & 0xfffffffe);
  }
  if ((local_58 & 1) != 0) {
    FUN_00023f68(local_50,(uint)local_58 & 0xfffffffe);
  }
  if (local_60 != -1) {
    (**(code **)(DAT_000607c0 + 0x60720 + local_60 * 4))(&uStack_89,&local_88);
  }
  if ((uVar12 & 1) != 0) {
    FUN_00023f68(uVar11,uVar12 & 0xfffffffe);
  }
  if ((uVar8 & 1) != 0) {
    FUN_00023f68(uVar7,uVar8 & 0xfffffffe);
  }
  if (**(int **)(DAT_000607c4 + 0x60768) != local_2c) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(local_2c);
  }
  return;
}




// ============================================================
// Function #608
// Name: FUN_000607f4
// Address: 000607f4
// JNI: NO
// ============================================================


void FUN_000607f4(int param_1)

{
  int *piVar1;
  int iVar2;
  
  piVar1 = (int *)FUN_000a0370(8);
  iVar2 = *(int *)(param_1 + 4);
  *piVar1 = (int)&DAT_0006081c + DAT_0006081c;
  piVar1[1] = iVar2;
  return;
}




// ============================================================
// Function #609
// Name: FUN_00060840
// Address: 00060840
// JNI: NO
// ============================================================


void FUN_00060840(void)

{
                    /* WARNING: Subroutine does not return */
  FUN_00026960((int)&DAT_0006084c + DAT_0006084c);
}




// ============================================================
// Function #610
// Name: FUN_00060850
// Address: 00060850
// JNI: NO
// ============================================================


void FUN_00060850(int *param_1)

{
  bool bVar1;
  int iVar2;
  int *piVar3;
  int *piVar4;
  int iVar5;
  int iVar6;
  int local_20;
  int local_1c;
  
  local_1c = **(int **)(DAT_000609a4 + 0x60870);
  iVar5 = param_1[0xf];
  *param_1 = DAT_000609a0 + 0x60874;
  if (iVar5 != 0) {
    iVar6 = param_1[0x10];
    iVar2 = iVar5;
    if (iVar5 != iVar6) {
      do {
        piVar3 = *(int **)(iVar6 + -4);
        if (piVar3 != (int *)0x0) {
          piVar4 = piVar3 + 1;
          DataMemoryBarrier(0xb);
          do {
            iVar2 = *piVar4;
            bVar1 = (bool)hasExclusiveAccess(piVar4);
          } while (!bVar1);
          *piVar4 = iVar2 + -1;
          DataMemoryBarrier(0xb);
          if (iVar2 == 0) {
            (**(code **)(*piVar3 + 8))(piVar3);
            FUN_00019dfe(piVar3);
          }
        }
        iVar6 = iVar6 + -8;
      } while (iVar5 != iVar6);
      iVar2 = param_1[0xf];
    }
    param_1[0x10] = iVar5;
    FUN_00023f68(iVar2,param_1[0x11] - iVar2);
  }
  iVar5 = param_1[4];
  param_1[4] = 0;
  if (iVar5 != 0) {
    piVar3 = (int *)param_1[10];
    local_20 = iVar5;
    if (piVar3 == (int *)0x0) {
                    /* WARNING: Subroutine does not return */
      FUN_000269a8();
    }
    (**(code **)(*piVar3 + 0x18))(piVar3,&local_20);
  }
  piVar3 = (int *)param_1[10];
  if (piVar3 == param_1 + 6) {
    iVar5 = 0x10;
  }
  else {
    iVar5 = 0x14;
    if (piVar3 == (int *)0x0) goto LAB_00060974;
  }
  (**(code **)(*piVar3 + iVar5))();
LAB_00060974:
  if (**(int **)(DAT_000609a8 + 0x60984) != local_1c) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(local_1c);
  }
  return;
}




// ============================================================
// Function #611
// Name: FUN_000609b0
// Address: 000609b0
// JNI: NO
// ============================================================


/* WARNING: Restarted to delay deadcode elimination for space: stack */

void FUN_000609b0(uint *param_1,int param_2)

{
  undefined1 *puVar1;
  undefined1 uVar2;
  byte bVar3;
  byte bVar4;
  ushort uVar5;
  short sVar6;
  longlong lVar7;
  ulonglong uVar8;
  uint *puVar9;
  undefined1 uVar10;
  undefined2 uVar11;
  short sVar12;
  ushort uVar13;
  undefined4 *puVar14;
  char *pcVar15;
  int iVar16;
  int *piVar17;
  undefined1 *puVar18;
  __pid_t _Var19;
  uint uVar20;
  undefined8 *puVar21;
  undefined4 extraout_r0;
  uint *puVar22;
  undefined4 extraout_r0_00;
  int iVar23;
  int iVar24;
  uint uVar25;
  int iVar26;
  int extraout_r1;
  int extraout_r1_00;
  int extraout_r1_01;
  int extraout_r1_02;
  int extraout_r1_03;
  int extraout_r1_04;
  int extraout_r1_05;
  int extraout_r1_06;
  int extraout_r1_07;
  int extraout_r1_08;
  int extraout_r1_09;
  int extraout_r1_10;
  int extraout_r1_11;
  int extraout_r1_12;
  int extraout_r1_13;
  int extraout_r1_14;
  int extraout_r1_15;
  int extraout_r1_16;
  int extraout_r1_17;
  int extraout_r1_18;
  int extraout_r1_19;
  uint extraout_r1_20;
  int extraout_r1_21;
  int extraout_r1_22;
  int extraout_r1_23;
  int extraout_r1_24;
  int extraout_r1_25;
  int extraout_r1_26;
  byte *pbVar27;
  int extraout_r1_27;
  uint extraout_r1_28;
  int iVar28;
  int extraout_r1_29;
  int extraout_r1_30;
  int extraout_r1_31;
  int extraout_r1_32;
  int extraout_r1_33;
  int extraout_r1_34;
  int extraout_r1_35;
  int extraout_r1_36;
  int extraout_r1_37;
  int extraout_r1_38;
  int extraout_r1_39;
  int extraout_r1_40;
  int extraout_r1_41;
  int extraout_r1_42;
  int extraout_r1_43;
  int extraout_r1_44;
  int extraout_r1_45;
  int extraout_r1_46;
  int extraout_r1_47;
  int extraout_r1_48;
  uint extraout_r1_49;
  uint extraout_r1_50;
  int extraout_r1_51;
  uint extraout_r1_52;
  int extraout_r1_53;
  int extraout_r1_54;
  int extraout_r1_55;
  int extraout_r1_56;
  int extraout_r1_57;
  int extraout_r1_58;
  int extraout_r1_59;
  int extraout_r1_60;
  int extraout_r1_61;
  int extraout_r1_62;
  int extraout_r1_63;
  int extraout_r1_64;
  int extraout_r1_65;
  int extraout_r1_66;
  int extraout_r1_67;
  int extraout_r1_68;
  int extraout_r1_69;
  int extraout_r1_70;
  int extraout_r1_71;
  int extraout_r1_72;
  int extraout_r1_73;
  int extraout_r1_74;
  int extraout_r1_75;
  int extraout_r1_76;
  int extraout_r1_77;
  int extraout_r1_78;
  int extraout_r1_79;
  int extraout_r1_80;
  uint extraout_r1_81;
  int extraout_r1_82;
  int extraout_r1_83;
  uint extraout_r1_84;
  uint extraout_r1_85;
  int extraout_r1_86;
  int extraout_r1_87;
  int extraout_r1_88;
  int extraout_r1_89;
  int extraout_r1_90;
  int extraout_r1_91;
  int extraout_r1_92;
  int extraout_r1_93;
  int extraout_r1_94;
  int extraout_r1_95;
  int extraout_r1_96;
  int extraout_r1_97;
  int extraout_r1_98;
  int extraout_r1_99;
  int extraout_r1_x00100;
  int extraout_r1_x00101;
  int extraout_r1_x00102;
  int extraout_r1_x00103;
  int extraout_r1_x00104;
  int extraout_r1_x00105;
  int extraout_r1_x00106;
  int extraout_r1_x00107;
  int extraout_r1_x00108;
  int extraout_r1_x00109;
  int extraout_r1_x00110;
  int extraout_r1_x00111;
  int extraout_r1_x00112;
  int extraout_r1_x00113;
  int extraout_r1_x00114;
  int extraout_r1_x00115;
  int extraout_r1_x00116;
  int extraout_r1_x00117;
  int extraout_r1_x00118;
  int extraout_r1_x00119;
  int extraout_r1_x00120;
  int extraout_r1_x00121;
  int extraout_r1_x00122;
  int extraout_r1_x00123;
  int extraout_r1_x00124;
  int extraout_r1_x00125;
  int extraout_r1_x00126;
  int extraout_r1_x00127;
  int extraout_r1_x00128;
  int extraout_r1_x00129;
  int extraout_r1_x00130;
  int extraout_r1_x00131;
  undefined4 extraout_r1_x00132;
  uint *extraout_r1_x00133;
  int extraout_r1_x00134;
  undefined4 extraout_r1_x00135;
  undefined4 extraout_r1_x00136;
  int extraout_r1_x00137;
  int extraout_r1_x00138;
  int extraout_r1_x00139;
  int extraout_r1_x00140;
  int extraout_r1_x00141;
  int extraout_r1_x00142;
  int extraout_r1_x00143;
  int extraout_r1_x00144;
  int extraout_r1_x00145;
  int extraout_r1_x00146;
  int extraout_r1_x00147;
  int extraout_r1_x00148;
  int extraout_r1_x00149;
  int extraout_r1_x00150;
  int extraout_r1_x00151;
  int extraout_r1_x00152;
  int extraout_r1_x00153;
  int extraout_r1_x00154;
  int extraout_r1_x00155;
  int extraout_r1_x00156;
  int extraout_r1_x00157;
  int extraout_r1_x00158;
  int extraout_r1_x00159;
  int extraout_r1_x00160;
  int extraout_r1_x00161;
  int extraout_r1_x00162;
  int extraout_r1_x00163;
  int extraout_r1_x00164;
  int extraout_r1_x00165;
  int extraout_r1_x00166;
  int extraout_r1_x00167;
  int extraout_r1_x00168;
  int extraout_r1_x00169;
  int extraout_r1_x00170;
  int extraout_r1_x00171;
  int extraout_r1_x00172;
  int extraout_r1_x00173;
  int extraout_r1_x00174;
  int extraout_r1_x00175;
  int extraout_r1_x00176;
  int extraout_r1_x00177;
  int extraout_r1_x00178;
  int extraout_r1_x00179;
  int extraout_r1_x00180;
  int extraout_r1_x00181;
  int extraout_r1_x00182;
  int extraout_r1_x00183;
  int extraout_r1_x00184;
  int extraout_r1_x00185;
  int extraout_r1_x00186;
  int extraout_r1_x00187;
  int extraout_r1_x00188;
  int extraout_r1_x00189;
  int extraout_r1_x00190;
  int extraout_r1_x00191;
  int extraout_r1_x00192;
  int extraout_r1_x00193;
  int extraout_r1_x00194;
  int extraout_r1_x00195;
  int extraout_r1_x00196;
  int extraout_r1_x00197;
  int extraout_r1_x00198;
  int extraout_r1_x00199;
  int extraout_r1_x00200;
  int extraout_r1_x00201;
  int extraout_r1_x00202;
  int extraout_r1_x00203;
  int extraout_r1_x00204;
  int extraout_r1_x00205;
  int extraout_r1_x00206;
  int extraout_r1_x00207;
  int extraout_r1_x00208;
  int extraout_r1_x00209;
  int extraout_r1_x00210;
  int extraout_r1_x00211;
  int extraout_r1_x00212;
  int extraout_r1_x00213;
  int extraout_r1_x00214;
  int extraout_r1_x00215;
  int extraout_r1_x00216;
  int extraout_r1_x00217;
  int extraout_r1_x00218;
  int extraout_r1_x00219;
  int extraout_r1_x00220;
  int extraout_r1_x00221;
  int extraout_r1_x00222;
  int extraout_r1_x00223;
  int extraout_r1_x00224;
  int extraout_r1_x00225;
  int extraout_r1_x00226;
  int extraout_r1_x00227;
  int extraout_r1_x00228;
  int extraout_r1_x00229;
  int extraout_r1_x00230;
  int extraout_r1_x00231;
  int extraout_r1_x00232;
  int extraout_r1_x00233;
  int extraout_r1_x00234;
  int extraout_r1_x00235;
  int extraout_r1_x00236;
  int extraout_r1_x00237;
  int extraout_r1_x00238;
  int extraout_r1_x00239;
  int extraout_r1_x00240;
  int extraout_r1_x00241;
  int extraout_r1_x00242;
  int extraout_r1_x00243;
  int extraout_r1_x00244;
  int extraout_r1_x00245;
  int extraout_r1_x00246;
  int extraout_r1_x00247;
  int extraout_r1_x00248;
  int extraout_r1_x00249;
  int extraout_r1_x00250;
  int extraout_r1_x00251;
  int extraout_r1_x00252;
  int extraout_r1_x00253;
  int extraout_r1_x00254;
  int extraout_r1_x00255;
  int extraout_r1_x00256;
  int extraout_r1_x00257;
  int extraout_r1_x00258;
  int extraout_r1_x00259;
  int extraout_r1_x00260;
  int extraout_r1_x00261;
  int extraout_r1_x00262;
  int extraout_r1_x00263;
  int extraout_r1_x00264;
  int extraout_r1_x00265;
  int extraout_r1_x00266;
  int extraout_r1_x00267;
  int extraout_r1_x00268;
  int extraout_r1_x00269;
  int extraout_r1_x00270;
  int extraout_r1_x00271;
  int extraout_r1_x00272;
  int extraout_r1_x00273;
  int extraout_r1_x00274;
  int extraout_r1_x00275;
  int extraout_r1_x00276;
  int extraout_r1_x00277;
  int extraout_r1_x00278;
  int extraout_r1_x00279;
  int extraout_r1_x00280;
  int extraout_r1_x00281;
  int extraout_r1_x00282;
  int extraout_r1_x00283;
  int extraout_r1_x00284;
  int extraout_r1_x00285;
  int extraout_r1_x00286;
  int extraout_r1_x00287;
  int extraout_r1_x00288;
  int extraout_r1_x00289;
  int extraout_r1_x00290;
  int extraout_r1_x00291;
  int extraout_r1_x00292;
  int extraout_r1_x00293;
  int extraout_r1_x00294;
  int extraout_r1_x00295;
  int extraout_r1_x00296;
  int extraout_r1_x00297;
  int extraout_r1_x00298;
  int extraout_r1_x00299;
  int extraout_r1_x00300;
  int extraout_r1_x00301;
  int extraout_r1_x00302;
  int extraout_r1_x00303;
  int extraout_r1_x00304;
  int extraout_r1_x00305;
  int extraout_r1_x00306;
  int extraout_r1_x00307;
  int extraout_r1_x00308;
  int extraout_r1_x00309;
  int extraout_r1_x00310;
  int extraout_r1_x00311;
  int extraout_r1_x00312;
  int extraout_r1_x00313;
  int extraout_r1_x00314;
  int extraout_r1_x00315;
  int extraout_r1_x00316;
  int extraout_r1_x00317;
  int extraout_r1_x00318;
  int extraout_r1_x00319;
  int extraout_r1_x00320;
  int extraout_r1_x00321;
  int extraout_r1_x00322;
  int extraout_r1_x00323;
  int extraout_r1_x00324;
  int extraout_r1_x00325;
  int extraout_r1_x00326;
  int extraout_r1_x00327;
  int extraout_r1_x00328;
  int extraout_r1_x00329;
  int extraout_r1_x00330;
  int extraout_r1_x00331;
  int extraout_r1_x00332;
  int extraout_r1_x00333;
  int extraout_r1_x00334;
  int extraout_r1_x00335;
  int extraout_r1_x00336;
  int extraout_r1_x00337;
  int extraout_r1_x00338;
  int extraout_r1_x00339;
  int extraout_r1_x00340;
  int extraout_r1_x00341;
  int extraout_r1_x00342;
  int extraout_r1_x00343;
  int extraout_r1_x00344;
  int extraout_r1_x00345;
  int extraout_r1_x00346;
  int extraout_r1_x00347;
  int extraout_r1_x00348;
  int extraout_r1_x00349;
  int extraout_r1_x00350;
  int extraout_r1_x00351;
  int extraout_r1_x00352;
  int extraout_r1_x00353;
  int extraout_r1_x00354;
  int extraout_r1_x00355;
  int extraout_r1_x00356;
  int extraout_r1_x00357;
  int extraout_r1_x00358;
  int extraout_r1_x00359;
  undefined4 uVar29;
  int extraout_r1_x00360;
  int extraout_r1_x00361;
  int extraout_r1_x00362;
  int extraout_r1_x00363;
  int extraout_r1_x00364;
  int extraout_r1_x00365;
  int extraout_r1_x00366;
  int extraout_r1_x00367;
  int extraout_r1_x00368;
  int extraout_r1_x00369;
  int extraout_r1_x00370;
  int extraout_r1_x00371;
  int extraout_r1_x00372;
  int extraout_r1_x00373;
  int extraout_r1_x00374;
  int extraout_r1_x00375;
  int extraout_r1_x00376;
  int extraout_r1_x00377;
  int extraout_r1_x00378;
  int extraout_r1_x00379;
  int extraout_r1_x00380;
  int extraout_r1_x00381;
  int extraout_r1_x00382;
  int extraout_r1_x00383;
  int extraout_r1_x00384;
  int extraout_r1_x00385;
  int extraout_r1_x00386;
  int extraout_r1_x00387;
  int extraout_r1_x00388;
  int extraout_r1_x00389;
  int extraout_r1_x00390;
  int extraout_r1_x00391;
  int extraout_r1_x00392;
  int extraout_r1_x00393;
  int extraout_r1_x00394;
  int extraout_r1_x00395;
  int extraout_r1_x00396;
  int extraout_r1_x00397;
  int extraout_r1_x00398;
  int extraout_r1_x00399;
  int extraout_r1_x00400;
  int extraout_r1_x00401;
  int extraout_r1_x00402;
  int extraout_r1_x00403;
  int extraout_r1_x00404;
  int extraout_r1_x00405;
  int extraout_r1_x00406;
  int extraout_r1_x00407;
  int extraout_r1_x00408;
  int extraout_r1_x00409;
  int extraout_r1_x00410;
  int extraout_r1_x00411;
  int extraout_r1_x00412;
  int extraout_r1_x00413;
  int extraout_r1_x00414;
  int extraout_r1_x00415;
  int extraout_r1_x00416;
  int extraout_r1_x00417;
  int extraout_r1_x00418;
  int extraout_r1_x00419;
  int extraout_r1_x00420;
  int extraout_r1_x00421;
  int extraout_r1_x00422;
  int extraout_r1_x00423;
  int extraout_r1_x00424;
  int extraout_r1_x00425;
  int extraout_r1_x00426;
  int extraout_r1_x00427;
  int extraout_r1_x00428;
  int extraout_r1_x00429;
  int extraout_r1_x00430;
  int extraout_r1_x00431;
  int extraout_r1_x00432;
  int extraout_r1_x00433;
  int extraout_r1_x00434;
  int extraout_r1_x00435;
  int extraout_r1_x00436;
  int extraout_r1_x00437;
  int extraout_r1_x00438;
  int extraout_r1_x00439;
  int extraout_r1_x00440;
  int extraout_r1_x00441;
  int extraout_r1_x00442;
  int extraout_r1_x00443;
  int extraout_r1_x00444;
  int extraout_r1_x00445;
  int extraout_r1_x00446;
  int extraout_r1_x00447;
  int extraout_r1_x00448;
  int extraout_r1_x00449;
  int extraout_r1_x00450;
  int extraout_r1_x00451;
  int extraout_r1_x00452;
  int extraout_r1_x00453;
  int extraout_r1_x00454;
  int extraout_r1_x00455;
  int extraout_r1_x00456;
  int extraout_r1_x00457;
  int extraout_r1_x00458;
  int extraout_r1_x00459;
  int extraout_r1_x00460;
  int extraout_r1_x00461;
  int extraout_r1_x00462;
  int extraout_r1_x00463;
  int extraout_r1_x00464;
  int extraout_r1_x00465;
  int extraout_r1_x00466;
  int extraout_r1_x00467;
  int extraout_r1_x00468;
  int extraout_r1_x00469;
  int extraout_r1_x00470;
  int extraout_r1_x00471;
  int extraout_r1_x00472;
  int extraout_r1_x00473;
  int extraout_r1_x00474;
  int extraout_r1_x00475;
  int extraout_r1_x00476;
  int extraout_r1_x00477;
  int extraout_r1_x00478;
  int extraout_r1_x00479;
  int extraout_r1_x00480;
  int extraout_r1_x00481;
  int extraout_r1_x00482;
  int extraout_r1_x00483;
  int extraout_r1_x00484;
  int extraout_r1_x00485;
  int extraout_r1_x00486;
  int extraout_r1_x00487;
  int extraout_r1_x00488;
  int extraout_r1_x00489;
  int extraout_r1_x00490;
  int extraout_r1_x00491;
  int extraout_r1_x00492;
  int extraout_r1_x00493;
  int extraout_r1_x00494;
  int extraout_r1_x00495;
  int extraout_r1_x00496;
  int extraout_r1_x00497;
  int extraout_r1_x00498;
  int extraout_r1_x00499;
  int extraout_r1_x00500;
  int extraout_r1_x00501;
  int extraout_r1_x00502;
  int extraout_r1_x00503;
  int extraout_r1_x00504;
  int extraout_r1_x00505;
  int extraout_r1_x00506;
  int extraout_r1_x00507;
  int extraout_r1_x00508;
  int extraout_r1_x00509;
  int extraout_r1_x00510;
  int extraout_r1_x00511;
  int extraout_r1_x00512;
  int extraout_r1_x00513;
  int extraout_r1_x00514;
  int extraout_r1_x00515;
  int extraout_r1_x00516;
  int extraout_r1_x00517;
  int extraout_r1_x00518;
  int extraout_r1_x00519;
  int extraout_r1_x00520;
  int extraout_r1_x00521;
  int extraout_r1_x00522;
  int extraout_r1_x00523;
  int extraout_r1_x00524;
  int extraout_r1_x00525;
  uint extraout_r1_x00526;
  int extraout_r1_x00527;
  uint extraout_r1_x00528;
  uint extraout_r1_x00529;
  int extraout_r1_x00530;
  int extraout_r1_x00531;
  int extraout_r1_x00532;
  int extraout_r1_x00533;
  int extraout_r1_x00534;
  int extraout_r1_x00535;
  int extraout_r1_x00536;
  int extraout_r1_x00537;
  int extraout_r1_x00538;
  int extraout_r1_x00539;
  int extraout_r1_x00540;
  int extraout_r1_x00541;
  int extraout_r1_x00542;
  uint extraout_r1_x00543;
  int extraout_r1_x00544;
  int extraout_r1_x00545;
  int extraout_r1_x00546;
  uint extraout_r1_x00547;
  int extraout_r1_x00548;
  int extraout_r1_x00549;
  int extraout_r1_x00550;
  int extraout_r1_x00551;
  int extraout_r1_x00552;
  int extraout_r1_x00553;
  int extraout_r1_x00554;
  float fVar30;
  int extraout_r1_x00555;
  int extraout_r1_x00556;
  int extraout_r1_x00557;
  int extraout_r1_x00558;
  int extraout_r1_x00559;
  int extraout_r1_x00560;
  int extraout_r1_x00561;
  int extraout_r1_x00562;
  int extraout_r1_x00563;
  int extraout_r1_x00564;
  int extraout_r1_x00565;
  uint extraout_r1_x00566;
  int extraout_r1_x00567;
  int extraout_r1_x00568;
  int extraout_r1_x00569;
  int extraout_r1_x00570;
  int extraout_r1_x00571;
  int extraout_r1_x00572;
  int extraout_r1_x00573;
  int extraout_r1_x00574;
  int extraout_r1_x00575;
  int extraout_r1_x00576;
  int extraout_r1_x00577;
  int extraout_r1_x00578;
  int extraout_r1_x00579;
  int extraout_r1_x00580;
  int extraout_r1_x00581;
  uint extraout_r1_x00582;
  int extraout_r1_x00583;
  uint extraout_r1_x00584;
  int extraout_r1_x00585;
  int extraout_r1_x00586;
  uint extraout_r1_x00587;
  int extraout_r1_x00588;
  int extraout_r1_x00589;
  int extraout_r1_x00590;
  int extraout_r1_x00591;
  int extraout_r1_x00592;
  int extraout_r1_x00593;
  int extraout_r1_x00594;
  int extraout_r1_x00595;
  int extraout_r1_x00596;
  int extraout_r1_x00597;
  int extraout_r1_x00598;
  int extraout_r1_x00599;
  int extraout_r1_x00600;
  int extraout_r1_x00601;
  int extraout_r1_x00602;
  int extraout_r1_x00603;
  int extraout_r1_x00604;
  int extraout_r1_x00605;
  int extraout_r1_x00606;
  int extraout_r1_x00607;
  int extraout_r1_x00608;
  int extraout_r1_x00609;
  int extraout_r1_x00610;
  int extraout_r1_x00611;
  int extraout_r1_x00612;
  int extraout_r1_x00613;
  int extraout_r1_x00614;
  int extraout_r1_x00615;
  int extraout_r1_x00616;
  int extraout_r1_x00617;
  int extraout_r1_x00618;
  int extraout_r1_x00619;
  int extraout_r1_x00620;
  int extraout_r1_x00621;
  int extraout_r1_x00622;
  int extraout_r1_x00623;
  int extraout_r1_x00624;
  uint extraout_r1_x00625;
  int extraout_r1_x00626;
  int extraout_r1_x00627;
  int extraout_r1_x00628;
  int extraout_r1_x00629;
  int extraout_r1_x00630;
  int extraout_r1_x00631;
  int extraout_r1_x00632;
  int extraout_r1_x00633;
  int extraout_r1_x00634;
  int extraout_r1_x00635;
  int extraout_r1_x00636;
  int extraout_r1_x00637;
  int extraout_r1_x00638;
  int extraout_r1_x00639;
  int extraout_r1_x00640;
  int extraout_r1_x00641;
  undefined4 extraout_r1_x00642;
  int extraout_r1_x00643;
  int extraout_r1_x00644;
  int extraout_r1_x00645;
  int extraout_r1_x00646;
  int extraout_r1_x00647;
  int extraout_r1_x00648;
  int extraout_r1_x00649;
  int extraout_r1_x00650;
  int extraout_r1_x00651;
  int extraout_r1_x00652;
  int extraout_r1_x00653;
  int extraout_r1_x00654;
  int extraout_r1_x00655;
  int extraout_r1_x00656;
  int extraout_r1_x00657;
  int extraout_r1_x00658;
  int extraout_r1_x00659;
  int extraout_r1_x00660;
  int extraout_r1_x00661;
  int extraout_r1_x00662;
  int extraout_r1_x00663;
  int extraout_r1_x00664;
  int extraout_r1_x00665;
  int extraout_r1_x00666;
  int extraout_r1_x00667;
  int extraout_r1_x00668;
  int extraout_r1_x00669;
  int extraout_r1_x00670;
  int extraout_r1_x00671;
  int extraout_r1_x00672;
  int extraout_r1_x00673;
  int extraout_r1_x00674;
  int extraout_r1_x00675;
  int extraout_r1_x00676;
  int extraout_r1_x00677;
  int extraout_r1_x00678;
  int extraout_r1_x00679;
  int extraout_r1_x00680;
  int extraout_r1_x00681;
  int extraout_r1_x00682;
  int extraout_r1_x00683;
  int extraout_r1_x00684;
  int extraout_r1_x00685;
  int extraout_r1_x00686;
  int extraout_r1_x00687;
  int extraout_r1_x00688;
  int extraout_r1_x00689;
  int extraout_r1_x00690;
  int extraout_r1_x00691;
  int extraout_r1_x00692;
  int extraout_r1_x00693;
  int extraout_r1_x00694;
  int extraout_r1_x00695;
  int extraout_r1_x00696;
  int extraout_r1_x00697;
  int extraout_r1_x00698;
  int extraout_r1_x00699;
  int extraout_r1_x00700;
  int extraout_r1_x00701;
  int extraout_r1_x00702;
  int extraout_r1_x00703;
  int extraout_r1_x00704;
  int extraout_r1_x00705;
  int extraout_r1_x00706;
  int extraout_r1_x00707;
  int extraout_r1_x00708;
  int extraout_r1_x00709;
  int extraout_r1_x00710;
  int extraout_r1_x00711;
  int extraout_r1_x00712;
  int extraout_r1_x00713;
  int extraout_r1_x00714;
  int extraout_r1_x00715;
  int extraout_r1_x00716;
  int extraout_r1_x00717;
  int extraout_r1_x00718;
  int extraout_r1_x00719;
  int extraout_r1_x00720;
  int extraout_r1_x00721;
  int extraout_r1_x00722;
  int extraout_r1_x00723;
  int extraout_r1_x00724;
  int extraout_r1_x00725;
  int extraout_r1_x00726;
  int extraout_r1_x00727;
  int extraout_r1_x00728;
  int extraout_r1_x00729;
  int extraout_r1_x00730;
  int extraout_r1_x00731;
  int extraout_r1_x00732;
  int extraout_r1_x00733;
  int extraout_r1_x00734;
  int extraout_r1_x00735;
  int extraout_r1_x00736;
  int extraout_r1_x00737;
  int extraout_r1_x00738;
  int extraout_r1_x00739;
  int extraout_r1_x00740;
  int extraout_r1_x00741;
  int extraout_r1_x00742;
  int extraout_r1_x00743;
  int extraout_r1_x00744;
  int extraout_r1_x00745;
  int extraout_r1_x00746;
  int extraout_r1_x00747;
  int extraout_r1_x00748;
  int extraout_r1_x00749;
  int extraout_r1_x00750;
  int extraout_r1_x00751;
  int extraout_r1_x00752;
  int extraout_r1_x00753;
  int extraout_r1_x00754;
  int extraout_r1_x00755;
  int extraout_r1_x00756;
  int extraout_r1_x00757;
  int extraout_r1_x00758;
  int extraout_r1_x00759;
  int extraout_r1_x00760;
  int extraout_r1_x00761;
  int extraout_r1_x00762;
  int extraout_r1_x00763;
  int extraout_r1_x00764;
  int extraout_r1_x00765;
  int extraout_r1_x00766;
  int extraout_r1_x00767;
  int extraout_r1_x00768;
  int extraout_r1_x00769;
  int extraout_r1_x00770;
  int extraout_r1_x00771;
  int extraout_r1_x00772;
  int extraout_r1_x00773;
  int extraout_r1_x00774;
  int extraout_r1_x00775;
  int extraout_r1_x00776;
  int extraout_r1_x00777;
  int extraout_r1_x00778;
  int extraout_r1_x00779;
  int extraout_r1_x00780;
  int extraout_r1_x00781;
  int extraout_r1_x00782;
  int extraout_r1_x00783;
  int extraout_r1_x00784;
  int extraout_r1_x00785;
  int extraout_r1_x00786;
  int extraout_r1_x00787;
  int extraout_r1_x00788;
  int extraout_r1_x00789;
  int extraout_r1_x00790;
  int extraout_r1_x00791;
  int extraout_r1_x00792;
  int extraout_r1_x00793;
  int extraout_r1_x00794;
  int extraout_r1_x00795;
  int extraout_r1_x00796;
  int extraout_r1_x00797;
  int extraout_r1_x00798;
  int extraout_r1_x00799;
  int extraout_r1_x00800;
  int extraout_r1_x00801;
  int extraout_r1_x00802;
  int extraout_r1_x00803;
  int extraout_r1_x00804;
  int extraout_r1_x00805;
  int extraout_r1_x00806;
  int extraout_r1_x00807;
  int extraout_r1_x00808;
  int extraout_r1_x00809;
  int extraout_r1_x00810;
  int extraout_r1_x00811;
  int extraout_r1_x00812;
  int extraout_r1_x00813;
  int extraout_r1_x00814;
  int extraout_r1_x00815;
  int extraout_r1_x00816;
  int extraout_r1_x00817;
  int extraout_r1_x00818;
  int extraout_r1_x00819;
  int extraout_r1_x00820;
  int extraout_r1_x00821;
  int extraout_r1_x00822;
  int extraout_r1_x00823;
  int extraout_r1_x00824;
  int extraout_r1_x00825;
  int extraout_r1_x00826;
  int extraout_r1_x00827;
  int extraout_r1_x00828;
  int extraout_r1_x00829;
  int extraout_r1_x00830;
  int extraout_r1_x00831;
  int extraout_r1_x00832;
  int extraout_r1_x00833;
  int extraout_r1_x00834;
  int extraout_r1_x00835;
  int extraout_r1_x00836;
  int extraout_r1_x00837;
  int extraout_r1_x00838;
  int extraout_r1_x00839;
  int extraout_r1_x00840;
  int extraout_r1_x00841;
  int extraout_r1_x00842;
  int extraout_r1_x00843;
  int extraout_r1_x00844;
  int extraout_r1_x00845;
  int extraout_r1_x00846;
  int extraout_r1_x00847;
  int extraout_r1_x00848;
  int extraout_r1_x00849;
  int extraout_r1_x00850;
  int extraout_r1_x00851;
  int extraout_r1_x00852;
  int extraout_r1_x00853;
  int extraout_r1_x00854;
  int extraout_r1_x00855;
  int extraout_r1_x00856;
  int extraout_r1_x00857;
  int extraout_r1_x00858;
  int extraout_r1_x00859;
  int extraout_r1_x00860;
  int extraout_r1_x00861;
  int extraout_r1_x00862;
  int extraout_r1_x00863;
  int extraout_r1_x00864;
  int extraout_r1_x00865;
  int extraout_r1_x00866;
  int extraout_r1_x00867;
  int extraout_r1_x00868;
  int extraout_r1_x00869;
  int extraout_r1_x00870;
  int extraout_r1_x00871;
  int extraout_r1_x00872;
  int extraout_r1_x00873;
  int extraout_r1_x00874;
  int extraout_r1_x00875;
  int extraout_r1_x00876;
  int extraout_r1_x00877;
  int extraout_r1_x00878;
  int extraout_r1_x00879;
  int extraout_r1_x00880;
  int extraout_r1_x00881;
  int extraout_r1_x00882;
  int extraout_r1_x00883;
  undefined4 extraout_r1_x00884;
  int extraout_r1_x00885;
  int extraout_r1_x00886;
  int extraout_r1_x00887;
  int extraout_r1_x00888;
  int extraout_r1_x00889;
  int extraout_r1_x00890;
  int extraout_r1_x00891;
  int extraout_r1_x00892;
  int extraout_r1_x00893;
  int extraout_r1_x00894;
  int extraout_r1_x00895;
  undefined4 extraout_r1_x00896;
  int extraout_r1_x00897;
  int extraout_r1_x00898;
  uint extraout_r1_x00899;
  int extraout_r1_x00900;
  int extraout_r1_x00901;
  int extraout_r1_x00902;
  int extraout_r1_x00903;
  int extraout_r1_x00904;
  int extraout_r1_x00905;
  int extraout_r1_x00906;
  int extraout_r1_x00907;
  int extraout_r1_x00908;
  int extraout_r1_x00909;
  int extraout_r1_x00910;
  int extraout_r1_x00911;
  int extraout_r1_x00912;
  int extraout_r1_x00913;
  int extraout_r1_x00914;
  int extraout_r1_x00915;
  int extraout_r1_x00916;
  int extraout_r1_x00917;
  int extraout_r1_x00918;
  int extraout_r1_x00919;
  int extraout_r1_x00920;
  int extraout_r1_x00921;
  int extraout_r1_x00922;
  int extraout_r1_x00923;
  int extraout_r1_x00924;
  int extraout_r1_x00925;
  int extraout_r1_x00926;
  int extraout_r1_x00927;
  int extraout_r1_x00928;
  int extraout_r1_x00929;
  int extraout_r1_x00930;
  int extraout_r1_x00931;
  int extraout_r1_x00932;
  int extraout_r1_x00933;
  int extraout_r1_x00934;
  int extraout_r1_x00935;
  int extraout_r1_x00936;
  int extraout_r1_x00937;
  int extraout_r1_x00938;
  int extraout_r1_x00939;
  int extraout_r1_x00940;
  int extraout_r1_x00941;
  int extraout_r1_x00942;
  int extraout_r1_x00943;
  int extraout_r1_x00944;
  int extraout_r1_x00945;
  int extraout_r1_x00946;
  int extraout_r1_x00947;
  int extraout_r1_x00948;
  int extraout_r1_x00949;
  int extraout_r1_x00950;
  int extraout_r1_x00951;
  int extraout_r1_x00952;
  uint extraout_r1_x00953;
  uint extraout_r1_x00954;
  byte *pbVar31;
  undefined4 extraout_r2;
  undefined4 extraout_r2_00;
  uint uVar32;
  uint uVar33;
  uint uVar34;
  uint uVar35;
  uint uVar36;
  int iVar37;
  uint uVar38;
  uint uVar39;
  float fVar40;
  uint extraout_r3;
  undefined4 extraout_r3_00;
  uint uVar41;
  uint unaff_r4;
  byte *pbVar42;
  int iVar43;
  uint uVar44;
  undefined8 *puVar45;
  uint uVar46;
  int *piVar47;
  int iVar48;
  uint uVar49;
  uint uVar50;
  uint uVar51;
  undefined8 *puVar52;
  uint uVar53;
  byte *pbVar54;
  uint uVar55;
  uint uVar56;
  uint uVar57;
  char *pcVar58;
  uint *puVar59;
  uint uVar60;
  uint uVar61;
  int iVar62;
  int *piVar63;
  uint uVar64;
  uint uVar65;
  char *pcVar66;
  uint uVar67;
  uint uVar68;
  uint uVar69;
  int iVar70;
  uint uVar71;
  uint uVar72;
  char *pcVar73;
  uint uVar74;
  uint uVar75;
  char *pcVar76;
  uint uVar77;
  uint uVar78;
  uint uVar79;
  uint uVar80;
  uint uVar81;
  bool bVar82;
  uint in_fpscr;
  undefined4 uVar83;
  float __y;
  undefined4 extraout_s1;
  undefined4 extraout_s2;
  undefined4 extraout_s3;
  double dVar84;
  double dVar85;
  undefined8 uVar86;
  undefined8 uVar87;
  ulonglong uVar88;
  uint local_1ac;
  uint local_170;
  int local_16c;
  uint local_158;
  uint local_150;
  uint local_14c;
  uint local_134;
  uint local_128;
  uint local_124 [3];
  uint *local_118;
  uint local_114;
  int *local_110;
  int *local_10c;
  int local_108;
  int *local_104;
  uint *local_100;
  int local_f8;
  int *local_e0;
  undefined2 local_d8;
  ushort local_d6;
  uint local_d4;
  uint local_d0;
  int local_cc;
  int local_c8;
  int local_c4;
  uint *local_c0;
  uint local_bc;
  undefined8 local_b8;
  uint local_b0;
  int *local_ac;
  int local_a8;
  short local_a4;
  uint *local_a0;
  int local_98;
  int iStack_94;
  int local_90;
  short local_8c;
  undefined4 local_88;
  undefined4 local_84;
  uint local_80;
  uint *local_78;
  int local_74;
  uint *local_70;
  int local_6c;
  uint *local_68;
  ulonglong local_58;
  undefined4 local_50;
  ulonglong *local_48;
  int local_3c;
  
  local_3c = **(int **)(DAT_00061930 + 0x609dc);
  puVar14 = (undefined4 *)FUN_00025e6c(DAT_0006192c + 0x609d8);
  iVar23 = DAT_00061a08 + 0x60a24;
  iVar24 = DAT_00061a20 + 0x60a40;
  uVar25 = DAT_00061a24 + 0x60a50;
  iVar26 = DAT_00061a28 + 0x60a60;
  uVar61 = 0xa9a7de6b;
  iVar43 = iVar26;
switchD_00060e5c_caseD_3:
  do {
    while (iVar37 = iVar43, uVar53 = uVar61, uVar46 = local_114, puVar9 = local_118, iVar43 = iVar37
          , 0x2322e1cf < (int)uVar53) {
      if ((int)uVar53 < 0x3a183c72) {
        if (uVar53 == 0x2322e1d0) {
          iVar62 = FUN_0002f714(local_124 + 2,unaff_r4 & 0xffff,local_124);
          uVar61 = 0x7946bc42;
          goto LAB_00060e1c;
        }
        if (uVar53 == 0x23b9b767) {
          uVar61 = 0x8b88c633;
          if (iVar37 == 0) {
            uVar61 = 0x283b8c50;
          }
        }
        else {
          if (uVar53 != 0x283b8c50) goto LAB_0006176c;
          uVar61 = 0x3a183c72;
          if (param_1[2] == 0) {
            uVar61 = 0x1adfcbac;
          }
        }
      }
      else if (uVar53 == 0x3a183c72) {
        local_158 = param_1[2];
        local_14c = (uint)*(short *)(*param_1 + local_158);
        param_1[2] = (local_158 ^ 2) + (local_158 & 2) * 2;
        uVar61 = 0xcb5db9f8;
        if ((int)local_14c < 0) {
          uVar61 = 0x922c7a75;
        }
      }
      else {
        uVar61 = 0x23b9b767;
        iVar43 = 1;
        if (uVar53 != 0x74941a64) {
          if (uVar53 != 0x7946bc42) goto LAB_0006176c;
          iVar62 = FUN_0007b1d0(&local_108,unaff_r4 & 0xffff);
          uVar61 = 0x74941a64;
LAB_00060e1c:
          iVar43 = iVar37;
          if (iVar62 != 0) {
            uVar61 = 0xd3515b13;
          }
        }
      }
    }
    if ((int)uVar53 < -0x34a24608) {
      if (uVar53 != 0x8d34a35c) {
        if (uVar53 == 0x922c7a75) {
          uVar60 = *param_1;
          uVar61 = param_1[1];
          FUN_000264a4(~(*(uint *)(uVar60 + (local_128 | 4) * 2 + (local_128 & 4) +
                                   (~local_128 & 0xfffffffb) + 1) ^ uVar61),uVar61);
          uVar55 = *(uint *)(uVar60 + extraout_r1);
          FUN_000264a4(~(*(uint *)(uVar60 + (local_128 & 0xc) * 2 + (local_128 ^ 0xc) * 3 +
                                   (local_128 << 1 ^ 0xffffffe6) + 2) ^ uVar61),uVar61);
          FUN_000264a4(~(*(uint *)(uVar60 + (local_128 ^ 8) + (local_128 << 1 | 0xffffffee) + 0x12)
                        ^ uVar61),uVar61);
          FUN_000264a4(~(*(uint *)(uVar60 + local_128) ^ uVar61),uVar61);
          uVar46 = *(uint *)(uVar60 + extraout_r1_02);
          uVar53 = *(uint *)(uVar60 + extraout_r1_00);
          FUN_000264a4(~(*(uint *)((int)(uVar60 + local_128) +
                                  (~local_128 | 0x10) + (local_128 | 0x10) + 1) ^ uVar61),uVar61);
          uVar61 = *(uint *)(uVar60 + extraout_r1_03);
          uVar46 = uVar46 ^ (uVar53 | uVar55);
          uVar46 = *(uint *)(uVar60 + extraout_r1_01) | (uVar61 + uVar46) - (uVar61 | uVar46);
          unaff_r4 = ((local_14c ^ (uVar61 | uVar46) - (uVar61 ^ uVar46)) & 0x7fff) % 0xba;
          goto LAB_00060df4;
        }
        if (uVar53 == 0x8b88c633) {
          FUN_00060850(&local_108);
          if (**(int **)(DAT_00073248 + 0x7321c) != local_3c) {
                    /* WARNING: Subroutine does not return */
            __stack_chk_fail(local_3c);
          }
          return;
        }
        goto LAB_0006176c;
      }
      uVar61 = 0x2322e1d0;
      switch(unaff_r4 & 0xffff) {
      case 2:
        uVar39 = *local_118;
        uVar53 = local_118[1];
        uVar72 = local_118[2];
        uVar55 = local_114 | 8;
        FUN_000264a4(~(*(uint *)(uVar39 + uVar55 * 2 + (local_114 ^ 0xfffffff7) + 1) ^ uVar53),
                     uVar53);
        FUN_000264a4(~(*(uint *)(uVar39 + (uVar46 << 1 | 0x19) + (uVar46 ^ 0xfffffff3)) ^ uVar53),
                     uVar53);
        uVar61 = ~uVar46;
        FUN_000264a4(~(*(uint *)(uVar39 + (uVar46 | 4) * 2 + (uVar46 | 0xfffffffb) + (uVar61 | 4) +
                                2) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar39 + (uVar46 | 0x10) * 2 + (uVar46 | 0xffffffef) +
                                 (uVar61 | 0x10) + 2) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar39 + (uVar46 | 0xc) * 2 + (uVar46 ^ 0xfffffff3) + 1) ^ uVar53),
                     uVar53);
        uVar41 = *(uint *)(uVar39 + extraout_r1_08);
        uVar32 = *(uint *)(uVar39 + extraout_r1_05);
        FUN_000264a4(~(*(uint *)(uVar39 + uVar55 * 2 + (uVar46 | 0xfffffff7) + (uVar61 | 8) + 2) ^
                      uVar53),uVar53);
        uVar55 = *(uint *)(uVar39 + extraout_r1_09);
        uVar60 = *(uint *)(uVar39 + extraout_r1_07);
        uVar71 = *(uint *)(uVar39 + extraout_r1_06);
        uVar38 = *(uint *)(uVar39 + extraout_r1_04);
        uVar61 = uVar46 & 8;
        FUN_000264a4(~(*(uint *)(uVar39 + (uVar61 | uVar61 << 1) + ~uVar61 + (uVar46 ^ 8) + 1) ^
                      uVar53),uVar53);
        uVar61 = uVar46 & 0x10;
        FUN_000264a4(~(*(uint *)(uVar39 + (uVar61 | uVar61 << 1) + ~uVar61 + (uVar46 ^ 0x10) + 1) ^
                      uVar53),uVar53);
        puVar22 = (uint *)(uVar39 + uVar46);
        uVar34 = *puVar22;
        uVar61 = puVar22[1];
        FUN_000264a4(~(puVar22[3] ^ uVar53),uVar53);
        FUN_000264a4(~(uVar34 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar61 ^ uVar53),uVar53);
        uVar34 = *(uint *)(uVar39 + extraout_r1_14);
        uVar33 = *(uint *)(uVar39 + extraout_r1_13);
        uVar35 = *(uint *)(uVar39 + uVar72);
        uVar75 = *(uint *)(uVar39 + extraout_r1_12);
        uVar44 = *(uint *)(uVar39 + extraout_r1_11);
        uVar61 = *(uint *)(uVar39 + extraout_r1_10);
        puVar9[2] = uVar72 + 4;
        uVar44 = uVar44 & uVar61;
        sVar12 = *(short *)(uVar39 + uVar72 + 4);
        iVar28 = (int)sVar12;
        puVar9[2] = uVar72 + 6;
        sVar6 = *(short *)(uVar39 + uVar72 + 6);
        iVar70 = (int)sVar6;
        puVar9[2] = uVar72 + 8;
        uVar61 = *(uint *)(uVar39 + uVar72 + 8);
        puVar9[2] = uVar72 + 0xc;
        uVar36 = *(uint *)(uVar39 + uVar72 + 0xc);
        puVar9[2] = uVar72 + 0x10;
        uVar67 = *(uint *)(uVar39 + uVar72 + 0x10);
        puVar9[2] = uVar72 + 0x14;
        uVar39 = *(uint *)(uVar39 + uVar72 + 0x14);
        uVar65 = *puVar9;
        uVar50 = puVar9[1];
        puVar9[2] = uVar72 + 0x18;
        uVar57 = *(uint *)(uVar65 + uVar72 + 0x18);
        puVar9[2] = uVar72 + 0x1c;
        uVar77 = *(uint *)(uVar65 + uVar72 + 0x1c);
        puVar9[2] = uVar72 + 0x20;
        uVar81 = *(uint *)(uVar65 + uVar72 + 0x20);
        puVar9[2] = uVar72 + 0x24;
        uVar79 = *(uint *)(uVar65 + uVar72 + 0x24);
        puVar9[2] = uVar72 + 0x28;
        piVar47 = (int *)(uVar65 + uVar72 + 0x28);
        iVar16 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar72 + 0x30;
        puVar22 = (uint *)(uVar65 + uVar72 + 0x30);
        uVar80 = *puVar22;
        uVar51 = puVar22[1];
        puVar9[2] = uVar72 + 0x38;
        uVar44 = (uVar44 + (~uVar75 ^ uVar44)) - (uVar44 | ~uVar75);
        uVar32 = uVar44 + (uVar38 | ~uVar44) + 1 & uVar32;
        uVar38 = (uVar32 - (uVar32 ^ uVar33)) + (uVar33 & ~uVar32);
        uVar60 = (uVar71 ^ uVar38) + (uVar38 & ~uVar71) + (uVar71 | ~uVar38) + 1 ^ uVar60;
        uVar60 = (uVar41 - uVar60) + (uVar60 & ~uVar41) * 2;
        uVar55 = (uVar60 + ~(uVar60 & uVar55)) - (uVar60 | ~uVar55);
        uVar55 = ((uVar34 | uVar55) - (uVar55 & ~uVar34)) + (uVar55 | ~uVar34) + 1;
        FUN_000264a4(uVar55 ^ uVar67,uVar53);
        FUN_000264a4(uVar55 ^ uVar77,uVar50);
        pbVar54 = *(byte **)(uVar65 + extraout_r1_16);
        pbVar42 = *(byte **)(uVar65 + extraout_r1_15);
        iVar48 = ((undefined4 *)(uVar65 + extraout_r1_16))[1];
        iVar37 = ((undefined4 *)(uVar65 + extraout_r1_15))[1];
        FUN_000264a4(uVar55 ^ uVar36,uVar53);
        FUN_000264a4(uVar55 ^ uVar39,uVar53);
        FUN_000264a4(uVar55 ^ uVar57,uVar53);
        FUN_000264a4(uVar55 ^ uVar81,uVar50);
        FUN_000264a4(uVar55 ^ uVar79,uVar50);
        puVar22 = (uint *)(uVar65 + uVar46);
        uVar34 = *puVar22;
        uVar38 = puVar22[2];
        uVar71 = puVar22[3];
        uVar46 = puVar22[4];
        FUN_000264a4(~(puVar22[1] ^ uVar50),uVar50);
        uVar60 = *(uint *)(uVar65 + extraout_r1_22);
        FUN_000264a4(~(uVar71 ^ uVar50),uVar50);
        uVar71 = *(uint *)(uVar65 + extraout_r1_23);
        FUN_000264a4(~(uVar46 ^ uVar50),uVar50);
        uVar46 = *(uint *)(uVar65 + extraout_r1_24);
        FUN_000264a4(~(uVar38 ^ uVar50),uVar50);
        uVar38 = *(uint *)(uVar65 + extraout_r1_25);
        FUN_000264a4(~(uVar34 ^ uVar50),uVar50);
        uVar34 = *(uint *)(uVar65 + extraout_r1_26);
        if ((pbVar42 == (byte *)0x0 && pbVar54 == (byte *)0x0) && (iVar37 == 0 && iVar48 == 0)) {
          uVar83 = 1;
        }
        else {
          uVar83 = 1;
          if (pbVar54 == (byte *)0x0 && iVar48 == 0) {
            uVar83 = 0xffffffff;
          }
          else if (pbVar42 != (byte *)0x0 || iVar37 != 0) {
            pbVar27 = pbVar54 + -1;
            do {
              pbVar27 = pbVar27 + 1;
            } while (*pbVar27 != 0);
            pbVar31 = pbVar42 + -1;
            do {
              pbVar31 = pbVar31 + 1;
            } while (*pbVar31 != 0);
            uVar44 = (int)pbVar27 - (int)pbVar54;
            uVar32 = (int)pbVar31 - (int)pbVar42;
            uVar41 = uVar44;
            if (uVar32 < uVar44) {
              uVar41 = uVar32;
            }
            for (; uVar41 != 0; uVar41 = uVar41 - 1) {
              if ((uint)*pbVar54 != (uint)*pbVar42) {
                iVar37 = (uint)*pbVar54 - (uint)*pbVar42;
                if (iVar37 == 0) {
                  iVar37 = uVar44 - uVar32;
                }
                goto LAB_000729c4;
              }
              pbVar42 = pbVar42 + 1;
              pbVar54 = pbVar54 + 1;
            }
            iVar37 = uVar44 - uVar32;
LAB_000729c4:
            uVar83 = 1;
            if (iVar37 < 1) {
              uVar83 = 0xffffffff;
            }
            if (iVar37 == 0) {
              uVar83 = 0;
            }
          }
        }
        uVar41 = 0x84222325;
        *(undefined4 *)(uVar65 + extraout_r1_17) = uVar83;
        uVar44 = 0xcbf29ce4;
        uVar32 = *puVar9;
        if (sVar12 != 0) {
          iVar37 = 0;
          do {
            uVar88 = (ulonglong)uVar41;
            iVar28 = iVar28 + -1;
            iVar48 = uVar41 * 0x100;
            pcVar15 = (char *)(uVar32 + extraout_r1_18 + iVar37);
            iVar37 = iVar37 + 1;
            uVar33 = (uint)*pcVar15;
            uVar41 = (uint)(uVar88 * 0x1b3) ^ uVar33;
            uVar44 = uVar44 * 0x1b3 + iVar48 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar33 >> 0x1f;
          } while (iVar28 != 0);
        }
        uVar34 = uVar34 ^ (uVar38 | uVar60 ^ uVar46 & (uVar71 ^ uVar60));
        uVar38 = uVar34 | (int)uVar34 >> 0x1f;
        uVar71 = *(uint *)(uVar32 + extraout_r1_19);
        uVar46 = (int)uVar71 >> 0x1f;
        uVar60 = extraout_r1_20;
        if ((uVar34 & ~(uVar41 ^ uVar71) | (uVar41 ^ uVar71) & ~uVar34) != uVar80 ||
            (uVar38 & ~(uVar44 ^ uVar46) | (uVar44 ^ uVar46) & ~uVar38) != uVar51) {
          uVar41 = 0x84222325;
          uVar60 = 0xcbf29ce4;
          if (sVar6 != 0) {
            iVar37 = 0;
            do {
              uVar88 = (ulonglong)uVar41;
              iVar70 = iVar70 + -1;
              iVar48 = uVar41 * 0x100;
              pcVar15 = (char *)(uVar32 + extraout_r1_21 + iVar37);
              iVar37 = iVar37 + 1;
              uVar44 = (uint)*pcVar15;
              uVar41 = (uint)(uVar88 * 0x1b3) ^ uVar44;
              uVar60 = uVar60 * 0x1b3 + iVar48 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar44 >> 0x1f
              ;
            } while (iVar70 != 0);
          }
          uVar44 = (uVar71 & ~uVar41) * 2;
          uVar32 = (uVar41 - uVar71) + uVar44;
          uVar60 = (uVar60 - (uVar46 + (uVar41 < uVar71))) +
                   ((~uVar60 & uVar46) << 1 | (uVar71 & ~uVar41) >> 0x1f) +
                   (uint)CARRY4(uVar41 - uVar71,uVar44);
          uVar46 = (uVar34 & ~uVar32) * 2;
          if ((uVar32 - uVar34) + uVar46 == iVar16 &&
              (uVar60 - (uVar38 + (uVar32 < uVar34))) +
              ((uVar38 & ~uVar60) << 1 | (uVar34 & ~uVar32) >> 0x1f) +
              (uint)CARRY4(uVar32 - uVar34,uVar46) == iVar62) {
            uVar61 = uVar35;
          }
          uVar55 = uVar55 ^ uVar61;
          break;
        }
        goto LAB_00073114;
      default:
        goto switchD_00060e5c_caseD_3;
      case 4:
        uVar41 = *local_118;
        local_134 = local_118[1];
        uVar44 = local_118[2];
        puVar22 = (uint *)(uVar41 + local_114);
        uVar61 = *puVar22;
        uVar60 = puVar22[2];
        uVar53 = puVar22[3];
        uVar55 = puVar22[4];
        FUN_000264a4(~(puVar22[1] ^ local_134),local_134);
        FUN_000264a4(~(uVar53 ^ local_134),local_134);
        FUN_000264a4(~(uVar55 ^ local_134),local_134);
        FUN_000264a4(~(uVar60 ^ local_134),local_134);
        FUN_000264a4(~(uVar61 ^ local_134),local_134);
        uVar55 = *(uint *)(uVar41 + extraout_r1_x00477);
        uVar60 = *(uint *)(uVar41 + extraout_r1_x00474);
        uVar53 = *(uint *)(uVar41 + extraout_r1_x00473);
        uVar33 = *(uint *)(uVar41 + extraout_r1_x00476);
        uVar71 = *(uint *)(uVar41 + extraout_r1_x00475);
        uVar38 = *(uint *)(uVar41 + uVar44);
        puVar9[2] = uVar44 + 4;
        uVar35 = *(uint *)(uVar41 + uVar44 + 4);
        puVar9[2] = uVar44 + 8;
        uVar36 = *(uint *)(uVar41 + uVar44 + 8);
        puVar9[2] = uVar44 + 0xc;
        iVar16 = (int)*(short *)(uVar41 + uVar44 + 0xc);
        puVar9[2] = uVar44 + 0xe;
        uVar67 = *(uint *)(uVar41 + uVar44 + 0xe);
        puVar9[2] = uVar44 + 0x12;
        uVar61 = *(uint *)(uVar41 + uVar44 + 0x12);
        puVar9[2] = uVar44 + 0x16;
        uVar32 = *(uint *)(uVar41 + uVar44 + 0x16);
        puVar9[2] = uVar44 + 0x1a;
        puVar22 = (uint *)(uVar41 + uVar44 + 0x1a);
        uVar81 = *puVar22;
        uVar39 = puVar22[1];
        puVar9[2] = uVar44 + 0x22;
        uVar34 = *(uint *)(uVar41 + uVar44 + 0x22);
        puVar9[2] = uVar44 + 0x26;
        piVar47 = (int *)(uVar41 + uVar44 + 0x26);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar44 + 0x2e;
        uVar65 = *puVar9;
        uVar55 = uVar33 ^ uVar71 & ~(uVar60 & uVar53) ^ uVar55;
        sVar12 = *(short *)(uVar41 + uVar44 + 0x2e);
        puVar9[2] = uVar44 + 0x30;
        uVar50 = *(uint *)(uVar65 + uVar44 + 0x30);
        puVar9[2] = uVar44 + 0x34;
        uVar57 = *(uint *)(uVar65 + uVar44 + 0x34);
        puVar9[2] = uVar44 + 0x38;
        FUN_000264a4(uVar55 ^ uVar38,local_134);
        FUN_000264a4(uVar55 ^ uVar32,local_134);
        FUN_000264a4(uVar55 ^ uVar34,local_134);
        uVar51 = puVar9[1];
        FUN_000264a4(~(*(uint *)(uVar65 + (uVar46 << 1 | 9) + (uVar46 ^ 0xfffffffb)) ^ uVar51),
                     uVar51);
        FUN_000264a4(~(*(uint *)(uVar65 + ((uVar46 | 0x10) * 2 - (uVar46 & 0xffffffef)) +
                                 (uVar46 | 0xffffffef) + 1) ^ uVar51),uVar51);
        iVar48 = uVar65 + (uVar46 ^ 8);
        FUN_000264a4(~(*(uint *)(iVar48 + (uVar46 | 8) * 2 + (uVar46 << 1 ^ 0xffffffee) + 2) ^
                      uVar51),uVar51);
        FUN_000264a4(~(*(uint *)(iVar48 + (uVar46 << 1 | 0xffffffee) + 0x12) ^ uVar51),uVar51);
        uVar77 = *puVar9;
        uVar79 = puVar9[1];
        FUN_000264a4(~(*(uint *)(uVar77 + (uVar46 | 0xc) * 2 + (uVar46 ^ 0xc) +
                                 (uVar46 << 1 ^ 0xffffffe6) + 2) ^ uVar79),uVar79);
        uVar53 = *(uint *)(uVar77 + extraout_r1_x00485);
        uVar60 = *(uint *)(uVar65 + extraout_r1_x00484);
        uVar71 = *(uint *)(uVar65 + extraout_r1_x00483);
        uVar38 = *(uint *)(uVar65 + extraout_r1_x00482);
        uVar34 = *(uint *)(uVar65 + extraout_r1_x00481);
        uVar32 = *(uint *)(uVar77 + extraout_r1_x00479);
        uVar41 = ((uint *)(uVar77 + extraout_r1_x00479))[1];
        uVar33 = *(uint *)(uVar77 + extraout_r1_x00478);
        uVar44 = ((uint *)(uVar77 + extraout_r1_x00478))[1];
        uVar80 = *(uint *)(uVar65 + uVar46);
        FUN_000264a4(~(((uint *)(uVar65 + uVar46))[3] ^ uVar51),uVar51);
        FUN_000264a4(~(uVar80 ^ uVar51),uVar51);
        FUN_000264a4(~(*(uint *)(uVar77 + uVar46) ^ uVar79),uVar79);
        uVar46 = *(uint *)(uVar65 + extraout_r1_x00487);
        uVar79 = *(uint *)(uVar77 + extraout_r1_x00488);
        uVar80 = *(uint *)(uVar65 + extraout_r1_x00486);
        *(int *)(uVar77 + extraout_r1_x00480) = uVar32 + uVar33;
        ((int *)(uVar77 + extraout_r1_x00480))[1] = uVar41 + uVar44 + (uint)CARRY4(uVar32,uVar33);
        FUN_000264a4(uVar55 ^ uVar35,local_134);
        FUN_000264a4(uVar55 ^ uVar67,local_134);
        FUN_000264a4(uVar55 ^ uVar57,uVar51);
        uVar32 = *puVar9;
        uVar41 = 0x84222325;
        uVar44 = 0xcbf29ce4;
        if (iVar16 != 0) {
          iVar48 = 0;
          do {
            uVar88 = (ulonglong)uVar41;
            iVar16 = iVar16 + -1;
            iVar28 = uVar41 * 0x100;
            pcVar15 = (char *)(uVar32 + extraout_r1_x00490 + iVar48);
            iVar48 = iVar48 + 1;
            uVar33 = (uint)*pcVar15;
            uVar41 = (uint)(uVar88 * 0x1b3) ^ uVar33;
            uVar44 = uVar44 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar33 >> 0x1f;
          } while (iVar16 != 0);
        }
        uVar38 = uVar38 & ~uVar34 | uVar34 & ~uVar38;
        uVar34 = *(uint *)(uVar32 + extraout_r1_x00491);
        uVar38 = uVar38 & ~uVar80 | uVar80 & ~uVar38;
        uVar71 = ~uVar38 + (uVar46 | uVar38) * 2 + (uVar38 | ~uVar46) + 2 | uVar71;
        uVar53 = uVar53 | (uVar60 - uVar71) + (uVar71 & ~uVar60) * 2;
        iVar48 = (uVar53 & uVar79) + (uVar53 | uVar79) * -2 + (uVar53 ^ uVar79);
        uVar53 = -iVar48;
        uVar60 = uVar53 | (int)uVar53 >> 0x1f;
        uVar46 = (int)uVar34 >> 0x1f;
        if ((uVar53 & ~(uVar41 ^ uVar34) | (uVar41 ^ uVar34) & ~uVar53) != uVar81 ||
            (uVar60 & ~(uVar44 ^ uVar46) | (uVar44 ^ uVar46) & ~uVar60) != uVar39) {
          uVar61 = 0x84222325;
          uVar71 = 0xcbf29ce4;
          if (sVar12 != 0) {
            iVar28 = (int)sVar12;
            iVar16 = 0;
            uVar61 = 0x84222325;
            do {
              uVar88 = (ulonglong)uVar61;
              iVar28 = iVar28 + -1;
              iVar70 = uVar61 * 0x100;
              pcVar15 = (char *)(uVar32 + extraout_r1_x00489 + iVar16);
              iVar16 = iVar16 + 1;
              uVar38 = (uint)*pcVar15;
              uVar61 = (uint)(uVar88 * 0x1b3) ^ uVar38;
              uVar71 = uVar71 * 0x1b3 + iVar70 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar38 >> 0x1f
              ;
            } while (iVar28 != 0);
          }
          uVar38 = (uVar34 & ~uVar61) * 2;
          uVar41 = (uVar61 - uVar34) + uVar38;
          uVar71 = (uVar71 - (uVar46 + (uVar61 < uVar34))) +
                   ((~uVar71 & uVar46) << 1 | (uVar34 & ~uVar61) >> 0x1f) +
                   (uint)CARRY4(uVar61 - uVar34,uVar38);
          uVar38 = uVar41 + iVar48;
          uVar46 = (uVar53 & ~uVar41) * 2;
          uVar61 = uVar36;
          if (uVar38 + uVar46 == iVar37 &&
              (uVar71 - (uVar60 + (uVar41 < uVar53))) +
              ((uVar60 & ~uVar71) << 1 | (uVar53 & ~uVar41) >> 0x1f) + (uint)CARRY4(uVar38,uVar46)
              == iVar62) {
            uVar61 = uVar50;
          }
        }
        goto LAB_000726c0;
      case 5:
        uVar35 = *local_118;
        uVar53 = local_118[1];
        uVar33 = local_118[2];
        puVar22 = (uint *)(uVar35 + local_114);
        uVar55 = *puVar22;
        uVar60 = puVar22[1];
        uVar46 = puVar22[3];
        uVar61 = puVar22[4];
        FUN_000264a4(~(puVar22[2] ^ uVar53),uVar53);
        FUN_000264a4(~(uVar55 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar46 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar60 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar61 ^ uVar53),uVar53);
        uVar55 = *(uint *)(uVar35 + extraout_r1_x00436);
        uVar36 = *(uint *)(uVar35 + extraout_r1_x00435);
        uVar38 = *(uint *)(uVar35 + extraout_r1_x00434);
        uVar44 = *(uint *)(uVar35 + extraout_r1_x00433);
        uVar46 = *(uint *)(uVar35 + extraout_r1_x00432);
        uVar34 = *(uint *)(uVar35 + uVar33);
        puVar9[2] = uVar33 + 4;
        piVar47 = (int *)(uVar35 + uVar33 + 4);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar33 + 0xc;
        uVar60 = *(uint *)(uVar35 + uVar33 + 0xc);
        puVar9[2] = uVar33 + 0x10;
        uVar71 = *(uint *)(uVar35 + uVar33 + 0x10);
        puVar9[2] = uVar33 + 0x14;
        iVar48 = (int)*(short *)(uVar35 + uVar33 + 0x14);
        puVar9[2] = uVar33 + 0x16;
        uVar61 = *(uint *)(uVar35 + uVar33 + 0x16);
        puVar9[2] = uVar33 + 0x1a;
        uVar32 = *(uint *)(uVar35 + uVar33 + 0x1a);
        puVar9[2] = uVar33 + 0x1e;
        uVar41 = *(uint *)(uVar35 + uVar33 + 0x1e);
        uVar55 = uVar55 ^ (uVar36 | uVar44 & uVar46 & uVar38);
        puVar9[2] = uVar33 + 0x22;
        FUN_000264a4(uVar55 ^ uVar34,uVar53);
        FUN_000264a4(uVar55 ^ uVar60,uVar53);
        *(uint *)(uVar35 + extraout_r1_x00437) = ~*(uint *)(uVar35 + extraout_r1_x00438);
        FUN_000264a4(uVar55 ^ uVar32,uVar53);
        FUN_000264a4(uVar55 ^ uVar41,uVar53);
        uVar46 = 0x84222325;
        uVar60 = 0xcbf29ce4;
        if (iVar48 != 0) {
          iVar16 = 0;
          do {
            uVar88 = (ulonglong)uVar46;
            iVar48 = iVar48 + -1;
            iVar28 = uVar46 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00439 + iVar16);
            iVar16 = iVar16 + 1;
            uVar38 = (uint)*pcVar15;
            uVar46 = (uint)(uVar88 * 0x1b3) ^ uVar38;
            uVar60 = uVar60 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar38 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar34 = *(uint *)(*puVar9 + extraout_r1_x00440);
        uVar38 = (uVar46 | uVar34) * 2;
        bVar82 = uVar38 - (uVar46 + uVar34) == iVar37 &&
                 ((uVar60 | (int)uVar34 >> 0x1f) << 1 | (uVar46 | uVar34) >> 0x1f) -
                 (uVar60 + ((int)uVar34 >> 0x1f) + (uint)CARRY4(uVar46,uVar34) +
                 (uint)(uVar38 < uVar46 + uVar34)) == iVar62;
        goto LAB_0006ffcc;
      case 7:
        uVar39 = *local_118;
        uVar53 = local_118[1];
        uVar67 = local_118[2];
        FUN_000264a4(~(*(uint *)(uVar39 + (local_114 << 1 | 9) + (local_114 ^ 0xfffffffb)) ^ uVar53)
                     ,uVar53);
        iVar37 = uVar39 + (uVar46 | 0x10) * 2;
        FUN_000264a4(~(*(uint *)(iVar37 + (uVar46 | 0xffffffef) + (~uVar46 | 0x10) + 2) ^ uVar53),
                     uVar53);
        FUN_000264a4(~(*(uint *)(iVar37 + (uVar46 ^ 0xffffffef) + 1) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar39 + (uVar46 & 4) * 2 + (uVar46 ^ 4) * 3 +
                                 (uVar46 << 1 ^ 0xfffffff6) + 2) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar39 + (uVar46 | 0xc) * 2 + (uVar46 ^ 0xfffffff3) + 1) ^ uVar53),
                     uVar53);
        uVar55 = *(uint *)(uVar39 + extraout_r1_x00455);
        uVar71 = *(uint *)(uVar39 + extraout_r1_x00454);
        uVar38 = *(uint *)(uVar39 + extraout_r1_x00453);
        uVar34 = *(uint *)(uVar39 + extraout_r1_x00452);
        uVar41 = *(uint *)(uVar39 + extraout_r1_x00451);
        FUN_000264a4(~(*(uint *)(uVar39 + (uVar46 | 0x10) + (uVar46 & 0x10)) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar39 + uVar46) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar39 + (uVar46 | 0xc) + (uVar46 & 0xc)) ^ uVar53),uVar53);
        FUN_000264a4(~(((uint *)(uVar39 + uVar46))[2] ^ uVar53),uVar53);
        uVar44 = *(uint *)(uVar39 + extraout_r1_x00458);
        uVar57 = *(uint *)(uVar39 + extraout_r1_x00459);
        uVar35 = *(uint *)(uVar39 + extraout_r1_x00456);
        uVar32 = *(uint *)(uVar39 + extraout_r1_x00457);
        uVar50 = *(uint *)(uVar39 + uVar67);
        puVar9[2] = uVar67 + 4;
        iVar48 = (int)*(short *)(uVar39 + uVar67 + 4);
        puVar9[2] = uVar67 + 6;
        uVar36 = *(uint *)(uVar39 + uVar67 + 6);
        puVar9[2] = uVar67 + 10;
        piVar47 = (int *)(uVar39 + uVar67 + 10);
        iVar62 = *piVar47;
        iVar37 = piVar47[1];
        puVar9[2] = uVar67 + 0x12;
        uVar60 = *(uint *)(uVar39 + uVar67 + 0x12);
        puVar9[2] = uVar67 + 0x16;
        uVar46 = *(uint *)(uVar39 + uVar67 + 0x16);
        puVar9[2] = uVar67 + 0x1a;
        uVar33 = *(uint *)(uVar39 + uVar67 + 0x1a);
        puVar9[2] = uVar67 + 0x1e;
        uVar61 = *(uint *)(uVar39 + uVar67 + 0x1e);
        puVar9[2] = uVar67 + 0x22;
        uVar38 = ~((uVar35 | uVar41) - (uVar41 ^ uVar35) & uVar34 | uVar38);
        uVar38 = (uVar32 + (uVar38 ^ uVar32)) - (uVar32 | uVar38);
        uVar71 = (uVar38 + ~(uVar71 & uVar38)) - (uVar38 | ~uVar71);
        uVar71 = uVar71 & ~uVar44 | uVar44 & ~uVar71;
        uVar55 = (uVar55 - (uVar55 ^ uVar71)) + (uVar71 & ~uVar55);
        uVar55 = (uVar55 - uVar57) + (uVar57 & ~uVar55) * 2;
        FUN_000264a4(uVar55 ^ uVar50,uVar53);
        FUN_000264a4(uVar55 ^ uVar33,uVar53);
        *(undefined1 *)(uVar39 + extraout_r1_x00461) = *(undefined1 *)(uVar39 + extraout_r1_x00460);
        FUN_000264a4(uVar55 ^ uVar36,uVar53);
        FUN_000264a4(uVar55 ^ uVar46,uVar53);
        uVar46 = 0x84222325;
        uVar71 = 0xcbf29ce4;
        if (iVar48 != 0) {
          iVar16 = 0;
          do {
            uVar88 = (ulonglong)uVar46;
            iVar48 = iVar48 + -1;
            iVar28 = uVar46 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00463 + iVar16);
            iVar16 = iVar16 + 1;
            uVar38 = (uint)*pcVar15;
            uVar46 = (uint)(uVar88 * 0x1b3) ^ uVar38;
            uVar71 = uVar71 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar38 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar34 = *(uint *)(*puVar9 + extraout_r1_x00462);
        uVar38 = (uVar46 | uVar34) * 2;
        bVar82 = uVar38 - (uVar46 + uVar34) == iVar62 &&
                 ((uVar71 | (int)uVar34 >> 0x1f) << 1 | (uVar46 | uVar34) >> 0x1f) -
                 (uVar71 + ((int)uVar34 >> 0x1f) + (uint)CARRY4(uVar46,uVar34) +
                 (uint)(uVar38 < uVar46 + uVar34)) == iVar37;
        goto LAB_00072ed8;
      case 0xb:
        uVar72 = *local_118;
        uVar36 = local_118[1];
        uVar57 = local_118[2];
        FUN_000264a4(~(*(uint *)(uVar72 + (~local_114 & 0xfffffff7) * -3 + (~local_114 | 0xfffffff7)
                                + (local_114 << 1 ^ 0xffffffee)) ^ uVar36),uVar36);
        FUN_000264a4(~(*(uint *)(uVar72 + (uVar46 ^ 0xc) + (uVar46 << 1 | 0xffffffe6) + 0x1a) ^
                      uVar36),uVar36);
        iVar37 = uVar72 + (uVar46 | 8);
        FUN_000264a4(~(*(uint *)(iVar37 + (uVar46 | 0xfffffff7) + 9) ^ uVar36),uVar36);
        uVar53 = uVar46 | 0x10;
        uVar35 = uVar46 & 0x10;
        FUN_000264a4(~(*(uint *)(uVar72 + uVar53 * 2 + uVar35 + (~uVar46 & 0xffffffef) + 1) ^ uVar36
                      ),uVar36);
        uVar41 = *(uint *)(uVar72 + extraout_r1_x00332);
        uVar55 = *(uint *)(uVar72 + extraout_r1_x00331);
        uVar60 = *(uint *)(uVar72 + extraout_r1_x00330);
        uVar71 = *(uint *)(uVar72 + extraout_r1_x00329);
        FUN_000264a4(~(*(uint *)(uVar72 + (uVar46 & 4) * 2 + (uVar46 ^ 4)) ^ uVar36),uVar36);
        puVar22 = (uint *)(uVar72 + uVar46);
        uVar61 = *puVar22;
        uVar34 = puVar22[3];
        uVar38 = puVar22[4];
        FUN_000264a4(~(puVar22[1] ^ uVar36),uVar36);
        FUN_000264a4(~(uVar38 ^ uVar36),uVar36);
        FUN_000264a4(~(uVar61 ^ uVar36),uVar36);
        FUN_000264a4(~(uVar34 ^ uVar36),uVar36);
        uVar75 = *(uint *)(uVar72 + extraout_r1_x00336);
        uVar77 = *(uint *)(uVar72 + extraout_r1_x00337);
        uVar32 = *(uint *)(uVar72 + extraout_r1_x00335);
        uVar34 = *(uint *)(uVar72 + extraout_r1_x00334);
        uVar38 = *(uint *)(uVar72 + uVar57);
        uVar44 = *(uint *)(uVar72 + extraout_r1_x00333);
        puVar9[2] = uVar57 + 4;
        uVar33 = *(uint *)(uVar72 + uVar57 + 4);
        puVar9[2] = uVar57 + 8;
        sVar12 = *(short *)(uVar72 + uVar57 + 8);
        iVar28 = (int)sVar12;
        puVar9[2] = uVar57 + 10;
        uVar39 = *(uint *)(uVar72 + uVar57 + 10);
        puVar9[2] = uVar57 + 0xe;
        iVar16 = (int)*(short *)(uVar72 + uVar57 + 0xe);
        puVar9[2] = uVar57 + 0x10;
        uVar61 = *(uint *)(uVar72 + uVar57 + 0x10);
        puVar9[2] = uVar57 + 0x14;
        uVar50 = *(uint *)(uVar72 + uVar57 + 0x14);
        puVar9[2] = uVar57 + 0x18;
        piVar47 = (int *)(uVar72 + uVar57 + 0x18);
        iVar62 = *piVar47;
        iVar48 = piVar47[1];
        puVar9[2] = uVar57 + 0x20;
        uVar67 = *(uint *)(uVar72 + uVar57 + 0x20);
        puVar9[2] = uVar57 + 0x24;
        puVar59 = (uint *)(uVar72 + uVar57 + 0x24);
        uVar81 = *puVar59;
        uVar79 = puVar59[1];
        puVar9[2] = uVar57 + 0x2c;
        uVar80 = *(uint *)(uVar72 + uVar57 + 0x2c);
        puVar9[2] = uVar57 + 0x30;
        uVar51 = *(uint *)(uVar72 + uVar57 + 0x30);
        puVar9[2] = uVar57 + 0x34;
        uVar65 = *(uint *)(uVar72 + uVar57 + 0x34);
        puVar9[2] = uVar57 + 0x38;
        uVar34 = uVar44 + (uVar71 | ~uVar44) + 1 & uVar34;
        uVar60 = (uVar60 + ~(uVar60 & uVar34)) - (uVar60 | ~uVar34);
        uVar55 = (uVar55 + ~(uVar60 & uVar55)) - (uVar55 | ~uVar60);
        uVar55 = (uVar55 + ~(uVar55 & uVar32)) - (uVar55 | ~uVar32);
        uVar55 = (~uVar55 + uVar55 * 2) - (uVar55 | ~uVar75);
        uVar41 = uVar41 ^ uVar77 + uVar55 + ~(uVar55 & uVar77) + 1;
        FUN_000264a4(uVar41 ^ uVar38,uVar36);
        FUN_000264a4(uVar41 ^ uVar67,uVar36);
        uVar57 = *puVar9;
        uVar77 = puVar9[1];
        uVar55 = *(uint *)(uVar57 + extraout_r1_x00339);
        uVar67 = *(uint *)(uVar57 + extraout_r1_x00338);
        FUN_000264a4(uVar41 ^ uVar33,uVar36);
        uVar60 = ((uint *)(uVar57 + extraout_r1_x00338))[1];
        uVar71 = ((uint *)(uVar57 + extraout_r1_x00339))[1];
        FUN_000264a4(~(*(uint *)(iVar37 + (uVar46 | 8) + (uVar46 ^ 0xfffffff7) + 1) ^ uVar36),uVar36
                    );
        FUN_000264a4(~(*(uint *)(uVar57 + (uVar46 << 1 | 0x19) + (uVar46 ^ 0xfffffff3)) ^ uVar77),
                     uVar77);
        FUN_000264a4(~(*(uint *)(uVar57 + uVar53 * 2 + (uVar46 ^ 0xffffffef) + 1) ^ uVar77),uVar77);
        FUN_000264a4(~(*(uint *)(uVar57 + (uVar46 & 0xc) * 2 + (uVar46 & 0xfffffff3) +
                                (~uVar46 & 0xc)) ^ uVar77),uVar77);
        uVar38 = *(uint *)(uVar57 + extraout_r1_x00344);
        uVar34 = *(uint *)(uVar57 + extraout_r1_x00343);
        uVar44 = *(uint *)(uVar57 + extraout_r1_x00342);
        uVar32 = *(uint *)(uVar72 + extraout_r1_x00341);
        FUN_000264a4(~(puVar22[1] ^ uVar36),uVar36);
        puVar22 = (uint *)(uVar57 + uVar46);
        FUN_000264a4(~(*puVar22 ^ uVar77),uVar77);
        uVar33 = puVar22[1];
        FUN_000264a4(~(puVar22[4] ^ uVar77),uVar77);
        FUN_000264a4(~(*(uint *)(uVar57 + ((uVar35 | uVar35 << 1) - uVar53) + (uVar46 ^ 0x10) * 2) ^
                      uVar77),uVar77);
        FUN_000264a4(~(uVar33 ^ uVar77),uVar77);
        uVar46 = *(uint *)(uVar57 + extraout_r1_x00349);
        uVar53 = *(uint *)(uVar57 + extraout_r1_x00348);
        uVar35 = *(uint *)(uVar57 + extraout_r1_x00347);
        uVar33 = *(uint *)(uVar57 + extraout_r1_x00346);
        uVar77 = *(uint *)(uVar57 + extraout_r1_x00345);
        *(uint *)(uVar57 + extraout_r1_x00340) = uVar67 ^ uVar55;
        ((uint *)(uVar57 + extraout_r1_x00340))[1] = uVar60 ^ uVar71;
        FUN_000264a4(uVar41 ^ uVar39,uVar36);
        FUN_000264a4(uVar41 ^ uVar80,uVar36);
        FUN_000264a4(uVar41 ^ uVar51,uVar36);
        uVar60 = 0x84222325;
        uVar71 = *puVar9;
        uVar55 = 0xcbf29ce4;
        if (iVar16 != 0) {
          iVar37 = 0;
          do {
            uVar88 = (ulonglong)uVar60;
            iVar16 = iVar16 + -1;
            iVar70 = uVar60 * 0x100;
            pcVar15 = (char *)(uVar71 + extraout_r1_x00351 + iVar37);
            iVar37 = iVar37 + 1;
            uVar67 = (uint)*pcVar15;
            uVar60 = (uint)(uVar88 * 0x1b3) ^ uVar67;
            uVar55 = uVar55 * 0x1b3 + iVar70 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar67 >> 0x1f;
          } while (iVar16 != 0);
        }
        uVar33 = uVar33 ^ (uVar32 + (uVar77 ^ uVar32)) - (uVar32 & ~uVar77);
        uVar34 = uVar34 + ((uVar44 - (uVar44 ^ uVar33)) + (uVar33 & ~uVar44) | ~uVar34) + 1;
        uVar38 = ((uVar34 | uVar38) - (uVar34 & ~uVar38)) + (uVar34 | ~uVar38) + 1;
        uVar38 = uVar38 + uVar35 + ~(uVar35 & uVar38) * 2 + 2;
        uVar53 = (uVar38 + (~uVar53 ^ uVar38)) - (uVar38 | ~uVar53);
        uVar53 = uVar53 & ~uVar46 | uVar46 & ~uVar53;
        uVar34 = uVar53 | (int)uVar53 >> 0x1f;
        uVar38 = *(uint *)(uVar71 + extraout_r1_x00350);
        uVar46 = (int)uVar38 >> 0x1f;
        if ((uVar53 & ~(uVar60 ^ uVar38) | (uVar60 ^ uVar38) & ~uVar53) != uVar81 ||
            (uVar34 & ~(uVar55 ^ uVar46) | (uVar55 ^ uVar46) & ~uVar34) != uVar79) {
          uVar61 = 0x84222325;
          uVar55 = 0xcbf29ce4;
          if (sVar12 != 0) {
            iVar37 = 0;
            do {
              uVar88 = (ulonglong)uVar61;
              iVar28 = iVar28 + -1;
              iVar16 = uVar61 * 0x100;
              pcVar15 = (char *)(uVar71 + extraout_r1_x00352 + iVar37);
              iVar37 = iVar37 + 1;
              uVar60 = (uint)*pcVar15;
              uVar61 = (uint)(uVar88 * 0x1b3) ^ uVar60;
              uVar55 = uVar55 * 0x1b3 + iVar16 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar60 >> 0x1f
              ;
            } while (iVar28 != 0);
          }
          uVar60 = (uVar38 & ~uVar61) * 2;
          uVar71 = (uVar61 - uVar38) + uVar60;
          uVar55 = (uVar55 - (uVar46 + (uVar61 < uVar38))) +
                   ((~uVar55 & uVar46) << 1 | (uVar38 & ~uVar61) >> 0x1f) +
                   (uint)CARRY4(uVar61 - uVar38,uVar60);
          uVar46 = (uVar53 & ~uVar71) * 2;
          uVar61 = uVar50;
          if ((uVar71 - uVar53) + uVar46 == iVar62 &&
              (uVar55 - (uVar34 + (uVar71 < uVar53))) +
              ((uVar34 & ~uVar55) << 1 | (uVar53 & ~uVar71) >> 0x1f) +
              (uint)CARRY4(uVar71 - uVar53,uVar46) == iVar48) {
            uVar61 = uVar65;
          }
        }
        uVar41 = uVar41 ^ uVar61;
        goto LAB_00071ca8;
      case 0xf:
        uVar32 = *local_118;
        uVar39 = local_118[1];
        uVar67 = local_118[2];
        puVar22 = (uint *)(uVar32 + local_114);
        uVar61 = *puVar22;
        uVar53 = puVar22[1];
        uVar60 = puVar22[2];
        uVar55 = puVar22[4];
        FUN_000264a4(~(puVar22[3] ^ uVar39),uVar39);
        FUN_000264a4(~(uVar53 ^ uVar39),uVar39);
        FUN_000264a4(~(uVar55 ^ uVar39),uVar39);
        FUN_000264a4(~(uVar60 ^ uVar39),uVar39);
        FUN_000264a4(~(uVar61 ^ uVar39),uVar39);
        uVar61 = *(uint *)(uVar32 + extraout_r1_x00571);
        uVar57 = *(uint *)(uVar32 + extraout_r1_x00570);
        iVar16 = (int)*(short *)(uVar32 + uVar67);
        uVar50 = *(uint *)(uVar32 + extraout_r1_x00569);
        uVar71 = *(uint *)(uVar32 + extraout_r1_x00568);
        uVar53 = *(uint *)(uVar32 + extraout_r1_x00567);
        puVar9[2] = uVar67 + 2;
        uVar38 = *(uint *)(uVar32 + uVar67 + 2);
        uVar81 = *puVar9;
        puVar9[2] = uVar67 + 6;
        uVar34 = *(uint *)(uVar32 + uVar67 + 6);
        puVar9[2] = uVar67 + 10;
        uVar41 = *(uint *)(uVar32 + uVar67 + 10);
        puVar9[2] = uVar67 + 0xe;
        sVar12 = *(short *)(uVar32 + uVar67 + 0xe);
        puVar9[2] = uVar67 + 0x10;
        uVar44 = *(uint *)(uVar32 + uVar67 + 0x10);
        puVar9[2] = uVar67 + 0x14;
        uVar55 = *(uint *)(uVar32 + uVar67 + 0x14);
        puVar9[2] = uVar67 + 0x18;
        uVar60 = *(uint *)(uVar32 + uVar67 + 0x18);
        puVar9[2] = uVar67 + 0x1c;
        uVar77 = *(uint *)(uVar32 + uVar67 + 0x1c);
        puVar9[2] = uVar67 + 0x20;
        uVar32 = *(uint *)(uVar32 + uVar67 + 0x20);
        puVar9[2] = uVar67 + 0x24;
        puVar22 = (uint *)(uVar81 + uVar67 + 0x24);
        uVar33 = *puVar22;
        uVar35 = puVar22[1];
        puVar9[2] = uVar67 + 0x2c;
        uVar36 = *(uint *)(uVar81 + uVar67 + 0x2c);
        puVar9[2] = uVar67 + 0x30;
        piVar47 = (int *)(uVar81 + uVar67 + 0x30);
        iVar48 = *piVar47;
        iVar37 = piVar47[1];
        puVar9[2] = uVar67 + 0x38;
        uVar50 = uVar57 & (uVar50 | uVar71 ^ uVar53) & ~uVar61;
        FUN_000264a4(uVar50 ^ uVar55,uVar39);
        FUN_000264a4(uVar50 ^ uVar60,uVar39);
        uVar67 = *puVar9;
        uVar57 = puVar9[1];
        uVar53 = puVar9[1];
        fVar40 = *(float *)(uVar67 + extraout_r1_x00572);
        fVar30 = *(float *)(uVar67 + extraout_r1_x00573);
        FUN_000264a4(uVar50 ^ uVar77,uVar39);
        FUN_000264a4(~(*(uint *)(uVar81 + (uVar46 | 0x10) * 2 + (uVar46 ^ 0xffffffef) + 1) ^ uVar57)
                     ,uVar57);
        iVar62 = uVar81 + (uVar46 & 4) * 2;
        FUN_000264a4(~(*(uint *)(iVar62 + (uVar46 ^ 4) * 3 + (uVar46 << 1 ^ 0xfffffff6) + 2) ^
                      uVar57),uVar57);
        uVar71 = *(uint *)(uVar81 + extraout_r1_x00576);
        uVar61 = *(uint *)(uVar81 + extraout_r1_x00575);
        FUN_000264a4(~(*(uint *)(uVar81 + uVar46) ^ uVar57),uVar57);
        FUN_000264a4(~(*(uint *)(uVar81 + (uVar46 & 8) * 2 + (uVar46 ^ 8)) ^ uVar57),uVar57);
        FUN_000264a4(~(*(uint *)(iVar62 + (uVar46 ^ 4)) ^ uVar57),uVar57);
        FUN_000264a4(~(((uint *)(uVar81 + uVar46))[4] ^ uVar57),uVar57);
        FUN_000264a4(~(*(uint *)(uVar67 + (uVar46 & 0xc) * 2 + (uVar46 ^ 0xc)) ^ uVar53));
        uVar46 = *(uint *)(uVar67 + extraout_r1_x00581);
        uVar53 = *(uint *)(uVar81 + extraout_r1_x00580);
        uVar55 = *(uint *)(uVar81 + extraout_r1_x00579);
        uVar60 = *(uint *)(uVar81 + extraout_r1_x00578);
        uVar77 = *(uint *)(uVar81 + extraout_r1_x00577);
        *(float *)(uVar67 + extraout_r1_x00574) = fVar30 + fVar40;
        FUN_000264a4(uVar50 ^ uVar38,uVar39);
        FUN_000264a4(uVar50 ^ uVar34,uVar39);
        FUN_000264a4(uVar50 ^ uVar41,uVar39);
        FUN_000264a4(uVar50 ^ uVar44,uVar39);
        FUN_000264a4(uVar50 ^ uVar32,uVar39);
        FUN_000264a4(uVar50 ^ uVar36,uVar57);
        uVar41 = *puVar9;
        uVar38 = 0x84222325;
        uVar34 = 0xcbf29ce4;
        if (iVar16 != 0) {
          iVar62 = 0;
          do {
            uVar88 = (ulonglong)uVar38;
            iVar16 = iVar16 + -1;
            iVar28 = uVar38 * 0x100;
            pcVar15 = (char *)(uVar41 + extraout_r1_x00585 + iVar62);
            iVar62 = iVar62 + 1;
            uVar44 = (uint)*pcVar15;
            uVar38 = (uint)(uVar88 * 0x1b3) ^ uVar44;
            uVar34 = uVar34 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar44 >> 0x1f;
          } while (iVar16 != 0);
        }
        uVar60 = uVar60 & uVar61 + (uVar77 & ~uVar61) * 2 + (uVar61 | ~uVar77) + 1;
        uVar61 = uVar60 & ~uVar55 | uVar55 & ~uVar60;
        uVar61 = uVar77 & ~uVar61 | uVar61 & ~uVar77;
        uVar71 = uVar71 ^ (uVar53 + uVar61) - (uVar53 | uVar61);
        uVar46 = uVar46 + (uVar71 & ~uVar46) * 2 + (uVar46 | ~uVar71) + 1;
        uVar55 = uVar46 | (int)uVar46 >> 0x1f;
        uVar53 = *(uint *)(uVar41 + extraout_r1_x00586);
        uVar61 = (int)uVar53 >> 0x1f;
        uVar60 = extraout_r1_x00582;
        if ((uVar46 & ~(uVar38 ^ uVar53) | (uVar38 ^ uVar53) & ~uVar46) != uVar33 ||
            (uVar55 & ~(uVar34 ^ uVar61) | (uVar34 ^ uVar61) & ~uVar55) != uVar35) {
          uVar71 = 0x84222325;
          uVar60 = 0xcbf29ce4;
          if (sVar12 != 0) {
            iVar16 = (int)sVar12;
            iVar62 = 0;
            do {
              uVar88 = (ulonglong)uVar71;
              iVar16 = iVar16 + -1;
              iVar28 = uVar71 * 0x100;
              pcVar15 = (char *)(uVar41 + extraout_r1_x00583 + iVar62);
              iVar62 = iVar62 + 1;
              uVar38 = (uint)*pcVar15;
              uVar71 = (uint)(uVar88 * 0x1b3) ^ uVar38;
              uVar60 = uVar60 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar38 >> 0x1f
              ;
            } while (iVar16 != 0);
          }
          uVar38 = (uVar53 & ~uVar71) * 2;
          uVar34 = (uVar71 - uVar53) + uVar38;
          uVar53 = (uVar60 - (uVar61 + (uVar71 < uVar53))) +
                   ((~uVar60 & uVar61) << 1 | (uVar53 & ~uVar71) >> 0x1f) +
                   (uint)CARRY4(uVar71 - uVar53,uVar38);
          uVar61 = (uVar46 & ~uVar34) * 2;
          uVar60 = extraout_r1_x00584;
          if ((uVar34 - uVar46) + uVar61 == iVar48 &&
              (uVar53 - (uVar55 + (uVar34 < uVar46))) +
              ((uVar55 & ~uVar53) << 1 | (uVar46 & ~uVar34) >> 0x1f) +
              (uint)CARRY4(uVar34 - uVar46,uVar61) == iVar37) {
            uVar60 = extraout_r1_x00587;
          }
        }
        goto LAB_00073114;
      case 0x10:
        uVar57 = *local_118;
        uVar53 = local_118[1];
        uVar33 = local_118[2];
        puVar22 = (uint *)(uVar57 + local_114);
        uVar61 = *puVar22;
        uVar38 = puVar22[1];
        uVar55 = puVar22[3];
        uVar60 = puVar22[4];
        FUN_000264a4(~(puVar22[2] ^ uVar53),uVar53);
        FUN_000264a4(~(uVar55 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar61 ^ uVar53),uVar53);
        uVar71 = *(uint *)(uVar57 + extraout_r1_x00611);
        FUN_000264a4(~(uVar38 ^ uVar53),uVar53);
        uVar55 = *(uint *)(uVar57 + extraout_r1_x00612);
        uVar38 = *(uint *)(uVar57 + extraout_r1_x00610);
        FUN_000264a4(~(uVar60 ^ uVar53),uVar53);
        uVar60 = *(uint *)(uVar57 + extraout_r1_x00613);
        uVar41 = *(uint *)(uVar57 + uVar33);
        uVar79 = *puVar9;
        uVar34 = *(uint *)(uVar57 + extraout_r1_x00609);
        puVar9[2] = uVar33 + 4;
        uVar35 = *(uint *)(uVar57 + uVar33 + 4);
        puVar9[2] = uVar33 + 8;
        piVar47 = (int *)(uVar57 + uVar33 + 8);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar33 + 0x10;
        sVar12 = *(short *)(uVar57 + uVar33 + 0x10);
        puVar9[2] = uVar33 + 0x12;
        uVar44 = *(uint *)(uVar57 + uVar33 + 0x12);
        puVar9[2] = uVar33 + 0x16;
        uVar32 = *(uint *)(uVar57 + uVar33 + 0x16);
        puVar9[2] = uVar33 + 0x1a;
        puVar22 = (uint *)(uVar57 + uVar33 + 0x1a);
        uVar36 = *puVar22;
        uVar67 = puVar22[1];
        puVar9[2] = uVar33 + 0x22;
        uVar39 = *(uint *)(uVar57 + uVar33 + 0x22);
        puVar9[2] = uVar33 + 0x26;
        uVar50 = *(uint *)(uVar57 + uVar33 + 0x26);
        puVar9[2] = uVar33 + 0x2a;
        iVar48 = (int)*(short *)(uVar57 + uVar33 + 0x2a);
        puVar9[2] = uVar33 + 0x2c;
        uVar61 = *(uint *)(uVar57 + uVar33 + 0x2c);
        uVar55 = uVar38 & ~(uVar34 ^ uVar60) & uVar71 & uVar55;
        puVar9[2] = uVar33 + 0x30;
        uVar57 = *(uint *)(uVar79 + uVar33 + 0x30);
        puVar9[2] = uVar33 + 0x34;
        uVar77 = *(uint *)(uVar79 + uVar33 + 0x34);
        puVar9[2] = uVar33 + 0x38;
        FUN_000264a4(uVar55 ^ uVar44,uVar53);
        FUN_000264a4(uVar55 ^ uVar32,uVar53);
        uVar60 = *(uint *)(uVar79 + extraout_r1_x00614);
        uVar33 = *(uint *)(uVar79 + extraout_r1_x00615);
        FUN_000264a4(uVar55 ^ uVar41,uVar53);
        uVar71 = ((uint *)(uVar79 + extraout_r1_x00615))[1];
        uVar38 = ((uint *)(uVar79 + extraout_r1_x00614))[1];
        puVar22 = (uint *)(uVar79 + uVar46);
        uVar46 = *puVar22;
        uVar34 = puVar22[2];
        uVar81 = puVar9[1];
        uVar44 = puVar22[1];
        uVar41 = puVar22[4];
        FUN_000264a4(~(puVar22[3] ^ uVar81),uVar81);
        FUN_000264a4(~(uVar41 ^ uVar81),uVar81);
        FUN_000264a4(~(uVar44 ^ uVar81),uVar81);
        FUN_000264a4(~(uVar46 ^ uVar81),uVar81);
        FUN_000264a4(~(uVar34 ^ uVar81),uVar81);
        uVar46 = *(uint *)(uVar79 + extraout_r1_x00621);
        uVar34 = *(uint *)(uVar79 + extraout_r1_x00620);
        uVar41 = *(uint *)(uVar79 + extraout_r1_x00619);
        uVar44 = *(uint *)(uVar79 + extraout_r1_x00618);
        uVar32 = *(uint *)(uVar79 + extraout_r1_x00617);
        *(uint *)(uVar79 + extraout_r1_x00616) = ~(uVar33 & uVar60);
        ((uint *)(uVar79 + extraout_r1_x00616))[1] = ~(uVar71 & uVar38);
        FUN_000264a4(uVar55 ^ uVar35,uVar53);
        FUN_000264a4(uVar55 ^ uVar50,uVar53);
        FUN_000264a4(uVar55 ^ uVar57,uVar53);
        FUN_000264a4(uVar55 ^ uVar77,uVar81);
        uVar33 = *puVar9;
        uVar38 = 0x84222325;
        uVar71 = 0xcbf29ce4;
        if (iVar48 != 0) {
          iVar16 = 0;
          do {
            uVar88 = (ulonglong)uVar38;
            iVar48 = iVar48 + -1;
            iVar28 = uVar38 * 0x100;
            pcVar15 = (char *)(uVar33 + extraout_r1_x00624 + iVar16);
            iVar16 = iVar16 + 1;
            uVar60 = (uint)*pcVar15;
            uVar38 = (uint)(uVar88 * 0x1b3) ^ uVar60;
            uVar71 = uVar71 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar60 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar35 = *(uint *)(uVar33 + extraout_r1_x00622);
        uVar34 = uVar34 ^ (uVar46 | uVar34 & (uVar41 | uVar44 ^ uVar32));
        uVar41 = uVar34 | (int)uVar34 >> 0x1f;
        uVar46 = (int)uVar35 >> 0x1f;
        uVar60 = extraout_r1_x00625;
        if ((uVar34 & ~(uVar38 ^ uVar35) | (uVar38 ^ uVar35) & ~uVar34) != uVar36 ||
            (uVar41 & ~(uVar71 ^ uVar46) | (uVar71 ^ uVar46) & ~uVar41) != uVar67) {
          uVar71 = 0x84222325;
          uVar60 = 0xcbf29ce4;
          if (sVar12 != 0) {
            iVar16 = (int)sVar12;
            iVar48 = 0;
            do {
              uVar88 = (ulonglong)uVar71;
              iVar16 = iVar16 + -1;
              iVar28 = uVar71 * 0x100;
              pcVar15 = (char *)(uVar33 + extraout_r1_x00623 + iVar48);
              iVar48 = iVar48 + 1;
              uVar38 = (uint)*pcVar15;
              uVar71 = (uint)(uVar88 * 0x1b3) ^ uVar38;
              uVar60 = uVar60 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar38 >> 0x1f
              ;
            } while (iVar16 != 0);
          }
          uVar38 = (uVar35 & ~uVar71) * 2;
          uVar44 = (uVar71 - uVar35) + uVar38;
          uVar60 = (uVar60 - (uVar46 + (uVar71 < uVar35))) +
                   ((~uVar60 & uVar46) << 1 | (uVar35 & ~uVar71) >> 0x1f) +
                   (uint)CARRY4(uVar71 - uVar35,uVar38);
          uVar46 = (uVar34 & ~uVar44) * 2;
          if ((uVar44 - uVar34) + uVar46 == iVar37 &&
              (uVar60 - (uVar41 + (uVar44 < uVar34))) +
              ((uVar41 & ~uVar60) << 1 | (uVar34 & ~uVar44) >> 0x1f) +
              (uint)CARRY4(uVar44 - uVar34,uVar46) == iVar62) {
            uVar61 = uVar39;
          }
          uVar55 = uVar55 ^ uVar61;
          break;
        }
        goto LAB_00073114;
      case 0x11:
        uVar33 = *local_118;
        uVar53 = local_118[1];
        uVar44 = local_118[2];
        puVar22 = (uint *)(uVar33 + local_114);
        uVar46 = *puVar22;
        uVar55 = puVar22[2];
        uVar60 = puVar22[3];
        uVar61 = puVar22[4];
        FUN_000264a4(~(puVar22[1] ^ uVar53),uVar53);
        FUN_000264a4(~(uVar55 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar46 ^ uVar53),uVar53);
        uVar55 = *(uint *)(uVar33 + extraout_r1_x00466);
        uVar32 = *(uint *)(uVar33 + extraout_r1_x00465);
        uVar46 = *(uint *)(uVar33 + extraout_r1_x00464);
        FUN_000264a4(~(uVar60 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar61 ^ uVar53),uVar53);
        uVar34 = *(uint *)(uVar33 + uVar44);
        uVar71 = *(uint *)(uVar33 + extraout_r1_x00468);
        uVar38 = *(uint *)(uVar33 + extraout_r1_x00467);
        puVar9[2] = uVar44 + 4;
        uVar61 = *(uint *)(uVar33 + uVar44 + 4);
        puVar9[2] = uVar44 + 8;
        iVar48 = (int)*(short *)(uVar33 + uVar44 + 8);
        puVar9[2] = uVar44 + 10;
        uVar41 = *(uint *)(uVar33 + uVar44 + 10);
        puVar9[2] = uVar44 + 0xe;
        uVar60 = *(uint *)(uVar33 + uVar44 + 0xe);
        puVar9[2] = uVar44 + 0x12;
        uVar55 = uVar55 ^ (uVar46 | uVar38 ^ uVar71 | uVar32);
        piVar47 = (int *)(uVar33 + uVar44 + 0x12);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar44 + 0x1a;
        uVar71 = *(uint *)(uVar33 + uVar44 + 0x1a);
        puVar9[2] = uVar44 + 0x1e;
        uVar46 = *(uint *)(uVar33 + uVar44 + 0x1e);
        puVar9[2] = uVar44 + 0x22;
        FUN_000264a4(uVar55 ^ uVar41,uVar53);
        FUN_000264a4(uVar55 ^ uVar46,uVar53);
        *(undefined2 *)(uVar33 + extraout_r1_x00470) = *(undefined2 *)(uVar33 + extraout_r1_x00469);
        FUN_000264a4(uVar55 ^ uVar34,uVar53);
        FUN_000264a4(uVar55 ^ uVar71,uVar53);
        uVar46 = 0x84222325;
        uVar71 = 0xcbf29ce4;
        if (iVar48 != 0) {
          iVar16 = 0;
          do {
            uVar88 = (ulonglong)uVar46;
            iVar48 = iVar48 + -1;
            iVar28 = uVar46 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00471 + iVar16);
            iVar16 = iVar16 + 1;
            uVar38 = (uint)*pcVar15;
            uVar46 = (uint)(uVar88 * 0x1b3) ^ uVar38;
            uVar71 = uVar71 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar38 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar34 = *(uint *)(*puVar9 + extraout_r1_x00472);
        uVar38 = (uVar46 | uVar34) * 2;
        bVar82 = uVar38 - (uVar46 + uVar34) == iVar37 &&
                 ((uVar71 | (int)uVar34 >> 0x1f) << 1 | (uVar46 | uVar34) >> 0x1f) -
                 (uVar71 + ((int)uVar34 >> 0x1f) + (uint)CARRY4(uVar46,uVar34) +
                 (uint)(uVar38 < uVar46 + uVar34)) == iVar62;
        goto LAB_00072fd0;
      case 0x13:
        uVar50 = *local_118;
        uVar53 = local_118[1];
        uVar36 = local_118[2];
        FUN_000264a4(~(*(uint *)(uVar50 + (local_114 | 8) * 2 + (local_114 & 8) +
                                 (~local_114 & 0xfffffff7) + 1) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar50 + (~uVar46 & 0xfffffff3) * -3 + ~(uVar46 & 0xc) +
                                (uVar46 << 1 ^ 0xffffffe6)) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar50 + (uVar46 << 1 | 9) + (uVar46 ^ 0xfffffffb)) ^ uVar53),
                     uVar53);
        FUN_000264a4(~(*(uint *)(uVar50 + (uVar46 ^ 4) + (uVar46 << 1 | 0xfffffff6) + 10) ^ uVar53),
                     uVar53);
        uVar61 = *(uint *)(uVar50 + extraout_r1_x00649);
        uVar32 = *(uint *)(uVar50 + extraout_r1_x00648);
        uVar60 = *(uint *)(uVar50 + extraout_r1_x00647);
        uVar71 = *(uint *)(uVar50 + extraout_r1_x00646);
        puVar22 = (uint *)(uVar50 + uVar46);
        FUN_000264a4(~(*puVar22 ^ uVar53),uVar53);
        uVar55 = puVar22[3];
        FUN_000264a4(~(puVar22[2] ^ uVar53),uVar53);
        FUN_000264a4(~(uVar55 ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar50 + ((uVar46 & 0xc) * 3 - (uVar46 | 0xc)) + (uVar46 ^ 0xc) * 2
                                ) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar50 + (uVar46 & 0x10) * 2 + (uVar46 ^ 0x10)) ^ uVar53),uVar53);
        uVar44 = *(uint *)(uVar50 + extraout_r1_x00652);
        uVar55 = *(uint *)(uVar50 + extraout_r1_x00654);
        uVar39 = *(uint *)(uVar50 + extraout_r1_x00650);
        local_134 = *(uint *)(uVar50 + uVar36);
        uVar33 = *(uint *)(uVar50 + extraout_r1_x00653);
        uVar35 = *(uint *)(uVar50 + extraout_r1_x00651);
        puVar9[2] = uVar36 + 4;
        uVar46 = *(uint *)(uVar50 + uVar36 + 4);
        puVar9[2] = uVar36 + 8;
        uVar57 = *(uint *)(uVar50 + uVar36 + 8);
        puVar9[2] = uVar36 + 0xc;
        uVar38 = *(uint *)(uVar50 + uVar36 + 0xc);
        puVar9[2] = uVar36 + 0x10;
        uVar34 = *(uint *)(uVar50 + uVar36 + 0x10);
        puVar9[2] = uVar36 + 0x14;
        uVar67 = *(uint *)(uVar50 + uVar36 + 0x14);
        puVar9[2] = uVar36 + 0x18;
        local_170 = *(uint *)(uVar50 + uVar36 + 0x18);
        puVar9[2] = uVar36 + 0x1c;
        sVar12 = *(short *)(uVar50 + uVar36 + 0x1c);
        iVar48 = (int)sVar12;
        puVar9[2] = uVar36 + 0x1e;
        piVar47 = (int *)(uVar50 + uVar36 + 0x1e);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar36 + 0x26;
        uVar41 = *(uint *)(uVar50 + uVar36 + 0x26);
        puVar9[2] = uVar36 + 0x2a;
        uVar71 = (uVar71 - (uVar71 ^ uVar39)) + (uVar39 & ~uVar71);
        uVar44 = uVar71 & ~uVar35 | uVar35 & ~uVar71 | uVar44;
        uVar32 = uVar32 | (uVar60 - uVar44) + (uVar44 & ~uVar60) * 2;
        uVar61 = uVar32 & ~uVar61 | uVar61 & ~uVar32;
        uVar55 = uVar61 + uVar33 + ~(uVar33 & uVar61) + 1 | uVar55;
        FUN_000264a4(uVar55 ^ uVar57,uVar53);
        FUN_000264a4(uVar55 ^ uVar67,uVar53);
        uVar11 = CONCAT11(*(undefined1 *)(uVar50 + extraout_r1_x00656),
                          *(undefined1 *)(uVar50 + extraout_r1_x00655));
        FUN_000264a4(uVar55 ^ uVar46,uVar53);
        FUN_000264a4(uVar55 ^ uVar38,uVar53);
        FUN_000264a4(uVar55 ^ uVar34,uVar53);
        FUN_000264a4(uVar55 ^ uVar41,uVar53);
        switch(uVar11) {
        case 0x401:
          fVar30 = *(float *)(uVar50 + extraout_r1_x00658);
          uVar61 = in_fpscr & 0xfffffff;
          if (NAN(fVar30)) {
LAB_000731c8:
            in_fpscr = in_fpscr & 0xfffffff;
            *(undefined1 *)(uVar50 + extraout_r1_x00657) = 0;
          }
          else {
            uVar10 = 0x80;
            in_fpscr = uVar61 | (uint)(fVar30 < DAT_00071d30) << 0x1f;
            if (!SUB41(in_fpscr >> 0x1f,0)) {
              uVar10 = 0x7f;
              uVar61 = uVar61 | (uint)(fVar30 < DAT_00071d34) << 0x1f |
                       (uint)(fVar30 == DAT_00071d34) << 0x1e;
              in_fpscr = uVar61 | (uint)(NAN(fVar30) || NAN(DAT_00071d34)) << 0x1c;
              bVar3 = (byte)(uVar61 >> 0x18);
              if ((bool)(bVar3 >> 6 & 1) || bVar3 >> 7 != ((byte)(in_fpscr >> 0x1c) & 1)) {
                uVar10 = (undefined1)(int)fVar30;
              }
            }
LAB_00071a8c:
            *(undefined1 *)(uVar50 + extraout_r1_x00657) = uVar10;
          }
          break;
        case 0x402:
          fVar30 = *(float *)(uVar50 + extraout_r1_x00658);
          uVar61 = in_fpscr & 0xfffffff;
          if (NAN(fVar30)) {
LAB_000731f8:
            in_fpscr = in_fpscr & 0xfffffff;
            uVar11 = 0;
          }
          else {
            uVar11 = 0x8000;
            in_fpscr = uVar61 | (uint)(fVar30 < DAT_00072bac) << 0x1f;
            if (!SUB41(in_fpscr >> 0x1f,0)) {
              uVar11 = 0x7fff;
              uVar61 = uVar61 | (uint)(fVar30 < DAT_00072bb0) << 0x1f |
                       (uint)(fVar30 == DAT_00072bb0) << 0x1e;
              in_fpscr = uVar61 | (uint)(NAN(fVar30) || NAN(DAT_00072bb0)) << 0x1c;
              bVar3 = (byte)(uVar61 >> 0x18);
              if ((bool)(bVar3 >> 6 & 1) || bVar3 >> 7 != ((byte)(in_fpscr >> 0x1c) & 1)) {
                uVar11 = (undefined2)(int)fVar30;
              }
            }
          }
LAB_000729a8:
          *(undefined2 *)(uVar50 + extraout_r1_x00657) = uVar11;
          break;
        case 0x403:
        case 0x405:
        case 0x406:
        case 0x407:
          break;
        case 0x404:
          fVar30 = *(float *)(uVar50 + extraout_r1_x00658);
          uVar61 = in_fpscr & 0xfffffff;
          if (NAN(fVar30)) {
LAB_000731e8:
            in_fpscr = in_fpscr & 0xfffffff;
            *(undefined4 *)(uVar50 + extraout_r1_x00657) = 0;
          }
          else {
            iVar16 = -0x80000000;
            in_fpscr = uVar61 | (uint)(fVar30 < DAT_00072b68) << 0x1f;
            if (!SUB41(in_fpscr >> 0x1f,0)) {
              iVar16 = 0x7fffffff;
              uVar61 = uVar61 | (uint)(fVar30 < DAT_00072b6c) << 0x1f |
                       (uint)(fVar30 == DAT_00072b6c) << 0x1e;
              in_fpscr = uVar61 | (uint)(NAN(fVar30) || NAN(DAT_00072b6c)) << 0x1c;
              bVar3 = (byte)(uVar61 >> 0x18);
              if ((bool)(bVar3 >> 6 & 1) || bVar3 >> 7 != ((byte)(in_fpscr >> 0x1c) & 1)) {
                iVar16 = (int)fVar30;
              }
            }
LAB_00072958:
            *(int *)(uVar50 + extraout_r1_x00657) = iVar16;
          }
          break;
        case 0x408:
          fVar30 = *(float *)(uVar50 + extraout_r1_x00658);
          uVar61 = in_fpscr & 0xfffffff;
          if (NAN(fVar30)) {
LAB_000731d8:
            in_fpscr = in_fpscr & 0xfffffff;
            uVar86 = 0;
          }
          else {
            in_fpscr = uVar61 | (uint)(fVar30 < DAT_000729b4) << 0x1f;
            if (SUB41(in_fpscr >> 0x1f,0)) {
LAB_00072904:
              uVar86 = 0x8000000000000000;
            }
            else {
              uVar61 = uVar61 | (uint)(fVar30 < DAT_000729b8) << 0x1f |
                       (uint)(fVar30 == DAT_000729b8) << 0x1e;
              in_fpscr = uVar61 | (uint)(NAN(fVar30) || NAN(DAT_000729b8)) << 0x1c;
              bVar3 = (byte)(uVar61 >> 0x18);
              if ((bool)(bVar3 >> 6 & 1) || bVar3 >> 7 != ((byte)(in_fpscr >> 0x1c) & 1)) {
                uVar86 = FUN_0002674c();
              }
              else {
LAB_00073030:
                uVar86 = 0x7fffffffffffffff;
              }
            }
          }
LAB_00073050:
          *(undefined8 *)(uVar50 + extraout_r1_x00657) = uVar86;
          break;
        default:
          switch(uVar11) {
          case 0x801:
            dVar84 = *(double *)(uVar50 + extraout_r1_x00658);
            uVar61 = in_fpscr & 0xfffffff;
            if (!NAN(dVar84)) {
              uVar10 = 0x80;
              in_fpscr = uVar61 | (uint)(dVar84 < DAT_0006c9e8) << 0x1f;
              if (!SUB41(in_fpscr >> 0x1f,0)) {
                uVar10 = 0x7f;
                uVar61 = uVar61 | (uint)(dVar84 < DAT_0006c9f0) << 0x1f |
                         (uint)(dVar84 == DAT_0006c9f0) << 0x1e;
                in_fpscr = uVar61 | (uint)(NAN(dVar84) || NAN(DAT_0006c9f0)) << 0x1c;
                bVar3 = (byte)(uVar61 >> 0x18);
                if ((bool)(bVar3 >> 6 & 1) || bVar3 >> 7 != ((byte)(in_fpscr >> 0x1c) & 1)) {
                  uVar10 = (undefined1)(longlong)dVar84;
                }
              }
              goto LAB_00071a8c;
            }
            goto LAB_000731c8;
          case 0x802:
            dVar84 = *(double *)(uVar50 + extraout_r1_x00658);
            uVar61 = in_fpscr & 0xfffffff;
            if (NAN(dVar84)) goto LAB_000731f8;
            uVar11 = 0x8000;
            in_fpscr = uVar61 | (uint)(dVar84 < DAT_00072c78) << 0x1f;
            if (!SUB41(in_fpscr >> 0x1f,0)) {
              uVar11 = 0x7fff;
              uVar61 = uVar61 | (uint)(dVar84 < DAT_00072c80) << 0x1f |
                       (uint)(dVar84 == DAT_00072c80) << 0x1e;
              in_fpscr = uVar61 | (uint)(NAN(dVar84) || NAN(DAT_00072c80)) << 0x1c;
              bVar3 = (byte)(uVar61 >> 0x18);
              if ((bool)(bVar3 >> 6 & 1) || bVar3 >> 7 != ((byte)(in_fpscr >> 0x1c) & 1)) {
                uVar11 = (undefined2)(longlong)dVar84;
              }
            }
            goto LAB_000729a8;
          case 0x804:
            dVar84 = *(double *)(uVar50 + extraout_r1_x00658);
            uVar61 = in_fpscr & 0xfffffff;
            if (!NAN(dVar84)) {
              iVar16 = -0x80000000;
              in_fpscr = uVar61 | (uint)(dVar84 < DAT_00072c68) << 0x1f;
              if (!SUB41(in_fpscr >> 0x1f,0)) {
                iVar16 = 0x7fffffff;
                uVar61 = uVar61 | (uint)(dVar84 < DAT_00072c70) << 0x1f |
                         (uint)(dVar84 == DAT_00072c70) << 0x1e;
                in_fpscr = uVar61 | (uint)(NAN(dVar84) || NAN(DAT_00072c70)) << 0x1c;
                bVar3 = (byte)(uVar61 >> 0x18);
                if ((bool)(bVar3 >> 6 & 1) || bVar3 >> 7 != ((byte)(in_fpscr >> 0x1c) & 1)) {
                  iVar16 = (int)(longlong)dVar84;
                }
              }
              goto LAB_00072958;
            }
            goto LAB_000731e8;
          case 0x808:
            dVar84 = *(double *)(uVar50 + extraout_r1_x00658);
            uVar61 = in_fpscr & 0xfffffff;
            if (NAN(dVar84)) goto LAB_000731d8;
            in_fpscr = uVar61 | (uint)(dVar84 < DAT_00072c60) << 0x1f;
            if (SUB41(in_fpscr >> 0x1f,0)) goto LAB_00072904;
            uVar61 = uVar61 | (uint)(dVar84 < DAT_00073240) << 0x1f |
                     (uint)(dVar84 == DAT_00073240) << 0x1e;
            in_fpscr = uVar61 | (uint)(NAN(dVar84) || NAN(DAT_00073240)) << 0x1c;
            bVar3 = (byte)(uVar61 >> 0x18);
            if (!(bool)(bVar3 >> 6 & 1) && bVar3 >> 7 == ((byte)(in_fpscr >> 0x1c) & 1))
            goto LAB_00073030;
            uVar86 = FUN_000268d0(SUB84(dVar84,0),(int)((ulonglong)dVar84 >> 0x20));
            goto LAB_00073050;
          }
        }
        uVar46 = 0xcbf29ce4;
        uVar61 = 0x84222325;
        if (sVar12 != 0) {
          iVar16 = 0;
          do {
            uVar88 = (ulonglong)uVar61;
            iVar48 = iVar48 + -1;
            iVar28 = uVar61 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00660 + iVar16);
            iVar16 = iVar16 + 1;
            uVar60 = (uint)*pcVar15;
            uVar61 = (uint)(uVar88 * 0x1b3) ^ uVar60;
            uVar46 = uVar46 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar60 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar71 = *(uint *)(*puVar9 + extraout_r1_x00659);
        uVar60 = (uVar61 | uVar71) * 2;
        bVar82 = uVar60 - (uVar61 + uVar71) == iVar37 &&
                 ((uVar46 | (int)uVar71 >> 0x1f) << 1 | (uVar61 | uVar71) >> 0x1f) -
                 (uVar46 + ((int)uVar71 >> 0x1f) + (uint)CARRY4(uVar61,uVar71) +
                 (uint)(uVar60 < uVar61 + uVar71)) == iVar62;
        goto LAB_000730f0;
      case 0x15:
        uVar50 = *local_118;
        uVar53 = local_118[1];
        uVar39 = local_118[2];
        FUN_000264a4(~(*(uint *)(uVar50 + (local_114 << 1 | 0x19) + (local_114 ^ 0xfffffff3)) ^
                      uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar50 + (uVar46 & 0x10) * 2 + (uVar46 ^ 0x10) * 3 +
                                 (uVar46 << 1 ^ 0xffffffde) + 2) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar50 + (~uVar46 & 0xfffffff7) * -3 + (~uVar46 | 0xfffffff7) +
                                (uVar46 << 1 ^ 0xffffffee)) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar50 + (uVar46 | 4) * 2 + (uVar46 & 4) + (~uVar46 & 0xfffffffb) +
                                1) ^ uVar53),uVar53);
        uVar55 = *(uint *)(uVar50 + extraout_r1_x00399);
        uVar60 = *(uint *)(uVar50 + extraout_r1_x00398);
        uVar71 = *(uint *)(uVar50 + extraout_r1_x00397);
        uVar38 = *(uint *)(uVar50 + extraout_r1_x00396);
        FUN_000264a4(~(*(uint *)(uVar50 + (uVar46 & 8) * 2 + (uVar46 ^ 8)) ^ uVar53),uVar53);
        uVar61 = *(uint *)(uVar50 + uVar46);
        FUN_000264a4(~(((uint *)(uVar50 + uVar46))[4] ^ uVar53),uVar53);
        FUN_000264a4(~(uVar61 ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar50 + (uVar46 & 4) * 2 + (uVar46 ^ 4)) ^ uVar53),uVar53);
        uVar32 = *(uint *)(uVar50 + extraout_r1_x00403);
        uVar46 = *(uint *)(uVar50 + extraout_r1_x00402);
        uVar33 = *(uint *)(uVar50 + extraout_r1_x00401);
        uVar36 = *(uint *)(uVar50 + extraout_r1_x00400);
        uVar57 = *(uint *)(uVar50 + uVar39);
        puVar9[2] = uVar39 + 4;
        uVar34 = *(uint *)(uVar50 + uVar39 + 4);
        puVar9[2] = uVar39 + 8;
        piVar47 = (int *)(uVar50 + uVar39 + 8);
        iVar48 = *piVar47;
        iVar28 = piVar47[1];
        puVar9[2] = uVar39 + 0x10;
        uVar67 = *(uint *)(uVar50 + uVar39 + 0x10);
        puVar9[2] = uVar39 + 0x14;
        uVar35 = *(uint *)(uVar50 + uVar39 + 0x14);
        puVar9[2] = uVar39 + 0x18;
        uVar61 = *(uint *)(uVar50 + uVar39 + 0x18);
        puVar9[2] = uVar39 + 0x1c;
        uVar41 = *(uint *)(uVar50 + uVar39 + 0x1c);
        puVar9[2] = uVar39 + 0x20;
        uVar44 = *(uint *)(uVar50 + uVar39 + 0x20);
        puVar9[2] = uVar39 + 0x24;
        iVar16 = (int)*(short *)(uVar50 + uVar39 + 0x24);
        puVar9[2] = uVar39 + 0x26;
        uVar38 = (uVar38 + (~uVar36 ^ uVar38)) - (uVar38 | ~uVar36);
        uVar38 = (uVar38 - (uVar38 ^ uVar33)) + (uVar33 & ~uVar38);
        uVar38 = uVar38 & ~uVar46 | uVar46 & ~uVar38;
        uVar60 = uVar60 ^ ((uVar71 | uVar38) - (uVar71 & ~uVar38)) + (uVar71 | ~uVar38) + 1 & uVar46
        ;
        uVar55 = uVar55 & (uVar60 & ~uVar32 | uVar32 & ~uVar60);
        uVar55 = uVar55 & ~uVar46 | uVar46 & ~uVar55;
        FUN_000264a4(uVar55 ^ uVar57,uVar53);
        FUN_000264a4(uVar55 ^ uVar35,uVar53);
        iVar62 = *(int *)(uVar50 + extraout_r1_x00405);
        iVar37 = *(int *)(uVar50 + extraout_r1_x00404);
        FUN_000264a4(uVar55 ^ uVar34,uVar53);
        *(uint *)(uVar50 + extraout_r1_x00406) = (uint)(iVar37 != 0 && iVar62 != 0);
        FUN_000264a4(uVar55 ^ uVar41,uVar53);
        FUN_000264a4(uVar55 ^ uVar44,uVar53);
        uVar46 = 0x84222325;
        uVar60 = 0xcbf29ce4;
        if (iVar16 != 0) {
          iVar37 = 0;
          do {
            uVar88 = (ulonglong)uVar46;
            iVar16 = iVar16 + -1;
            iVar62 = uVar46 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00408 + iVar37);
            iVar37 = iVar37 + 1;
            uVar71 = (uint)*pcVar15;
            uVar46 = (uint)(uVar88 * 0x1b3) ^ uVar71;
            uVar60 = uVar60 * 0x1b3 + iVar62 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar71 >> 0x1f;
          } while (iVar16 != 0);
        }
        uVar38 = *(uint *)(*puVar9 + extraout_r1_x00407);
        uVar71 = (uVar46 | uVar38) * 2;
        if (uVar71 - (uVar46 + uVar38) == iVar48 &&
            ((uVar60 | (int)uVar38 >> 0x1f) << 1 | (uVar46 | uVar38) >> 0x1f) -
            (uVar60 + ((int)uVar38 >> 0x1f) + (uint)CARRY4(uVar46,uVar38) +
            (uint)(uVar71 < uVar46 + uVar38)) == iVar28) {
          uVar61 = uVar67;
        }
        uVar55 = uVar55 ^ uVar61;
        break;
      case 0x1b:
        uVar44 = *local_118;
        uVar53 = local_118[1];
        uVar32 = local_118[2];
        puVar22 = (uint *)(uVar44 + local_114);
        uVar61 = *puVar22;
        uVar71 = puVar22[1];
        uVar55 = puVar22[3];
        uVar46 = puVar22[4];
        FUN_000264a4(~(puVar22[2] ^ uVar53),uVar53);
        FUN_000264a4(~(uVar61 ^ uVar53),uVar53);
        uVar36 = *(uint *)(uVar44 + extraout_r1_x00638);
        FUN_000264a4(~(uVar55 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar46 ^ uVar53),uVar53);
        uVar55 = *(uint *)(uVar44 + extraout_r1_x00640);
        uVar60 = *(uint *)(uVar44 + extraout_r1_x00639);
        uVar33 = *(uint *)(uVar44 + extraout_r1_x00637);
        FUN_000264a4(~(uVar71 ^ uVar53),uVar53);
        uVar46 = *(uint *)(uVar44 + extraout_r1_x00641);
        iVar62 = *(int *)(uVar44 + uVar32);
        iVar37 = ((int *)(uVar44 + uVar32))[1];
        puVar9[2] = uVar32 + 8;
        uVar71 = *(uint *)(uVar44 + uVar32 + 8);
        puVar9[2] = uVar32 + 0xc;
        uVar38 = *(uint *)(uVar44 + uVar32 + 0xc);
        puVar9[2] = uVar32 + 0x10;
        uVar61 = *(uint *)(uVar44 + uVar32 + 0x10);
        puVar9[2] = uVar32 + 0x14;
        iVar48 = (int)*(short *)(uVar44 + uVar32 + 0x14);
        puVar9[2] = uVar32 + 0x16;
        uVar35 = *(uint *)(uVar44 + uVar32 + 0x16);
        puVar9[2] = uVar32 + 0x1a;
        uVar41 = *(uint *)(uVar44 + uVar32 + 0x1a);
        puVar9[2] = uVar32 + 0x1e;
        uVar34 = *(uint *)(uVar44 + uVar32 + 0x1e);
        puVar9[2] = uVar32 + 0x22;
        uVar44 = *(uint *)(uVar44 + uVar32 + 0x22);
        puVar9[2] = uVar32 + 0x26;
        uVar55 = uVar55 ^ uVar60 & (uVar36 ^ uVar33 & ~(uVar46 ^ uVar36));
        FUN_000264a4(uVar55 ^ uVar71,uVar53);
        uVar83 = FUN_000264a4(uVar55 ^ uVar35,uVar53);
        fmod((double)CONCAT44(extraout_s1,uVar83),(double)CONCAT44(extraout_s3,extraout_s2));
        FUN_000264a4(uVar55 ^ uVar44,uVar53);
        uVar46 = *puVar9;
        *(undefined4 *)(uVar46 + extraout_r1_x00643) = extraout_r0_00;
        ((undefined4 *)(uVar46 + extraout_r1_x00643))[1] = extraout_r1_x00642;
        FUN_000264a4(uVar55 ^ uVar38,uVar53);
        FUN_000264a4(uVar55 ^ uVar41,uVar53);
        uVar46 = 0x84222325;
        uVar60 = 0xcbf29ce4;
        if (iVar48 != 0) {
          iVar16 = 0;
          do {
            uVar88 = (ulonglong)uVar46;
            iVar48 = iVar48 + -1;
            iVar28 = uVar46 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00645 + iVar16);
            iVar16 = iVar16 + 1;
            uVar71 = (uint)*pcVar15;
            uVar46 = (uint)(uVar88 * 0x1b3) ^ uVar71;
            uVar60 = uVar60 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar71 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar38 = *(uint *)(*puVar9 + extraout_r1_x00644);
        uVar71 = (uVar46 | uVar38) * 2;
        bVar82 = uVar71 - (uVar46 + uVar38) == iVar62 &&
                 ((uVar60 | (int)uVar38 >> 0x1f) << 1 | (uVar46 | uVar38) >> 0x1f) -
                 (uVar60 + ((int)uVar38 >> 0x1f) + (uint)CARRY4(uVar46,uVar38) +
                 (uint)(uVar71 < uVar46 + uVar38)) == iVar37;
        goto LAB_0006c604;
      case 0x1d:
        uVar50 = *local_118;
        uVar53 = local_118[1];
        uVar77 = local_118[2];
        puVar22 = (uint *)(uVar50 + local_114);
        FUN_000264a4(~(*puVar22 ^ uVar53),uVar53);
        uVar61 = puVar22[4];
        uVar60 = puVar22[2];
        uVar55 = puVar22[3];
        FUN_000264a4(~(puVar22[1] ^ uVar53),uVar53);
        FUN_000264a4(~(uVar55 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar60 ^ uVar53),uVar53);
        uVar55 = *(uint *)(uVar50 + extraout_r1_x00298);
        uVar60 = *(uint *)(uVar50 + extraout_r1_x00297);
        uVar71 = *(uint *)(uVar50 + extraout_r1_x00296);
        uVar38 = *(uint *)(uVar50 + extraout_r1_x00295);
        FUN_000264a4(~(uVar61 ^ uVar53),uVar53);
        uVar34 = *(uint *)(uVar50 + extraout_r1_x00299);
        uVar41 = *(uint *)(uVar50 + uVar77);
        puVar9[2] = uVar77 + 4;
        uVar44 = *(uint *)(uVar50 + uVar77 + 4);
        puVar9[2] = uVar77 + 8;
        uVar32 = *(uint *)(uVar50 + uVar77 + 8);
        puVar9[2] = uVar77 + 0xc;
        piVar47 = (int *)(uVar50 + uVar77 + 0xc);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar77 + 0x14;
        uVar33 = *(uint *)(uVar50 + uVar77 + 0x14);
        puVar9[2] = uVar77 + 0x18;
        uVar35 = *(uint *)(uVar50 + uVar77 + 0x18);
        puVar9[2] = uVar77 + 0x1c;
        uVar61 = *(uint *)(uVar50 + uVar77 + 0x1c);
        puVar9[2] = uVar77 + 0x20;
        puVar22 = (uint *)(uVar50 + uVar77 + 0x20);
        uVar36 = *puVar22;
        uVar67 = puVar22[1];
        puVar9[2] = uVar77 + 0x28;
        uVar39 = *(uint *)(uVar50 + uVar77 + 0x28);
        puVar9[2] = uVar77 + 0x2c;
        uVar50 = *(uint *)(uVar50 + uVar77 + 0x2c);
        uVar65 = *puVar9;
        puVar9[2] = uVar77 + 0x30;
        uVar57 = *(uint *)(uVar65 + uVar77 + 0x30);
        puVar9[2] = uVar77 + 0x34;
        sVar12 = *(short *)(uVar65 + uVar77 + 0x34);
        iVar16 = (int)sVar12;
        puVar9[2] = uVar77 + 0x36;
        sVar6 = *(short *)(uVar65 + uVar77 + 0x36);
        iVar28 = (int)sVar6;
        puVar9[2] = uVar77 + 0x38;
        uVar51 = uVar46 | 0x10;
        uVar20 = *puVar9;
        uVar49 = puVar9[1];
        FUN_000264a4(~(*(uint *)(uVar65 + uVar51 + (uVar46 | 0xffffffef) + 0x11) ^ uVar49),uVar49);
        uVar80 = uVar46 & 0x10;
        FUN_000264a4(~(*(uint *)(uVar65 + uVar51 * 2 + uVar80 + (~uVar46 & 0xffffffef) + 1) ^ uVar49
                      ),uVar49);
        uVar77 = *(uint *)(uVar65 + extraout_r1_x00301);
        uVar81 = *(uint *)(uVar65 + extraout_r1_x00300);
        FUN_000264a4(~(*(uint *)(uVar65 + ((uVar80 | uVar80 << 1) - uVar51) + (uVar46 ^ 0x10) * 2) ^
                      uVar49),uVar49);
        uVar79 = *(uint *)(uVar65 + extraout_r1_x00302);
        FUN_000264a4(~(*(uint *)(uVar65 + (~uVar46 & 0xffffffef) * -3 + ~uVar80 +
                                (uVar46 << 1 ^ 0xffffffde)) ^ uVar49),uVar49);
        uVar80 = *(uint *)(uVar65 + extraout_r1_x00303);
        FUN_000264a4(~(*(uint *)(uVar65 + uVar51 + uVar46 + (~uVar46 | 0x10) + 1) ^ uVar49),uVar49);
        uVar51 = *(uint *)(uVar65 + extraout_r1_x00304);
        FUN_000264a4(~(*(uint *)(uVar65 + (uVar46 & 8) * 2 + (uVar46 ^ 8) * 3 +
                                 (uVar46 << 1 ^ 0xffffffee) + 2) ^ uVar49),uVar49);
        uVar65 = *(uint *)(uVar20 + extraout_r1_x00305);
        FUN_000264a4(~(*(uint *)(uVar20 + (~uVar46 & 0xfffffff3) * -3 + (~uVar46 | 0xfffffff3) +
                                (uVar46 << 1 ^ 0xffffffe6)) ^ uVar49),uVar49);
        uVar72 = *(uint *)(uVar20 + extraout_r1_x00306);
        FUN_000264a4(~(*(uint *)(uVar20 + uVar46) ^ uVar49),uVar49);
        uVar75 = *(uint *)(uVar20 + extraout_r1_x00307);
        FUN_000264a4(~(*(uint *)(uVar20 + (uVar46 | 4) * 2 + (uVar46 ^ 0xfffffffb) + 1) ^ uVar49),
                     uVar49);
        uVar78 = *(uint *)(uVar20 + extraout_r1_x00308);
        FUN_000264a4(~(*(uint *)(uVar20 + (uVar46 & 0xc) * 2 + (uVar46 ^ 0xc)) ^ uVar49),uVar49);
        uVar46 = *(uint *)(uVar20 + extraout_r1_x00309);
        uVar55 = uVar60 & ~(uVar71 ^ (uVar34 | uVar38)) & uVar55;
        FUN_000264a4(uVar55 ^ uVar39,uVar53);
        iVar70 = *(int *)(uVar20 + extraout_r1_x00310);
        iVar48 = ((int *)(uVar20 + extraout_r1_x00310))[1];
        FUN_000264a4(uVar55 ^ uVar41,uVar53);
        FUN_000264a4(uVar55 ^ uVar44,uVar53);
        FUN_000264a4(uVar55 ^ uVar32,uVar53);
        FUN_000264a4(uVar55 ^ uVar35,uVar53);
        FUN_000264a4(uVar55 ^ uVar50,uVar53);
        puVar22 = (uint *)(uVar20 + extraout_r1_x00315);
        if (iVar70 == 0 && iVar48 == -0x80000000) {
          puVar22 = (uint *)(*puVar22 & puVar22[1]);
        }
        if ((iVar70 == 0 && iVar48 == -0x80000000) && puVar22 == (uint *)0xffffffff) {
          uVar86 = 0x8000000000000000;
        }
        else {
          uVar86 = FUN_00026020(iVar70,iVar48);
        }
        uVar71 = 0x84222325;
        *(undefined8 *)(uVar20 + extraout_r1_x00312) = uVar86;
        uVar60 = 0xcbf29ce4;
        uVar38 = *puVar9;
        if (sVar12 != 0) {
          iVar48 = 0;
          uVar60 = 0xcbf29ce4;
          do {
            uVar88 = (ulonglong)uVar71;
            iVar16 = iVar16 + -1;
            iVar70 = uVar71 * 0x100;
            pcVar15 = (char *)(uVar38 + extraout_r1_x00314 + iVar48);
            iVar48 = iVar48 + 1;
            uVar34 = (uint)*pcVar15;
            uVar71 = (uint)(uVar88 * 0x1b3) ^ uVar34;
            uVar60 = uVar60 * 0x1b3 + iVar70 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar34 >> 0x1f;
          } while (iVar16 != 0);
        }
        uVar34 = uVar77 + (uVar81 | ~uVar77) + 1;
        uVar34 = (uVar34 - uVar79) + (uVar79 & ~uVar34) * 2;
        uVar51 = (uVar80 + ~(uVar34 & uVar80)) - (uVar80 | ~uVar34) & uVar51;
        uVar72 = uVar72 | uVar65 & ~uVar51 | uVar51 & ~uVar65;
        iVar48 = (uVar72 & uVar75) + (uVar72 | uVar75) * -2 + (uVar72 ^ uVar75);
        uVar34 = -iVar48;
        uVar34 = ((uVar78 | iVar48 - 1U) + (uVar34 & ~uVar78) * 2) - (uVar34 | ~uVar78);
        uVar34 = ~uVar34 + (uVar75 | uVar34) * 2 + (uVar34 | ~uVar75) + 2;
        uVar41 = uVar46 & ~uVar34 | uVar34 & ~uVar46;
        uVar44 = uVar41 | (int)uVar41 >> 0x1f;
        uVar34 = *(uint *)(uVar38 + extraout_r1_x00311);
        uVar46 = (int)uVar34 >> 0x1f;
        if ((uVar41 & ~(uVar71 ^ uVar34) | (uVar71 ^ uVar34) & ~uVar41) != uVar36 ||
            (uVar44 & ~(uVar60 ^ uVar46) | (uVar60 ^ uVar46) & ~uVar44) != uVar67) {
          uVar61 = 0x84222325;
          uVar60 = 0xcbf29ce4;
          if (sVar6 != 0) {
            iVar48 = 0;
            do {
              uVar88 = (ulonglong)uVar61;
              iVar28 = iVar28 + -1;
              iVar16 = uVar61 * 0x100;
              pcVar15 = (char *)(uVar38 + extraout_r1_x00313 + iVar48);
              iVar48 = iVar48 + 1;
              uVar71 = (uint)*pcVar15;
              uVar61 = (uint)(uVar88 * 0x1b3) ^ uVar71;
              uVar60 = uVar60 * 0x1b3 + iVar16 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar71 >> 0x1f
              ;
            } while (iVar28 != 0);
          }
          uVar71 = (uVar34 & ~uVar61) * 2;
          uVar38 = (uVar61 - uVar34) + uVar71;
          uVar60 = (uVar60 - (uVar46 + (uVar61 < uVar34))) +
                   ((~uVar60 & uVar46) << 1 | (uVar34 & ~uVar61) >> 0x1f) +
                   (uint)CARRY4(uVar61 - uVar34,uVar71);
          uVar46 = (uVar41 & ~uVar38) * 2;
          uVar61 = uVar57;
          if ((uVar38 - uVar41) + uVar46 == iVar37 &&
              (uVar60 - (uVar44 + (uVar38 < uVar41))) +
              ((uVar44 & ~uVar60) << 1 | (uVar41 & ~uVar38) >> 0x1f) +
              (uint)CARRY4(uVar38 - uVar41,uVar46) == iVar62) {
            uVar61 = uVar33;
          }
        }
        uVar55 = uVar55 ^ uVar61;
        break;
      case 0x1e:
        uVar41 = *local_118;
        uVar53 = local_118[1];
        uVar34 = local_118[2];
        puVar22 = (uint *)(uVar41 + local_114);
        uVar71 = *puVar22;
        uVar61 = puVar22[2];
        uVar55 = puVar22[1];
        uVar60 = puVar22[4];
        FUN_000264a4(~(puVar22[3] ^ uVar53),uVar53);
        FUN_000264a4(~(uVar60 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar55 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar71 ^ uVar53),uVar53);
        uVar38 = *(uint *)(uVar41 + extraout_r1_x00384);
        FUN_000264a4(~(uVar61 ^ uVar53),uVar53);
        uVar55 = *(uint *)(uVar41 + extraout_r1_x00385);
        uVar61 = *(uint *)(uVar41 + extraout_r1_x00383);
        uVar60 = *(uint *)(uVar41 + extraout_r1_x00381);
        uVar71 = *(uint *)(uVar41 + extraout_r1_x00382);
        iVar48 = (int)*(short *)(uVar41 + uVar34);
        puVar9[2] = uVar34 + 2;
        piVar47 = (int *)(uVar41 + uVar34 + 2);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar34 + 10;
        sVar12 = *(short *)(uVar41 + uVar34 + 10);
        uVar55 = uVar55 & (uVar60 ^ uVar38 & (uVar61 ^ (uVar71 | uVar60)));
        puVar9[2] = uVar34 + 0xc;
        uVar60 = *(uint *)(uVar41 + uVar34 + 0xc);
        puVar9[2] = uVar34 + 0x10;
        uVar71 = *(uint *)(uVar41 + uVar34 + 0x10);
        puVar9[2] = uVar34 + 0x14;
        uVar38 = *(uint *)(uVar41 + uVar34 + 0x14);
        puVar9[2] = uVar34 + 0x18;
        uVar39 = *(uint *)(uVar41 + uVar34 + 0x18);
        puVar9[2] = uVar34 + 0x1c;
        uVar44 = *(uint *)(uVar41 + uVar34 + 0x1c);
        puVar9[2] = uVar34 + 0x20;
        uVar61 = *(uint *)(uVar41 + uVar34 + 0x20);
        puVar9[2] = uVar34 + 0x24;
        uVar32 = *(uint *)(uVar41 + uVar34 + 0x24);
        puVar9[2] = uVar34 + 0x28;
        puVar22 = (uint *)(uVar41 + uVar34 + 0x28);
        uVar33 = *puVar22;
        uVar35 = puVar22[1];
        uVar67 = *puVar9;
        puVar9[2] = uVar34 + 0x30;
        uVar36 = *(uint *)(uVar67 + uVar34 + 0x30);
        puVar9[2] = uVar34 + 0x34;
        FUN_000264a4(uVar55 ^ uVar38,uVar53);
        FUN_000264a4(uVar55 ^ uVar39,uVar53);
        uVar83 = *(undefined4 *)(uVar67 + extraout_r1_x00387);
        uVar41 = puVar9[1];
        puVar22 = (uint *)(uVar67 + uVar46);
        FUN_000264a4(~(*puVar22 ^ uVar41),uVar41);
        uVar46 = *(uint *)(uVar67 + extraout_r1_x00388);
        uVar38 = puVar22[3];
        uVar34 = puVar22[4];
        uVar39 = puVar22[2];
        FUN_000264a4(~(puVar22[1] ^ uVar41),uVar41);
        FUN_000264a4(~(uVar39 ^ uVar41),uVar41);
        FUN_000264a4(~(uVar38 ^ uVar41),uVar41);
        FUN_000264a4(~(uVar34 ^ uVar41),uVar41);
        uVar38 = *(uint *)(uVar67 + extraout_r1_x00392);
        uVar34 = *(uint *)(uVar67 + extraout_r1_x00391);
        uVar41 = *(uint *)(uVar67 + extraout_r1_x00390);
        uVar39 = *(uint *)(uVar67 + extraout_r1_x00389);
        *(undefined4 *)(uVar67 + extraout_r1_x00386) = uVar83;
        FUN_000264a4(uVar55 ^ uVar71,uVar53);
        FUN_000264a4(uVar55 ^ uVar44,uVar53);
        FUN_000264a4(uVar55 ^ uVar32,uVar53);
        uVar32 = *puVar9;
        uVar44 = 0x84222325;
        uVar71 = 0xcbf29ce4;
        if (iVar48 != 0) {
          iVar16 = 0;
          do {
            uVar88 = (ulonglong)uVar44;
            iVar48 = iVar48 + -1;
            iVar28 = uVar44 * 0x100;
            pcVar15 = (char *)(uVar32 + extraout_r1_x00395 + iVar16);
            iVar16 = iVar16 + 1;
            uVar67 = (uint)*pcVar15;
            uVar44 = (uint)(uVar88 * 0x1b3) ^ uVar67;
            uVar71 = uVar71 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar67 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar67 = *(uint *)(uVar32 + extraout_r1_x00393);
        uVar38 = uVar38 & (uVar34 ^ (uVar41 | uVar39 | uVar46));
        uVar34 = uVar38 | (int)uVar38 >> 0x1f;
        uVar46 = (int)uVar67 >> 0x1f;
        if ((uVar38 & ~(uVar44 ^ uVar67) | (uVar44 ^ uVar67) & ~uVar38) != uVar33 ||
            (uVar34 & ~(uVar71 ^ uVar46) | (uVar71 ^ uVar46) & ~uVar34) != uVar35) {
          uVar71 = 0x84222325;
          uVar61 = 0xcbf29ce4;
          if (sVar12 != 0) {
            iVar16 = (int)sVar12;
            iVar48 = 0;
            do {
              uVar88 = (ulonglong)uVar71;
              iVar16 = iVar16 + -1;
              iVar28 = uVar71 * 0x100;
              pcVar15 = (char *)(uVar32 + extraout_r1_x00394 + iVar48);
              iVar48 = iVar48 + 1;
              uVar41 = (uint)*pcVar15;
              uVar71 = (uint)(uVar88 * 0x1b3) ^ uVar41;
              uVar61 = uVar61 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar41 >> 0x1f
              ;
            } while (iVar16 != 0);
          }
          uVar41 = (uVar67 & ~uVar71) * 2;
          uVar44 = (uVar71 - uVar67) + uVar41;
          uVar71 = (uVar61 - (uVar46 + (uVar71 < uVar67))) +
                   ((~uVar61 & uVar46) << 1 | (uVar67 & ~uVar71) >> 0x1f) +
                   (uint)CARRY4(uVar71 - uVar67,uVar41);
          uVar46 = (uVar38 & ~uVar44) * 2;
          uVar61 = uVar36;
          if ((uVar44 - uVar38) + uVar46 == iVar37 &&
              (uVar71 - (uVar34 + (uVar44 < uVar38))) +
              ((uVar34 & ~uVar71) << 1 | (uVar38 & ~uVar44) >> 0x1f) +
              (uint)CARRY4(uVar44 - uVar38,uVar46) == iVar62) {
            uVar61 = uVar60;
          }
        }
        uVar55 = uVar55 ^ uVar61;
        break;
      case 0x1f:
        uVar33 = *local_118;
        uVar53 = local_118[1];
        uVar32 = local_118[2];
        puVar22 = (uint *)(uVar33 + local_114);
        uVar46 = *puVar22;
        uVar55 = puVar22[2];
        uVar60 = puVar22[3];
        uVar61 = puVar22[4];
        FUN_000264a4(~(puVar22[1] ^ uVar53),uVar53);
        FUN_000264a4(~(uVar46 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar60 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar55 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar61 ^ uVar53),uVar53);
        uVar35 = *(uint *)(uVar33 + extraout_r1_x00604);
        uVar55 = *(uint *)(uVar33 + extraout_r1_x00605);
        uVar34 = *(uint *)(uVar33 + extraout_r1_x00601);
        uVar60 = *(uint *)(uVar33 + uVar32);
        uVar46 = *(uint *)(uVar33 + extraout_r1_x00603);
        uVar71 = *(uint *)(uVar33 + extraout_r1_x00602);
        puVar9[2] = uVar32 + 4;
        uVar61 = *(uint *)(uVar33 + uVar32 + 4);
        puVar9[2] = uVar32 + 8;
        uVar38 = *(uint *)(uVar33 + uVar32 + 8);
        puVar9[2] = uVar32 + 0xc;
        uVar41 = *(uint *)(uVar33 + uVar32 + 0xc);
        puVar9[2] = uVar32 + 0x10;
        piVar47 = (int *)(uVar33 + uVar32 + 0x10);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar32 + 0x18;
        iVar48 = (int)*(short *)(uVar33 + uVar32 + 0x18);
        puVar9[2] = uVar32 + 0x1a;
        uVar44 = *(uint *)(uVar33 + uVar32 + 0x1a);
        puVar9[2] = uVar32 + 0x1e;
        uVar55 = uVar35 ^ (uVar71 | uVar34 | uVar46) ^ uVar55;
        FUN_000264a4(uVar55 ^ uVar61,uVar53);
        *(int *)(uVar33 + extraout_r1_x00606) = *(int *)(uVar33 + extraout_r1_x00606) + 1;
        FUN_000264a4(uVar55 ^ uVar38,uVar53);
        FUN_000264a4(uVar55 ^ uVar44,uVar53);
        uVar61 = 0x84222325;
        uVar46 = 0xcbf29ce4;
        if (iVar48 != 0) {
          iVar16 = 0;
          do {
            uVar88 = (ulonglong)uVar61;
            iVar48 = iVar48 + -1;
            iVar28 = uVar61 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00608 + iVar16);
            iVar16 = iVar16 + 1;
            uVar71 = (uint)*pcVar15;
            uVar61 = (uint)(uVar88 * 0x1b3) ^ uVar71;
            uVar46 = uVar46 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar71 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar38 = *(uint *)(*puVar9 + extraout_r1_x00607);
        uVar71 = (uVar61 | uVar38) * 2;
        bVar82 = uVar71 - (uVar61 + uVar38) == iVar37 &&
                 ((uVar46 | (int)uVar38 >> 0x1f) << 1 | (uVar61 | uVar38) >> 0x1f) -
                 (uVar46 + ((int)uVar38 >> 0x1f) + (uint)CARRY4(uVar61,uVar38) +
                 (uint)(uVar71 < uVar61 + uVar38)) == iVar62;
        goto LAB_0006bbd0;
      case 0x20:
        uVar81 = *local_118;
        uVar53 = local_118[1];
        uVar32 = local_118[2];
        FUN_000264a4(~(*(uint *)(uVar81 + (local_114 << 1 | 0x11) + (local_114 ^ 0xfffffff7)) ^
                      uVar53),uVar53);
        uVar41 = *(uint *)(uVar81 + extraout_r1_x00224);
        FUN_000264a4(~(*(uint *)(uVar81 + (uVar46 & 0xc) * 2 + (uVar46 ^ 0xc)) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar81 + (uVar46 & 8) * 2 + (uVar46 ^ 8)) ^ uVar53),uVar53);
        puVar22 = (uint *)(uVar81 + uVar46);
        FUN_000264a4(~(*puVar22 ^ uVar53),uVar53);
        FUN_000264a4(~(puVar22[4] ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar81 + ((uVar46 & 4 | (uVar46 & 4) << 1) - (uVar46 | 4)) +
                                (uVar46 ^ 4) * 2) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar81 + uVar46 * 2 + (uVar46 ^ 8) + (~uVar46 | 8) * 2 + 2) ^
                      uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar81 + ((uVar46 & 0x10 | (uVar46 & 0x10) << 1) - (uVar46 | 0x10))
                                + (uVar46 ^ 0x10) * 2) ^ uVar53),uVar53);
        uVar55 = *(uint *)(uVar81 + extraout_r1_x00231);
        uVar33 = *(uint *)(uVar81 + uVar32);
        uVar51 = *(uint *)(uVar81 + extraout_r1_x00230);
        uVar79 = *(uint *)(uVar81 + extraout_r1_x00229);
        uVar60 = *(uint *)(uVar81 + extraout_r1_x00227);
        uVar80 = *(uint *)(uVar81 + extraout_r1_x00228);
        uVar34 = *(uint *)(uVar81 + extraout_r1_x00226);
        uVar44 = *(uint *)(uVar81 + extraout_r1_x00225);
        puVar9[2] = uVar32 + 4;
        uVar35 = *(uint *)(uVar81 + uVar32 + 4);
        puVar9[2] = uVar32 + 8;
        sVar12 = *(short *)(uVar81 + uVar32 + 8);
        iVar28 = (int)sVar12;
        puVar9[2] = uVar32 + 10;
        piVar47 = (int *)(uVar81 + uVar32 + 10);
        iVar48 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar32 + 0x12;
        uVar36 = *(uint *)(uVar81 + uVar32 + 0x12);
        puVar9[2] = uVar32 + 0x16;
        uVar71 = *(uint *)(uVar81 + uVar32 + 0x16);
        puVar9[2] = uVar32 + 0x1a;
        uVar67 = *(uint *)(uVar81 + uVar32 + 0x1a);
        puVar9[2] = uVar32 + 0x1e;
        uVar39 = *(uint *)(uVar81 + uVar32 + 0x1e);
        puVar9[2] = uVar32 + 0x22;
        uVar50 = *(uint *)(uVar81 + uVar32 + 0x22);
        puVar9[2] = uVar32 + 0x26;
        sVar6 = *(short *)(uVar81 + uVar32 + 0x26);
        iVar16 = (int)sVar6;
        puVar9[2] = uVar32 + 0x28;
        uVar61 = *(uint *)(uVar81 + uVar32 + 0x28);
        puVar9[2] = uVar32 + 0x2c;
        uVar38 = *(uint *)(uVar81 + uVar32 + 0x2c);
        puVar9[2] = uVar32 + 0x30;
        puVar59 = (uint *)(uVar81 + uVar32 + 0x30);
        uVar57 = *puVar59;
        uVar77 = puVar59[1];
        puVar9[2] = uVar32 + 0x38;
        uVar34 = ((uVar34 & ~uVar44) * 2 - (uVar34 | ~uVar44)) + (uVar44 | ~uVar34);
        uVar41 = uVar41 | uVar80 + (uVar34 + (uVar60 | ~uVar34) + 1 | ~uVar80) + 1;
        uVar60 = uVar41 & uVar79;
        uVar60 = (uVar41 ^ uVar79) + ~uVar60 + uVar60 * 2 + 1;
        uVar60 = ((uVar51 & ~uVar60) * 2 - (uVar51 | ~uVar60)) + (uVar60 | ~uVar51);
        uVar34 = ~uVar55;
        uVar55 = ((uVar60 | uVar55) + uVar34) - (uVar60 | uVar34);
        FUN_000264a4(uVar55 ^ uVar38,uVar53);
        uVar44 = *puVar9;
        uVar41 = puVar9[1];
        uVar13 = *(ushort *)(uVar44 + extraout_r1_x00232);
        uVar60 = (uint)(short)uVar13;
        uVar38 = puVar22[3];
        FUN_000264a4(~(*puVar22 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar38 ^ uVar53),uVar53);
        iVar37 = uVar44 + uVar46;
        uVar46 = *(uint *)(iVar37 + 4);
        uVar38 = *(uint *)(iVar37 + 8);
        uVar34 = *(uint *)(iVar37 + 0x10);
        FUN_000264a4(~(*(uint *)(iVar37 + 0xc) ^ uVar41),uVar41);
        FUN_000264a4(~(uVar34 ^ uVar41),uVar41);
        FUN_000264a4(~(uVar46 ^ uVar41),uVar41);
        FUN_000264a4(~(uVar38 ^ uVar41),uVar41);
        uVar46 = *(uint *)(uVar44 + extraout_r1_x00238);
        uVar38 = *(uint *)(uVar44 + extraout_r1_x00237);
        uVar34 = *(uint *)(uVar44 + extraout_r1_x00236);
        uVar41 = *(uint *)(uVar44 + extraout_r1_x00235);
        uVar44 = *(uint *)(uVar81 + extraout_r1_x00234);
        uVar32 = *(uint *)(uVar81 + extraout_r1_x00233);
        puVar21 = (undefined8 *)FUN_000a0398(uVar60);
        __aeabi_memclr(puVar21,uVar60);
        FUN_000264a4(uVar55 ^ uVar33,uVar53);
        FUN_000264a4(uVar55 ^ uVar71,uVar53);
        FUN_000264a4(uVar55 ^ uVar67,uVar53);
        FUN_000264a4(uVar55 ^ uVar39,uVar53);
        FUN_000264a4(uVar55 ^ uVar50,uVar53);
        if (uVar13 != 0) {
          iVar37 = *puVar9 + extraout_r1_x00242;
          uVar33 = 0;
          uVar71 = extraout_r3;
          if (0xf < uVar13) {
            uVar71 = (int)puVar21 - iVar37;
          }
          if (0xf < uVar13 && 0xf < uVar71) {
            uVar33 = uVar60 & 0xfffffff0;
            iVar70 = 0;
            uVar71 = uVar33;
            puVar52 = puVar21;
            do {
              puVar45 = (undefined8 *)(iVar37 + iVar70);
              uVar71 = uVar71 - 0x10;
              uVar86 = puVar45[1];
              iVar70 = iVar70 + 0x10;
              *puVar52 = *puVar45;
              puVar52[1] = uVar86;
              puVar52 = puVar52 + 2;
            } while (uVar71 != 0);
            if (uVar33 != uVar60) goto LAB_00065648;
          }
          else {
LAB_00065648:
            iVar70 = uVar60 - uVar33;
            puVar18 = (undefined1 *)((int)puVar21 + uVar33);
            do {
              puVar1 = (undefined1 *)(iVar37 + uVar33);
              iVar70 = iVar70 + -1;
              uVar33 = uVar33 + 1;
              *puVar18 = *puVar1;
              puVar18 = puVar18 + 1;
            } while (iVar70 != 0);
          }
          uVar71 = *puVar9;
          uVar33 = 0;
          iVar37 = uVar71 + extraout_r1_x00239;
          if (0xf < uVar13) {
            uVar71 = iVar37 - (int)puVar21;
          }
          if (0xf < uVar13 && 0xf < uVar71) {
            uVar33 = uVar60 & 0xfffffff0;
            iVar70 = 0;
            uVar71 = uVar33;
            puVar52 = puVar21;
            do {
              puVar45 = (undefined8 *)(iVar37 + iVar70);
              uVar86 = *puVar52;
              uVar87 = puVar52[1];
              puVar52 = puVar52 + 2;
              uVar71 = uVar71 - 0x10;
              iVar70 = iVar70 + 0x10;
              *puVar45 = uVar86;
              puVar45[1] = uVar87;
            } while (uVar71 != 0);
            if (uVar33 == uVar60) goto LAB_0006569c;
          }
          iVar70 = uVar60 - uVar33;
          puVar18 = (undefined1 *)((int)puVar21 + uVar33);
          do {
            iVar70 = iVar70 + -1;
            *(undefined1 *)(iVar37 + uVar33) = *puVar18;
            uVar33 = uVar33 + 1;
            puVar18 = puVar18 + 1;
          } while (iVar70 != 0);
        }
LAB_0006569c:
        uVar33 = *puVar9;
        uVar60 = 0x84222325;
        uVar71 = 0xcbf29ce4;
        if (sVar12 != 0) {
          iVar37 = 0;
          do {
            uVar88 = (ulonglong)uVar60;
            iVar28 = iVar28 + -1;
            iVar70 = uVar60 * 0x100;
            pcVar15 = (char *)(uVar33 + extraout_r1_x00240 + iVar37);
            iVar37 = iVar37 + 1;
            uVar67 = (uint)*pcVar15;
            uVar60 = (uint)(uVar88 * 0x1b3) ^ uVar67;
            uVar71 = uVar71 * 0x1b3 + iVar70 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar67 >> 0x1f;
          } while (iVar28 != 0);
        }
        uVar67 = *(uint *)(uVar33 + extraout_r1_x00243);
        uVar46 = uVar46 ^ (uVar38 | uVar34 & (uVar41 | uVar44 ^ uVar32));
        uVar34 = uVar46 | (int)uVar46 >> 0x1f;
        uVar38 = (int)uVar67 >> 0x1f;
        if ((uVar46 & ~(uVar60 ^ uVar67) | (uVar60 ^ uVar67) & ~uVar46) != uVar57 ||
            (uVar34 & ~(uVar71 ^ uVar38) | (uVar71 ^ uVar38) & ~uVar34) != uVar77) {
          uVar60 = 0x84222325;
          uVar61 = 0xcbf29ce4;
          if (sVar6 != 0) {
            iVar37 = 0;
            do {
              uVar88 = (ulonglong)uVar60;
              iVar16 = iVar16 + -1;
              iVar28 = uVar60 * 0x100;
              pcVar15 = (char *)(uVar33 + extraout_r1_x00241 + iVar37);
              iVar37 = iVar37 + 1;
              uVar71 = (uint)*pcVar15;
              uVar60 = (uint)(uVar88 * 0x1b3) ^ uVar71;
              uVar61 = uVar61 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar71 >> 0x1f
              ;
            } while (iVar16 != 0);
          }
          uVar71 = (uVar67 & ~uVar60) * 2;
          uVar41 = (uVar60 - uVar67) + uVar71;
          uVar71 = (uVar61 - (uVar38 + (uVar60 < uVar67))) +
                   ((~uVar61 & uVar38) << 1 | (uVar67 & ~uVar60) >> 0x1f) +
                   (uint)CARRY4(uVar60 - uVar67,uVar71);
          uVar60 = (uVar46 & ~uVar41) * 2;
          uVar61 = uVar36;
          if ((uVar41 - uVar46) + uVar60 == iVar48 &&
              (uVar71 - (uVar34 + (uVar41 < uVar46))) +
              ((uVar34 & ~uVar71) << 1 | (uVar46 & ~uVar41) >> 0x1f) +
              (uint)CARRY4(uVar41 - uVar46,uVar60) == iVar62) {
            uVar61 = uVar35;
          }
        }
        FUN_00023f74(puVar21);
        uVar55 = uVar55 ^ uVar61;
        break;
      case 0x21:
        uVar36 = *local_118;
        uVar53 = local_118[1];
        uVar32 = local_118[2];
        puVar22 = (uint *)(uVar36 + local_114);
        uVar55 = *puVar22;
        uVar61 = puVar22[1];
        uVar60 = puVar22[2];
        uVar46 = puVar22[3];
        FUN_000264a4(~(puVar22[4] ^ uVar53),uVar53);
        FUN_000264a4(~(uVar55 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar60 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar46 ^ uVar53),uVar53);
        uVar35 = *(uint *)(uVar36 + extraout_r1_x00444);
        uVar33 = *(uint *)(uVar36 + extraout_r1_x00443);
        FUN_000264a4(~(uVar61 ^ uVar53),uVar53);
        uVar55 = *(uint *)(uVar36 + extraout_r1_x00445);
        uVar67 = *(uint *)(uVar36 + extraout_r1_x00442);
        uVar61 = *(uint *)(uVar36 + extraout_r1_x00441);
        uVar71 = *(uint *)(uVar36 + uVar32);
        puVar9[2] = uVar32 + 4;
        piVar47 = (int *)(uVar36 + uVar32 + 4);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar32 + 0xc;
        uVar46 = *(uint *)(uVar36 + uVar32 + 0xc);
        puVar9[2] = uVar32 + 0x10;
        uVar38 = *(uint *)(uVar36 + uVar32 + 0x10);
        puVar9[2] = uVar32 + 0x14;
        iVar48 = (int)*(short *)(uVar36 + uVar32 + 0x14);
        puVar9[2] = uVar32 + 0x16;
        uVar60 = *(uint *)(uVar36 + uVar32 + 0x16);
        puVar9[2] = uVar32 + 0x1a;
        uVar41 = *(uint *)(uVar36 + uVar32 + 0x1a);
        puVar9[2] = uVar32 + 0x1e;
        uVar44 = *(uint *)(uVar36 + uVar32 + 0x1e);
        puVar9[2] = uVar32 + 0x22;
        uVar34 = *(uint *)(uVar36 + uVar32 + 0x22);
        puVar9[2] = uVar32 + 0x26;
        uVar55 = uVar55 | uVar35 ^ uVar33 & ~(uVar67 ^ uVar61 ^ uVar55);
        FUN_000264a4(uVar55 ^ uVar46,uVar53);
        FUN_000264a4(uVar55 ^ uVar44,uVar53);
        uVar44 = *(uint *)(uVar36 + extraout_r1_x00447) & 0x3f;
        uVar46 = ((uint *)(uVar36 + extraout_r1_x00446))[1];
        uVar32 = uVar44 - 0x20;
        uVar61 = *(uint *)(uVar36 + extraout_r1_x00446) >> uVar44 | uVar46 << (0x20 - uVar44 & 0xff)
        ;
        if (-1 < (int)uVar32) {
          uVar61 = uVar46 >> (uVar32 & 0xff);
        }
        FUN_000264a4(uVar55 ^ uVar71,uVar53);
        uVar71 = *puVar9;
        *(uint *)(uVar71 + extraout_r1_x00448) = uVar61;
        uVar46 = uVar46 >> uVar44;
        if (-1 < (int)uVar32) {
          uVar46 = 0;
        }
        ((uint *)(uVar71 + extraout_r1_x00448))[1] = uVar46;
        FUN_000264a4(uVar55 ^ uVar38,uVar53);
        FUN_000264a4(uVar55 ^ uVar34,uVar53);
        uVar61 = 0x84222325;
        uVar46 = 0xcbf29ce4;
        if (iVar48 != 0) {
          iVar16 = 0;
          do {
            uVar88 = (ulonglong)uVar61;
            iVar48 = iVar48 + -1;
            iVar28 = uVar61 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00450 + iVar16);
            iVar16 = iVar16 + 1;
            uVar71 = (uint)*pcVar15;
            uVar61 = (uint)(uVar88 * 0x1b3) ^ uVar71;
            uVar46 = uVar46 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar71 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar38 = *(uint *)(*puVar9 + extraout_r1_x00449);
        uVar71 = (uVar61 | uVar38) * 2;
        bVar82 = uVar71 - (uVar61 + uVar38) == iVar37 &&
                 ((uVar46 | (int)uVar38 >> 0x1f) << 1 | (uVar61 | uVar38) >> 0x1f) -
                 (uVar46 + ((int)uVar38 >> 0x1f) + (uint)CARRY4(uVar61,uVar38) +
                 (uint)(uVar71 < uVar61 + uVar38)) == iVar62;
LAB_0006bbd0:
        if (bVar82) {
          uVar60 = uVar41;
        }
        uVar55 = uVar55 ^ uVar60;
        break;
      case 0x2f:
        uVar35 = *local_118;
        uVar53 = local_118[1];
        uVar36 = local_118[2];
        puVar22 = (uint *)(uVar35 + local_114);
        uVar46 = *puVar22;
        uVar61 = puVar22[3];
        uVar60 = puVar22[2];
        uVar55 = puVar22[4];
        FUN_000264a4(~(puVar22[1] ^ uVar53),uVar53);
        FUN_000264a4(~(uVar55 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar60 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar46 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar61 ^ uVar53),uVar53);
        uVar55 = *(uint *)(uVar35 + extraout_r1_x00199);
        uVar67 = *(uint *)(uVar35 + extraout_r1_x00198);
        uVar33 = *(uint *)(uVar35 + extraout_r1_x00196);
        uVar46 = *(uint *)(uVar35 + extraout_r1_x00195);
        uVar41 = *(uint *)(uVar35 + extraout_r1_x00197);
        uVar44 = *(uint *)(uVar35 + uVar36);
        puVar9[2] = uVar36 + 4;
        uVar71 = *(uint *)(uVar35 + uVar36 + 4);
        puVar9[2] = uVar36 + 8;
        uVar38 = *(uint *)(uVar35 + uVar36 + 8);
        puVar9[2] = uVar36 + 0xc;
        iVar48 = (int)*(short *)(uVar35 + uVar36 + 0xc);
        puVar9[2] = uVar36 + 0xe;
        uVar32 = *(uint *)(uVar35 + uVar36 + 0xe);
        puVar9[2] = uVar36 + 0x12;
        piVar47 = (int *)(uVar35 + uVar36 + 0x12);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar36 + 0x1a;
        uVar34 = *(uint *)(uVar35 + uVar36 + 0x1a);
        puVar9[2] = uVar36 + 0x1e;
        uVar60 = *(uint *)(uVar35 + uVar36 + 0x1e);
        puVar9[2] = uVar36 + 0x22;
        uVar61 = *(uint *)(uVar35 + uVar36 + 0x22);
        uVar55 = uVar55 & ~(uVar67 ^ (uVar41 | uVar33 ^ uVar46));
        puVar9[2] = uVar36 + 0x26;
        FUN_000264a4(uVar55 ^ uVar44,uVar53);
        FUN_000264a4(uVar55 ^ uVar32,uVar53);
        uVar44 = *(uint *)(uVar35 + extraout_r1_x00200);
        uVar41 = *(uint *)(uVar35 + extraout_r1_x00201);
        uVar46 = ((uint *)(uVar35 + extraout_r1_x00201))[1];
        lVar7 = (ulonglong)uVar41 * (ulonglong)uVar44;
        uVar32 = ((uint *)(uVar35 + extraout_r1_x00200))[1];
        FUN_000264a4(uVar55 ^ uVar60,uVar53);
        uVar60 = *puVar9;
        *(undefined4 *)(uVar60 + extraout_r1_x00202) = (int)lVar7;
        ((undefined4 *)(uVar60 + extraout_r1_x00202))[1] =
             uVar32 * uVar41 + uVar44 * uVar46 + (int)((ulonglong)lVar7 >> 0x20);
        FUN_000264a4(uVar55 ^ uVar38,uVar53);
        FUN_000264a4(uVar55 ^ uVar34,uVar53);
        uVar46 = 0x84222325;
        uVar60 = 0xcbf29ce4;
        if (iVar48 != 0) {
          iVar16 = 0;
          do {
            uVar88 = (ulonglong)uVar46;
            iVar48 = iVar48 + -1;
            iVar28 = uVar46 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00204 + iVar16);
            iVar16 = iVar16 + 1;
            uVar38 = (uint)*pcVar15;
            uVar46 = (uint)(uVar88 * 0x1b3) ^ uVar38;
            uVar60 = uVar60 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar38 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar34 = *(uint *)(*puVar9 + extraout_r1_x00203);
        uVar38 = (uVar46 | uVar34) * 2;
        if (uVar38 - (uVar46 + uVar34) == iVar37 &&
            ((uVar60 | (int)uVar34 >> 0x1f) << 1 | (uVar46 | uVar34) >> 0x1f) -
            (uVar60 + ((int)uVar34 >> 0x1f) + (uint)CARRY4(uVar46,uVar34) +
            (uint)(uVar38 < uVar46 + uVar34)) == iVar62) {
          uVar61 = uVar71;
        }
        uVar55 = uVar55 ^ uVar61;
        break;
      case 0x30:
        uVar36 = *local_118;
        uVar53 = local_118[1];
        uVar35 = local_118[2];
        puVar22 = (uint *)(uVar36 + local_114);
        uVar61 = *puVar22;
        uVar55 = puVar22[1];
        uVar46 = puVar22[3];
        uVar60 = puVar22[4];
        FUN_000264a4(~(puVar22[2] ^ uVar53),uVar53);
        FUN_000264a4(~(uVar46 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar55 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar61 ^ uVar53),uVar53);
        uVar55 = *(uint *)(uVar36 + extraout_r1_x00505);
        uVar32 = *(uint *)(uVar36 + extraout_r1_x00503);
        FUN_000264a4(~(uVar60 ^ uVar53),uVar53);
        local_134 = *(uint *)(uVar36 + uVar35);
        uVar61 = *(uint *)(uVar36 + extraout_r1_x00506);
        uVar60 = *(uint *)(uVar36 + extraout_r1_x00504);
        uVar71 = *(uint *)(uVar36 + extraout_r1_x00502);
        puVar9[2] = uVar35 + 4;
        uVar38 = *(uint *)(uVar36 + uVar35 + 4);
        puVar9[2] = uVar35 + 8;
        uVar34 = *(uint *)(uVar36 + uVar35 + 8);
        puVar9[2] = uVar35 + 0xc;
        iVar48 = (int)*(short *)(uVar36 + uVar35 + 0xc);
        puVar9[2] = uVar35 + 0xe;
        uVar46 = *(uint *)(uVar36 + uVar35 + 0xe);
        puVar9[2] = uVar35 + 0x12;
        piVar47 = (int *)(uVar36 + uVar35 + 0x12);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar35 + 0x1a;
        uVar41 = *(uint *)(uVar36 + uVar35 + 0x1a);
        puVar9[2] = uVar35 + 0x1e;
        uVar44 = *(uint *)(uVar36 + uVar35 + 0x1e);
        puVar9[2] = uVar35 + 0x22;
        uVar33 = *(uint *)(uVar36 + uVar35 + 0x22);
        uVar55 = uVar55 ^ (uVar32 | uVar61 ^ (uVar60 | uVar71));
        puVar9[2] = uVar35 + 0x26;
        FUN_000264a4(uVar55 ^ uVar44,uVar53);
        FUN_000264a4(uVar55 ^ uVar33,uVar53);
        uVar61 = *(uint *)(uVar36 + extraout_r1_x00507);
        uVar60 = *(uint *)(uVar36 + extraout_r1_x00508);
        FUN_000264a4(uVar55 ^ uVar41,uVar53);
        *(uint *)(*puVar9 + extraout_r1_x00509) = uVar61 | uVar60;
        FUN_000264a4(uVar55 ^ uVar38,uVar53);
        FUN_000264a4(uVar55 ^ uVar34,uVar53);
        uVar61 = 0x84222325;
        uVar60 = 0xcbf29ce4;
        if (iVar48 != 0) {
          iVar16 = 0;
          do {
            uVar88 = (ulonglong)uVar61;
            iVar48 = iVar48 + -1;
            iVar28 = uVar61 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00510 + iVar16);
            iVar16 = iVar16 + 1;
            uVar71 = (uint)*pcVar15;
            uVar61 = (uint)(uVar88 * 0x1b3) ^ uVar71;
            uVar60 = uVar60 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar71 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar38 = *(uint *)(*puVar9 + extraout_r1_x00511);
        uVar71 = (uVar61 | uVar38) * 2;
        bVar82 = uVar71 - (uVar61 + uVar38) == iVar37 &&
                 ((uVar60 | (int)uVar38 >> 0x1f) << 1 | (uVar61 | uVar38) >> 0x1f) -
                 (uVar60 + ((int)uVar38 >> 0x1f) + (uint)CARRY4(uVar61,uVar38) +
                 (uint)(uVar71 < uVar61 + uVar38)) == iVar62;
        goto LAB_0006a25c;
      case 0x31:
        uVar39 = *local_118;
        uVar53 = local_118[1];
        uVar67 = local_118[2];
        FUN_000264a4(~(*(uint *)(uVar39 + (local_114 | 4) + (local_114 | 0xfffffffb) + 5) ^ uVar53),
                     uVar53);
        FUN_000264a4(~(*(uint *)(uVar39 + (uVar46 | 8) * 2 + (uVar46 ^ 0xfffffff7) + 1) ^ uVar53),
                     uVar53);
        uVar61 = *(uint *)(uVar39 + (uVar46 | 0xc) * 2 + (uVar46 | 0xfffffff3) + (~uVar46 | 0xc) + 2
                          );
        FUN_000264a4(~(*(uint *)(uVar39 + (uVar46 << 1 | 9) + (uVar46 ^ 0xfffffffb)) ^ uVar53),
                     uVar53);
        uVar55 = *(uint *)(uVar39 + extraout_r1_x00628);
        uVar34 = *(uint *)(uVar39 + extraout_r1_x00626);
        FUN_000264a4(~(uVar61 ^ uVar53),uVar53);
        uVar71 = *(uint *)(uVar39 + extraout_r1_x00629);
        uVar38 = *(uint *)(uVar39 + extraout_r1_x00627);
        FUN_000264a4(~(*(uint *)(uVar39 + uVar46) ^ uVar53),uVar53);
        FUN_000264a4(~(((uint *)(uVar39 + uVar46))[2] ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar39 + ((uVar46 & 0x10 |
                                           (uVar46 & 0xffffffef) + (uVar46 & 0x10) * 2) ^ 0x10)) ^
                      uVar53),uVar53);
        uVar44 = *(uint *)(uVar39 + extraout_r1_x00632);
        uVar32 = *(uint *)(uVar39 + extraout_r1_x00631);
        uVar41 = *(uint *)(uVar39 + extraout_r1_x00630);
        uVar46 = *(uint *)(uVar39 + uVar67);
        puVar9[2] = uVar67 + 4;
        uVar36 = *(uint *)(uVar39 + uVar67 + 4);
        puVar9[2] = uVar67 + 8;
        iVar48 = (int)*(short *)(uVar39 + uVar67 + 8);
        puVar9[2] = uVar67 + 10;
        uVar60 = *(uint *)(uVar39 + uVar67 + 10);
        puVar9[2] = uVar67 + 0xe;
        uVar33 = *(uint *)(uVar39 + uVar67 + 0xe);
        puVar9[2] = uVar67 + 0x12;
        piVar47 = (int *)(uVar39 + uVar67 + 0x12);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar67 + 0x1a;
        uVar35 = *(uint *)(uVar39 + uVar67 + 0x1a);
        puVar9[2] = uVar67 + 0x1e;
        uVar61 = *(uint *)(uVar39 + uVar67 + 0x1e);
        puVar9[2] = uVar67 + 0x22;
        uVar32 = (uVar41 & ~uVar34 | uVar34 & ~uVar41) ^ uVar32;
        uVar55 = uVar71 & (uVar41 ^ uVar38 & (uVar44 & ~uVar32 | uVar32 & ~uVar44)) & uVar55;
        FUN_000264a4(uVar55 ^ uVar46,uVar53);
        FUN_000264a4(uVar55 ^ uVar36,uVar53);
        *(undefined2 *)(uVar39 + extraout_r1_x00633) = *(undefined2 *)(uVar39 + extraout_r1_x00634);
        FUN_000264a4(uVar55 ^ uVar33,uVar53);
        FUN_000264a4(uVar55 ^ uVar35,uVar53);
        uVar46 = 0x84222325;
        uVar71 = 0xcbf29ce4;
        if (iVar48 != 0) {
          iVar16 = 0;
          do {
            uVar88 = (ulonglong)uVar46;
            iVar48 = iVar48 + -1;
            iVar28 = uVar46 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00635 + iVar16);
            iVar16 = iVar16 + 1;
            uVar38 = (uint)*pcVar15;
            uVar46 = (uint)(uVar88 * 0x1b3) ^ uVar38;
            uVar71 = uVar71 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar38 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar34 = *(uint *)(*puVar9 + extraout_r1_x00636);
        uVar38 = (uVar46 | uVar34) * 2;
        bVar82 = uVar38 - (uVar46 + uVar34) == iVar37 &&
                 ((uVar71 | (int)uVar34 >> 0x1f) << 1 | (uVar46 | uVar34) >> 0x1f) -
                 (uVar71 + ((int)uVar34 >> 0x1f) + (uint)CARRY4(uVar46,uVar34) +
                 (uint)(uVar38 < uVar46 + uVar34)) == iVar62;
        goto LAB_00072ed8;
      case 0x36:
        uVar35 = *local_118;
        uVar53 = local_118[1];
        uVar75 = local_118[2];
        iVar37 = uVar35 + (local_114 ^ 0xc);
        FUN_000264a4(~(*(uint *)(iVar37 + (local_114 << 1 | 0xffffffe6) + 0x1a) ^ uVar53),uVar53);
        uVar61 = *(uint *)(uVar35 + (uVar46 | 0x10) * 2 + (uVar46 ^ 0xffffffef) + 1);
        FUN_000264a4(~(*(uint *)(uVar35 + (uVar46 | 0x10) * 2 + (uVar46 ^ 0xffffffef) + 1) ^ uVar53)
                     ,uVar53);
        uVar50 = *(uint *)(uVar35 + extraout_r1_x00737);
        uVar57 = *(uint *)(uVar35 + extraout_r1_x00736);
        FUN_000264a4(~(uVar61 ^ uVar53),uVar53);
        uVar55 = *(uint *)(uVar35 + extraout_r1_x00738);
        uVar72 = uVar46 & 4;
        FUN_000264a4(~(*(uint *)(uVar35 + ((uVar72 | (uVar46 & 0xfffffffb) + uVar72 * 2) ^ 4)) ^
                      uVar53),uVar53);
        puVar22 = (uint *)(uVar35 + uVar46);
        uVar61 = *puVar22;
        FUN_000264a4(~(*(uint *)((int)puVar22 + (~uVar46 | 0xc) + (uVar46 | 0xc) + 1) ^ uVar53),
                     uVar53);
        FUN_000264a4(~(puVar22[3] ^ uVar53),uVar53);
        FUN_000264a4(~(uVar61 ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(iVar37 + (uVar46 & 0xc) * 2) ^ uVar53),uVar53);
        uVar77 = uVar46 | 8;
        FUN_000264a4(~(*(uint *)(uVar35 + ((uVar46 & 8 | (uVar46 & 8) << 1) - uVar77) +
                                (uVar46 ^ 8) * 2) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar35 + uVar72 * 2 + (uVar46 ^ 4)) ^ uVar53),uVar53);
        uVar60 = *(uint *)(uVar35 + extraout_r1_x00745);
        uVar79 = *(uint *)(uVar35 + extraout_r1_x00744);
        uVar80 = *(uint *)(uVar35 + extraout_r1_x00743);
        uVar81 = *(uint *)(uVar35 + extraout_r1_x00742);
        uVar39 = *(uint *)(uVar35 + extraout_r1_x00741);
        uVar78 = *(uint *)(uVar35 + extraout_r1_x00740);
        uVar67 = *(uint *)(uVar35 + extraout_r1_x00739);
        uVar71 = *(uint *)(uVar35 + uVar75);
        puVar9[2] = uVar75 + 4;
        uVar38 = *(uint *)(uVar35 + uVar75 + 4);
        puVar9[2] = uVar75 + 8;
        uVar34 = *(uint *)(uVar35 + uVar75 + 8);
        puVar9[2] = uVar75 + 0xc;
        uVar41 = *(uint *)(uVar35 + uVar75 + 0xc);
        puVar9[2] = uVar75 + 0x10;
        puVar22 = (uint *)(uVar35 + uVar75 + 0x10);
        uVar44 = *puVar22;
        uVar32 = puVar22[1];
        puVar9[2] = uVar75 + 0x18;
        uVar61 = *(uint *)(uVar35 + uVar75 + 0x18);
        puVar9[2] = uVar75 + 0x1c;
        uVar33 = *(uint *)(uVar35 + uVar75 + 0x1c);
        puVar9[2] = uVar75 + 0x20;
        sVar12 = *(short *)(uVar35 + uVar75 + 0x20);
        iVar16 = (int)sVar12;
        puVar9[2] = uVar75 + 0x22;
        uVar51 = *puVar9;
        uVar35 = *(uint *)(uVar35 + uVar75 + 0x22);
        puVar9[2] = uVar75 + 0x26;
        uVar36 = *(uint *)(uVar51 + uVar75 + 0x26);
        puVar9[2] = uVar75 + 0x2a;
        uVar65 = *(uint *)(uVar51 + uVar75 + 0x2a);
        puVar9[2] = uVar75 + 0x2e;
        iVar48 = (int)*(short *)(uVar51 + uVar75 + 0x2e);
        puVar9[2] = uVar75 + 0x30;
        piVar47 = (int *)(uVar51 + uVar75 + 0x30);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar75 + 0x38;
        uVar67 = uVar67 & uVar57;
        uVar39 = uVar39 | uVar67 + (uVar78 | ~uVar67) + 1;
        uVar67 = (uVar39 + (~uVar81 ^ uVar39)) - (uVar39 | ~uVar81);
        uVar39 = uVar81 | uVar67;
        uVar67 = (~uVar80 + uVar80 * 2) - (uVar80 | uVar39 + ~(uVar39 + (uVar81 ^ uVar67)));
        uVar67 = ((uVar79 & ~uVar67) * 2 - (uVar79 | ~uVar67)) + (uVar67 | ~uVar79);
        uVar55 = uVar55 + (uVar55 ^ uVar67) + (uVar67 | ~uVar55) + 1;
        uVar55 = ((uVar50 | ~uVar55) + (uVar55 & ~uVar50) * 2) - (uVar55 | ~uVar50);
        uVar55 = -((uVar55 | ~uVar60) + (uVar60 | ~uVar55)) - 2;
        FUN_000264a4(uVar55 ^ uVar71,uVar53);
        uVar79 = puVar9[1];
        FUN_000264a4(uVar55 ^ uVar65,uVar79);
        uVar80 = *puVar9;
        uVar60 = puVar9[1];
        uVar71 = *(uint *)(uVar80 + extraout_r1_x00747);
        uVar81 = *(uint *)(uVar80 + extraout_r1_x00746);
        FUN_000264a4(uVar55 ^ uVar33,uVar53);
        FUN_000264a4(~(*(uint *)(uVar51 + uVar77 * 2 + (uVar46 ^ 0xfffffff7) + 1) ^ uVar79),uVar79);
        FUN_000264a4(~(*(uint *)(uVar51 + uVar77 * 2 + (uVar46 ^ 0xfffffff7) + 1) ^ uVar79),uVar79);
        FUN_000264a4(~(*(uint *)(uVar80 + ((uVar46 | 4) * 2 - (uVar46 & 0xfffffffb)) +
                                 (uVar46 | 0xfffffffb) + 1) ^ uVar60));
        uVar33 = *(uint *)(uVar80 + extraout_r1_x00751);
        uVar67 = *(uint *)(uVar51 + extraout_r1_x00750);
        uVar39 = *(uint *)(uVar51 + extraout_r1_x00749);
        FUN_000264a4(~(*(uint *)(uVar51 + (uVar46 | 4) + uVar72) ^ uVar79),uVar79);
        FUN_000264a4(~(*(uint *)(uVar51 + ((uVar46 & 0x10 |
                                           (uVar46 & 0xffffffef) + (uVar46 & 0x10) * 2) ^ 0x10)) ^
                      uVar79),uVar79);
        FUN_000264a4(~(*(uint *)(uVar51 + uVar46) ^ uVar79),uVar79);
        FUN_000264a4(~(*(uint *)(uVar80 + uVar46) ^ uVar60));
        uVar60 = *(uint *)(uVar80 + extraout_r1_x00755);
        uVar50 = *(uint *)(uVar51 + extraout_r1_x00754);
        uVar57 = *(uint *)(uVar51 + extraout_r1_x00753);
        uVar77 = *(uint *)(uVar51 + extraout_r1_x00752);
        FUN_000264a4(~(*(uint *)((int)(uVar51 + uVar46) + (~uVar46 | 0xc) + (uVar46 | 0xc) + 1) ^
                      uVar79),uVar79);
        uVar79 = *(uint *)(uVar51 + extraout_r1_x00756);
        *(uint *)(uVar80 + extraout_r1_x00748) = uVar81 & uVar71;
        FUN_000264a4(uVar55 ^ uVar41,uVar53);
        FUN_000264a4(uVar55 ^ uVar35,uVar53);
        FUN_000264a4(uVar55 ^ uVar36,uVar53);
        uVar71 = 0xcbf29ce4;
        uVar41 = *puVar9;
        uVar46 = 0x84222325;
        if (iVar48 != 0) {
          iVar28 = 0;
          do {
            uVar88 = (ulonglong)uVar46;
            iVar48 = iVar48 + -1;
            iVar70 = uVar46 * 0x100;
            pcVar15 = (char *)(uVar41 + extraout_r1_x00757 + iVar28);
            iVar28 = iVar28 + 1;
            uVar35 = (uint)*pcVar15;
            uVar46 = (uint)(uVar88 * 0x1b3) ^ uVar35;
            uVar71 = uVar71 * 0x1b3 + iVar70 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar35 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar36 = *(uint *)(uVar41 + extraout_r1_x00758);
        uVar39 = uVar39 | uVar77 & ~uVar79 | uVar79 & ~uVar77;
        uVar50 = uVar50 | uVar39 + uVar57 + ~(uVar57 & uVar39) * 2 + 2;
        uVar35 = ~uVar67 + (uVar50 | uVar67) * 2 + (uVar67 | ~uVar50) + 2;
        uVar60 = (uVar60 | ~uVar35) + (uVar60 ^ uVar35) * 2 + (uVar35 | ~uVar60) + 2;
        uVar33 = ((uVar60 | ~uVar33) + (uVar33 & ~uVar60) * 2) - (uVar33 | ~uVar60);
        uVar35 = uVar33 | (int)uVar33 >> 0x1f;
        uVar60 = (int)uVar36 >> 0x1f;
        if ((uVar33 & ~(uVar46 ^ uVar36) | (uVar46 ^ uVar36) & ~uVar33) != uVar44 ||
            (uVar35 & ~(uVar71 ^ uVar60) | (uVar71 ^ uVar60) & ~uVar35) != uVar32) {
          uVar61 = 0x84222325;
          uVar46 = 0xcbf29ce4;
          if (sVar12 != 0) {
            iVar48 = 0;
            do {
              uVar88 = (ulonglong)uVar61;
              iVar16 = iVar16 + -1;
              iVar28 = uVar61 * 0x100;
              pcVar15 = (char *)(uVar41 + extraout_r1_x00759 + iVar48);
              iVar48 = iVar48 + 1;
              uVar71 = (uint)*pcVar15;
              uVar61 = (uint)(uVar88 * 0x1b3) ^ uVar71;
              uVar46 = uVar46 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar71 >> 0x1f
              ;
            } while (iVar16 != 0);
          }
          uVar71 = (uVar36 & ~uVar61) * 2;
          uVar41 = (uVar61 - uVar36) + uVar71;
          uVar60 = (uVar46 - (uVar60 + (uVar61 < uVar36))) +
                   ((~uVar46 & uVar60) << 1 | (uVar36 & ~uVar61) >> 0x1f) +
                   (uint)CARRY4(uVar61 - uVar36,uVar71);
          uVar46 = (uVar33 & ~uVar41) * 2;
          uVar61 = uVar38;
          if ((uVar41 - uVar33) + uVar46 == iVar37 &&
              (uVar60 - (uVar35 + (uVar41 < uVar33))) +
              ((uVar35 & ~uVar60) << 1 | (uVar33 & ~uVar41) >> 0x1f) +
              (uint)CARRY4(uVar41 - uVar33,uVar46) == iVar62) {
            uVar61 = uVar34;
          }
        }
        uVar55 = uVar55 ^ uVar61;
        break;
      case 0x3c:
        uVar61 = local_114 & 0xfffffff7;
        uVar32 = *local_118;
        uVar41 = local_118[1];
        uVar38 = local_118[2];
        FUN_000264a4(~(*(uint *)(uVar32 + ((local_114 | 8) * 2 - uVar61) + (local_114 | 0xfffffff7)
                                + 1) ^ uVar41),uVar41);
        FUN_000264a4(~(*(uint *)(uVar32 + (uVar46 | 0xc) * 2 + (uVar46 ^ 0xfffffff3) + 1) ^ uVar41),
                     uVar41);
        FUN_000264a4(~(*(uint *)(uVar32 + ((uVar46 | 0x10) * 2 - (uVar46 & 0xffffffef)) +
                                 (uVar46 | 0xffffffef) + 1) ^ uVar41),uVar41);
        uVar71 = uVar46 & 8;
        FUN_000264a4(~(*(uint *)(uVar32 + (uVar61 ^ 0xfffffff7) * -3 + ~uVar71 +
                                (uVar46 << 1 ^ 0xffffffee)) ^ uVar41),uVar41);
        uVar61 = *(uint *)(uVar32 + extraout_r1_x00535);
        uVar53 = *(uint *)(uVar32 + extraout_r1_x00534);
        uVar55 = *(uint *)(uVar32 + extraout_r1_x00533);
        uVar60 = *(uint *)(uVar32 + extraout_r1_x00532);
        FUN_000264a4(~(*(uint *)(uVar32 + (uVar71 | uVar71 << 1) + ~uVar71 + (uVar46 ^ 8) + 1) ^
                      uVar41),uVar41);
        FUN_000264a4(~(*(uint *)(uVar32 + uVar46) ^ uVar41),uVar41);
        uVar71 = uVar46 & 4;
        FUN_000264a4(~(*(uint *)(uVar32 + uVar71 * 2 + ~uVar71 + (uVar46 | 4) + 1) ^ uVar41),uVar41)
        ;
        FUN_000264a4(~(*(uint *)(uVar32 + ((uVar71 | uVar71 << 1) - (uVar46 | 4)) + (uVar46 ^ 4) * 2
                                ) ^ uVar41),uVar41);
        FUN_000264a4(~(*(uint *)(uVar32 + ((uVar46 & 0x10 |
                                           (uVar46 & 0xffffffef) + (uVar46 & 0x10) * 2) ^ 0x10)) ^
                      uVar41),uVar41);
        uVar81 = *(uint *)(uVar32 + extraout_r1_x00540);
        uVar34 = *(uint *)(uVar32 + extraout_r1_x00539);
        sVar12 = *(short *)(uVar32 + uVar38);
        iVar48 = (int)sVar12;
        uVar44 = *(uint *)(uVar32 + extraout_r1_x00538);
        uVar46 = *(uint *)(uVar32 + extraout_r1_x00537);
        uVar71 = *(uint *)(uVar32 + extraout_r1_x00536);
        puVar9[2] = uVar38 + 2;
        uVar77 = *(uint *)(uVar32 + uVar38 + 2);
        puVar9[2] = uVar38 + 6;
        uVar50 = *(uint *)(uVar32 + uVar38 + 6);
        puVar9[2] = uVar38 + 10;
        uVar36 = *(uint *)(uVar32 + uVar38 + 10);
        uVar57 = *puVar9;
        puVar9[2] = uVar38 + 0xe;
        uVar67 = *(uint *)(uVar32 + uVar38 + 0xe);
        puVar9[2] = uVar38 + 0x12;
        uVar39 = *(uint *)(uVar32 + uVar38 + 0x12);
        puVar9[2] = uVar38 + 0x16;
        uVar32 = *(uint *)(uVar32 + uVar38 + 0x16);
        puVar9[2] = uVar38 + 0x1a;
        uVar33 = puVar9[1];
        piVar47 = (int *)(uVar57 + uVar38 + 0x1a);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar38 + 0x22;
        uVar35 = *(uint *)(uVar57 + uVar38 + 0x22);
        puVar9[2] = uVar38 + 0x26;
        uVar60 = uVar55 + (uVar71 ^ uVar60 | ~uVar55) + 1;
        uVar60 = uVar60 + (uVar46 | ~uVar60) + 1;
        uVar55 = uVar55 & (uVar60 & ~uVar44 | uVar44 & ~uVar60);
        uVar53 = (uVar55 | uVar53) - (uVar55 ^ uVar53);
        uVar53 = ((uVar53 | uVar34) - (uVar34 & ~uVar53)) + (uVar34 | ~uVar53) + 1;
        uVar53 = uVar61 | ((uVar53 ^ uVar81) - uVar53) + (uVar53 | ~uVar81);
        uVar61 = uVar46 & uVar53 - uVar61 | uVar61 + ~uVar53 & ~uVar46;
        FUN_000264a4(uVar61 ^ uVar77,uVar41);
        FUN_000264a4(uVar61 ^ uVar50,uVar41);
        FUN_000264a4(uVar61 ^ uVar36,uVar41);
        FUN_000264a4(uVar61 ^ uVar67,uVar41);
        FUN_000264a4(uVar61 ^ uVar39,uVar41);
        FUN_000264a4(uVar61 ^ uVar32,uVar41);
        FUN_000264a4(uVar61 ^ uVar35,uVar33);
        bVar82 = *(int *)(uVar57 + extraout_r1_x00542) == -0x80000000;
        uVar83 = extraout_r2_00;
        if (bVar82) {
          uVar83 = 0x80000000;
        }
        if (!bVar82 || *(int *)(uVar57 + extraout_r1_x00545) != -1) {
          uVar83 = FUN_00026048();
        }
        uVar61 = 0x84222325;
        *(undefined4 *)(uVar57 + extraout_r1_x00544) = uVar83;
        uVar46 = 0xcbf29ce4;
        if (sVar12 != 0) {
          iVar16 = 0;
          do {
            uVar88 = (ulonglong)uVar61;
            iVar48 = iVar48 + -1;
            iVar28 = uVar61 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00541 + iVar16);
            iVar16 = iVar16 + 1;
            uVar53 = (uint)*pcVar15;
            uVar61 = (uint)(uVar88 * 0x1b3) ^ uVar53;
            uVar46 = uVar46 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar53 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar55 = *(uint *)(*puVar9 + extraout_r1_x00546);
        uVar53 = (uVar61 | uVar55) * 2;
        bVar82 = uVar53 - (uVar61 + uVar55) == iVar37 &&
                 ((uVar46 | (int)uVar55 >> 0x1f) << 1 | (uVar61 | uVar55) >> 0x1f) -
                 (uVar46 + ((int)uVar55 >> 0x1f) + (uint)CARRY4(uVar61,uVar55) +
                 (uint)(uVar53 < uVar61 + uVar55)) == iVar62;
        uVar60 = extraout_r1_x00547;
        local_170 = extraout_r1_x00543;
LAB_0007184c:
        if (bVar82) {
          uVar60 = local_170;
        }
        goto LAB_00073114;
      case 0x3e:
        uVar50 = *local_118;
        uVar53 = local_118[1];
        uVar36 = local_118[2];
        FUN_000264a4(~(*(uint *)(uVar50 + (local_114 << 1 | 0x11) + (local_114 ^ 0xfffffff7)) ^
                      uVar53),uVar53);
        uVar61 = ~uVar46 | 0xfffffffb;
        FUN_000264a4(~(*(uint *)(uVar50 + (uVar46 & 4) * 2 + uVar61 + (uVar46 | 4) + 1) ^ uVar53),
                     uVar53);
        FUN_000264a4(~(*(uint *)(uVar50 + (~uVar46 & 0xfffffffb) * -3 + uVar61 +
                                (uVar46 << 1 ^ 0xfffffff6)) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar50 + (uVar46 << 1 | 0x21) + (uVar46 ^ 0xffffffef)) ^ uVar53),
                     uVar53);
        uVar55 = *(uint *)(uVar50 + extraout_r1_x00591);
        uVar60 = *(uint *)(uVar50 + extraout_r1_x00590);
        uVar71 = *(uint *)(uVar50 + extraout_r1_x00589);
        uVar38 = *(uint *)(uVar50 + extraout_r1_x00588);
        FUN_000264a4(~(*(uint *)(uVar50 + uVar46) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar50 + (uVar46 | 8) + (uVar46 & 8)) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar50 + uVar46 * 2 + (uVar46 ^ 0xc) + (~uVar46 | 0xc) * 2 + 2) ^
                      uVar53),uVar53);
        uVar77 = *(uint *)(uVar50 + extraout_r1_x00594);
        uVar35 = *(uint *)(uVar50 + extraout_r1_x00593);
        iVar48 = *(int *)(uVar50 + uVar36);
        uVar46 = *(uint *)(uVar50 + extraout_r1_x00592);
        iVar37 = ((int *)(uVar50 + uVar36))[1];
        puVar9[2] = uVar36 + 8;
        uVar61 = *(uint *)(uVar50 + uVar36 + 8);
        puVar9[2] = uVar36 + 0xc;
        uVar34 = *(uint *)(uVar50 + uVar36 + 0xc);
        puVar9[2] = uVar36 + 0x10;
        uVar41 = *(uint *)(uVar50 + uVar36 + 0x10);
        puVar9[2] = uVar36 + 0x14;
        uVar57 = *(uint *)(uVar50 + uVar36 + 0x14);
        puVar9[2] = uVar36 + 0x18;
        uVar39 = *(uint *)(uVar50 + uVar36 + 0x18);
        puVar9[2] = uVar36 + 0x1c;
        sVar12 = *(short *)(uVar50 + uVar36 + 0x1c);
        iVar16 = (int)sVar12;
        puVar9[2] = uVar36 + 0x1e;
        uVar44 = *(uint *)(uVar50 + uVar36 + 0x1e);
        puVar9[2] = uVar36 + 0x22;
        uVar32 = *(uint *)(uVar50 + uVar36 + 0x22);
        puVar9[2] = uVar36 + 0x26;
        uVar33 = *(uint *)(uVar50 + uVar36 + 0x26);
        puVar9[2] = uVar36 + 0x2a;
        uVar67 = ~uVar46;
        uVar35 = (uVar35 + (uVar67 ^ uVar35)) - (uVar35 | uVar67);
        uVar36 = uVar35 | uVar38;
        iVar62 = uVar35 + uVar38 + 1;
        uVar38 = iVar62 + ~uVar36;
        uVar71 = (uVar36 - iVar62) + (uVar71 | uVar38) * 2 + (uVar38 | ~uVar71) + 2;
        uVar71 = (uVar77 ^ uVar71) + (uVar77 & ~uVar71) + (uVar71 | ~uVar77) + 1;
        uVar60 = uVar60 | ((uVar71 & ~uVar46) * 2 - (uVar71 | uVar67)) + (uVar46 | ~uVar71);
        uVar60 = uVar60 + uVar46 + ~(uVar46 & uVar60) * 2 + 2;
        uVar55 = uVar55 & ((uVar60 | uVar67) + (uVar46 & ~uVar60) * 2) - (uVar46 | ~uVar60);
        FUN_000264a4(uVar55 ^ uVar57,uVar53);
        FUN_000264a4(uVar55 ^ uVar39,uVar53);
        sVar6 = CONCAT11(*(undefined1 *)(uVar50 + extraout_r1_x00596),
                         *(undefined1 *)(uVar50 + extraout_r1_x00595));
        FUN_000264a4(uVar55 ^ uVar34,uVar53);
        FUN_000264a4(uVar55 ^ uVar41,uVar53);
        FUN_000264a4(uVar55 ^ uVar32,uVar53);
        FUN_000264a4(uVar55 ^ uVar33,uVar53);
        if (sVar6 == 0x804) {
          *(float *)(*puVar9 + extraout_r1_x00600) =
               (float)*(double *)(*puVar9 + extraout_r1_x00597);
        }
        else if (sVar6 == 0x408) {
          *(double *)(*puVar9 + extraout_r1_x00600) =
               (double)*(float *)(*puVar9 + extraout_r1_x00597);
        }
        uVar60 = 0xcbf29ce4;
        uVar46 = 0x84222325;
        if (sVar12 != 0) {
          iVar62 = 0;
          do {
            uVar88 = (ulonglong)uVar46;
            iVar16 = iVar16 + -1;
            iVar28 = uVar46 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00598 + iVar62);
            iVar62 = iVar62 + 1;
            uVar71 = (uint)*pcVar15;
            uVar46 = (uint)(uVar88 * 0x1b3) ^ uVar71;
            uVar60 = uVar60 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar71 >> 0x1f;
          } while (iVar16 != 0);
        }
        uVar38 = *(uint *)(*puVar9 + extraout_r1_x00599);
        uVar71 = (uVar46 | uVar38) * 2;
        if (uVar71 - (uVar46 + uVar38) == iVar48 &&
            ((uVar60 | (int)uVar38 >> 0x1f) << 1 | (uVar46 | uVar38) >> 0x1f) -
            (uVar60 + ((int)uVar38 >> 0x1f) + (uint)CARRY4(uVar46,uVar38) +
            (uint)(uVar71 < uVar46 + uVar38)) == iVar37) {
          uVar61 = uVar44;
        }
        uVar55 = uVar55 ^ uVar61;
        break;
      case 0x42:
        uVar61 = *local_118;
        uVar53 = ~local_114;
        uVar35 = local_118[1];
        uVar36 = local_118[2];
        FUN_000264a4(~(*(uint *)(uVar61 + (local_114 | 4) * 2 + (local_114 | 0xfffffffb) +
                                 (uVar53 | 4) + 2) ^ uVar35),uVar35);
        FUN_000264a4(~(*(uint *)(uVar61 + (uVar46 << 1 | 0x19) + (uVar46 ^ 0xfffffff3)) ^ uVar35),
                     uVar35);
        uVar55 = *(uint *)(uVar61 + extraout_r1_x00715);
        uVar60 = *(uint *)(uVar61 + extraout_r1_x00714);
        puVar22 = (uint *)(uVar61 + uVar46);
        FUN_000264a4(~(*puVar22 ^ uVar35),uVar35);
        FUN_000264a4(~(*(uint *)(uVar61 + (uVar46 & 0x10) * 2 + (uVar46 ^ 0x10)) ^ uVar35),uVar35);
        FUN_000264a4(~(*(uint *)((int)puVar22 + (uVar53 | 8) + (uVar46 | 8) + 1) ^ uVar35),uVar35);
        FUN_000264a4(~(puVar22[4] ^ uVar35),uVar35);
        uVar39 = *(uint *)(uVar61 + extraout_r1_x00719);
        uVar46 = *(uint *)(uVar61 + extraout_r1_x00717);
        uVar67 = *puVar9;
        uVar53 = puVar9[1];
        uVar34 = *(uint *)(uVar61 + uVar36);
        uVar71 = *(uint *)(uVar61 + extraout_r1_x00718);
        uVar38 = *(uint *)(uVar61 + extraout_r1_x00716);
        puVar9[2] = uVar36 + 4;
        uVar41 = *(uint *)(uVar67 + uVar36 + 4);
        puVar9[2] = uVar36 + 8;
        uVar44 = *(uint *)(uVar67 + uVar36 + 8);
        puVar9[2] = uVar36 + 0xc;
        piVar47 = (int *)(uVar67 + uVar36 + 0xc);
        iVar48 = *piVar47;
        iVar16 = piVar47[1];
        puVar9[2] = uVar36 + 0x14;
        uVar33 = *(uint *)(uVar67 + uVar36 + 0x14);
        puVar9[2] = uVar36 + 0x18;
        uVar32 = *(uint *)(uVar67 + uVar36 + 0x18);
        puVar9[2] = uVar36 + 0x1c;
        iVar28 = (int)*(short *)(uVar67 + uVar36 + 0x1c);
        puVar9[2] = uVar36 + 0x1e;
        uVar50 = *(uint *)(uVar67 + uVar36 + 0x1e);
        puVar9[2] = uVar36 + 0x22;
        uVar61 = *(uint *)(uVar67 + uVar36 + 0x22);
        puVar9[2] = uVar36 + 0x26;
        uVar71 = uVar71 & (uVar46 | uVar38 & (uVar38 + ~(uVar38 & uVar60)) - (uVar38 | ~uVar60));
        uVar46 = uVar71 + (uVar55 ^ uVar71) + (uVar55 | ~uVar71) + 1;
        uVar55 = ~uVar46;
        uVar46 = ((uVar38 | uVar46) + uVar55) - (uVar38 | uVar55);
        uVar55 = (~uVar46 + uVar46 * 2) - (uVar46 | ~uVar39);
        FUN_000264a4(uVar55 ^ uVar33,uVar53);
        FUN_000264a4(uVar55 ^ uVar50,uVar53);
        iVar37 = *(int *)(uVar67 + extraout_r1_x00720);
        iVar70 = 0;
        iVar62 = *(int *)(uVar67 + extraout_r1_x00721);
        FUN_000264a4(uVar55 ^ uVar44,uVar53);
        *(uint *)(uVar67 + extraout_r1_x00722) = (uint)(iVar62 < iVar37) - (uint)(iVar37 < iVar62);
        FUN_000264a4(uVar55 ^ uVar34,uVar35);
        FUN_000264a4(uVar55 ^ uVar41,uVar35);
        uVar46 = 0x84222325;
        uVar60 = 0xcbf29ce4;
        if (iVar28 != 0) {
          do {
            uVar88 = (ulonglong)uVar46;
            iVar28 = iVar28 + -1;
            iVar37 = uVar46 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00724 + iVar70);
            iVar70 = iVar70 + 1;
            uVar71 = (uint)*pcVar15;
            uVar46 = (uint)(uVar88 * 0x1b3) ^ uVar71;
            uVar60 = uVar60 * 0x1b3 + iVar37 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar71 >> 0x1f;
          } while (iVar28 != 0);
        }
        uVar38 = *(uint *)(*puVar9 + extraout_r1_x00723);
        uVar71 = (uVar46 | uVar38) * 2;
        if (uVar71 - (uVar46 + uVar38) == iVar48 &&
            ((uVar60 | (int)uVar38 >> 0x1f) << 1 | (uVar46 | uVar38) >> 0x1f) -
            (uVar60 + ((int)uVar38 >> 0x1f) + (uint)CARRY4(uVar46,uVar38) +
            (uint)(uVar71 < uVar46 + uVar38)) == iVar16) {
          uVar61 = uVar32;
        }
        uVar55 = uVar55 ^ uVar61;
        break;
      case 0x43:
        uVar41 = *local_118;
        uVar53 = local_118[1];
        uVar34 = local_118[2];
        puVar22 = (uint *)(uVar41 + local_114);
        uVar55 = *puVar22;
        uVar61 = puVar22[3];
        uVar60 = puVar22[1];
        uVar71 = puVar22[4];
        FUN_000264a4(~(puVar22[2] ^ uVar53),uVar53);
        FUN_000264a4(~(uVar60 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar55 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar71 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar61 ^ uVar53),uVar53);
        uVar55 = *(uint *)(uVar41 + extraout_r1_x00822);
        uVar77 = *(uint *)(uVar41 + extraout_r1_x00821);
        uVar32 = *(uint *)(uVar41 + extraout_r1_x00820);
        uVar38 = *(uint *)(uVar41 + uVar34);
        uVar71 = *(uint *)(uVar41 + extraout_r1_x00819);
        uVar81 = *puVar9;
        uVar60 = *(uint *)(uVar41 + extraout_r1_x00818);
        puVar9[2] = uVar34 + 4;
        uVar61 = *(uint *)(uVar41 + uVar34 + 4);
        puVar9[2] = uVar34 + 8;
        uVar33 = *(uint *)(uVar41 + uVar34 + 8);
        puVar9[2] = uVar34 + 0xc;
        uVar35 = *(uint *)(uVar41 + uVar34 + 0xc);
        puVar9[2] = uVar34 + 0x10;
        piVar47 = (int *)(uVar41 + uVar34 + 0x10);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar34 + 0x18;
        iVar48 = (int)*(short *)(uVar41 + uVar34 + 0x18);
        puVar9[2] = uVar34 + 0x1a;
        uVar44 = *(uint *)(uVar41 + uVar34 + 0x1a);
        puVar9[2] = uVar34 + 0x1e;
        uVar36 = *(uint *)(uVar41 + uVar34 + 0x1e);
        puVar9[2] = uVar34 + 0x22;
        uVar67 = *(uint *)(uVar41 + uVar34 + 0x22);
        puVar9[2] = uVar34 + 0x26;
        uVar39 = *(uint *)(uVar41 + uVar34 + 0x26);
        puVar9[2] = uVar34 + 0x2a;
        sVar12 = *(short *)(uVar81 + uVar34 + 0x2a);
        puVar9[2] = uVar34 + 0x2c;
        puVar22 = (uint *)(uVar81 + uVar34 + 0x2c);
        uVar50 = *puVar22;
        uVar57 = puVar22[1];
        uVar55 = uVar55 ^ (uVar77 | uVar32 ^ uVar60 & ~uVar71);
        puVar9[2] = uVar34 + 0x34;
        FUN_000264a4(uVar55 ^ uVar38,uVar53);
        FUN_000264a4(uVar55 ^ uVar44,uVar53);
        uVar32 = puVar9[1];
        uVar77 = *puVar9;
        FUN_000264a4(~(*(uint *)(uVar81 + (uVar46 | 8) * 2 + (uVar46 | 0xfffffff7) + (~uVar46 | 8) +
                                2) ^ uVar32),uVar32);
        FUN_000264a4(~(*(uint *)(uVar81 + ((uVar46 | 4) * 2 - (uVar46 & 0xfffffffb)) +
                                 (uVar46 | 0xfffffffb) + 1) ^ uVar32),uVar32);
        FUN_000264a4(~(*(uint *)(uVar81 + (uVar46 | 0x10) * 2 + (uVar46 ^ 0xffffffef) + 1) ^ uVar32)
                     ,uVar32);
        FUN_000264a4(~(*(uint *)(uVar81 + (~uVar46 & 0xffffffef) * -3 + (~uVar46 | 0xffffffef) +
                                (uVar46 << 1 ^ 0xffffffde)) ^ uVar32),uVar32);
        FUN_000264a4(~(*(uint *)(uVar77 + (uVar46 | 8) + (uVar46 | 0xfffffff7) + 9) ^ uVar32),uVar32
                    );
        FUN_000264a4(~(*(uint *)(uVar77 + (uVar46 | 4) * 2 + (uVar46 ^ 4) +
                                 (uVar46 << 1 ^ 0xfffffff6) + 2) ^ uVar32),uVar32);
        uVar60 = *(uint *)(uVar77 + extraout_r1_x00830);
        uVar71 = *(uint *)(uVar77 + extraout_r1_x00829);
        uVar38 = *(uint *)(uVar81 + extraout_r1_x00828);
        uVar34 = *(uint *)(uVar81 + extraout_r1_x00827);
        uVar41 = *(uint *)(uVar81 + extraout_r1_x00826);
        uVar44 = *(uint *)(uVar81 + extraout_r1_x00825);
        iVar16 = *(int *)(uVar77 + extraout_r1_x00823);
        FUN_000264a4(~(*(uint *)(uVar81 + (uVar46 & 0xc) * 2 + (uVar46 ^ 0xc)) ^ uVar32),uVar32);
        FUN_000264a4(~(*(uint *)(uVar81 + (uVar46 & 8) * 2 + (uVar46 ^ 8)) ^ uVar32),uVar32);
        FUN_000264a4(~(*(uint *)(uVar77 + (uVar46 & 0x10) * 2 + (uVar46 ^ 0x10)) ^ uVar32),uVar32);
        FUN_000264a4(~(*(uint *)(uVar77 + uVar46) ^ uVar32),uVar32);
        uVar46 = *(uint *)(uVar77 + extraout_r1_x00834);
        uVar32 = *(uint *)(uVar77 + extraout_r1_x00833);
        uVar79 = *(uint *)(uVar81 + extraout_r1_x00832);
        uVar81 = *(uint *)(uVar81 + extraout_r1_x00831);
        *(uint *)(uVar77 + extraout_r1_x00824) = (uint)(iVar16 != 0);
        FUN_000264a4(uVar55 ^ uVar33,uVar53);
        FUN_000264a4(uVar55 ^ uVar35,uVar53);
        FUN_000264a4(uVar55 ^ uVar67,uVar53);
        uVar67 = *puVar9;
        uVar35 = 0x84222325;
        uVar33 = 0xcbf29ce4;
        if (iVar48 != 0) {
          iVar16 = 0;
          do {
            uVar88 = (ulonglong)uVar35;
            iVar48 = iVar48 + -1;
            iVar28 = uVar35 * 0x100;
            pcVar15 = (char *)(uVar67 + extraout_r1_x00835 + iVar16);
            iVar16 = iVar16 + 1;
            uVar77 = (uint)*pcVar15;
            uVar35 = (uint)(uVar88 * 0x1b3) ^ uVar77;
            uVar33 = uVar33 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar77 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar44 = uVar44 & ~uVar81 | uVar81 & ~uVar44;
        uVar32 = uVar32 & (uVar38 ^ uVar34 & (uVar79 | (uVar44 + (~uVar41 ^ uVar44)) -
                                                       (uVar44 | ~uVar41)));
        uVar71 = (uVar32 + (uVar71 ^ uVar32)) - (uVar32 & ~uVar71);
        uVar46 = uVar71 + (uVar46 | ~uVar71) + 1;
        uVar71 = ((uVar60 & ~uVar46) * 2 - (uVar60 | ~uVar46)) + (uVar46 | ~uVar60);
        uVar38 = uVar71 | (int)uVar71 >> 0x1f;
        uVar60 = *(uint *)(uVar67 + extraout_r1_x00836);
        uVar46 = (int)uVar60 >> 0x1f;
        if ((uVar71 & ~(uVar35 ^ uVar60) | (uVar35 ^ uVar60) & ~uVar71) != uVar50 ||
            (uVar38 & ~(uVar33 ^ uVar46) | (uVar33 ^ uVar46) & ~uVar38) != uVar57) {
          uVar61 = 0x84222325;
          uVar34 = 0xcbf29ce4;
          if (sVar12 != 0) {
            iVar16 = (int)sVar12;
            iVar48 = 0;
            do {
              uVar88 = (ulonglong)uVar61;
              iVar16 = iVar16 + -1;
              iVar28 = uVar61 * 0x100;
              pcVar15 = (char *)(uVar67 + extraout_r1_x00837 + iVar48);
              iVar48 = iVar48 + 1;
              uVar41 = (uint)*pcVar15;
              uVar61 = (uint)(uVar88 * 0x1b3) ^ uVar41;
              uVar34 = uVar34 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar41 >> 0x1f
              ;
            } while (iVar16 != 0);
          }
          uVar41 = (uVar60 & ~uVar61) * 2;
          uVar44 = (uVar61 - uVar60) + uVar41;
          uVar60 = (uVar34 - (uVar46 + (uVar61 < uVar60))) +
                   ((~uVar34 & uVar46) << 1 | (uVar60 & ~uVar61) >> 0x1f) +
                   (uint)CARRY4(uVar61 - uVar60,uVar41);
          uVar46 = (uVar71 & ~uVar44) * 2;
          uVar61 = uVar39;
          if ((uVar44 - uVar71) + uVar46 == iVar37 &&
              (uVar60 - (uVar38 + (uVar44 < uVar71))) +
              ((uVar38 & ~uVar60) << 1 | (uVar71 & ~uVar44) >> 0x1f) +
              (uint)CARRY4(uVar44 - uVar71,uVar46) == iVar62) {
            uVar61 = uVar36;
          }
        }
        uVar55 = uVar55 ^ uVar61;
        break;
      case 0x47:
        uVar35 = *local_118;
        uVar53 = local_118[1];
        uVar36 = local_118[2];
        puVar22 = (uint *)(uVar35 + local_114);
        uVar61 = *puVar22;
        uVar55 = puVar22[1];
        uVar46 = puVar22[2];
        uVar60 = puVar22[4];
        FUN_000264a4(~(puVar22[3] ^ uVar53),uVar53);
        FUN_000264a4(~(uVar55 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar60 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar46 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar61 ^ uVar53),uVar53);
        uVar55 = *(uint *)(uVar35 + extraout_r1_x00426);
        uVar67 = *(uint *)(uVar35 + extraout_r1_x00425);
        uVar34 = *(uint *)(uVar35 + extraout_r1_x00422);
        uVar44 = *(uint *)(uVar35 + extraout_r1_x00424);
        uVar32 = *(uint *)(uVar35 + extraout_r1_x00423);
        uVar41 = *(uint *)(uVar35 + uVar36);
        puVar9[2] = uVar36 + 4;
        uVar61 = *(uint *)(uVar35 + uVar36 + 4);
        puVar9[2] = uVar36 + 8;
        piVar47 = (int *)(uVar35 + uVar36 + 8);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar36 + 0x10;
        uVar46 = *(uint *)(uVar35 + uVar36 + 0x10);
        puVar9[2] = uVar36 + 0x14;
        uVar60 = *(uint *)(uVar35 + uVar36 + 0x14);
        puVar9[2] = uVar36 + 0x18;
        iVar28 = (int)*(short *)(uVar35 + uVar36 + 0x18);
        puVar9[2] = uVar36 + 0x1a;
        uVar33 = *(uint *)(uVar35 + uVar36 + 0x1a);
        puVar9[2] = uVar36 + 0x1e;
        uVar71 = *(uint *)(uVar35 + uVar36 + 0x1e);
        puVar9[2] = uVar36 + 0x22;
        uVar38 = *(uint *)(uVar35 + uVar36 + 0x22);
        puVar9[2] = uVar36 + 0x26;
        uVar55 = uVar55 & (uVar67 | uVar44 | uVar32 ^ uVar34);
        FUN_000264a4(uVar55 ^ uVar41,uVar53);
        FUN_000264a4(uVar55 ^ uVar33,uVar53);
        iVar48 = *(int *)(uVar35 + extraout_r1_x00427);
        iVar16 = *(int *)(uVar35 + extraout_r1_x00428);
        FUN_000264a4(uVar55 ^ uVar71,uVar53);
        *(int *)(*puVar9 + extraout_r1_x00429) = iVar16 - iVar48;
        FUN_000264a4(uVar55 ^ uVar46,uVar53);
        FUN_000264a4(uVar55 ^ uVar38,uVar53);
        uVar46 = 0x84222325;
        uVar71 = 0xcbf29ce4;
        if (iVar28 != 0) {
          iVar48 = 0;
          do {
            uVar88 = (ulonglong)uVar46;
            iVar28 = iVar28 + -1;
            iVar16 = uVar46 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00431 + iVar48);
            iVar48 = iVar48 + 1;
            uVar38 = (uint)*pcVar15;
            uVar46 = (uint)(uVar88 * 0x1b3) ^ uVar38;
            uVar71 = uVar71 * 0x1b3 + iVar16 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar38 >> 0x1f;
          } while (iVar28 != 0);
        }
        uVar34 = *(uint *)(*puVar9 + extraout_r1_x00430);
        uVar38 = (uVar46 | uVar34) * 2;
        if (uVar38 - (uVar46 + uVar34) == iVar37 &&
            ((uVar71 | (int)uVar34 >> 0x1f) << 1 | (uVar46 | uVar34) >> 0x1f) -
            (uVar71 + ((int)uVar34 >> 0x1f) + (uint)CARRY4(uVar46,uVar34) +
            (uint)(uVar38 < uVar46 + uVar34)) == iVar62) {
          uVar61 = uVar60;
        }
        uVar55 = uVar55 ^ uVar61;
        break;
      case 0x49:
        uVar39 = *local_118;
        uVar53 = local_118[1];
        uVar36 = local_118[2];
        FUN_000264a4(~(*(uint *)(uVar39 + (local_114 << 1 | 0x19) + (local_114 ^ 0xfffffff3)) ^
                      uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar39 + (uVar46 | 0x10) * 2 + (uVar46 | 0xffffffef) +
                                 (~uVar46 | 0x10) + 2) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar39 + (uVar46 | 0xc) + (uVar46 | 0xfffffff3) + 0xd) ^ uVar53),
                     uVar53);
        FUN_000264a4(~(*(uint *)(uVar39 + (uVar46 & 4) * 2 + (uVar46 ^ 4) * 3 +
                                 (uVar46 << 1 ^ 0xfffffff6) + 2) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar39 + ((uVar46 | 8) * 2 - (uVar46 & 0xfffffff7)) +
                                 (uVar46 | 0xfffffff7) + 1) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar39 + (uVar46 | 4) + (uVar46 | 0xfffffffb) + 5) ^ uVar53),uVar53
                    );
        uVar44 = *(uint *)(uVar39 + extraout_r1_x00414);
        uVar67 = *(uint *)(uVar39 + extraout_r1_x00410);
        uVar55 = *(uint *)(uVar39 + extraout_r1_x00413);
        uVar60 = *(uint *)(uVar39 + extraout_r1_x00412);
        uVar71 = *(uint *)(uVar39 + extraout_r1_x00411);
        uVar41 = *(uint *)(uVar39 + extraout_r1_x00409);
        FUN_000264a4(~(*(uint *)(uVar39 + (uVar46 & 0x10) * 2 + (uVar46 ^ 0x10)) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar39 + uVar46) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar39 + (uVar46 & 8) * 2 + (uVar46 ^ 8)) ^ uVar53),uVar53);
        uVar33 = *(uint *)(uVar39 + extraout_r1_x00416);
        uVar32 = *(uint *)(uVar39 + extraout_r1_x00417);
        uVar57 = *(uint *)(uVar39 + extraout_r1_x00415);
        uVar50 = *(uint *)(uVar39 + uVar36);
        puVar9[2] = uVar36 + 4;
        iVar48 = (int)*(short *)(uVar39 + uVar36 + 4);
        puVar9[2] = uVar36 + 6;
        uVar61 = *(uint *)(uVar39 + uVar36 + 6);
        puVar9[2] = uVar36 + 10;
        uVar46 = *(uint *)(uVar39 + uVar36 + 10);
        puVar9[2] = uVar36 + 0xe;
        uVar35 = *(uint *)(uVar39 + uVar36 + 0xe);
        puVar9[2] = uVar36 + 0x12;
        uVar38 = *(uint *)(uVar39 + uVar36 + 0x12);
        puVar9[2] = uVar36 + 0x16;
        uVar34 = *(uint *)(uVar39 + uVar36 + 0x16);
        puVar9[2] = uVar36 + 0x1a;
        piVar47 = (int *)(uVar39 + uVar36 + 0x1a);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar36 + 0x22;
        uVar41 = uVar41 | uVar57;
        uVar44 = uVar55 ^ (uVar60 | uVar71 & (uVar41 & uVar67) + (uVar41 ^ uVar67)) ^ uVar44;
        uVar55 = uVar33 & uVar44;
        uVar55 = (uVar33 ^ uVar44) + ~uVar55 + uVar55 * 2 + 1;
        uVar55 = (uVar32 - uVar55) + (uVar55 & ~uVar32) * 2;
        uVar55 = (uVar55 | uVar67) * 2 - (uVar55 + uVar67);
        FUN_000264a4(uVar55 ^ uVar50,uVar53);
        FUN_000264a4(uVar55 ^ uVar35,uVar53);
        *(undefined4 *)(uVar39 + extraout_r1_x00419) = *(undefined4 *)(uVar39 + extraout_r1_x00418);
        FUN_000264a4(uVar55 ^ uVar46,uVar53);
        FUN_000264a4(uVar55 ^ uVar38,uVar53);
        uVar46 = 0x84222325;
        uVar60 = 0xcbf29ce4;
        if (iVar48 != 0) {
          iVar16 = 0;
          do {
            uVar88 = (ulonglong)uVar46;
            iVar48 = iVar48 + -1;
            iVar28 = uVar46 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00421 + iVar16);
            iVar16 = iVar16 + 1;
            uVar71 = (uint)*pcVar15;
            uVar46 = (uint)(uVar88 * 0x1b3) ^ uVar71;
            uVar60 = uVar60 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar71 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar38 = *(uint *)(*puVar9 + extraout_r1_x00420);
        uVar71 = (uVar46 | uVar38) * 2;
        bVar82 = uVar71 - (uVar46 + uVar38) == iVar37 &&
                 ((uVar60 | (int)uVar38 >> 0x1f) << 1 | (uVar46 | uVar38) >> 0x1f) -
                 (uVar60 + ((int)uVar38 >> 0x1f) + (uint)CARRY4(uVar46,uVar38) +
                 (uint)(uVar71 < uVar46 + uVar38)) == iVar62;
LAB_0006c604:
        if (bVar82) {
          uVar61 = uVar34;
        }
        uVar55 = uVar55 ^ uVar61;
        break;
      case 0x4c:
        uVar67 = *local_118;
        uVar53 = local_118[1];
        uVar50 = local_118[2];
        FUN_000264a4(~(*(uint *)(uVar67 + (local_114 | 8) * 2 + (local_114 | 0xfffffff7) +
                                 (~local_114 | 8) + 2) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar67 + ((uVar46 | 0x10) * 2 - (uVar46 & 0xffffffef)) +
                                 (uVar46 | 0xffffffef) + 1) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar67 + (uVar46 ^ 0xc) + (uVar46 << 1 | 0xffffffe6) + 0x1a) ^
                      uVar53),uVar53);
        uVar71 = *(uint *)(uVar67 + extraout_r1_x00874);
        uVar38 = *(uint *)(uVar67 + extraout_r1_x00873);
        uVar60 = *(uint *)(uVar67 + extraout_r1_x00872);
        FUN_000264a4(~(*(uint *)(uVar67 + ((uVar46 & 0xc) * 3 - (uVar46 | 0xc)) + (uVar46 ^ 0xc) * 2
                                ) ^ uVar53),uVar53);
        uVar34 = *(uint *)(uVar67 + uVar46);
        FUN_000264a4(~(((uint *)(uVar67 + uVar46))[2] ^ uVar53),uVar53);
        uVar55 = uVar46 & 4;
        FUN_000264a4(~(*(uint *)(uVar67 + uVar55 * 2 + (uVar46 ^ 4)) ^ uVar53),uVar53);
        uVar61 = uVar46 & 0x10;
        FUN_000264a4(~(*(uint *)(uVar67 + (uVar61 | uVar61 << 1) + ~uVar61 + (uVar46 ^ 0x10) + 1) ^
                      uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar67 + (uVar46 | 4) + uVar55) ^ uVar53),uVar53);
        FUN_000264a4(~(uVar34 ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar67 + ((uVar55 | (uVar46 & 0xfffffffb) + uVar55 * 2) ^ 4)) ^
                      uVar53),uVar53);
        uVar55 = *(uint *)(uVar67 + extraout_r1_x00880);
        uVar81 = *(uint *)(uVar67 + extraout_r1_x00881);
        uVar32 = *(uint *)(uVar67 + uVar50);
        uVar77 = *(uint *)(uVar67 + extraout_r1_x00875);
        uVar44 = *(uint *)(uVar67 + extraout_r1_x00879);
        uVar34 = *(uint *)(uVar67 + extraout_r1_x00878);
        uVar41 = *(uint *)(uVar67 + extraout_r1_x00877);
        uVar46 = *(uint *)(uVar67 + extraout_r1_x00876);
        puVar9[2] = uVar50 + 4;
        uVar33 = *(uint *)(uVar67 + uVar50 + 4);
        puVar9[2] = uVar50 + 8;
        uVar35 = *(uint *)(uVar67 + uVar50 + 8);
        puVar9[2] = uVar50 + 0xc;
        uVar36 = *(uint *)(uVar67 + uVar50 + 0xc);
        puVar9[2] = uVar50 + 0x10;
        piVar47 = (int *)(uVar67 + uVar50 + 0x10);
        iVar48 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar50 + 0x18;
        uVar39 = *(uint *)(uVar67 + uVar50 + 0x18);
        puVar9[2] = uVar50 + 0x1c;
        uVar57 = *puVar9;
        iVar16 = (int)*(short *)(uVar67 + uVar50 + 0x1c);
        puVar9[2] = uVar50 + 0x1e;
        uVar67 = *(uint *)(uVar57 + uVar50 + 0x1e);
        puVar9[2] = uVar50 + 0x22;
        uVar61 = *(uint *)(uVar57 + uVar50 + 0x22);
        puVar9[2] = uVar50 + 0x26;
        iVar37 = (uVar46 | ~uVar77) + (uVar77 | ~uVar46);
        uVar46 = -iVar37 - 2;
        uVar46 = (uVar41 | uVar46) - (uVar41 & iVar37 + 1U | uVar46 & ~uVar41);
        uVar46 = (uVar46 - (uVar46 ^ uVar34)) + (uVar34 & ~uVar46);
        uVar60 = uVar60 | uVar55 & (uVar46 - uVar44) + (uVar44 & ~uVar46) * 2;
        uVar46 = uVar38 & ~uVar60 | uVar60 & ~uVar38;
        uVar46 = uVar71 + uVar46 + ~(uVar71 & uVar46) + 1;
        uVar55 = uVar55 | (uVar81 - uVar46) + (uVar46 & ~uVar81) * 2;
        FUN_000264a4(uVar55 ^ uVar33,uVar53);
        FUN_000264a4(uVar55 ^ uVar36,uVar53);
        FUN_000266c4(*(undefined4 *)(uVar57 + extraout_r1_x00882),
                     *(undefined4 *)(uVar57 + extraout_r1_x00883));
        FUN_000264a4(uVar55 ^ uVar35,uVar53);
        *(undefined4 *)(uVar57 + extraout_r1_x00885) = extraout_r1_x00884;
        FUN_000264a4(uVar55 ^ uVar32,uVar53);
        FUN_000264a4(uVar55 ^ uVar39,uVar53);
        uVar46 = 0x84222325;
        uVar60 = 0xcbf29ce4;
        if (iVar16 != 0) {
          iVar37 = 0;
          do {
            uVar88 = (ulonglong)uVar46;
            iVar16 = iVar16 + -1;
            iVar28 = uVar46 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00887 + iVar37);
            iVar37 = iVar37 + 1;
            uVar71 = (uint)*pcVar15;
            uVar46 = (uint)(uVar88 * 0x1b3) ^ uVar71;
            uVar60 = uVar60 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar71 >> 0x1f;
          } while (iVar16 != 0);
        }
        uVar38 = *(uint *)(*puVar9 + extraout_r1_x00886);
        uVar71 = (uVar46 | uVar38) * 2;
        if (uVar71 - (uVar46 + uVar38) == iVar48 &&
            ((uVar60 | (int)uVar38 >> 0x1f) << 1 | (uVar46 | uVar38) >> 0x1f) -
            (uVar60 + ((int)uVar38 >> 0x1f) + (uint)CARRY4(uVar46,uVar38) +
            (uint)(uVar71 < uVar46 + uVar38)) == iVar62) {
          uVar61 = uVar67;
        }
        uVar55 = uVar55 ^ uVar61;
        break;
      case 0x4d:
        uVar55 = local_114 | 0x10;
        uVar50 = *local_118;
        uVar53 = local_118[1];
        uVar35 = local_118[2];
        FUN_000264a4(~(*(uint *)(uVar50 + uVar55 * 2 + (local_114 ^ 0xffffffef) + 1) ^ uVar53),
                     uVar53);
        uVar44 = *(uint *)(uVar50 + extraout_r1_x00157);
        FUN_000264a4(~(*(uint *)(uVar50 + (uVar46 | 8) * 2 + (uVar46 & 8) + (~uVar46 & 0xfffffff7) +
                                1) ^ uVar53),uVar53);
        uVar61 = *(uint *)(uVar50 + extraout_r1_x00158);
        puVar22 = (uint *)(uVar50 + uVar46);
        FUN_000264a4(~(*puVar22 ^ uVar53),uVar53);
        FUN_000264a4(~(puVar22[3] ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar50 + (uVar46 & 0x10) * 2 + (uVar46 ^ 0x10)) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar50 + (uVar46 & 4) * 2 + (uVar46 ^ 4)) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)((int)puVar22 + (~uVar46 | 0x10) + uVar55 + 1) ^ uVar53),uVar53);
        uVar55 = *(uint *)(uVar50 + extraout_r1_x00163);
        uVar67 = *(uint *)(uVar50 + extraout_r1_x00162);
        uVar36 = *(uint *)(uVar50 + extraout_r1_x00161);
        uVar71 = *(uint *)(uVar50 + extraout_r1_x00160);
        uVar39 = *(uint *)(uVar50 + extraout_r1_x00159);
        FUN_000264a4(~(*(uint *)(uVar50 + (uVar46 & 8) * 2 + (uVar46 ^ 8)) ^ uVar53),uVar53);
        uVar46 = *(uint *)(uVar50 + uVar35);
        uVar41 = *(uint *)(uVar50 + extraout_r1_x00164);
        puVar9[2] = uVar35 + 4;
        uVar38 = *(uint *)(uVar50 + uVar35 + 4);
        puVar9[2] = uVar35 + 8;
        local_134 = *(uint *)(uVar50 + uVar35 + 8);
        puVar9[2] = uVar35 + 0xc;
        uVar34 = *(uint *)(uVar50 + uVar35 + 0xc);
        puVar9[2] = uVar35 + 0x10;
        uVar32 = *(uint *)(uVar50 + uVar35 + 0x10);
        puVar9[2] = uVar35 + 0x14;
        local_150 = *(uint *)(uVar50 + uVar35 + 0x14);
        puVar9[2] = uVar35 + 0x18;
        uVar33 = *(uint *)(uVar50 + uVar35 + 0x18);
        puVar9[2] = uVar35 + 0x1c;
        iVar37 = (int)*(short *)(uVar50 + uVar35 + 0x1c);
        puVar9[2] = uVar35 + 0x1e;
        piVar47 = (int *)(uVar50 + uVar35 + 0x1e);
        iVar62 = *piVar47;
        uVar60 = piVar47[1];
        puVar9[2] = uVar35 + 0x26;
        uVar44 = (uVar41 - (uVar41 ^ uVar39)) + (uVar39 & ~uVar41) & uVar44;
        uVar71 = uVar71 & ((uVar39 & ~uVar44) * 2 - (uVar39 | ~uVar44)) + (uVar44 | ~uVar39);
        uVar71 = uVar36 + (uVar71 & ~uVar36) * 2 + (uVar36 | ~uVar71) + 1;
        uVar61 = uVar61 ^ ((uVar67 | uVar71) - (uVar71 & ~uVar67)) + (uVar71 | ~uVar67) + 1;
        uVar55 = uVar61 & ~uVar55 | uVar55 & ~uVar61;
        FUN_000264a4(uVar55 ^ uVar34,uVar53);
        FUN_000264a4(uVar55 ^ uVar32,uVar53);
        bVar3 = *(byte *)(uVar50 + extraout_r1_x00166);
        bVar4 = *(byte *)(uVar50 + extraout_r1_x00165);
        FUN_000264a4(uVar55 ^ uVar38,uVar53);
        *(byte *)(uVar50 + extraout_r1_x00167) = bVar4 | bVar3;
        FUN_000264a4(uVar55 ^ uVar46,uVar53);
        FUN_000264a4(uVar55 ^ uVar33,uVar53);
        uVar61 = 0x84222325;
        uVar46 = 0xcbf29ce4;
        if (iVar37 != 0) {
          iVar48 = 0;
          do {
            uVar88 = (ulonglong)uVar61;
            iVar37 = iVar37 + -1;
            iVar16 = uVar61 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00169 + iVar48);
            iVar48 = iVar48 + 1;
            uVar71 = (uint)*pcVar15;
            uVar61 = (uint)(uVar88 * 0x1b3) ^ uVar71;
            uVar46 = uVar46 * 0x1b3 + iVar16 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar71 >> 0x1f;
          } while (iVar37 != 0);
        }
        uVar38 = *(uint *)(*puVar9 + extraout_r1_x00168);
        uVar71 = (uVar61 | uVar38) * 2;
        iVar37 = uVar71 - (uVar61 + uVar38);
        uVar60 = ((uVar46 | (int)uVar38 >> 0x1f) << 1 | (uVar61 | uVar38) >> 0x1f) -
                 (uVar46 + ((int)uVar38 >> 0x1f) + (uint)CARRY4(uVar61,uVar38) +
                 (uint)(uVar71 < uVar61 + uVar38)) ^ uVar60;
        goto LAB_0006d7b0;
      case 0x4e:
        uVar67 = *local_118;
        uVar53 = local_118[1];
        uVar33 = local_118[2];
        puVar22 = (uint *)(uVar67 + local_114);
        FUN_000264a4(~(*puVar22 ^ uVar53),uVar53);
        uVar46 = puVar22[1];
        uVar61 = puVar22[3];
        uVar71 = puVar22[4];
        FUN_000264a4(~(puVar22[2] ^ uVar53),uVar53);
        FUN_000264a4(~(uVar46 ^ uVar53),uVar53);
        uVar55 = *(uint *)(uVar67 + extraout_r1_x00840);
        uVar46 = *(uint *)(uVar67 + extraout_r1_x00839);
        FUN_000264a4(~(uVar61 ^ uVar53),uVar53);
        uVar60 = *(uint *)(uVar67 + extraout_r1_x00841);
        uVar36 = *(uint *)(uVar67 + extraout_r1_x00838);
        FUN_000264a4(~(uVar71 ^ uVar53),uVar53);
        uVar71 = *(uint *)(uVar67 + extraout_r1_x00842);
        uVar61 = *(uint *)(uVar67 + uVar33);
        puVar9[2] = uVar33 + 4;
        uVar38 = *(uint *)(uVar67 + uVar33 + 4);
        puVar9[2] = uVar33 + 8;
        iVar28 = (int)*(short *)(uVar67 + uVar33 + 8);
        puVar9[2] = uVar33 + 10;
        uVar32 = *(uint *)(uVar67 + uVar33 + 10);
        puVar9[2] = uVar33 + 0xe;
        piVar47 = (int *)(uVar67 + uVar33 + 0xe);
        iVar48 = *piVar47;
        iVar16 = piVar47[1];
        puVar9[2] = uVar33 + 0x16;
        uVar34 = *(uint *)(uVar67 + uVar33 + 0x16);
        puVar9[2] = uVar33 + 0x1a;
        uVar41 = *(uint *)(uVar67 + uVar33 + 0x1a);
        puVar9[2] = uVar33 + 0x1e;
        uVar44 = *(uint *)(uVar67 + uVar33 + 0x1e);
        puVar9[2] = uVar33 + 0x22;
        uVar35 = *(uint *)(uVar67 + uVar33 + 0x22);
        puVar9[2] = uVar33 + 0x26;
        uVar55 = uVar55 ^ (uVar60 | uVar71 ^ uVar36 | uVar46);
        FUN_000264a4(uVar55 ^ uVar38,uVar53);
        FUN_000264a4(uVar55 ^ uVar32,uVar53);
        iVar37 = *(int *)(uVar67 + extraout_r1_x00843);
        iVar62 = *(int *)(uVar67 + extraout_r1_x00844);
        FUN_000264a4(uVar55 ^ uVar35,uVar53);
        *(int *)(*puVar9 + extraout_r1_x00845) = iVar62 * iVar37;
        FUN_000264a4(uVar55 ^ uVar34,uVar53);
        FUN_000264a4(uVar55 ^ uVar44,uVar53);
        uVar46 = 0x84222325;
        uVar60 = 0xcbf29ce4;
        if (iVar28 != 0) {
          iVar37 = 0;
          do {
            uVar88 = (ulonglong)uVar46;
            iVar28 = iVar28 + -1;
            iVar62 = uVar46 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00846 + iVar37);
            iVar37 = iVar37 + 1;
            uVar71 = (uint)*pcVar15;
            uVar46 = (uint)(uVar88 * 0x1b3) ^ uVar71;
            uVar60 = uVar60 * 0x1b3 + iVar62 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar71 >> 0x1f;
          } while (iVar28 != 0);
        }
        uVar38 = *(uint *)(*puVar9 + extraout_r1_x00847);
        uVar71 = (uVar46 | uVar38) * 2;
        if (uVar71 - (uVar46 + uVar38) == iVar48 &&
            ((uVar60 | (int)uVar38 >> 0x1f) << 1 | (uVar46 | uVar38) >> 0x1f) -
            (uVar60 + ((int)uVar38 >> 0x1f) + (uint)CARRY4(uVar46,uVar38) +
            (uint)(uVar71 < uVar46 + uVar38)) == iVar16) {
          uVar61 = uVar41;
        }
        uVar55 = uVar55 ^ uVar61;
        break;
      case 0x4f:
        uVar36 = *local_118;
        uVar53 = local_118[1];
        uVar35 = local_118[2];
        puVar22 = (uint *)(uVar36 + local_114);
        FUN_000264a4(~(*puVar22 ^ uVar53),uVar53);
        uVar61 = puVar22[1];
        uVar55 = puVar22[3];
        uVar46 = puVar22[4];
        FUN_000264a4(~(puVar22[2] ^ uVar53),uVar53);
        FUN_000264a4(~(uVar46 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar55 ^ uVar53),uVar53);
        uVar55 = *(uint *)(uVar36 + extraout_r1_x00851);
        uVar46 = *(uint *)(uVar36 + extraout_r1_x00850);
        uVar67 = *(uint *)(uVar36 + extraout_r1_x00849);
        uVar33 = *(uint *)(uVar36 + extraout_r1_x00848);
        FUN_000264a4(~(uVar61 ^ uVar53),uVar53);
        uVar38 = *(uint *)(uVar36 + extraout_r1_x00852);
        uVar60 = *(uint *)(uVar36 + uVar35);
        puVar9[2] = uVar35 + 4;
        uVar34 = *(uint *)(uVar36 + uVar35 + 4);
        puVar9[2] = uVar35 + 8;
        uVar71 = *(uint *)(uVar36 + uVar35 + 8);
        puVar9[2] = uVar35 + 0xc;
        uVar61 = *(uint *)(uVar36 + uVar35 + 0xc);
        puVar9[2] = uVar35 + 0x10;
        piVar47 = (int *)(uVar36 + uVar35 + 0x10);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar35 + 0x18;
        iVar16 = (int)*(short *)(uVar36 + uVar35 + 0x18);
        puVar9[2] = uVar35 + 0x1a;
        uVar41 = *(uint *)(uVar36 + uVar35 + 0x1a);
        puVar9[2] = uVar35 + 0x1e;
        uVar32 = *(uint *)(uVar36 + uVar35 + 0x1e);
        puVar9[2] = uVar35 + 0x22;
        uVar44 = *(uint *)(uVar36 + uVar35 + 0x22);
        puVar9[2] = uVar35 + 0x26;
        uVar55 = uVar67 & (uVar38 ^ uVar33) & ~uVar46 ^ uVar55;
        FUN_000264a4(uVar55 ^ uVar60,uVar53);
        FUN_000264a4(uVar55 ^ uVar32,uVar53);
        uVar38 = *(uint *)(uVar36 + extraout_r1_x00853);
        uVar60 = *(uint *)(uVar36 + extraout_r1_x00854);
        uVar32 = ((uint *)(uVar36 + extraout_r1_x00853))[1];
        uVar46 = ((uint *)(uVar36 + extraout_r1_x00854))[1];
        iVar48 = 0;
        FUN_000264a4(uVar55 ^ uVar34,uVar53);
        *(uint *)(*puVar9 + extraout_r1_x00855) =
             (uint)(uVar32 <= uVar46 && (uint)(uVar60 <= uVar38) <= uVar32 - uVar46) -
             (uint)(uVar46 <= uVar32 && (uint)(uVar38 <= uVar60) <= uVar46 - uVar32);
        FUN_000264a4(uVar55 ^ uVar41,uVar53);
        FUN_000264a4(uVar55 ^ uVar44,uVar53);
        uVar46 = 0x84222325;
        uVar60 = 0xcbf29ce4;
        if (iVar16 != 0) {
          do {
            uVar88 = (ulonglong)uVar46;
            iVar16 = iVar16 + -1;
            iVar28 = uVar46 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00856 + iVar48);
            iVar48 = iVar48 + 1;
            uVar38 = (uint)*pcVar15;
            uVar46 = (uint)(uVar88 * 0x1b3) ^ uVar38;
            uVar60 = uVar60 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar38 >> 0x1f;
          } while (iVar16 != 0);
        }
        uVar34 = *(uint *)(*puVar9 + extraout_r1_x00857);
        uVar38 = (uVar46 | uVar34) * 2;
        bVar82 = uVar38 - (uVar46 + uVar34) == iVar37 &&
                 ((uVar60 | (int)uVar34 >> 0x1f) << 1 | (uVar46 | uVar34) >> 0x1f) -
                 (uVar60 + ((int)uVar34 >> 0x1f) + (uint)CARRY4(uVar46,uVar34) +
                 (uint)(uVar38 < uVar46 + uVar34)) == iVar62;
LAB_0006ffcc:
        if (bVar82) {
          uVar61 = uVar71;
        }
        uVar55 = uVar55 ^ uVar61;
        break;
      case 0x53:
        uVar57 = *local_118;
        uVar53 = local_118[1];
        uVar32 = local_118[2];
        iVar37 = uVar57 + (local_114 | 4) * 2 + 2;
        uVar55 = ~local_114;
        FUN_000264a4(~(*(uint *)(iVar37 + (local_114 | 0xfffffffb) + (uVar55 | 4)) ^ uVar53),uVar53)
        ;
        FUN_000264a4(~(*(uint *)(uVar57 + (uVar46 ^ 8) + (uVar46 << 1 | 0xffffffee) + 0x12) ^ uVar53
                      ),uVar53);
        FUN_000264a4(~(*(uint *)(iVar37 + (uVar46 ^ 4) + (uVar46 << 1 ^ 0xfffffff6)) ^ uVar53),
                     uVar53);
        uVar61 = *(uint *)(uVar57 + extraout_r1_x00663);
        uVar60 = *(uint *)(uVar57 + extraout_r1_x00662);
        uVar71 = *(uint *)(uVar57 + extraout_r1_x00661);
        FUN_000264a4(~(*(uint *)(uVar57 + (uVar46 & 4) * 2 + (uVar46 ^ 4)) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar57 + ((uVar46 & 8 | (uVar46 & 8) << 1) - (uVar46 | 8)) +
                                (uVar46 ^ 8) * 2) ^ uVar53),uVar53);
        puVar22 = (uint *)(uVar57 + uVar46);
        uVar38 = *puVar22;
        FUN_000264a4(~(puVar22[2] ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)((int)puVar22 + (uVar55 | 0x10) + (uVar46 | 0x10) + 1) ^ uVar53),
                     uVar53);
        FUN_000264a4(~(uVar38 ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar57 + (uVar46 & 0xc) * 2 + (uVar46 ^ 0xc)) ^ uVar53),uVar53);
        uVar38 = *(uint *)(uVar57 + extraout_r1_x00668);
        uVar51 = *(uint *)(uVar57 + extraout_r1_x00669);
        uVar65 = *(uint *)(uVar57 + extraout_r1_x00667);
        uVar41 = *(uint *)(uVar57 + extraout_r1_x00665);
        uVar34 = *(uint *)(uVar57 + extraout_r1_x00666);
        sVar12 = *(short *)(uVar57 + uVar32);
        iVar70 = (int)sVar12;
        uVar44 = *(uint *)(uVar57 + extraout_r1_x00664);
        puVar9[2] = uVar32 + 2;
        uVar33 = *(uint *)(uVar57 + uVar32 + 2);
        puVar9[2] = uVar32 + 6;
        uVar35 = *(uint *)(uVar57 + uVar32 + 6);
        puVar9[2] = uVar32 + 10;
        uVar36 = *(uint *)(uVar57 + uVar32 + 10);
        puVar9[2] = uVar32 + 0xe;
        uVar67 = *(uint *)(uVar57 + uVar32 + 0xe);
        puVar9[2] = uVar32 + 0x12;
        uVar39 = *(uint *)(uVar57 + uVar32 + 0x12);
        puVar9[2] = uVar32 + 0x16;
        puVar22 = (uint *)(uVar57 + uVar32 + 0x16);
        uVar79 = *puVar22;
        uVar50 = puVar22[1];
        puVar9[2] = uVar32 + 0x1e;
        piVar47 = (int *)(uVar57 + uVar32 + 0x1e);
        iVar48 = *piVar47;
        iVar16 = piVar47[1];
        puVar9[2] = uVar32 + 0x26;
        uVar55 = *(uint *)(uVar57 + uVar32 + 0x26);
        puVar9[2] = uVar32 + 0x2a;
        iVar28 = (int)*(short *)(uVar57 + uVar32 + 0x2a);
        puVar9[2] = uVar32 + 0x2c;
        uVar80 = *(uint *)(uVar57 + uVar32 + 0x2c);
        puVar9[2] = uVar32 + 0x30;
        uVar57 = *(uint *)(uVar57 + uVar32 + 0x30);
        puVar9[2] = uVar32 + 0x34;
        uVar77 = *puVar9;
        uVar81 = *(uint *)(uVar77 + uVar32 + 0x34);
        puVar9[2] = uVar32 + 0x38;
        uVar71 = (uVar71 - uVar44) + (uVar44 & ~uVar71) * 2;
        uVar71 = (uVar71 - uVar41) + (uVar41 & ~uVar71) * 2;
        uVar60 = (uVar60 & uVar71) + (uVar60 ^ uVar71);
        uVar60 = ~(uVar34 + uVar60) + (uVar34 | uVar60);
        uVar38 = uVar38 & (uVar60 & uVar65) + ~(uVar65 | uVar60);
        uVar60 = (uVar51 | uVar38) + (uVar38 & ~uVar51) + (uVar51 | ~uVar38) + 1;
        uVar71 = ~uVar61;
        local_150 = ((uVar61 | uVar60) + uVar71) - (uVar60 | uVar71);
        FUN_000264a4(local_150 ^ uVar33,uVar53);
        FUN_000264a4(local_150 ^ uVar80,uVar53);
        iVar37 = *(int *)(uVar77 + extraout_r1_x00670);
        iVar62 = *(int *)(uVar77 + extraout_r1_x00671);
        FUN_000264a4(local_150 ^ uVar57,uVar53);
        puVar22 = (uint *)(uVar77 + uVar46);
        uVar61 = *puVar22;
        uVar71 = puVar22[4];
        uVar46 = puVar22[1];
        uVar60 = puVar22[2];
        uVar38 = puVar22[3];
        FUN_000264a4(~(uVar71 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar60 ^ uVar53),uVar53);
        uVar60 = puVar9[1];
        FUN_000264a4(~(uVar38 ^ uVar60),uVar60);
        FUN_000264a4(~(uVar71 ^ uVar60),uVar60);
        FUN_000264a4(~(uVar46 ^ uVar60),uVar60);
        FUN_000264a4(~(uVar61 ^ uVar60),uVar60);
        uVar61 = *(uint *)(uVar77 + extraout_r1_x00678);
        uVar46 = *(uint *)(uVar77 + extraout_r1_x00677);
        uVar60 = *(uint *)(uVar77 + extraout_r1_x00676);
        uVar71 = *(uint *)(uVar77 + extraout_r1_x00675);
        uVar38 = *(uint *)(uVar77 + extraout_r1_x00674);
        uVar34 = *(uint *)(uVar77 + extraout_r1_x00673);
        *(int *)(uVar77 + extraout_r1_x00672) = iVar62 + iVar37;
        FUN_000264a4(local_150 ^ uVar35,uVar53);
        FUN_000264a4(local_150 ^ uVar39,uVar53);
        FUN_000264a4(local_150 ^ uVar81,uVar53);
        uVar41 = 0x84222325;
        uVar32 = *puVar9;
        uVar44 = 0xcbf29ce4;
        if (iVar28 != 0) {
          iVar37 = 0;
          do {
            uVar88 = (ulonglong)uVar41;
            iVar28 = iVar28 + -1;
            iVar62 = uVar41 * 0x100;
            pcVar15 = (char *)(uVar32 + extraout_r1_x00679 + iVar37);
            iVar37 = iVar37 + 1;
            uVar33 = (uint)*pcVar15;
            uVar41 = (uint)(uVar88 * 0x1b3) ^ uVar33;
            uVar44 = uVar44 * 0x1b3 + iVar62 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar33 >> 0x1f;
          } while (iVar28 != 0);
        }
        uVar33 = *(uint *)(uVar32 + extraout_r1_x00680);
        uVar61 = uVar61 & (uVar46 ^ (uVar60 | uVar71 ^ (uVar38 | uVar34)));
        uVar60 = uVar61 | (int)uVar61 >> 0x1f;
        uVar46 = (int)uVar33 >> 0x1f;
        if ((uVar61 & ~(uVar41 ^ uVar33) | (uVar41 ^ uVar33) & ~uVar61) != uVar79 ||
            (uVar60 & ~(uVar44 ^ uVar46) | (uVar44 ^ uVar46) & ~uVar60) != uVar50) {
          uVar55 = 0x84222325;
          uVar71 = 0xcbf29ce4;
          if (sVar12 != 0) {
            iVar37 = 0;
            do {
              uVar88 = (ulonglong)uVar55;
              iVar70 = iVar70 + -1;
              iVar62 = uVar55 * 0x100;
              pcVar15 = (char *)(uVar32 + extraout_r1_x00681 + iVar37);
              iVar37 = iVar37 + 1;
              uVar38 = (uint)*pcVar15;
              uVar55 = (uint)(uVar88 * 0x1b3) ^ uVar38;
              uVar71 = uVar71 * 0x1b3 + iVar62 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar38 >> 0x1f
              ;
            } while (iVar70 != 0);
          }
          uVar38 = (uVar33 & ~uVar55) * 2;
          uVar34 = (uVar55 - uVar33) + uVar38;
          uVar71 = (uVar71 - (uVar46 + (uVar55 < uVar33))) +
                   ((~uVar71 & uVar46) << 1 | (uVar33 & ~uVar55) >> 0x1f) +
                   (uint)CARRY4(uVar55 - uVar33,uVar38);
          uVar46 = (uVar61 & ~uVar34) * 2;
          uVar55 = uVar36;
          if ((uVar34 - uVar61) + uVar46 == iVar48 &&
              (uVar71 - (uVar60 + (uVar34 < uVar61))) +
              ((uVar60 & ~uVar71) << 1 | (uVar61 & ~uVar34) >> 0x1f) +
              (uint)CARRY4(uVar34 - uVar61,uVar46) == iVar16) {
            uVar55 = uVar67;
          }
        }
        goto LAB_0006d00c;
      case 0x56:
        uVar32 = *local_118;
        uVar53 = local_118[1];
        uVar33 = local_118[2];
        puVar22 = (uint *)(uVar32 + local_114);
        uVar46 = *puVar22;
        uVar61 = puVar22[3];
        uVar60 = puVar22[1];
        uVar55 = puVar22[4];
        FUN_000264a4(~(puVar22[2] ^ uVar53),uVar53);
        FUN_000264a4(~(uVar46 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar55 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar60 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar61 ^ uVar53),uVar53);
        uVar36 = *(uint *)(uVar32 + extraout_r1_x00494);
        uVar35 = *(uint *)(uVar32 + extraout_r1_x00496);
        uVar55 = *(uint *)(uVar32 + extraout_r1_x00495);
        uVar71 = *(uint *)(uVar32 + extraout_r1_x00493);
        uVar41 = *(uint *)(uVar32 + extraout_r1_x00492);
        uVar34 = *(uint *)(uVar32 + uVar33);
        puVar9[2] = uVar33 + 4;
        uVar61 = *(uint *)(uVar32 + uVar33 + 4);
        puVar9[2] = uVar33 + 8;
        iVar48 = (int)*(short *)(uVar32 + uVar33 + 8);
        puVar9[2] = uVar33 + 10;
        local_134 = *(uint *)(uVar32 + uVar33 + 10);
        puVar9[2] = uVar33 + 0xe;
        piVar47 = (int *)(uVar32 + uVar33 + 0xe);
        iVar62 = *piVar47;
        iVar37 = piVar47[1];
        puVar9[2] = uVar33 + 0x16;
        uVar60 = *(uint *)(uVar32 + uVar33 + 0x16);
        puVar9[2] = uVar33 + 0x1a;
        uVar44 = *(uint *)(uVar32 + uVar33 + 0x1a);
        puVar9[2] = uVar33 + 0x1e;
        uVar46 = *(uint *)(uVar32 + uVar33 + 0x1e);
        puVar9[2] = uVar33 + 0x22;
        uVar38 = *(uint *)(uVar32 + uVar33 + 0x22);
        puVar9[2] = uVar33 + 0x26;
        uVar55 = uVar35 ^ uVar55 & (uVar71 | uVar41 | uVar36) ^ uVar55;
        FUN_000264a4(uVar55 ^ uVar60,uVar53);
        FUN_000264a4(uVar55 ^ uVar44,uVar53);
        uVar71 = *(uint *)(uVar32 + extraout_r1_x00498);
        uVar60 = *(uint *)(uVar32 + extraout_r1_x00497);
        FUN_000264a4(uVar55 ^ uVar61,uVar53);
        *(uint *)(*puVar9 + extraout_r1_x00499) = uVar60 >> (uVar71 & 0x1f);
        FUN_000264a4(uVar55 ^ uVar34,uVar53);
        FUN_000264a4(uVar55 ^ uVar38,uVar53);
        uVar61 = 0x84222325;
        uVar60 = 0xcbf29ce4;
        if (iVar48 != 0) {
          iVar16 = 0;
          do {
            uVar88 = (ulonglong)uVar61;
            iVar48 = iVar48 + -1;
            iVar28 = uVar61 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00501 + iVar16);
            iVar16 = iVar16 + 1;
            uVar71 = (uint)*pcVar15;
            uVar61 = (uint)(uVar88 * 0x1b3) ^ uVar71;
            uVar60 = uVar60 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar71 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar38 = *(uint *)(*puVar9 + extraout_r1_x00500);
        uVar71 = (uVar61 | uVar38) * 2;
        bVar82 = uVar71 - (uVar61 + uVar38) == iVar62 &&
                 ((uVar60 | (int)uVar38 >> 0x1f) << 1 | (uVar61 | uVar38) >> 0x1f) -
                 (uVar60 + ((int)uVar38 >> 0x1f) + (uint)CARRY4(uVar61,uVar38) +
                 (uint)(uVar71 < uVar61 + uVar38)) == iVar37;
        goto LAB_0006a25c;
      case 0x58:
        uVar67 = *local_118;
        uVar36 = local_118[1];
        uVar57 = local_118[2];
        puVar22 = (uint *)(uVar67 + local_114);
        FUN_000264a4(~(*puVar22 ^ uVar36),uVar36);
        uVar61 = puVar22[1];
        uVar53 = puVar22[2];
        uVar55 = puVar22[3];
        FUN_000264a4(~(puVar22[4] ^ uVar36),uVar36);
        FUN_000264a4(~(uVar55 ^ uVar36),uVar36);
        FUN_000264a4(~(uVar61 ^ uVar36),uVar36);
        uVar41 = *(uint *)(uVar67 + extraout_r1_x00685);
        uVar61 = *(uint *)(uVar67 + extraout_r1_x00684);
        uVar55 = *(uint *)(uVar67 + extraout_r1_x00683);
        uVar60 = *(uint *)(uVar67 + extraout_r1_x00682);
        FUN_000264a4(~(uVar53 ^ uVar36),uVar36);
        uVar49 = *(uint *)(uVar67 + extraout_r1_x00686);
        uVar72 = *(uint *)(uVar67 + uVar57);
        uVar71 = ((uint *)(uVar67 + uVar57))[1];
        puVar9[2] = uVar57 + 8;
        uVar53 = *(uint *)(uVar67 + uVar57 + 8);
        uVar80 = *puVar9;
        puVar9[2] = uVar57 + 0xc;
        uVar38 = *(uint *)(uVar67 + uVar57 + 0xc);
        puVar9[2] = uVar57 + 0x10;
        uVar34 = *(uint *)(uVar67 + uVar57 + 0x10);
        puVar9[2] = uVar57 + 0x14;
        uVar44 = *(uint *)(uVar67 + uVar57 + 0x14);
        puVar9[2] = uVar57 + 0x18;
        uVar32 = *(uint *)(uVar67 + uVar57 + 0x18);
        puVar9[2] = uVar57 + 0x1c;
        piVar47 = (int *)(uVar67 + uVar57 + 0x1c);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar57 + 0x24;
        uVar33 = *(uint *)(uVar67 + uVar57 + 0x24);
        puVar9[2] = uVar57 + 0x28;
        uVar35 = *(uint *)(uVar67 + uVar57 + 0x28);
        puVar9[2] = uVar57 + 0x2c;
        uVar67 = *(uint *)(uVar67 + uVar57 + 0x2c);
        uVar78 = puVar9[1];
        puVar9[2] = uVar57 + 0x30;
        sVar12 = *(short *)(uVar80 + uVar57 + 0x30);
        puVar9[2] = uVar57 + 0x32;
        uVar39 = *(uint *)(uVar80 + uVar57 + 0x32);
        puVar9[2] = uVar57 + 0x36;
        sVar6 = *(short *)(uVar80 + uVar57 + 0x36);
        puVar9[2] = uVar57 + 0x38;
        uVar50 = *(uint *)(uVar80 + uVar57 + 0x38);
        uVar79 = uVar46 & 4;
        puVar9[2] = uVar57 + 0x3c;
        FUN_000264a4(~(*(uint *)(uVar80 + uVar79 * 2 + (uVar46 ^ 4) * 3 + (uVar46 << 1 ^ 0xfffffff6)
                                + 2) ^ uVar78),uVar78);
        uVar57 = *(uint *)(uVar80 + extraout_r1_x00687);
        FUN_000264a4(~(*(uint *)(uVar80 + ((uVar46 & 0x10 |
                                           (uVar46 & 0xffffffef) + (uVar46 & 0x10) * 2) ^ 0x10)) ^
                      uVar78),uVar78);
        uVar77 = *(uint *)(uVar80 + extraout_r1_x00688);
        FUN_000264a4(~(*(uint *)(uVar80 + uVar46) ^ uVar78),uVar78);
        uVar81 = *(uint *)(uVar80 + extraout_r1_x00689);
        FUN_000264a4(~(*(uint *)(uVar80 + ((uVar79 | uVar79 << 1) - (uVar46 | 4)) + (uVar46 ^ 4) * 2
                                ) ^ uVar78),uVar78);
        uVar79 = *(uint *)(uVar80 + extraout_r1_x00690);
        FUN_000264a4(~(*(uint *)(uVar80 + ((uVar46 & 8 | (uVar46 & 8) << 1) - (uVar46 | 8)) +
                                (uVar46 ^ 8) * 2) ^ uVar78),uVar78);
        uVar80 = *(uint *)(uVar80 + extraout_r1_x00691);
        uVar75 = *puVar9;
        uVar20 = puVar9[1];
        FUN_000264a4(~(*(uint *)(uVar75 + uVar46) ^ uVar78),uVar78);
        uVar51 = *(uint *)(uVar75 + extraout_r1_x00692);
        FUN_000264a4(~(*(uint *)(uVar75 + (uVar46 | 0xc) * 2 + (uVar46 | 0xfffffff3) +
                                 (~uVar46 | 0xc) + 2) ^ uVar20),uVar20);
        uVar65 = *(uint *)(uVar75 + extraout_r1_x00693);
        uVar41 = uVar41 | uVar61 ^ (uVar55 | uVar49 & uVar60) ^ uVar49;
        FUN_000264a4(uVar41 ^ uVar34,uVar36);
        FUN_000264a4(uVar41 ^ uVar32,uVar36);
        FUN_000264a4(uVar41 ^ uVar33,uVar36);
        FUN_000264a4(uVar41 ^ uVar35,uVar36);
        FUN_000264a4(uVar41 ^ uVar39,uVar78);
        FUN_000264a4(uVar41 ^ uVar50,uVar78);
        dVar84 = *(double *)(uVar75 + extraout_r1_x00694);
        dVar85 = *(double *)(uVar75 + extraout_r1_x00696);
        FUN_000264a4(~(((uint *)(uVar75 + uVar46))[2] ^ uVar20),uVar20);
        bVar82 = NAN(dVar85);
        uVar61 = in_fpscr & 0xfffffff;
        uVar46 = *(uint *)(uVar75 + extraout_r1_x00700);
        in_fpscr = uVar61 | (uint)(bVar82 || NAN(dVar84)) << 0x1c;
        if (!bVar82) {
          bVar82 = SUB41(in_fpscr >> 0x1c,0);
        }
        if (bVar82) {
          FUN_000264a4(uVar41 ^ uVar44,uVar36);
          uVar83 = *(undefined4 *)(uVar75 + extraout_r1_x00701);
        }
        else {
          uVar61 = uVar61 | (uint)(dVar85 < dVar84) << 0x1f | (uint)(dVar85 == dVar84) << 0x1e;
          in_fpscr = uVar61 | (uint)(NAN(dVar85) || NAN(dVar84)) << 0x1c;
          uVar83 = 0xffffffff;
          bVar3 = (byte)(uVar61 >> 0x18);
          bVar82 = (bool)(bVar3 >> 6 & 1);
          if (!bVar82 && bVar3 >> 7 == ((byte)(in_fpscr >> 0x1c) & 1)) {
            uVar83 = 1;
          }
          if (bVar82) {
            uVar83 = 0;
          }
        }
        uVar55 = 0xcbf29ce4;
        *(undefined4 *)(uVar75 + extraout_r1_x00698) = uVar83;
        uVar61 = 0x84222325;
        uVar60 = *puVar9;
        if (sVar12 != 0) {
          iVar48 = (int)sVar12;
          iVar16 = 0;
          do {
            uVar88 = (ulonglong)uVar61;
            iVar48 = iVar48 + -1;
            iVar28 = uVar61 * 0x100;
            pcVar15 = (char *)(uVar60 + extraout_r1_x00699 + iVar16);
            iVar16 = iVar16 + 1;
            uVar34 = (uint)*pcVar15;
            uVar61 = (uint)(uVar88 * 0x1b3) ^ uVar34;
            uVar55 = uVar55 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar34 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar34 = ~(uVar57 & uVar77);
        uVar34 = uVar79 + ((uVar81 + (uVar81 ^ uVar34)) - (uVar81 | uVar34) | ~uVar79) + 1;
        uVar34 = (uVar80 | uVar34) * 2 - (uVar80 + uVar34);
        uVar46 = uVar65 + (uVar51 + uVar34 + ~(uVar34 & uVar51) * 2 + 2 | ~uVar65) + 1 & uVar46;
        uVar44 = *(uint *)(uVar60 + extraout_r1_x00697);
        uVar32 = uVar46 | (int)uVar46 >> 0x1f;
        uVar34 = (int)uVar44 >> 0x1f;
        if ((uVar46 & ~(uVar61 ^ uVar44) | (uVar61 ^ uVar44) & ~uVar46) != uVar72 ||
            (uVar32 & ~(uVar55 ^ uVar34) | (uVar55 ^ uVar34) & ~uVar32) != uVar71) {
          uVar53 = 0x84222325;
          uVar61 = 0xcbf29ce4;
          if (sVar6 != 0) {
            iVar16 = (int)sVar6;
            iVar48 = 0;
            do {
              uVar88 = (ulonglong)uVar53;
              iVar16 = iVar16 + -1;
              iVar28 = uVar53 * 0x100;
              pcVar15 = (char *)(uVar60 + extraout_r1_x00695 + iVar48);
              iVar48 = iVar48 + 1;
              uVar55 = (uint)*pcVar15;
              uVar53 = (uint)(uVar88 * 0x1b3) ^ uVar55;
              uVar61 = uVar61 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar55 >> 0x1f
              ;
            } while (iVar16 != 0);
          }
          uVar55 = (uVar44 & ~uVar53) * 2;
          uVar60 = (uVar53 - uVar44) + uVar55;
          uVar55 = (uVar61 - (uVar34 + (uVar53 < uVar44))) +
                   ((~uVar61 & uVar34) << 1 | (uVar44 & ~uVar53) >> 0x1f) +
                   (uint)CARRY4(uVar53 - uVar44,uVar55);
          uVar61 = (uVar46 & ~uVar60) * 2;
          uVar53 = uVar38;
          if ((uVar60 - uVar46) + uVar61 == iVar37 &&
              (uVar55 - (uVar32 + (uVar60 < uVar46))) +
              ((uVar32 & ~uVar55) << 1 | (uVar46 & ~uVar60) >> 0x1f) +
              (uint)CARRY4(uVar60 - uVar46,uVar61) == iVar62) {
            uVar53 = uVar67;
          }
        }
        uVar41 = uVar41 ^ uVar53;
        goto LAB_00071ca8;
      case 0x5a:
        uVar39 = *local_118;
        uVar53 = local_118[1];
        uVar35 = local_118[2];
        FUN_000264a4(~(*(uint *)(uVar39 + (local_114 ^ 0xc) + (local_114 << 1 | 0xffffffe6) + 0x1a)
                      ^ uVar53),uVar53);
        uVar61 = uVar46 << 1 ^ 0xffffffee;
        uVar71 = uVar46 & 8;
        FUN_000264a4(~(*(uint *)(uVar39 + (uVar46 & 0xfffffff7 ^ 0xfffffff7) * -3 + ~uVar71 + uVar61
                                ) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar39 + (uVar46 | 4) * 2 + (uVar46 ^ 4) +
                                 (uVar46 << 1 ^ 0xfffffff6) + 2) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar39 + (uVar46 | 0x10) * 2 + (uVar46 | 0xffffffef) +
                                 (~uVar46 | 0x10) + 2) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar39 + (uVar46 ^ 0x10) + (uVar46 << 1 | 0xffffffde) + 0x22) ^
                      uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar39 + (uVar46 | 8) * 2 + (uVar46 ^ 8) + uVar61 + 2) ^ uVar53),
                     uVar53);
        uVar61 = *(uint *)(uVar39 + extraout_r1_x00249);
        uVar55 = *(uint *)(uVar39 + extraout_r1_x00248);
        uVar60 = *(uint *)(uVar39 + extraout_r1_x00247);
        uVar50 = *(uint *)(uVar39 + extraout_r1_x00246);
        uVar36 = *(uint *)(uVar39 + extraout_r1_x00245);
        uVar67 = *(uint *)(uVar39 + extraout_r1_x00244);
        FUN_000264a4(~(*(uint *)(uVar39 + uVar46) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar39 + ((uVar71 | (uVar46 & 0xfffffff7) + uVar71 * 2) ^ 8)) ^
                      uVar53),uVar53);
        local_134 = *(uint *)(uVar39 + uVar35);
        uVar34 = *(uint *)(uVar39 + extraout_r1_x00250);
        uVar38 = *(uint *)(uVar39 + extraout_r1_x00251);
        puVar9[2] = uVar35 + 4;
        uVar46 = *(uint *)(uVar39 + uVar35 + 4);
        puVar9[2] = uVar35 + 8;
        uVar71 = *(uint *)(uVar39 + uVar35 + 8);
        puVar9[2] = uVar35 + 0xc;
        uVar41 = *(uint *)(uVar39 + uVar35 + 0xc);
        puVar9[2] = uVar35 + 0x10;
        uVar44 = *(uint *)(uVar39 + uVar35 + 0x10);
        puVar9[2] = uVar35 + 0x14;
        uVar32 = *(uint *)(uVar39 + uVar35 + 0x14);
        puVar9[2] = uVar35 + 0x18;
        piVar47 = (int *)(uVar39 + uVar35 + 0x18);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar35 + 0x20;
        iVar48 = (int)*(short *)(uVar39 + uVar35 + 0x20);
        puVar9[2] = uVar35 + 0x22;
        uVar33 = *(uint *)(uVar39 + uVar35 + 0x22);
        puVar9[2] = uVar35 + 0x26;
        uVar34 = uVar67 & ~uVar34 | uVar34 & ~uVar67;
        uVar38 = (uVar38 - ((uVar38 | ~uVar34) + (uVar38 | uVar34) * 2)) - 2 | uVar36;
        uVar60 = uVar60 + ~(uVar60 | ((uVar50 & uVar36 + ~uVar38) - uVar50) +
                                     (uVar50 | uVar38 - uVar36));
        uVar55 = (~uVar61 + uVar61 * 2) - ((uVar60 & uVar55) + ~(uVar60 + uVar55) | uVar61);
        FUN_000264a4(uVar55 ^ uVar46,uVar53);
        FUN_000264a4(uVar55 ^ uVar41,uVar53);
        FUN_000264a4(uVar55 ^ uVar32,uVar53);
        *(double *)(uVar39 + extraout_r1_x00252) =
             *(double *)(uVar39 + extraout_r1_x00254) * *(double *)(uVar39 + extraout_r1_x00253);
        FUN_000264a4(uVar55 ^ uVar44,uVar53);
        FUN_000264a4(uVar55 ^ uVar33,uVar53);
        uVar61 = 0x84222325;
        uVar46 = 0xcbf29ce4;
        if (iVar48 != 0) {
          iVar16 = 0;
          do {
            uVar88 = (ulonglong)uVar61;
            iVar48 = iVar48 + -1;
            iVar28 = uVar61 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00256 + iVar16);
            iVar16 = iVar16 + 1;
            uVar60 = (uint)*pcVar15;
            uVar61 = (uint)(uVar88 * 0x1b3) ^ uVar60;
            uVar46 = uVar46 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar60 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar38 = *(uint *)(*puVar9 + extraout_r1_x00255);
        uVar60 = (uVar61 | uVar38) * 2;
        bVar82 = uVar60 - (uVar61 + uVar38) == iVar37 &&
                 ((uVar46 | (int)uVar38 >> 0x1f) << 1 | (uVar61 | uVar38) >> 0x1f) -
                 (uVar46 + ((int)uVar38 >> 0x1f) + (uint)CARRY4(uVar61,uVar38) +
                 (uint)(uVar60 < uVar61 + uVar38)) == iVar62;
        goto LAB_00065c18;
      case 0x5b:
        uVar61 = *local_118;
        uVar34 = local_114 ^ 4;
        uVar36 = local_118[1];
        uVar72 = local_118[2];
        FUN_000264a4(~(*(uint *)(uVar61 + uVar34 + (local_114 << 1 | 0xfffffff6) + 10) ^ uVar36),
                     uVar36);
        uVar80 = uVar46 | 4;
        FUN_000264a4(~(*(uint *)(uVar61 + uVar80 * 2 + (uVar46 ^ 0xfffffffb) + 1) ^ uVar36),uVar36);
        FUN_000264a4(~(*(uint *)(uVar61 + (uVar46 << 1 | 0x21) + (uVar46 ^ 0xffffffef)) ^ uVar36),
                     uVar36);
        uVar44 = ~uVar46;
        FUN_000264a4(~(*(uint *)(uVar61 + (uVar46 | 0xc) * 2 + (uVar46 | 0xfffffff3) +
                                 (uVar44 | 0xc) + 2) ^ uVar36),uVar36);
        uVar32 = uVar46 | 0x10;
        FUN_000264a4(~(*(uint *)(uVar61 + uVar32 * 2 + (uVar46 ^ 0x10) + (uVar46 << 1 ^ 0xffffffde)
                                + 2) ^ uVar36),uVar36);
        uVar41 = *(uint *)(uVar61 + extraout_r1_x00174);
        uVar53 = *(uint *)(uVar61 + extraout_r1_x00173);
        uVar55 = *(uint *)(uVar61 + extraout_r1_x00172);
        uVar60 = *(uint *)(uVar61 + extraout_r1_x00171);
        uVar71 = *(uint *)(uVar61 + extraout_r1_x00170);
        FUN_000264a4(~(*(uint *)(uVar61 + uVar46) ^ uVar36),uVar36);
        FUN_000264a4(~(*(uint *)(uVar61 + (uVar46 | 8) + (uVar46 & 8)) ^ uVar36),uVar36);
        uVar33 = uVar46 & 4;
        FUN_000264a4(~(*(uint *)(uVar61 + ((uVar33 | (uVar46 & 0xfffffffb) + uVar33 * 2) ^ 4)) ^
                      uVar36),uVar36);
        FUN_000264a4(~(*(uint *)(uVar61 + (uVar46 & 0x10) * 2 + (uVar46 ^ 0x10)) ^ uVar36),uVar36);
        uVar65 = *(uint *)(uVar61 + extraout_r1_x00177);
        uVar51 = *(uint *)(uVar61 + extraout_r1_x00178);
        uVar49 = *(uint *)(uVar61 + extraout_r1_x00176);
        uVar35 = *(uint *)(uVar61 + uVar72);
        uVar38 = *(uint *)(uVar61 + extraout_r1_x00175);
        puVar9[2] = uVar72 + 4;
        uVar20 = *(uint *)(uVar61 + uVar72 + 4);
        puVar9[2] = uVar72 + 8;
        uVar67 = *(uint *)(uVar61 + uVar72 + 8);
        puVar9[2] = uVar72 + 0xc;
        iVar48 = (int)*(short *)(uVar61 + uVar72 + 0xc);
        puVar9[2] = uVar72 + 0xe;
        uVar39 = *(uint *)(uVar61 + uVar72 + 0xe);
        puVar9[2] = uVar72 + 0x12;
        uVar50 = *(uint *)(uVar61 + uVar72 + 0x12);
        puVar9[2] = uVar72 + 0x16;
        puVar22 = (uint *)(uVar61 + uVar72 + 0x16);
        uVar57 = *puVar22;
        uVar77 = puVar22[1];
        puVar9[2] = uVar72 + 0x1e;
        uVar75 = *(uint *)(uVar61 + uVar72 + 0x1e);
        puVar9[2] = uVar72 + 0x22;
        piVar47 = (int *)(uVar61 + uVar72 + 0x22);
        iVar62 = *piVar47;
        iVar37 = piVar47[1];
        puVar9[2] = uVar72 + 0x2a;
        uVar81 = *(uint *)(uVar61 + uVar72 + 0x2a);
        puVar9[2] = uVar72 + 0x2e;
        uVar78 = *puVar9;
        sVar12 = *(short *)(uVar78 + uVar72 + 0x2e);
        iVar16 = (int)sVar12;
        puVar9[2] = uVar72 + 0x30;
        uVar61 = *(uint *)(uVar78 + uVar72 + 0x30);
        puVar9[2] = uVar72 + 0x34;
        uVar79 = *(uint *)(uVar78 + uVar72 + 0x34);
        puVar9[2] = uVar72 + 0x38;
        uVar60 = uVar65 + (uVar60 ^ uVar71 + (uVar38 | ~uVar71) + 1 ^ uVar49 | ~uVar65) + 1;
        uVar60 = uVar38 & (uVar60 & ~uVar51 | uVar51 & ~uVar60);
        uVar55 = uVar60 + (uVar55 | ~uVar60) + 1;
        uVar41 = uVar41 & (uVar53 | (uVar38 | uVar55) * 2 - (uVar38 + uVar55));
        FUN_000264a4(uVar41 ^ uVar20,uVar36);
        FUN_000264a4(uVar41 ^ uVar75,uVar36);
        uVar51 = *puVar9;
        uVar38 = puVar9[1];
        bVar3 = *(byte *)(uVar51 + extraout_r1_x00180);
        bVar4 = *(byte *)(uVar51 + extraout_r1_x00179);
        FUN_000264a4(uVar41 ^ uVar67,uVar36);
        FUN_000264a4(~(*(uint *)(uVar78 + (uVar46 & 0x10) * 2 + (uVar44 | 0xffffffef) + uVar32 + 1)
                      ^ uVar38),uVar38);
        FUN_000264a4(~(*(uint *)(uVar51 + uVar32 * 2 + (uVar46 ^ 0xffffffef) + 1) ^ uVar38),uVar38);
        FUN_000264a4(~(*(uint *)(uVar51 + (uVar46 | 0xc) * 2 + (uVar46 & 0xc) +
                                 (~uVar46 & 0xfffffff3) + 1) ^ uVar38),uVar38);
        uVar53 = *(uint *)(uVar51 + extraout_r1_x00184);
        uVar55 = *(uint *)(uVar51 + extraout_r1_x00183);
        uVar60 = *(uint *)(uVar78 + extraout_r1_x00182);
        puVar22 = (uint *)(uVar78 + uVar46);
        uVar71 = *puVar22;
        FUN_000264a4(~(puVar22[1] ^ uVar38),uVar38);
        FUN_000264a4(~(*(uint *)(uVar78 + (uVar46 & 8) * 2 + (uVar46 ^ 8)) ^ uVar38),uVar38);
        FUN_000264a4(~(*(uint *)(uVar78 + uVar33 * 2 + ~uVar33 + uVar80 + 1) ^ uVar38),uVar38);
        FUN_000264a4(~(uVar71 ^ uVar38),uVar38);
        FUN_000264a4(~(*(uint *)((int)puVar22 + (uVar44 | 0x10) + uVar32 + 1) ^ uVar38),uVar38);
        FUN_000264a4(~(*(uint *)(uVar51 + uVar46 * 2 + uVar34 + (uVar44 | 4) * 2 + 2) ^ uVar38),
                     uVar38);
        FUN_000264a4(~(*(uint *)(uVar51 + ((uVar33 | uVar33 << 1) - uVar80) + uVar34 * 2) ^ uVar38),
                     uVar38);
        uVar46 = *(uint *)(uVar51 + extraout_r1_x00191);
        uVar38 = *(uint *)(uVar51 + extraout_r1_x00190);
        uVar34 = *(uint *)(uVar78 + extraout_r1_x00189);
        uVar44 = *(uint *)(uVar78 + extraout_r1_x00188);
        uVar71 = *(uint *)(uVar78 + extraout_r1_x00187);
        uVar32 = *(uint *)(uVar78 + extraout_r1_x00186);
        uVar80 = *(uint *)(uVar78 + extraout_r1_x00185);
        *(byte *)(uVar51 + extraout_r1_x00181) = bVar3 ^ bVar4;
        FUN_000264a4(uVar41 ^ uVar39,uVar36);
        FUN_000264a4(uVar41 ^ uVar50,uVar36);
        FUN_000264a4(uVar41 ^ uVar81,uVar36);
        uVar33 = 0x84222325;
        uVar39 = *puVar9;
        uVar67 = 0xcbf29ce4;
        if (iVar48 != 0) {
          iVar28 = 0;
          do {
            uVar88 = (ulonglong)uVar33;
            iVar48 = iVar48 + -1;
            iVar70 = uVar33 * 0x100;
            pcVar15 = (char *)(uVar39 + extraout_r1_x00192 + iVar28);
            iVar28 = iVar28 + 1;
            uVar50 = (uint)*pcVar15;
            uVar33 = (uint)(uVar88 * 0x1b3) ^ uVar50;
            uVar67 = uVar67 * 0x1b3 + iVar70 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar50 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar71 = uVar71 | uVar32 & ~uVar80 | uVar80 & ~uVar32;
        uVar71 = uVar71 & ~uVar44 | uVar44 & ~uVar71;
        uVar38 = uVar38 | uVar60 | (uVar71 - uVar34) + (uVar34 & ~uVar71) * 2;
        uVar55 = (uVar38 ^ uVar55) + uVar55 + (uVar38 | ~uVar55) + 1;
        uVar46 = (uVar46 ^ uVar55) + (uVar55 & ~uVar46) + (uVar46 | ~uVar55) + 1;
        uVar53 = (uVar53 | uVar46) + (uVar53 & ~uVar46) + (uVar46 | ~uVar53) + 1;
        uVar60 = uVar53 | (int)uVar53 >> 0x1f;
        uVar55 = *(uint *)(uVar39 + extraout_r1_x00193);
        uVar46 = (int)uVar55 >> 0x1f;
        if ((uVar53 & ~(uVar33 ^ uVar55) | (uVar33 ^ uVar55) & ~uVar53) != uVar57 ||
            (uVar60 & ~(uVar67 ^ uVar46) | (uVar67 ^ uVar46) & ~uVar60) != uVar77) {
          uVar71 = 0x84222325;
          uVar61 = 0xcbf29ce4;
          if (sVar12 != 0) {
            iVar48 = 0;
            do {
              uVar88 = (ulonglong)uVar71;
              iVar16 = iVar16 + -1;
              iVar28 = uVar71 * 0x100;
              pcVar15 = (char *)(uVar39 + extraout_r1_x00194 + iVar48);
              iVar48 = iVar48 + 1;
              uVar38 = (uint)*pcVar15;
              uVar71 = (uint)(uVar88 * 0x1b3) ^ uVar38;
              uVar61 = uVar61 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar38 >> 0x1f
              ;
            } while (iVar16 != 0);
          }
          uVar38 = (uVar55 & ~uVar71) * 2;
          uVar34 = (uVar71 - uVar55) + uVar38;
          uVar55 = (uVar61 - (uVar46 + (uVar71 < uVar55))) +
                   ((~uVar61 & uVar46) << 1 | (uVar55 & ~uVar71) >> 0x1f) +
                   (uint)CARRY4(uVar71 - uVar55,uVar38);
          uVar46 = (uVar53 & ~uVar34) * 2;
          uVar61 = uVar35;
          if ((uVar34 - uVar53) + uVar46 == iVar62 &&
              (uVar55 - (uVar60 + (uVar34 < uVar53))) +
              ((uVar60 & ~uVar55) << 1 | (uVar53 & ~uVar34) >> 0x1f) +
              (uint)CARRY4(uVar34 - uVar53,uVar46) == iVar37) {
            uVar61 = uVar79;
          }
        }
        uVar41 = uVar41 ^ uVar61;
        goto LAB_00071ca8;
      case 0x5c:
        uVar57 = *local_118;
        uVar79 = local_114 | 0xc;
        uVar81 = local_114 ^ 0xfffffff3;
        uVar56 = local_118[1];
        uVar80 = local_118[2];
        FUN_000264a4(~(*(uint *)(uVar57 + uVar79 * 2 + uVar81 + 1) ^ uVar56),uVar56);
        FUN_000264a4(~(*(uint *)(uVar57 + (uVar46 << 1 | 9) + (uVar46 ^ 0xfffffffb)) ^ uVar56),
                     uVar56);
        FUN_000264a4(~(*(uint *)(uVar57 + (uVar46 | 0x10) * 2 + (uVar46 & 0x10) +
                                 (~uVar46 & 0xffffffef) + 1) ^ uVar56),uVar56);
        uVar61 = *(uint *)(uVar57 + extraout_r1_x00114);
        uVar53 = *(uint *)(uVar57 + extraout_r1_x00113);
        uVar55 = *(uint *)(uVar57 + extraout_r1_x00112);
        puVar22 = (uint *)(uVar57 + uVar46);
        uVar71 = *puVar22;
        uVar38 = puVar22[3];
        uVar60 = puVar22[4];
        FUN_000264a4(~(puVar22[2] ^ uVar56),uVar56);
        FUN_000264a4(~(uVar60 ^ uVar56),uVar56);
        FUN_000264a4(~(uVar71 ^ uVar56),uVar56);
        uVar60 = uVar46 & 8;
        FUN_000264a4(~(*(uint *)(uVar57 + ((uVar60 | uVar60 << 1) - (uVar46 | 8)) + (uVar46 ^ 8) * 2
                                ) ^ uVar56),uVar56);
        FUN_000264a4(~(uVar38 ^ uVar56),uVar56);
        FUN_000264a4(~(*(uint *)(uVar57 + (uVar46 & 4) * 2 + (uVar46 ^ 4)) ^ uVar56),uVar56);
        uVar71 = *(uint *)(uVar57 + extraout_r1_x00120);
        uVar78 = *(uint *)(uVar57 + extraout_r1_x00119);
        uVar38 = *(uint *)(uVar57 + extraout_r1_x00118);
        uVar75 = *(uint *)(uVar57 + extraout_r1_x00117);
        uVar34 = *(uint *)(uVar57 + extraout_r1_x00116);
        uVar72 = *(uint *)(uVar57 + extraout_r1_x00115);
        uVar41 = *(uint *)(uVar57 + uVar80);
        puVar9[2] = uVar80 + 4;
        uVar44 = *(uint *)(uVar57 + uVar80 + 4);
        puVar9[2] = uVar80 + 8;
        uVar32 = *(uint *)(uVar57 + uVar80 + 8);
        puVar9[2] = uVar80 + 0xc;
        sVar12 = *(short *)(uVar57 + uVar80 + 0xc);
        puVar9[2] = uVar80 + 0xe;
        piVar47 = (int *)(uVar57 + uVar80 + 0xe);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar80 + 0x16;
        uVar33 = *(uint *)(uVar57 + uVar80 + 0x16);
        puVar9[2] = uVar80 + 0x1a;
        sVar6 = *(short *)(uVar57 + uVar80 + 0x1a);
        puVar9[2] = uVar80 + 0x1c;
        uVar35 = *(uint *)(uVar57 + uVar80 + 0x1c);
        puVar9[2] = uVar80 + 0x20;
        uVar36 = *(uint *)(uVar57 + uVar80 + 0x20);
        puVar9[2] = uVar80 + 0x24;
        uVar67 = *(uint *)(uVar57 + uVar80 + 0x24);
        puVar9[2] = uVar80 + 0x28;
        puVar22 = (uint *)(uVar57 + uVar80 + 0x28);
        uVar39 = *puVar22;
        piVar47 = (int *)puVar22[1];
        puVar9[2] = uVar80 + 0x30;
        uVar50 = *(uint *)(uVar57 + uVar80 + 0x30);
        puVar9[2] = uVar80 + 0x34;
        uVar57 = *(uint *)(uVar57 + uVar80 + 0x34);
        uVar64 = *puVar9;
        puVar9[2] = uVar80 + 0x38;
        uVar77 = *(uint *)(uVar64 + uVar80 + 0x38);
        puVar9[2] = uVar80 + 0x3c;
        FUN_000264a4(~(*(uint *)(uVar64 + (uVar46 & 0xc) * 2 + (uVar46 ^ 0xc) * 3 +
                                 (uVar46 << 1 ^ 0xffffffe6) + 2) ^ uVar56),uVar56);
        uVar49 = puVar9[1];
        uVar68 = *puVar9;
        FUN_000264a4(~(*(uint *)(uVar64 + uVar79 * 2 + uVar81 + 1) ^ uVar49),uVar49);
        FUN_000264a4(~(*(uint *)(uVar64 + (uVar46 | 4) * 2 + (uVar46 ^ 4) +
                                 (uVar46 << 1 ^ 0xfffffff6) + 2) ^ uVar49),uVar49);
        FUN_000264a4(~(*(uint *)(uVar68 + (uVar46 | 0x10) * 2 + (uVar46 | 0xffffffef) +
                                 (~uVar46 | 0x10) + 2) ^ uVar49),uVar49);
        uVar81 = *(uint *)(uVar68 + extraout_r1_x00124);
        uVar79 = *(uint *)(uVar64 + extraout_r1_x00123);
        uVar80 = *(uint *)(uVar64 + extraout_r1_x00122);
        uVar51 = *(uint *)(uVar64 + extraout_r1_x00121);
        FUN_000264a4(~(*(uint *)(uVar64 + (uVar46 | 8) + uVar60) ^ uVar49),uVar49);
        uVar65 = *(uint *)(uVar64 + uVar46);
        FUN_000264a4(~(((uint *)(uVar64 + uVar46))[4] ^ uVar49),uVar49);
        FUN_000264a4(~(*(uint *)(uVar64 + uVar46 * 2 + (uVar46 ^ 0x10) + (~uVar46 | 0x10) * 2 + 2) ^
                      uVar49),uVar49);
        FUN_000264a4(~(uVar65 ^ uVar49),uVar49);
        FUN_000264a4(~(*(uint *)(uVar68 + uVar46 + 8) ^ uVar49),uVar49);
        FUN_000264a4(~(*(uint *)(uVar68 + (uVar46 & 0xc) * 2 + (uVar46 ^ 0xc)) ^ uVar49),uVar49);
        uVar65 = *(uint *)(uVar68 + extraout_r1_x00130);
        uVar20 = *(uint *)(uVar64 + extraout_r1_x00128);
        uVar74 = *(uint *)(uVar68 + extraout_r1_x00129);
        FUN_000264a4(~(*(uint *)(uVar68 + ((uVar60 | (uVar46 & 0xfffffff7) + uVar60 * 2) ^ 8)) ^
                      uVar49),uVar49);
        uVar69 = *(uint *)(uVar68 + extraout_r1_x00131);
        uVar68 = *(uint *)(uVar64 + extraout_r1_x00127);
        uVar49 = *(uint *)(uVar64 + extraout_r1_x00126);
        uVar60 = *(uint *)(uVar64 + extraout_r1_x00125);
        uVar72 = uVar72 | uVar55;
        uVar75 = uVar75 | (uVar34 | uVar72) * 2 - (uVar34 + uVar72);
        uVar78 = uVar78 & ((uVar38 & ~uVar75) * 2 - (uVar38 | ~uVar75)) + (uVar75 | ~uVar38);
        uVar46 = uVar71 & ~uVar78 | uVar78 & ~uVar71;
        uVar46 = (uVar46 + (uVar53 ^ uVar46)) - (uVar46 & ~uVar53);
        uVar53 = ~uVar61;
        uVar46 = ((uVar61 | uVar46) + uVar53) - (uVar46 | uVar53);
        local_b0 = uVar39;
        local_ac = piVar47;
        local_98 = iVar37;
        iStack_94 = iVar62;
        FUN_000264a4(uVar46 ^ uVar32,uVar56);
        local_b8 = CONCAT44(local_b8._4_4_,extraout_r1_x00132);
        FUN_000264a4(uVar46 ^ uVar35,uVar56);
        local_a4 = sVar12;
        local_a0 = extraout_r1_x00133;
        FUN_000264a4(uVar46 ^ uVar50,uVar56);
        local_a8 = extraout_r1_x00134;
        FUN_000264a4(uVar46 ^ uVar44,uVar56);
        local_84 = extraout_r1_x00135;
        FUN_000264a4(uVar46 ^ uVar33,uVar56);
        local_8c = sVar6;
        local_88 = extraout_r1_x00136;
        FUN_000264a4(uVar46 ^ uVar41,uVar56);
        uVar60 = uVar60 & uVar51 + uVar80 + ~(uVar80 & uVar51) + 1;
        uVar61 = uVar60 & ~uVar79 | uVar79 & ~uVar60;
        uVar20 = uVar20 ^ uVar68 + ~(uVar68 | ((uVar61 & uVar49) - uVar61) + (uVar61 | ~uVar49));
        uVar61 = ~uVar69;
        uVar61 = ((uVar20 | uVar69) + uVar61) - (uVar20 | uVar61);
        local_80 = uVar81 ^ (uVar65 | (uVar74 + uVar61) - (uVar74 | uVar61));
        local_90 = extraout_r1_x00137;
        FUN_000264a4(uVar46 ^ uVar77,uVar56);
        local_6c = extraout_r1_x00138;
        FUN_000264a4(uVar46 ^ uVar36,uVar56);
        uVar61 = *puVar9;
        uVar10 = *(undefined1 *)(uVar61 + extraout_r1_x00139);
        uVar2 = *(undefined1 *)(uVar61 + extraout_r1_x00138);
        local_68 = puVar9;
        local_70 = puVar9;
        FUN_000264a4(uVar46 ^ uVar67,uVar56);
        uVar13 = CONCAT11(uVar2,uVar10);
        local_78 = puVar9;
        local_74 = extraout_r1_x00140;
        FUN_000264a4(uVar46 ^ uVar57,uVar56);
        if (uVar13 < 0x401) {
          if (uVar13 < 0x201) {
            if (uVar13 == 0x102) {
              sVar12 = (short)*(char *)(uVar61 + extraout_r1_x00140);
              goto LAB_00072c90;
            }
            if (uVar13 == 0x104) {
              *(int *)(uVar61 + extraout_r1_x00141) = (int)*(char *)(uVar61 + extraout_r1_x00140);
            }
            else if (uVar13 == 0x108) {
              iVar37 = (int)*(char *)(uVar61 + extraout_r1_x00140);
LAB_000723bc:
              *(int *)(uVar61 + extraout_r1_x00141) = iVar37;
              ((int *)(uVar61 + extraout_r1_x00141))[1] = iVar37 >> 0x1f;
            }
          }
          else if (uVar13 == 0x201) {
LAB_00072700:
            uVar10 = *(undefined1 *)(uVar61 + extraout_r1_x00140);
LAB_00072c30:
            *(undefined1 *)(uVar61 + extraout_r1_x00141) = uVar10;
          }
          else if (uVar13 == 0x204) {
            *(int *)(uVar61 + extraout_r1_x00141) = (int)*(short *)(uVar61 + extraout_r1_x00140);
          }
          else if (uVar13 == 0x208) {
            iVar37 = (int)*(short *)(uVar61 + extraout_r1_x00140);
            goto LAB_000723bc;
          }
        }
        else if (uVar13 < 0x801) {
          if (uVar13 == 0x401) {
            uVar10 = (undefined1)*(undefined4 *)(uVar61 + extraout_r1_x00140);
            goto LAB_00072c30;
          }
          if (uVar13 == 0x402) {
            sVar12 = (short)*(undefined4 *)(uVar61 + extraout_r1_x00140);
LAB_00072c90:
            *(short *)(uVar61 + extraout_r1_x00141) = sVar12;
          }
          else if (uVar13 == 0x408) {
            iVar37 = *(int *)(uVar61 + extraout_r1_x00140);
            goto LAB_000723bc;
          }
        }
        else {
          if (uVar13 == 0x801) goto LAB_00072700;
          if (uVar13 == 0x802) {
            sVar12 = *(short *)(uVar61 + extraout_r1_x00140);
            goto LAB_00072c90;
          }
          if (uVar13 == 0x804) {
            *(undefined4 *)(uVar61 + extraout_r1_x00141) =
                 *(undefined4 *)(uVar61 + extraout_r1_x00140);
          }
        }
        uVar53 = *puVar9;
        iVar37 = (int)local_a4;
        uVar61 = 0x84222325;
        uVar46 = 0xcbf29ce4;
        if (iVar37 != 0) {
          pcVar15 = (char *)(uVar53 + local_a8);
          do {
            uVar88 = (ulonglong)uVar61;
            iVar37 = iVar37 + -1;
            iVar62 = uVar61 * 0x100;
            uVar61 = (uint)(uVar88 * 0x1b3) ^ (int)*pcVar15;
            uVar46 = uVar46 * 0x1b3 + iVar62 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)*pcVar15 >> 0x1f
            ;
            pcVar15 = pcVar15 + 1;
          } while (iVar37 != 0);
        }
        uVar71 = local_80 | (int)local_80 >> 0x1f;
        uVar60 = *(uint *)(uVar53 + (uint)local_b8);
        uVar55 = (int)uVar60 >> 0x1f;
        iVar37 = 0x18;
        if ((local_80 & ~(uVar61 ^ uVar60) | (uVar61 ^ uVar60) & ~local_80) != local_b0 ||
            (int *)(uVar71 & ~(uVar46 ^ uVar55) | (uVar46 ^ uVar55) & ~uVar71) != local_ac) {
          uVar46 = 0x84222325;
          iVar37 = (int)local_8c;
          uVar61 = 0xcbf29ce4;
          if (iVar37 != 0) {
            pcVar15 = (char *)(uVar53 + local_90);
            do {
              uVar88 = (ulonglong)uVar46;
              iVar37 = iVar37 + -1;
              iVar62 = uVar46 * 0x100;
              uVar46 = (uint)(uVar88 * 0x1b3) ^ (int)*pcVar15;
              uVar61 = uVar61 * 0x1b3 + iVar62 + (int)(uVar88 * 0x1b3 >> 0x20) ^
                       (int)*pcVar15 >> 0x1f;
              pcVar15 = pcVar15 + 1;
            } while (iVar37 != 0);
          }
          uVar53 = (uVar60 & ~uVar46) * 2;
          uVar38 = (uVar46 - uVar60) + uVar53;
          uVar46 = (uVar61 - (uVar55 + (uVar46 < uVar60))) +
                   ((~uVar61 & uVar55) << 1 | (uVar60 & ~uVar46) >> 0x1f) +
                   (uint)CARRY4(uVar46 - uVar60,uVar53);
          uVar61 = (local_80 & ~uVar38) * 2;
          iVar37 = 0x34;
          if ((uVar38 - local_80) + uVar61 == local_98 &&
              (uVar46 - (uVar71 + (uVar38 < local_80))) +
              ((uVar71 & ~uVar46) << 1 | (local_80 & ~uVar38) >> 0x1f) +
              (uint)CARRY4(uVar38 - local_80,uVar61) == iStack_94) {
            iVar37 = 0x30;
          }
        }
        uVar60 = *(uint *)((int)&local_b8 + iVar37);
        goto LAB_00073114;
      case 0x5f:
        uVar57 = *local_118;
        local_134 = local_118[1];
        uVar50 = local_118[2];
        puVar22 = (uint *)(uVar57 + local_114);
        uVar61 = *puVar22;
        uVar53 = puVar22[1];
        uVar71 = puVar22[3];
        uVar55 = puVar22[4];
        FUN_000264a4(~(puVar22[2] ^ local_134),local_134);
        FUN_000264a4(~(uVar53 ^ local_134),local_134);
        FUN_000264a4(~(uVar55 ^ local_134),local_134);
        FUN_000264a4(~(uVar61 ^ local_134),local_134);
        uVar55 = *(uint *)(uVar57 + extraout_r1_x00145);
        uVar60 = *(uint *)(uVar57 + extraout_r1_x00144);
        FUN_000264a4(~(uVar71 ^ local_134),local_134);
        uVar34 = *(uint *)(uVar57 + uVar50);
        uVar53 = *(uint *)(uVar57 + extraout_r1_x00146);
        uVar71 = *(uint *)(uVar57 + extraout_r1_x00143);
        uVar38 = *(uint *)(uVar57 + extraout_r1_x00142);
        puVar9[2] = uVar50 + 4;
        puVar22 = (uint *)(uVar57 + uVar50 + 4);
        uVar41 = *puVar22;
        uVar44 = puVar22[1];
        puVar9[2] = uVar50 + 0xc;
        uVar32 = *(uint *)(uVar57 + uVar50 + 0xc);
        puVar9[2] = uVar50 + 0x10;
        uVar33 = *(uint *)(uVar57 + uVar50 + 0x10);
        puVar9[2] = uVar50 + 0x14;
        uVar36 = *(uint *)(uVar57 + uVar50 + 0x14);
        puVar9[2] = uVar50 + 0x18;
        sVar12 = *(short *)(uVar57 + uVar50 + 0x18);
        puVar9[2] = uVar50 + 0x1a;
        piVar47 = (int *)(uVar57 + uVar50 + 0x1a);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar50 + 0x22;
        uVar67 = *(uint *)(uVar57 + uVar50 + 0x22);
        uVar35 = *puVar9;
        puVar9[2] = uVar50 + 0x26;
        uVar39 = *(uint *)(uVar57 + uVar50 + 0x26);
        puVar9[2] = uVar50 + 0x2a;
        uVar77 = *(uint *)(uVar57 + uVar50 + 0x2a);
        puVar9[2] = uVar50 + 0x2e;
        iVar48 = (int)*(short *)(uVar57 + uVar50 + 0x2e);
        puVar9[2] = uVar50 + 0x30;
        uVar61 = *(uint *)(uVar35 + uVar50 + 0x30);
        uVar55 = (uVar71 | uVar38 | uVar53) & ~uVar60 ^ uVar55;
        puVar9[2] = uVar50 + 0x34;
        FUN_000264a4(uVar55 ^ uVar33,local_134);
        FUN_000264a4(uVar55 ^ uVar77,local_134);
        uVar60 = puVar9[1];
        uVar86 = *(undefined8 *)(uVar35 + extraout_r1_x00148);
        puVar22 = (uint *)(uVar35 + uVar46);
        uVar38 = *puVar22;
        uVar46 = puVar22[1];
        uVar53 = puVar22[2];
        uVar71 = puVar22[4];
        FUN_000264a4(~(puVar22[3] ^ uVar60),uVar60);
        FUN_000264a4(~(uVar71 ^ uVar60),uVar60);
        FUN_000264a4(~(uVar38 ^ uVar60),uVar60);
        FUN_000264a4(~(uVar46 ^ uVar60),uVar60);
        FUN_000264a4(~(uVar53 ^ uVar60),uVar60);
        uVar46 = *(uint *)(uVar35 + extraout_r1_x00153);
        uVar53 = *(uint *)(uVar35 + extraout_r1_x00152);
        uVar60 = *(uint *)(uVar35 + extraout_r1_x00151);
        uVar33 = *(uint *)(uVar35 + extraout_r1_x00150);
        uVar50 = *(uint *)(uVar35 + extraout_r1_x00149);
        *(undefined8 *)(uVar35 + extraout_r1_x00147) = uVar86;
        FUN_000264a4(uVar55 ^ uVar34,local_134);
        FUN_000264a4(uVar55 ^ uVar32,local_134);
        FUN_000264a4(uVar55 ^ uVar67,local_134);
        uVar34 = *puVar9;
        uVar71 = 0x84222325;
        uVar38 = 0xcbf29ce4;
        if (iVar48 != 0) {
          iVar16 = 0;
          do {
            uVar88 = (ulonglong)uVar71;
            iVar48 = iVar48 + -1;
            iVar28 = uVar71 * 0x100;
            pcVar15 = (char *)(uVar34 + extraout_r1_x00155 + iVar16);
            iVar16 = iVar16 + 1;
            uVar32 = (uint)*pcVar15;
            uVar71 = (uint)(uVar88 * 0x1b3) ^ uVar32;
            uVar38 = uVar38 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar32 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar32 = *(uint *)(uVar34 + extraout_r1_x00156);
        uVar46 = uVar46 ^ uVar53 & (uVar33 & ~uVar50 ^ uVar60);
        uVar60 = uVar46 | (int)uVar46 >> 0x1f;
        uVar53 = (int)uVar32 >> 0x1f;
        if ((uVar46 & ~(uVar71 ^ uVar32) | (uVar71 ^ uVar32) & ~uVar46) != uVar41 ||
            (uVar60 & ~(uVar38 ^ uVar53) | (uVar38 ^ uVar53) & ~uVar60) != uVar44) {
          uVar61 = 0x84222325;
          uVar71 = 0xcbf29ce4;
          if (sVar12 != 0) {
            iVar16 = (int)sVar12;
            iVar48 = 0;
            do {
              uVar88 = (ulonglong)uVar61;
              iVar16 = iVar16 + -1;
              iVar28 = uVar61 * 0x100;
              pcVar15 = (char *)(uVar34 + extraout_r1_x00154 + iVar48);
              iVar48 = iVar48 + 1;
              uVar38 = (uint)*pcVar15;
              uVar61 = (uint)(uVar88 * 0x1b3) ^ uVar38;
              uVar71 = uVar71 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar38 >> 0x1f
              ;
            } while (iVar16 != 0);
          }
          uVar38 = (uVar32 & ~uVar61) * 2;
          uVar34 = (uVar61 - uVar32) + uVar38;
          uVar71 = (uVar71 - (uVar53 + (uVar61 < uVar32))) +
                   ((~uVar71 & uVar53) << 1 | (uVar32 & ~uVar61) >> 0x1f) +
                   (uint)CARRY4(uVar61 - uVar32,uVar38);
          uVar53 = (uVar46 & ~uVar34) * 2;
          uVar61 = uVar39;
          if ((uVar34 - uVar46) + uVar53 == iVar37 &&
              (uVar71 - (uVar60 + (uVar34 < uVar46))) +
              ((uVar60 & ~uVar71) << 1 | (uVar46 & ~uVar34) >> 0x1f) +
              (uint)CARRY4(uVar34 - uVar46,uVar53) == iVar62) {
            uVar61 = uVar36;
          }
        }
        goto LAB_000726c0;
      case 0x62:
        uVar32 = *local_118;
        uVar72 = local_118[1];
        uVar39 = local_118[2];
        puVar22 = (uint *)(uVar32 + local_114);
        uVar53 = *puVar22;
        uVar61 = puVar22[1];
        uVar60 = puVar22[2];
        uVar55 = puVar22[4];
        FUN_000264a4(~(puVar22[3] ^ uVar72),uVar72);
        FUN_000264a4(~(uVar61 ^ uVar72),uVar72);
        FUN_000264a4(~(uVar53 ^ uVar72),uVar72);
        FUN_000264a4(~(uVar60 ^ uVar72),uVar72);
        uVar61 = *(uint *)(uVar32 + extraout_r1_65);
        uVar80 = *(uint *)(uVar32 + extraout_r1_66);
        FUN_000264a4(~(uVar55 ^ uVar72),uVar72);
        uVar50 = *(uint *)(uVar32 + extraout_r1_67);
        uVar35 = *(uint *)(uVar32 + extraout_r1_64);
        uVar67 = *(uint *)(uVar32 + extraout_r1_63);
        uVar57 = *(uint *)(uVar32 + uVar39);
        puVar9[2] = uVar39 + 4;
        uVar53 = *(uint *)(uVar32 + uVar39 + 4);
        puVar9[2] = uVar39 + 8;
        uVar65 = *puVar9;
        sVar12 = *(short *)(uVar32 + uVar39 + 8);
        puVar9[2] = uVar39 + 10;
        uVar55 = *(uint *)(uVar32 + uVar39 + 10);
        puVar9[2] = uVar39 + 0xe;
        puVar22 = (uint *)(uVar32 + uVar39 + 0xe);
        uVar71 = *puVar22;
        uVar38 = puVar22[1];
        puVar9[2] = uVar39 + 0x16;
        uVar60 = *(uint *)(uVar32 + uVar39 + 0x16);
        puVar9[2] = uVar39 + 0x1a;
        uVar34 = *(uint *)(uVar32 + uVar39 + 0x1a);
        puVar9[2] = uVar39 + 0x1e;
        iVar62 = (int)*(short *)(uVar32 + uVar39 + 0x1e);
        puVar9[2] = uVar39 + 0x20;
        uVar41 = *(uint *)(uVar32 + uVar39 + 0x20);
        puVar9[2] = uVar39 + 0x24;
        uVar44 = *(uint *)(uVar32 + uVar39 + 0x24);
        puVar9[2] = uVar39 + 0x28;
        uVar32 = *(uint *)(uVar32 + uVar39 + 0x28);
        uVar79 = puVar9[1];
        puVar9[2] = uVar39 + 0x2c;
        uVar33 = *(uint *)(uVar65 + uVar39 + 0x2c);
        puVar9[2] = uVar39 + 0x30;
        piVar47 = (int *)(uVar65 + uVar39 + 0x30);
        iVar37 = *piVar47;
        uVar36 = piVar47[1];
        puVar9[2] = uVar39 + 0x38;
        uVar80 = uVar80 | uVar61 & (uVar50 ^ uVar35 & uVar67);
        FUN_000264a4(uVar80 ^ uVar57,uVar72);
        FUN_000264a4(uVar80 ^ uVar60,uVar72);
        FUN_000264a4(uVar80 ^ uVar34,uVar72);
        FUN_000264a4(~(*(uint *)(uVar65 + (uVar46 | 4) * 2 + (uVar46 ^ 4) +
                                 (uVar46 << 1 ^ 0xfffffff6) + 2) ^ uVar79),uVar79);
        uVar61 = *(uint *)(uVar65 + extraout_r1_71);
        uVar51 = *puVar9;
        uVar60 = puVar9[1];
        uVar77 = *(uint *)(uVar51 + extraout_r1_68);
        uVar34 = ((uint *)(uVar51 + extraout_r1_68))[1];
        uVar81 = *(uint *)(uVar51 + extraout_r1_70);
        uVar35 = ((uint *)(uVar51 + extraout_r1_70))[1];
        FUN_000264a4(~(*(uint *)(uVar65 + uVar46) ^ uVar79),uVar79);
        uVar67 = uVar46 & 8;
        FUN_000264a4(~(*(uint *)(uVar65 + uVar67 * 2 + (uVar46 ^ 8)) ^ uVar79),uVar79);
        FUN_000264a4(~(*(uint *)(uVar65 + (uVar67 | uVar67 << 1) + ~uVar67 + (uVar46 ^ 8) + 1) ^
                      uVar79),uVar79);
        FUN_000264a4(~(*(uint *)(uVar65 + (uVar46 & 0xc) * 2 + (uVar46 ^ 0xc)) ^ uVar79),uVar79);
        FUN_000264a4(~(((uint *)(uVar65 + uVar46))[2] ^ uVar79),uVar79);
        FUN_000264a4(~(*(uint *)(uVar65 + (uVar46 & 4) * 2 + (uVar46 ^ 4)) ^ uVar60),uVar60);
        FUN_000264a4(~(*(uint *)(uVar51 + (uVar46 & 0x10) * 2 + (uVar46 ^ 0x10)) ^ uVar60),uVar60);
        FUN_000264a4(~(*(uint *)(uVar51 + uVar46 + 8) ^ uVar60),uVar60);
        uVar46 = *(uint *)(uVar51 + extraout_r1_79);
        uVar60 = *(uint *)(uVar51 + extraout_r1_78);
        uVar67 = *(uint *)(uVar51 + extraout_r1_77);
        uVar39 = *(uint *)(uVar65 + extraout_r1_76);
        uVar75 = *(uint *)(uVar65 + extraout_r1_75);
        uVar50 = *(uint *)(uVar65 + extraout_r1_74);
        uVar57 = *(uint *)(uVar65 + extraout_r1_73);
        uVar65 = *(uint *)(uVar65 + extraout_r1_72);
        *(int *)(uVar51 + extraout_r1_69) = uVar81 - uVar77;
        ((int *)(uVar51 + extraout_r1_69))[1] = uVar35 - (uVar34 + (uVar81 < uVar77));
        FUN_000264a4(uVar80 ^ uVar53,uVar72);
        FUN_000264a4(uVar80 ^ uVar55,uVar72);
        FUN_000264a4(uVar80 ^ uVar41,uVar72);
        FUN_000264a4(uVar80 ^ uVar44,uVar72);
        FUN_000264a4(uVar80 ^ uVar32,uVar72);
        FUN_000264a4(uVar80 ^ uVar33,uVar79);
        uVar55 = 0xcbf29ce4;
        uVar34 = *puVar9;
        uVar53 = 0x84222325;
        if (iVar62 != 0) {
          iVar48 = 0;
          do {
            uVar88 = (ulonglong)uVar53;
            iVar62 = iVar62 + -1;
            iVar16 = uVar53 * 0x100;
            pcVar15 = (char *)(uVar34 + extraout_r1_82 + iVar48);
            iVar48 = iVar48 + 1;
            uVar41 = (uint)*pcVar15;
            uVar53 = (uint)(uVar88 * 0x1b3) ^ uVar41;
            uVar55 = uVar55 * 0x1b3 + iVar16 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar41 >> 0x1f;
          } while (iVar62 != 0);
        }
        uVar61 = uVar61 ^ uVar65;
        uVar50 = (uVar61 + (~uVar57 ^ uVar61)) - (uVar61 | ~uVar57) & uVar50;
        uVar61 = (uVar75 ^ uVar50) + (uVar75 & ~uVar50) + (uVar50 | ~uVar75) + 1;
        uVar61 = uVar39 & ~uVar61 | uVar61 & ~uVar39;
        uVar61 = (uVar61 - uVar65) + (uVar65 & ~uVar61) * 2;
        uVar46 = (uVar67 + uVar61) - (uVar67 | uVar61) & uVar60 | uVar46;
        uVar44 = uVar46 | (int)uVar46 >> 0x1f;
        uVar41 = *(uint *)(uVar34 + extraout_r1_80);
        uVar61 = (int)uVar41 >> 0x1f;
        uVar60 = extraout_r1_81;
        if ((uVar46 & ~(uVar53 ^ uVar41) | (uVar53 ^ uVar41) & ~uVar46) != uVar71 ||
            (uVar44 & ~(uVar55 ^ uVar61) | (uVar55 ^ uVar61) & ~uVar44) != uVar38) {
          uVar53 = 0x84222325;
          uVar55 = 0xcbf29ce4;
          if (sVar12 != 0) {
            iVar48 = (int)sVar12;
            iVar62 = 0;
            uVar53 = 0x84222325;
            do {
              uVar88 = (ulonglong)uVar53;
              iVar48 = iVar48 + -1;
              iVar16 = uVar53 * 0x100;
              pcVar15 = (char *)(uVar34 + extraout_r1_83 + iVar62);
              iVar62 = iVar62 + 1;
              uVar60 = (uint)*pcVar15;
              uVar53 = (uint)(uVar88 * 0x1b3) ^ uVar60;
              uVar55 = uVar55 * 0x1b3 + iVar16 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar60 >> 0x1f
              ;
            } while (iVar48 != 0);
          }
          uVar60 = (uVar41 & ~uVar53) * 2;
          uVar71 = (uVar53 - uVar41) + uVar60;
          uVar53 = (uVar55 - (uVar61 + (uVar53 < uVar41))) +
                   ((~uVar55 & uVar61) << 1 | (uVar41 & ~uVar53) >> 0x1f) +
                   (uint)CARRY4(uVar53 - uVar41,uVar60);
          uVar61 = (uVar46 & ~uVar71) * 2;
          iVar62 = (uVar71 - uVar46) + uVar61;
          uVar36 = (uVar53 - (uVar44 + (uVar71 < uVar46))) +
                   ((uVar44 & ~uVar53) << 1 | (uVar46 & ~uVar71) >> 0x1f) +
                   (uint)CARRY4(uVar71 - uVar46,uVar61) ^ uVar36;
          uVar60 = extraout_r1_85;
          local_170 = extraout_r1_84;
LAB_00071844:
          bVar82 = iVar62 == iVar37 && uVar36 == 0;
          goto LAB_0007184c;
        }
        goto LAB_00073114;
      case 100:
        uVar67 = *local_118;
        uVar53 = local_118[1];
        uVar36 = local_118[2];
        FUN_000264a4(~(*(uint *)(uVar67 + ((local_114 | 0xc) * 2 - (local_114 & 0xfffffff3)) +
                                 (local_114 | 0xfffffff3) + 1) ^ uVar53),uVar53);
        iVar37 = uVar67 + (uVar46 | 8);
        FUN_000264a4(~(*(uint *)(iVar37 + (uVar46 | 0xfffffff7) + 9) ^ uVar53),uVar53);
        uVar61 = *(uint *)(uVar67 + extraout_r1_x00859);
        iVar62 = uVar67 + (uVar46 & 4) * 2;
        uVar55 = *(uint *)(uVar67 + extraout_r1_x00858);
        FUN_000264a4(~(*(uint *)(iVar62 + (~uVar46 | 0xfffffffb) + (uVar46 | 4) + 1) ^ uVar53),
                     uVar53);
        uVar60 = *(uint *)(uVar67 + extraout_r1_x00860);
        FUN_000264a4(~(*(uint *)(iVar62 + (uVar46 ^ 4)) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar67 + uVar46) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar67 + ((uVar46 & 0x10 |
                                           (uVar46 & 0xffffffef) + (uVar46 & 0x10) * 2) ^ 0x10)) ^
                      uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(iVar37 + uVar46 + (~uVar46 | 8) + 1) ^ uVar53),uVar53);
        FUN_000264a4(~(((uint *)(uVar67 + uVar46))[3] ^ uVar53),uVar53);
        uVar39 = *(uint *)(uVar67 + extraout_r1_x00864);
        uVar33 = *(uint *)(uVar67 + extraout_r1_x00863);
        uVar32 = *(uint *)(uVar67 + extraout_r1_x00862);
        uVar50 = *(uint *)(uVar67 + extraout_r1_x00865);
        uVar35 = *(uint *)(uVar67 + uVar36);
        uVar44 = *(uint *)(uVar67 + extraout_r1_x00861);
        puVar9[2] = uVar36 + 4;
        uVar46 = *(uint *)(uVar67 + uVar36 + 4);
        puVar9[2] = uVar36 + 8;
        uVar71 = *(uint *)(uVar67 + uVar36 + 8);
        puVar9[2] = uVar36 + 0xc;
        piVar47 = (int *)(uVar67 + uVar36 + 0xc);
        iVar48 = *piVar47;
        iVar37 = piVar47[1];
        puVar9[2] = uVar36 + 0x14;
        sVar12 = *(short *)(uVar67 + uVar36 + 0x14);
        iVar16 = (int)sVar12;
        puVar9[2] = uVar36 + 0x16;
        local_134 = *(uint *)(uVar67 + uVar36 + 0x16);
        puVar9[2] = uVar36 + 0x1a;
        uVar38 = *(uint *)(uVar67 + uVar36 + 0x1a);
        puVar9[2] = uVar36 + 0x1e;
        uVar34 = *(uint *)(uVar67 + uVar36 + 0x1e);
        puVar9[2] = uVar36 + 0x22;
        uVar41 = *(uint *)(uVar67 + uVar36 + 0x22);
        puVar9[2] = uVar36 + 0x26;
        local_170 = *(uint *)(uVar67 + uVar36 + 0x26);
        puVar9[2] = uVar36 + 0x2a;
        uVar44 = uVar44 | uVar60 | uVar55;
        uVar55 = uVar44 & ~uVar32 | uVar32 & ~uVar44;
        uVar61 = (uVar61 - (uVar61 ^ uVar55)) + (uVar55 & ~uVar61);
        uVar32 = uVar32 & (uVar32 ^ uVar61) + (uVar61 & ~uVar32) + (uVar32 | ~uVar61) + 1;
        uVar55 = uVar32 | uVar33;
        iVar62 = uVar32 + uVar33 + 1;
        uVar61 = iVar62 + ~uVar55;
        uVar61 = (uVar39 | uVar61) + (uVar55 - iVar62) + (uVar61 & ~uVar39) + 1;
        uVar55 = uVar50 & ~uVar61 | uVar61 & ~uVar50;
        FUN_000264a4(uVar55 ^ uVar35,uVar53);
        FUN_000264a4(uVar55 ^ uVar46,uVar53);
        FUN_000264a4(uVar55 ^ uVar71,uVar53);
        FUN_000264a4(uVar55 ^ uVar38,uVar53);
        FUN_000264a4(uVar55 ^ uVar34,uVar53);
        FUN_000264a4(uVar55 ^ uVar41,uVar53);
        iVar62 = *(int *)(uVar67 + extraout_r1_x00871);
        if (iVar62 == 0) {
          uVar88 = 0;
        }
        else {
          pcVar15 = (char *)(iVar62 + -1);
          do {
            pcVar15 = pcVar15 + 1;
          } while (*pcVar15 != '\0');
          uVar88 = 0;
          if (*(uint *)(uVar67 + extraout_r1_x00868) < (uint)((int)pcVar15 - iVar62)) {
            uVar88 = strtoull((char *)(iVar62 + *(uint *)(uVar67 + extraout_r1_x00868)),(char **)0x0
                              ,*(int *)(uVar67 + extraout_r1_x00866));
          }
        }
        uVar46 = 0xcbf29ce4;
        *(ulonglong *)(*puVar9 + extraout_r1_x00867) = uVar88;
        uVar61 = 0x84222325;
        if (sVar12 != 0) {
          iVar62 = 0;
          do {
            uVar88 = (ulonglong)uVar61;
            iVar16 = iVar16 + -1;
            iVar28 = uVar61 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00869 + iVar62);
            iVar62 = iVar62 + 1;
            uVar60 = (uint)*pcVar15;
            uVar61 = (uint)(uVar88 * 0x1b3) ^ uVar60;
            uVar46 = uVar46 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar60 >> 0x1f;
          } while (iVar16 != 0);
        }
        uVar71 = *(uint *)(*puVar9 + extraout_r1_x00870);
        uVar60 = (uVar61 | uVar71) * 2;
        bVar82 = uVar60 - (uVar61 + uVar71) == iVar48 &&
                 ((uVar46 | (int)uVar71 >> 0x1f) << 1 | (uVar61 | uVar71) >> 0x1f) -
                 (uVar46 + ((int)uVar71 >> 0x1f) + (uint)CARRY4(uVar61,uVar71) +
                 (uint)(uVar60 < uVar61 + uVar71)) == iVar37;
        goto LAB_000730f0;
      case 0x66:
        uVar32 = *local_118;
        uVar53 = local_118[1];
        uVar44 = local_118[2];
        puVar22 = (uint *)(uVar32 + local_114);
        uVar55 = *puVar22;
        uVar61 = puVar22[3];
        uVar46 = puVar22[1];
        uVar60 = puVar22[4];
        FUN_000264a4(~(puVar22[2] ^ uVar53),uVar53);
        FUN_000264a4(~(uVar46 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar55 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar60 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar61 ^ uVar53),uVar53);
        uVar36 = *(uint *)(uVar32 + extraout_r1_x00729);
        uVar67 = *(uint *)(uVar32 + extraout_r1_x00728);
        uVar46 = *(uint *)(uVar32 + extraout_r1_x00726);
        uVar55 = *(uint *)(uVar32 + extraout_r1_x00725);
        uVar41 = *(uint *)(uVar32 + extraout_r1_x00727);
        uVar34 = *(uint *)(uVar32 + uVar44);
        puVar9[2] = uVar44 + 4;
        uVar33 = *(uint *)(uVar32 + uVar44 + 4);
        puVar9[2] = uVar44 + 8;
        uVar71 = *(uint *)(uVar32 + uVar44 + 8);
        puVar9[2] = uVar44 + 0xc;
        uVar38 = *(uint *)(uVar32 + uVar44 + 0xc);
        puVar9[2] = uVar44 + 0x10;
        uVar60 = *(uint *)(uVar32 + uVar44 + 0x10);
        puVar9[2] = uVar44 + 0x14;
        sVar12 = *(short *)(uVar32 + uVar44 + 0x14);
        puVar9[2] = uVar44 + 0x16;
        uVar35 = *(uint *)(uVar32 + uVar44 + 0x16);
        puVar9[2] = uVar44 + 0x1a;
        piVar47 = (int *)(uVar32 + uVar44 + 0x1a);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar44 + 0x22;
        uVar61 = *(uint *)(uVar32 + uVar44 + 0x22);
        puVar9[2] = uVar44 + 0x26;
        uVar32 = *(uint *)(uVar32 + uVar44 + 0x26);
        uVar55 = uVar55 ^ (uVar41 | uVar46 ^ uVar55 | uVar67 | uVar36);
        puVar9[2] = uVar44 + 0x2a;
        FUN_000264a4(uVar55 ^ uVar34,uVar53);
        FUN_000264a4(uVar55 ^ uVar35,uVar53);
        uVar46 = *puVar9;
        uVar13 = CONCAT11(*(undefined1 *)(uVar46 + extraout_r1_x00730),
                          *(undefined1 *)(uVar46 + extraout_r1_x00731));
        FUN_000264a4(uVar55 ^ uVar33,uVar53);
        FUN_000264a4(uVar55 ^ uVar71,uVar53);
        FUN_000264a4(uVar55 ^ uVar38,uVar53);
        FUN_000264a4(uVar55 ^ uVar32,uVar53);
        if (uVar13 < 0x401) {
          if (uVar13 < 0x201) {
            if (uVar13 == 0x102) {
              uVar13 = (ushort)*(byte *)(uVar46 + extraout_r1_x00733);
              goto LAB_00072e38;
            }
            if (uVar13 == 0x104) {
              *(uint *)(uVar46 + extraout_r1_x00732) = (uint)*(byte *)(uVar46 + extraout_r1_x00733);
            }
            else if (uVar13 == 0x108) {
              uVar71 = (uint)*(byte *)(uVar46 + extraout_r1_x00733);
LAB_0007242c:
              *(uint *)(uVar46 + extraout_r1_x00732) = uVar71;
              ((uint *)(uVar46 + extraout_r1_x00732))[1] = 0;
            }
          }
          else if (uVar13 == 0x201) {
LAB_00072708:
            uVar10 = *(undefined1 *)(uVar46 + extraout_r1_x00733);
LAB_00072e04:
            *(undefined1 *)(uVar46 + extraout_r1_x00732) = uVar10;
          }
          else if (uVar13 == 0x204) {
            *(uint *)(uVar46 + extraout_r1_x00732) = (uint)*(ushort *)(uVar46 + extraout_r1_x00733);
          }
          else if (uVar13 == 0x208) {
            uVar71 = (uint)*(ushort *)(uVar46 + extraout_r1_x00733);
            goto LAB_0007242c;
          }
        }
        else if (uVar13 < 0x801) {
          if (uVar13 == 0x401) {
            uVar10 = (undefined1)*(undefined4 *)(uVar46 + extraout_r1_x00733);
            goto LAB_00072e04;
          }
          if (uVar13 == 0x402) {
            uVar13 = (ushort)*(undefined4 *)(uVar46 + extraout_r1_x00733);
LAB_00072e38:
            *(ushort *)(uVar46 + extraout_r1_x00732) = uVar13;
          }
          else if (uVar13 == 0x408) {
            uVar71 = *(uint *)(uVar46 + extraout_r1_x00733);
            goto LAB_0007242c;
          }
        }
        else {
          if (uVar13 == 0x801) goto LAB_00072708;
          if (uVar13 == 0x802) {
            uVar13 = *(ushort *)(uVar46 + extraout_r1_x00733);
            goto LAB_00072e38;
          }
          if (uVar13 == 0x804) {
            *(undefined4 *)(uVar46 + extraout_r1_x00732) =
                 *(undefined4 *)(uVar46 + extraout_r1_x00733);
          }
        }
        uVar46 = 0x84222325;
        uVar71 = 0xcbf29ce4;
        if (sVar12 != 0) {
          iVar48 = (int)sVar12;
          iVar16 = 0;
          do {
            uVar88 = (ulonglong)uVar46;
            iVar48 = iVar48 + -1;
            iVar28 = uVar46 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00734 + iVar16);
            iVar16 = iVar16 + 1;
            uVar38 = (uint)*pcVar15;
            uVar46 = (uint)(uVar88 * 0x1b3) ^ uVar38;
            uVar71 = uVar71 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar38 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar34 = *(uint *)(*puVar9 + extraout_r1_x00735);
        uVar38 = (uVar46 | uVar34) * 2;
        bVar82 = uVar38 - (uVar46 + uVar34) == iVar37 &&
                 ((uVar71 | (int)uVar34 >> 0x1f) << 1 | (uVar46 | uVar34) >> 0x1f) -
                 (uVar71 + ((int)uVar34 >> 0x1f) + (uint)CARRY4(uVar46,uVar34) +
                 (uint)(uVar38 < uVar46 + uVar34)) == iVar62;
LAB_00072ed8:
        if (bVar82) {
          uVar61 = uVar60;
        }
        uVar55 = uVar55 ^ uVar61;
        break;
      case 0x68:
        uVar35 = *local_118;
        uVar53 = local_118[1];
        uVar36 = local_118[2];
        puVar22 = (uint *)(uVar35 + local_114);
        uVar55 = *puVar22;
        uVar60 = puVar22[1];
        uVar71 = puVar22[3];
        uVar61 = puVar22[4];
        FUN_000264a4(~(puVar22[2] ^ uVar53),uVar53);
        FUN_000264a4(~(uVar55 ^ uVar53),uVar53);
        uVar55 = *(uint *)(uVar35 + extraout_r1_x00354);
        FUN_000264a4(~(uVar71 ^ uVar53),uVar53);
        local_134 = *(uint *)(uVar35 + extraout_r1_x00355);
        uVar41 = *(uint *)(uVar35 + extraout_r1_x00353);
        FUN_000264a4(~(uVar60 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar61 ^ uVar53),uVar53);
        uVar61 = *(uint *)(uVar35 + extraout_r1_x00357);
        uVar60 = *(uint *)(uVar35 + extraout_r1_x00356);
        sVar12 = *(short *)(uVar35 + uVar36);
        iVar16 = (int)sVar12;
        puVar9[2] = uVar36 + 2;
        iVar48 = (int)*(short *)(uVar35 + uVar36 + 2);
        puVar9[2] = uVar36 + 4;
        uVar71 = *(uint *)(uVar35 + uVar36 + 4);
        puVar9[2] = uVar36 + 8;
        piVar47 = (int *)(uVar35 + uVar36 + 8);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar36 + 0x10;
        uVar34 = *(uint *)(uVar35 + uVar36 + 0x10);
        puVar9[2] = uVar36 + 0x14;
        uVar38 = *(uint *)(uVar35 + uVar36 + 0x14);
        puVar9[2] = uVar36 + 0x18;
        local_134 = uVar55 | uVar41 & (uVar61 ^ uVar60) | local_134;
        uVar41 = *(uint *)(uVar35 + uVar36 + 0x18);
        puVar9[2] = uVar36 + 0x1c;
        uVar44 = *(uint *)(uVar35 + uVar36 + 0x1c);
        puVar9[2] = uVar36 + 0x20;
        local_1ac = *(uint *)(uVar35 + uVar36 + 0x20);
        puVar9[2] = uVar36 + 0x24;
        puVar22 = (uint *)(uVar35 + uVar36 + 0x24);
        uVar32 = *puVar22;
        uVar33 = puVar22[1];
        puVar9[2] = uVar36 + 0x2c;
        uVar35 = *(uint *)(uVar35 + uVar36 + 0x2c);
        uVar67 = *puVar9;
        puVar9[2] = uVar36 + 0x30;
        uVar55 = *(uint *)(uVar67 + uVar36 + 0x30);
        puVar9[2] = uVar36 + 0x34;
        FUN_000264a4(local_134 ^ uVar71,uVar53);
        FUN_000264a4(local_134 ^ uVar38,uVar53);
        uVar29 = *(undefined4 *)(uVar67 + extraout_r1_x00358);
        uVar83 = ((undefined4 *)(uVar67 + extraout_r1_x00358))[1];
        puVar22 = (uint *)(uVar67 + uVar46);
        uVar38 = *puVar22;
        uVar71 = puVar9[1];
        uVar46 = puVar22[1];
        uVar60 = puVar22[3];
        uVar61 = puVar22[4];
        FUN_000264a4(~(puVar22[2] ^ uVar71),uVar71);
        FUN_000264a4(~(uVar38 ^ uVar71),uVar71);
        FUN_000264a4(~(uVar60 ^ uVar71),uVar71);
        FUN_000264a4(~(uVar61 ^ uVar71),uVar71);
        FUN_000264a4(~(uVar46 ^ uVar71),uVar71);
        uVar61 = *(uint *)(uVar67 + extraout_r1_x00364);
        uVar46 = *(uint *)(uVar67 + extraout_r1_x00363);
        uVar60 = *(uint *)(uVar67 + extraout_r1_x00362);
        uVar71 = *(uint *)(uVar67 + extraout_r1_x00361);
        uVar38 = *(uint *)(uVar67 + extraout_r1_x00360);
        *(undefined4 *)(uVar67 + extraout_r1_x00359) = uVar29;
        ((undefined4 *)(uVar67 + extraout_r1_x00359))[1] = uVar83;
        FUN_000264a4(local_134 ^ uVar41,uVar53);
        FUN_000264a4(local_134 ^ uVar44,uVar53);
        FUN_000264a4(local_134 ^ uVar35,uVar53);
        uVar35 = *puVar9;
        uVar41 = 0x84222325;
        uVar44 = 0xcbf29ce4;
        if (iVar48 != 0) {
          iVar28 = 0;
          do {
            uVar88 = (ulonglong)uVar41;
            iVar48 = iVar48 + -1;
            iVar70 = uVar41 * 0x100;
            pcVar15 = (char *)(uVar35 + extraout_r1_x00367 + iVar28);
            iVar28 = iVar28 + 1;
            uVar36 = (uint)*pcVar15;
            uVar41 = (uint)(uVar88 * 0x1b3) ^ uVar36;
            uVar44 = uVar44 * 0x1b3 + iVar70 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar36 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar36 = *(uint *)(uVar35 + extraout_r1_x00366);
        uVar60 = uVar60 ^ uVar71 & (uVar61 ^ uVar46 & (uVar60 ^ uVar71 & uVar38));
        uVar46 = uVar60 | (int)uVar60 >> 0x1f;
        uVar61 = (int)uVar36 >> 0x1f;
        if ((uVar60 & ~(uVar41 ^ uVar36) | (uVar41 ^ uVar36) & ~uVar60) != uVar32 ||
            (uVar46 & ~(uVar44 ^ uVar61) | (uVar44 ^ uVar61) & ~uVar46) != uVar33) {
          uVar55 = 0x84222325;
          uVar71 = 0xcbf29ce4;
          if (sVar12 != 0) {
            iVar48 = 0;
            do {
              uVar88 = (ulonglong)uVar55;
              iVar16 = iVar16 + -1;
              iVar28 = uVar55 * 0x100;
              pcVar15 = (char *)(uVar35 + extraout_r1_x00365 + iVar48);
              iVar48 = iVar48 + 1;
              uVar38 = (uint)*pcVar15;
              uVar55 = (uint)(uVar88 * 0x1b3) ^ uVar38;
              uVar71 = uVar71 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar38 >> 0x1f
              ;
            } while (iVar16 != 0);
          }
          uVar38 = (uVar36 & ~uVar55) * 2;
          uVar41 = (uVar55 - uVar36) + uVar38;
          uVar55 = (uVar71 - (uVar61 + (uVar55 < uVar36))) +
                   ((~uVar71 & uVar61) << 1 | (uVar36 & ~uVar55) >> 0x1f) +
                   (uint)CARRY4(uVar55 - uVar36,uVar38);
          uVar61 = (uVar60 & ~uVar41) * 2;
          bVar82 = (uVar41 - uVar60) + uVar61 == iVar37 &&
                   (uVar55 - (uVar46 + (uVar41 < uVar60))) +
                   ((uVar46 & ~uVar55) << 1 | (uVar60 & ~uVar41) >> 0x1f) +
                   (uint)CARRY4(uVar41 - uVar60,uVar61) == iVar62;
LAB_00067c80:
          uVar55 = local_1ac;
          if (bVar82) {
            uVar55 = uVar34;
          }
        }
        goto LAB_00067c88;
      case 0x6c:
        uVar41 = *local_118;
        uVar61 = local_114 ^ 0xc;
        uVar81 = local_118[1];
        uVar77 = local_118[2];
        FUN_000264a4(~(*(uint *)(uVar41 + (local_114 | 0xc) * 2 + uVar61 +
                                 (local_114 << 1 ^ 0xffffffe6) + 2) ^ uVar81),uVar81);
        FUN_000264a4(~(*(uint *)(uVar41 + (uVar46 << 1 | 0x21) + (uVar46 ^ 0xffffffef)) ^ uVar81),
                     uVar81);
        uVar61 = *(uint *)(uVar41 + (uVar46 & 0xc) * 2 + uVar61);
        FUN_000264a4(~(*(uint *)(uVar41 + uVar46) ^ uVar81),uVar81);
        uVar53 = *(uint *)(uVar41 + extraout_r1_x00514);
        uVar38 = *(uint *)(uVar41 + extraout_r1_x00513);
        FUN_000264a4(~(uVar61 ^ uVar81),uVar81);
        FUN_000264a4(~(((uint *)(uVar41 + uVar46))[2] ^ uVar81),uVar81);
        uVar61 = *(uint *)(uVar41 + extraout_r1_x00516);
        uVar55 = *(uint *)(uVar41 + extraout_r1_x00515);
        uVar60 = *(uint *)(uVar41 + extraout_r1_x00512);
        uVar71 = uVar46 & 4;
        FUN_000264a4(~(*(uint *)(uVar41 + (uVar71 | uVar71 << 1) + ~uVar71 + (uVar46 ^ 4) + 1) ^
                      uVar81),uVar81);
        uVar71 = *(uint *)(uVar41 + extraout_r1_x00517);
        uVar34 = *(uint *)(uVar41 + uVar77);
        uVar57 = *puVar9;
        uVar79 = puVar9[1];
        puVar9[2] = uVar77 + 4;
        uVar41 = *(uint *)(uVar41 + uVar77 + 4);
        puVar9[2] = uVar77 + 8;
        puVar22 = (uint *)(uVar57 + uVar77 + 8);
        uVar44 = *puVar22;
        uVar32 = puVar22[1];
        puVar9[2] = uVar77 + 0x10;
        iVar16 = (int)*(short *)(uVar57 + uVar77 + 0x10);
        puVar9[2] = uVar77 + 0x12;
        piVar47 = (int *)(uVar57 + uVar77 + 0x12);
        iVar62 = *piVar47;
        iVar48 = piVar47[1];
        puVar9[2] = uVar77 + 0x1a;
        uVar33 = *(uint *)(uVar57 + uVar77 + 0x1a);
        puVar9[2] = uVar77 + 0x1e;
        sVar12 = *(short *)(uVar57 + uVar77 + 0x1e);
        iVar28 = (int)sVar12;
        puVar9[2] = uVar77 + 0x20;
        uVar35 = *(uint *)(uVar57 + uVar77 + 0x20);
        puVar9[2] = uVar77 + 0x24;
        uVar36 = *(uint *)(uVar57 + uVar77 + 0x24);
        puVar9[2] = uVar77 + 0x28;
        uVar67 = *(uint *)(uVar57 + uVar77 + 0x28);
        puVar9[2] = uVar77 + 0x2c;
        uVar39 = *(uint *)(uVar57 + uVar77 + 0x2c);
        puVar9[2] = uVar77 + 0x30;
        uVar80 = *(uint *)(uVar57 + uVar77 + 0x30);
        puVar9[2] = uVar77 + 0x34;
        uVar50 = *(uint *)(uVar57 + uVar77 + 0x34);
        puVar9[2] = uVar77 + 0x38;
        uVar61 = uVar38 + (uVar61 & (uVar60 | uVar71 ^ uVar55) | ~uVar38) + 1;
        uVar60 = uVar61 + uVar53 + ~(uVar53 & uVar61) + 1;
        FUN_000264a4(uVar60 ^ uVar36,uVar79);
        FUN_000264a4(uVar60 ^ uVar80,uVar79);
        uVar71 = *puVar9;
        uVar55 = *(uint *)(uVar71 + extraout_r1_x00519);
        uVar53 = *(uint *)(uVar71 + extraout_r1_x00518);
        iVar37 = uVar55 << (uVar53 & 0xff);
        uVar61 = uVar55 >> (0x20 - uVar53 & 0xff) |
                 ((uint *)(uVar71 + extraout_r1_x00519))[1] << (uVar53 & 0xff);
        uVar53 = uVar53 - 0x20;
        if (-1 < (int)uVar53) {
          iVar37 = 0;
        }
        FUN_000264a4(uVar60 ^ uVar50,uVar79);
        puVar22 = (uint *)(uVar57 + uVar46);
        uVar46 = *puVar22;
        uVar38 = puVar22[2];
        uVar36 = puVar22[3];
        uVar50 = puVar22[4];
        FUN_000264a4(~(puVar22[1] ^ uVar79),uVar79);
        FUN_000264a4(~(uVar50 ^ uVar79),uVar79);
        FUN_000264a4(~(uVar46 ^ uVar79),uVar79);
        uVar46 = *(uint *)(uVar57 + extraout_r1_x00523);
        FUN_000264a4(~(uVar36 ^ uVar79),uVar79);
        FUN_000264a4(~(uVar38 ^ uVar79),uVar79);
        uVar38 = *(uint *)(uVar57 + extraout_r1_x00525);
        uVar36 = *(uint *)(uVar57 + extraout_r1_x00524);
        uVar50 = *(uint *)(uVar57 + extraout_r1_x00522);
        uVar57 = *(uint *)(uVar57 + extraout_r1_x00521);
        *(int *)(uVar71 + extraout_r1_x00520) = iVar37;
        if (-1 < (int)uVar53) {
          uVar61 = uVar55 << (uVar53 & 0xff);
        }
        ((int *)(uVar71 + extraout_r1_x00520))[1] = uVar61;
        FUN_000264a4(uVar60 ^ uVar34,uVar81);
        FUN_000264a4(uVar60 ^ uVar41,uVar81);
        FUN_000264a4(uVar60 ^ uVar33,uVar79);
        FUN_000264a4(uVar60 ^ uVar35,uVar79);
        FUN_000264a4(uVar60 ^ uVar67,uVar79);
        FUN_000264a4(uVar60 ^ uVar39,uVar79);
        uVar61 = 0x84222325;
        uVar55 = *puVar9;
        uVar53 = 0xcbf29ce4;
        if (iVar16 != 0) {
          iVar37 = 0;
          do {
            uVar88 = (ulonglong)uVar61;
            iVar16 = iVar16 + -1;
            iVar70 = uVar61 * 0x100;
            pcVar15 = (char *)(uVar55 + extraout_r1_x00531 + iVar37);
            iVar37 = iVar37 + 1;
            uVar60 = (uint)*pcVar15;
            uVar61 = (uint)(uVar88 * 0x1b3) ^ uVar60;
            uVar53 = uVar53 * 0x1b3 + iVar70 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar60 >> 0x1f;
          } while (iVar16 != 0);
        }
        uVar34 = *(uint *)(uVar55 + extraout_r1_x00527);
        uVar46 = uVar46 | uVar38 & (uVar36 ^ uVar50 ^ uVar57);
        uVar38 = uVar46 | (int)uVar46 >> 0x1f;
        uVar71 = (int)uVar34 >> 0x1f;
        uVar60 = extraout_r1_x00528;
        if ((uVar46 & ~(uVar61 ^ uVar34) | (uVar61 ^ uVar34) & ~uVar46) != uVar44 ||
            (uVar38 & ~(uVar53 ^ uVar71) | (uVar53 ^ uVar71) & ~uVar38) != uVar32) {
          uVar53 = 0x84222325;
          uVar61 = 0xcbf29ce4;
          if (sVar12 != 0) {
            iVar37 = 0;
            do {
              uVar88 = (ulonglong)uVar53;
              iVar28 = iVar28 + -1;
              iVar16 = uVar53 * 0x100;
              pcVar15 = (char *)(uVar55 + extraout_r1_x00530 + iVar37);
              iVar37 = iVar37 + 1;
              uVar60 = (uint)*pcVar15;
              uVar53 = (uint)(uVar88 * 0x1b3) ^ uVar60;
              uVar61 = uVar61 * 0x1b3 + iVar16 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar60 >> 0x1f
              ;
            } while (iVar28 != 0);
          }
          uVar55 = (uVar34 & ~uVar53) * 2;
          uVar41 = (uVar53 - uVar34) + uVar55;
          uVar53 = (uVar61 - (uVar71 + (uVar53 < uVar34))) +
                   ((~uVar61 & uVar71) << 1 | (uVar34 & ~uVar53) >> 0x1f) +
                   (uint)CARRY4(uVar53 - uVar34,uVar55);
          uVar61 = (uVar46 & ~uVar41) * 2;
          uVar60 = extraout_r1_x00529;
          if ((uVar41 - uVar46) + uVar61 == iVar62 &&
              (uVar53 - (uVar38 + (uVar41 < uVar46))) +
              ((uVar38 & ~uVar53) << 1 | (uVar46 & ~uVar41) >> 0x1f) +
              (uint)CARRY4(uVar41 - uVar46,uVar61) == iVar48) {
            uVar60 = extraout_r1_x00526;
          }
        }
        goto LAB_00073114;
      case 0x72:
        uVar41 = *local_118;
        local_134 = local_118[1];
        uVar81 = local_118[2];
        FUN_000264a4(~(*(uint *)(uVar41 + (local_114 << 1 | 0x11) + (local_114 ^ 0xfffffff7)) ^
                      local_134),local_134);
        uVar61 = uVar46 ^ 0xc;
        uVar55 = *(uint *)(uVar41 + extraout_r1_x00780);
        FUN_000264a4(~(*(uint *)(uVar41 + (uVar46 | 0xc) * 2 + uVar61 + (uVar46 << 1 ^ 0xffffffe6) +
                                2) ^ local_134),local_134);
        uVar60 = *(uint *)(uVar41 + extraout_r1_x00781);
        FUN_000264a4(~(*(uint *)(uVar41 + uVar46 * 2 + (uVar46 ^ 4) + (~uVar46 | 4) * 2 + 2) ^
                      local_134),local_134);
        FUN_000264a4(~(*(uint *)(uVar41 + (uVar46 & 4) * 2 + (uVar46 ^ 4)) ^ local_134),local_134);
        FUN_000264a4(~(*(uint *)(uVar41 + (uVar46 & 0xc) * 2 + uVar61) ^ local_134),local_134);
        FUN_000264a4(~(*(uint *)(uVar41 + ((uVar46 & 0xc) * 3 - (uVar46 | 0xc)) + uVar61 * 2) ^
                      local_134),local_134);
        FUN_000264a4(~(*(uint *)(uVar41 + ((uVar46 & 0x10 |
                                           (uVar46 & 0xffffffef) + (uVar46 & 0x10) * 2) ^ 0x10)) ^
                      local_134),local_134);
        puVar22 = (uint *)(uVar41 + uVar46);
        FUN_000264a4(~(*puVar22 ^ local_134),local_134);
        uVar38 = *(uint *)(uVar41 + extraout_r1_x00786);
        uVar79 = *(uint *)(uVar41 + extraout_r1_x00783);
        uVar44 = *(uint *)(uVar41 + uVar81);
        uVar71 = *(uint *)(uVar41 + extraout_r1_x00787);
        uVar80 = *(uint *)(uVar41 + extraout_r1_x00782);
        uVar34 = *(uint *)(uVar41 + extraout_r1_x00785);
        uVar53 = *(uint *)(uVar41 + extraout_r1_x00784);
        puVar9[2] = uVar81 + 4;
        sVar12 = *(short *)(uVar41 + uVar81 + 4);
        iVar16 = (int)sVar12;
        puVar9[2] = uVar81 + 6;
        piVar47 = (int *)(uVar41 + uVar81 + 6);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar81 + 0xe;
        uVar32 = *(uint *)(uVar41 + uVar81 + 0xe);
        puVar9[2] = uVar81 + 0x12;
        uVar33 = *(uint *)(uVar41 + uVar81 + 0x12);
        puVar9[2] = uVar81 + 0x16;
        uVar35 = *(uint *)(uVar41 + uVar81 + 0x16);
        puVar9[2] = uVar81 + 0x1a;
        uVar36 = *(uint *)(uVar41 + uVar81 + 0x1a);
        puVar9[2] = uVar81 + 0x1e;
        uVar61 = *(uint *)(uVar41 + uVar81 + 0x1e);
        puVar9[2] = uVar81 + 0x22;
        uVar67 = *(uint *)(uVar41 + uVar81 + 0x22);
        puVar9[2] = uVar81 + 0x26;
        uVar39 = *(uint *)(uVar41 + uVar81 + 0x26);
        puVar9[2] = uVar81 + 0x2a;
        puVar59 = (uint *)(uVar41 + uVar81 + 0x2a);
        uVar50 = *puVar59;
        uVar57 = puVar59[1];
        puVar9[2] = uVar81 + 0x32;
        sVar6 = *(short *)(uVar41 + uVar81 + 0x32);
        iVar48 = (int)sVar6;
        puVar9[2] = uVar81 + 0x34;
        uVar77 = *(uint *)(uVar41 + uVar81 + 0x34);
        puVar9[2] = uVar81 + 0x38;
        uVar79 = uVar79 | uVar80;
        uVar53 = (uVar53 | uVar79) * 2 - (uVar53 + uVar79);
        uVar53 = uVar34 + uVar53 + ~(uVar34 & uVar53) + 1;
        uVar53 = uVar71 | (uVar38 - (uVar38 ^ uVar53)) + (uVar53 & ~uVar38);
        uVar53 = uVar60 | (uVar55 - (uVar55 | uVar53)) + (uVar53 | ~uVar55);
        uVar55 = (uVar71 & uVar53 - uVar60) + uVar60 + ~uVar53;
        FUN_000264a4(uVar55 ^ uVar44,local_134);
        FUN_000264a4(uVar55 ^ uVar32,local_134);
        FUN_000264a4(uVar55 ^ uVar33,local_134);
        FUN_000264a4(uVar55 ^ uVar67,local_134);
        FUN_000264a4(uVar55 ^ uVar39,local_134);
        uVar38 = *puVar9;
        uVar34 = puVar9[1];
        pcVar66 = *(char **)(uVar38 + extraout_r1_x00788);
        pcVar76 = *(char **)(uVar38 + extraout_r1_x00791);
        uVar53 = puVar22[3];
        FUN_000264a4(~(puVar22[2] ^ local_134),local_134);
        FUN_000264a4(~(uVar53 ^ local_134),local_134);
        uVar53 = *(uint *)(uVar38 + extraout_r1_x00794);
        uVar60 = *(uint *)(uVar41 + extraout_r1_x00793);
        puVar22 = (uint *)(uVar38 + uVar46);
        uVar41 = *puVar22;
        uVar46 = puVar22[1];
        uVar71 = puVar22[3];
        FUN_000264a4(~(puVar22[4] ^ uVar34),uVar34);
        FUN_000264a4(~(uVar71 ^ uVar34),uVar34);
        FUN_000264a4(~(uVar41 ^ uVar34),uVar34);
        uVar41 = *(uint *)(uVar38 + extraout_r1_x00797);
        FUN_000264a4(~(uVar46 ^ uVar34),uVar34);
        uVar46 = *(uint *)(uVar38 + extraout_r1_x00798);
        pcVar58 = pcVar76 + -1;
        uVar71 = *(uint *)(uVar38 + extraout_r1_x00796);
        uVar34 = *(uint *)(uVar38 + extraout_r1_x00795);
        pcVar15 = pcVar58;
        do {
          pcVar15 = pcVar15 + 1;
        } while (*pcVar15 != '\0');
        pcVar73 = pcVar66 + -1;
        do {
          pcVar73 = pcVar73 + 1;
        } while (*pcVar73 != '\0');
        FUN_000264a4(uVar55 ^ uVar77,local_134);
        iVar28 = 0;
        if ((uint)((int)pcVar15 - (int)pcVar76) <= (uint)((int)pcVar73 - (int)pcVar66)) {
          do {
            iVar70 = iVar28;
            pcVar58 = pcVar58 + 1;
            iVar28 = iVar70 + -1;
          } while (*pcVar58 != '\0');
          iVar28 = 1;
          if (pcVar58 != pcVar76) {
            do {
              if (*pcVar66 != *pcVar76) {
                iVar28 = 0;
                break;
              }
              bVar82 = iVar70 != -1;
              iVar70 = iVar70 + 1;
              pcVar76 = pcVar76 + 1;
              pcVar66 = pcVar66 + 1;
            } while (bVar82);
          }
        }
        *(int *)(uVar38 + extraout_r1_x00799) = iVar28;
        uVar38 = 0x84222325;
        uVar44 = 0xcbf29ce4;
        uVar32 = *puVar9;
        if (sVar6 != 0) {
          iVar28 = 0;
          do {
            uVar88 = (ulonglong)uVar38;
            iVar48 = iVar48 + -1;
            iVar70 = uVar38 * 0x100;
            pcVar15 = (char *)(uVar32 + extraout_r1_x00789 + iVar28);
            iVar28 = iVar28 + 1;
            uVar33 = (uint)*pcVar15;
            uVar38 = (uint)(uVar88 * 0x1b3) ^ uVar33;
            uVar44 = uVar44 * 0x1b3 + iVar70 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar33 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar46 = uVar71 | uVar34 ^ (uVar53 | uVar60) | uVar41 | uVar46;
        uVar71 = uVar46 | (int)uVar46 >> 0x1f;
        uVar60 = *(uint *)(uVar32 + extraout_r1_x00790);
        uVar53 = (int)uVar60 >> 0x1f;
        if ((uVar46 & ~(uVar38 ^ uVar60) | (uVar38 ^ uVar60) & ~uVar46) != uVar50 ||
            (uVar71 & ~(uVar44 ^ uVar53) | (uVar44 ^ uVar53) & ~uVar71) != uVar57) {
          uVar38 = 0x84222325;
          uVar61 = 0xcbf29ce4;
          if (sVar12 != 0) {
            iVar48 = 0;
            do {
              uVar88 = (ulonglong)uVar38;
              iVar16 = iVar16 + -1;
              iVar28 = uVar38 * 0x100;
              pcVar15 = (char *)(uVar32 + extraout_r1_x00792 + iVar48);
              iVar48 = iVar48 + 1;
              uVar34 = (uint)*pcVar15;
              uVar38 = (uint)(uVar88 * 0x1b3) ^ uVar34;
              uVar61 = uVar61 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar34 >> 0x1f
              ;
            } while (iVar16 != 0);
          }
          uVar34 = (uVar60 & ~uVar38) * 2;
          uVar41 = (uVar38 - uVar60) + uVar34;
          uVar60 = (uVar61 - (uVar53 + (uVar38 < uVar60))) +
                   ((~uVar61 & uVar53) << 1 | (uVar60 & ~uVar38) >> 0x1f) +
                   (uint)CARRY4(uVar38 - uVar60,uVar34);
          uVar53 = (uVar46 & ~uVar41) * 2;
          uVar61 = uVar35;
          if ((uVar41 - uVar46) + uVar53 == iVar37 &&
              (uVar60 - (uVar71 + (uVar41 < uVar46))) +
              ((uVar71 & ~uVar60) << 1 | (uVar46 & ~uVar41) >> 0x1f) +
              (uint)CARRY4(uVar41 - uVar46,uVar53) == iVar62) {
            uVar61 = uVar36;
          }
        }
        goto LAB_000726c0;
      case 0x74:
        uVar33 = *local_118;
        uVar53 = local_118[1];
        uVar35 = local_118[2];
        puVar22 = (uint *)(uVar33 + local_114);
        uVar60 = *puVar22;
        uVar61 = puVar22[1];
        uVar55 = puVar22[2];
        uVar46 = puVar22[3];
        FUN_000264a4(~(puVar22[4] ^ uVar53),uVar53);
        FUN_000264a4(~(uVar46 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar55 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar60 ^ uVar53),uVar53);
        uVar46 = *(uint *)(uVar33 + extraout_r1_56);
        uVar55 = *(uint *)(uVar33 + extraout_r1_55);
        FUN_000264a4(~(uVar61 ^ uVar53),uVar53);
        uVar38 = *(uint *)(uVar33 + extraout_r1_57);
        uVar34 = *(uint *)(uVar33 + extraout_r1_54);
        uVar41 = *(uint *)(uVar33 + extraout_r1_53);
        uVar36 = *(uint *)(uVar33 + uVar35);
        puVar9[2] = uVar35 + 4;
        local_134 = *(uint *)(uVar33 + uVar35 + 4);
        puVar9[2] = uVar35 + 8;
        uVar61 = *(uint *)(uVar33 + uVar35 + 8);
        puVar9[2] = uVar35 + 0xc;
        uVar44 = *(uint *)(uVar33 + uVar35 + 0xc);
        puVar9[2] = uVar35 + 0x10;
        uVar60 = *(uint *)(uVar33 + uVar35 + 0x10);
        puVar9[2] = uVar35 + 0x14;
        iVar16 = (int)*(short *)(uVar33 + uVar35 + 0x14);
        puVar9[2] = uVar35 + 0x16;
        piVar47 = (int *)(uVar33 + uVar35 + 0x16);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar35 + 0x1e;
        uVar32 = *(uint *)(uVar33 + uVar35 + 0x1e);
        puVar9[2] = uVar35 + 0x22;
        uVar71 = *(uint *)(uVar33 + uVar35 + 0x22);
        puVar9[2] = uVar35 + 0x26;
        uVar55 = uVar55 ^ (uVar46 | uVar38 & ~(uVar34 & uVar41) & uVar55);
        FUN_000264a4(uVar55 ^ uVar36,uVar53);
        FUN_000264a4(uVar55 ^ uVar32,uVar53);
        iVar48 = *(int *)(uVar33 + extraout_r1_58);
        uVar46 = *(uint *)(uVar33 + extraout_r1_59);
        FUN_000264a4(uVar55 ^ uVar60,uVar53);
        *(int *)(*puVar9 + extraout_r1_60) = iVar48 << (uVar46 & 0xff);
        FUN_000264a4(uVar55 ^ uVar61,uVar53);
        FUN_000264a4(uVar55 ^ uVar44,uVar53);
        uVar61 = 0x84222325;
        uVar46 = 0xcbf29ce4;
        if (iVar16 != 0) {
          iVar48 = 0;
          do {
            uVar88 = (ulonglong)uVar61;
            iVar16 = iVar16 + -1;
            iVar28 = uVar61 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_61 + iVar48);
            iVar48 = iVar48 + 1;
            uVar60 = (uint)*pcVar15;
            uVar61 = (uint)(uVar88 * 0x1b3) ^ uVar60;
            uVar46 = uVar46 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar60 >> 0x1f;
          } while (iVar16 != 0);
        }
        uVar38 = *(uint *)(*puVar9 + extraout_r1_62);
        uVar60 = (uVar61 | uVar38) * 2;
        bVar82 = uVar60 - (uVar61 + uVar38) == iVar37 &&
                 ((uVar46 | (int)uVar38 >> 0x1f) << 1 | (uVar61 | uVar38) >> 0x1f) -
                 (uVar46 + ((int)uVar38 >> 0x1f) + (uint)CARRY4(uVar61,uVar38) +
                 (uint)(uVar60 < uVar61 + uVar38)) == iVar62;
LAB_00065c18:
        if (bVar82) {
          local_134 = uVar71;
        }
        uVar55 = uVar55 ^ local_134;
        break;
      case 0x78:
        uVar77 = *local_118;
        uVar53 = local_118[1];
        uVar50 = local_118[2];
        FUN_000264a4(~(*(uint *)(uVar77 + (local_114 | 0x10) * 2 + (local_114 ^ 0xffffffef) + 1) ^
                      uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar77 + (uVar46 | 4) + (uVar46 | 0xfffffffb) + 5) ^ uVar53),uVar53
                    );
        FUN_000264a4(~(*(uint *)(uVar77 + (uVar46 | 4) * 2 + (uVar46 ^ 0xfffffffb) + 1) ^ uVar53),
                     uVar53);
        uVar38 = *(uint *)(uVar77 + extraout_r1_x00207);
        uVar41 = *(uint *)(uVar77 + extraout_r1_x00206);
        FUN_000264a4(~(*(uint *)(uVar77 + (uVar46 | 0xc) * 2 + (uVar46 | 0xfffffff3) +
                                 (~uVar46 | 0xc) + 2) ^ uVar53),uVar53);
        local_134 = *(uint *)(uVar77 + extraout_r1_x00208);
        uVar61 = *(uint *)(uVar77 + extraout_r1_x00205);
        puVar22 = (uint *)(uVar77 + uVar46);
        uVar55 = *puVar22;
        FUN_000264a4(~(puVar22[2] ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar77 + (uVar46 & 4) * 2 + (uVar46 ^ 4)) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar77 + (uVar46 | 0xc) + (uVar46 & 0xc)) ^ uVar53),uVar53);
        FUN_000264a4(~(uVar55 ^ uVar53),uVar53);
        uVar71 = *(uint *)(uVar77 + extraout_r1_x00212);
        uVar39 = *(uint *)(uVar77 + extraout_r1_x00210);
        sVar12 = *(short *)(uVar77 + uVar50);
        iVar28 = (int)sVar12;
        uVar67 = *(uint *)(uVar77 + extraout_r1_x00211);
        uVar60 = *(uint *)(uVar77 + extraout_r1_x00209);
        puVar9[2] = uVar50 + 2;
        uVar55 = *(uint *)(uVar77 + uVar50 + 2);
        puVar9[2] = uVar50 + 6;
        uVar81 = *(uint *)(uVar77 + uVar50 + 6);
        puVar9[2] = uVar50 + 10;
        uVar34 = *(uint *)(uVar77 + uVar50 + 10);
        puVar9[2] = uVar50 + 0xe;
        piVar47 = (int *)(uVar77 + uVar50 + 0xe);
        iVar62 = *piVar47;
        iVar48 = piVar47[1];
        puVar9[2] = uVar50 + 0x16;
        uVar44 = *(uint *)(uVar77 + uVar50 + 0x16);
        puVar9[2] = uVar50 + 0x1a;
        uVar57 = *(uint *)(uVar77 + uVar50 + 0x1a);
        puVar9[2] = uVar50 + 0x1e;
        iVar16 = (int)*(short *)(uVar77 + uVar50 + 0x1e);
        puVar9[2] = uVar50 + 0x20;
        uVar32 = *(uint *)(uVar77 + uVar50 + 0x20);
        puVar9[2] = uVar50 + 0x24;
        puVar59 = (uint *)(uVar77 + uVar50 + 0x24);
        uVar33 = *puVar59;
        uVar35 = puVar59[1];
        puVar9[2] = uVar50 + 0x2c;
        local_1ac = *(uint *)(uVar77 + uVar50 + 0x2c);
        puVar9[2] = uVar50 + 0x30;
        uVar36 = *(uint *)(uVar77 + uVar50 + 0x30);
        puVar9[2] = uVar50 + 0x34;
        uVar60 = uVar60 | uVar61;
        uVar61 = uVar41 + ((uVar60 - uVar39) + (uVar39 & ~uVar60) * 2 | ~uVar41) + 1;
        uVar71 = (uVar67 ^ uVar61) + (uVar61 & ~uVar67) + (uVar67 | ~uVar61) + 1 & uVar71;
        local_134 = -((uVar38 | ~uVar71) + (uVar71 | ~uVar38)) - 2 ^ local_134;
        FUN_000264a4(local_134 ^ uVar81,uVar53);
        FUN_000264a4(local_134 ^ uVar57,uVar53);
        uVar41 = *puVar9;
        uVar71 = puVar9[1];
        iVar37 = *(int *)(uVar41 + extraout_r1_x00214);
        uVar61 = puVar22[3];
        uVar60 = puVar22[1];
        FUN_000264a4(~(puVar22[4] ^ uVar53),uVar53);
        FUN_000264a4(~(uVar60 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar61 ^ uVar53),uVar53);
        puVar22 = (uint *)(uVar41 + uVar46);
        FUN_000264a4(~(*puVar22 ^ uVar71),uVar71);
        uVar61 = puVar22[3];
        FUN_000264a4(~(puVar22[2] ^ uVar71),uVar71);
        FUN_000264a4(~(uVar61 ^ uVar71),uVar71);
        uVar61 = *(uint *)(uVar41 + extraout_r1_x00220);
        uVar46 = *(uint *)(uVar41 + extraout_r1_x00219);
        uVar60 = *(uint *)(uVar41 + extraout_r1_x00218);
        uVar71 = *(uint *)(uVar41 + extraout_r1_x00217);
        uVar38 = *(uint *)(uVar77 + extraout_r1_x00216);
        uVar67 = *(uint *)(uVar77 + extraout_r1_x00215);
        *(uint *)(uVar41 + extraout_r1_x00213) = (uint)(iVar37 == 0);
        FUN_000264a4(local_134 ^ uVar44,uVar53);
        FUN_000264a4(local_134 ^ uVar32,uVar53);
        FUN_000264a4(local_134 ^ uVar36,uVar53);
        uVar32 = *puVar9;
        uVar44 = 0x84222325;
        uVar41 = 0xcbf29ce4;
        if (iVar16 != 0) {
          iVar37 = 0;
          do {
            uVar88 = (ulonglong)uVar44;
            iVar16 = iVar16 + -1;
            iVar70 = uVar44 * 0x100;
            pcVar15 = (char *)(uVar32 + extraout_r1_x00223 + iVar37);
            iVar37 = iVar37 + 1;
            uVar36 = (uint)*pcVar15;
            uVar44 = (uint)(uVar88 * 0x1b3) ^ uVar36;
            uVar41 = uVar41 * 0x1b3 + iVar70 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar36 >> 0x1f;
          } while (iVar16 != 0);
        }
        uVar61 = uVar60 & ~(uVar38 & uVar67 & uVar71) & uVar46 & uVar61;
        uVar71 = uVar61 | (int)uVar61 >> 0x1f;
        uVar60 = *(uint *)(uVar32 + extraout_r1_x00222);
        uVar46 = (int)uVar60 >> 0x1f;
        if ((uVar61 & ~(uVar44 ^ uVar60) | (uVar44 ^ uVar60) & ~uVar61) != uVar33 ||
            (uVar71 & ~(uVar41 ^ uVar46) | (uVar41 ^ uVar46) & ~uVar71) != uVar35) {
          uVar38 = 0x84222325;
          uVar55 = 0xcbf29ce4;
          if (sVar12 != 0) {
            iVar37 = 0;
            do {
              uVar88 = (ulonglong)uVar38;
              iVar28 = iVar28 + -1;
              iVar16 = uVar38 * 0x100;
              pcVar15 = (char *)(uVar32 + extraout_r1_x00221 + iVar37);
              iVar37 = iVar37 + 1;
              uVar41 = (uint)*pcVar15;
              uVar38 = (uint)(uVar88 * 0x1b3) ^ uVar41;
              uVar55 = uVar55 * 0x1b3 + iVar16 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar41 >> 0x1f
              ;
            } while (iVar28 != 0);
          }
          uVar41 = (uVar60 & ~uVar38) * 2;
          uVar44 = (uVar38 - uVar60) + uVar41;
          uVar55 = (uVar55 - (uVar46 + (uVar38 < uVar60))) +
                   ((~uVar55 & uVar46) << 1 | (uVar60 & ~uVar38) >> 0x1f) +
                   (uint)CARRY4(uVar38 - uVar60,uVar41);
          uVar46 = (uVar61 & ~uVar44) * 2;
          bVar82 = (uVar44 - uVar61) + uVar46 == iVar62 &&
                   (uVar55 - (uVar71 + (uVar44 < uVar61))) +
                   ((uVar71 & ~uVar55) << 1 | (uVar61 & ~uVar44) >> 0x1f) +
                   (uint)CARRY4(uVar44 - uVar61,uVar46) == iVar48;
          goto LAB_00067c80;
        }
LAB_00067c88:
        uVar55 = local_134 ^ uVar55;
        break;
      case 0x7c:
        uVar39 = *local_118;
        uVar53 = local_118[1];
        uVar33 = local_118[2];
        FUN_000264a4(~(*(uint *)(uVar39 + (local_114 ^ 8) + (local_114 << 1 | 0xffffffee) + 0x12) ^
                      uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar39 + (uVar46 | 8) + (uVar46 | 0xfffffff7) + 9) ^ uVar53),uVar53
                    );
        uVar55 = *(uint *)(uVar39 + extraout_r1_x00703);
        puVar22 = (uint *)(uVar39 + uVar46);
        uVar38 = *(uint *)(uVar39 + extraout_r1_x00702);
        FUN_000264a4(~(*puVar22 ^ uVar53),uVar53);
        uVar60 = puVar22[3];
        FUN_000264a4(~(puVar22[1] ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar39 + (uVar46 & 4) * 2 + (uVar46 ^ 4)) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar39 + uVar46 * 2 + (uVar46 ^ 0x10) + (~uVar46 | 0x10) * 2 + 2) ^
                      uVar53),uVar53);
        uVar61 = *(uint *)(uVar39 + extraout_r1_x00707);
        uVar36 = *(uint *)(uVar39 + extraout_r1_x00706);
        uVar67 = *(uint *)(uVar39 + extraout_r1_x00705);
        uVar35 = *(uint *)(uVar39 + extraout_r1_x00704);
        FUN_000264a4(~(uVar60 ^ uVar53),uVar53);
        uVar71 = *(uint *)(uVar39 + extraout_r1_x00708);
        uVar46 = *(uint *)(uVar39 + uVar33);
        puVar9[2] = uVar33 + 4;
        uVar34 = *(uint *)(uVar39 + uVar33 + 4);
        puVar9[2] = uVar33 + 8;
        uVar41 = *(uint *)(uVar39 + uVar33 + 8);
        puVar9[2] = uVar33 + 0xc;
        uVar44 = *(uint *)(uVar39 + uVar33 + 0xc);
        puVar9[2] = uVar33 + 0x10;
        local_134 = *(uint *)(uVar39 + uVar33 + 0x10);
        puVar9[2] = uVar33 + 0x14;
        local_150 = *(uint *)(uVar39 + uVar33 + 0x14);
        puVar9[2] = uVar33 + 0x18;
        uVar32 = *(uint *)(uVar39 + uVar33 + 0x18);
        puVar9[2] = uVar33 + 0x1c;
        piVar47 = (int *)(uVar39 + uVar33 + 0x1c);
        iVar62 = *piVar47;
        uVar60 = piVar47[1];
        puVar9[2] = uVar33 + 0x24;
        iVar48 = (int)*(short *)(uVar39 + uVar33 + 0x24);
        puVar9[2] = uVar33 + 0x26;
        uVar38 = (uVar71 & ~uVar35 | uVar35 & ~uVar71) ^ uVar38;
        uVar71 = (uVar67 - (uVar67 ^ uVar38)) + (uVar38 & ~uVar67);
        uVar71 = uVar35 & ~uVar71 | uVar71 & ~uVar35;
        uVar71 = uVar36 + uVar71 + ~(uVar71 & uVar36) * 2 + 2;
        uVar71 = uVar71 + (uVar36 | ~uVar71) + 1;
        uVar38 = uVar71 ^ uVar61;
        iVar37 = (uVar71 | uVar61) + 1;
        uVar61 = uVar38 - iVar37;
        uVar61 = ((iVar37 + ~uVar38 | uVar35) - (uVar61 & uVar35)) + (uVar61 | uVar35) + 1;
        uVar55 = -((uVar55 | ~uVar61) + (uVar61 | ~uVar55)) - 2;
        FUN_000264a4(uVar55 ^ uVar46,uVar53);
        FUN_000264a4(uVar55 ^ uVar32,uVar53);
        uVar71 = *(uint *)(uVar39 + extraout_r1_x00709);
        iVar37 = 0;
        uVar46 = *(uint *)(uVar39 + extraout_r1_x00710);
        uVar61 = ((uint *)(uVar39 + extraout_r1_x00709))[1];
        uVar38 = ((uint *)(uVar39 + extraout_r1_x00710))[1];
        FUN_000264a4(uVar55 ^ uVar34,uVar53);
        *(uint *)(uVar39 + extraout_r1_x00711) =
             (uint)((int)(uVar38 - (uVar61 + (uVar46 < uVar71))) < 0 !=
                   (SBORROW4(uVar38,uVar61) != SBORROW4(uVar38 - uVar61,(uint)(uVar46 < uVar71)))) -
             (uint)((int)(uVar61 - (uVar38 + (uVar71 < uVar46))) < 0 !=
                   (SBORROW4(uVar61,uVar38) != SBORROW4(uVar61 - uVar38,(uint)(uVar71 < uVar46))));
        FUN_000264a4(uVar55 ^ uVar41,uVar53);
        FUN_000264a4(uVar55 ^ uVar44,uVar53);
        uVar61 = 0x84222325;
        uVar46 = 0xcbf29ce4;
        if (iVar48 != 0) {
          do {
            uVar88 = (ulonglong)uVar61;
            iVar48 = iVar48 + -1;
            iVar16 = uVar61 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00712 + iVar37);
            iVar37 = iVar37 + 1;
            uVar71 = (uint)*pcVar15;
            uVar61 = (uint)(uVar88 * 0x1b3) ^ uVar71;
            uVar46 = uVar46 * 0x1b3 + iVar16 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar71 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar38 = *(uint *)(*puVar9 + extraout_r1_x00713);
        uVar71 = (uVar61 | uVar38) * 2;
        iVar37 = uVar71 - (uVar61 + uVar38);
        uVar60 = ((uVar46 | (int)uVar38 >> 0x1f) << 1 | (uVar61 | uVar38) >> 0x1f) -
                 (uVar46 + ((int)uVar38 >> 0x1f) + (uint)CARRY4(uVar61,uVar38) +
                 (uint)(uVar71 < uVar61 + uVar38)) ^ uVar60;
LAB_0006d7b0:
        if (iVar37 == iVar62 && uVar60 == 0) {
          local_134 = local_150;
        }
        uVar55 = uVar55 ^ local_134;
        break;
      case 0x7f:
        uVar60 = *local_118;
        uVar53 = local_118[1];
        uVar33 = local_118[2];
        puVar22 = (uint *)(uVar60 + local_114);
        uVar61 = *puVar22;
        uVar55 = puVar22[1];
        uVar71 = puVar22[2];
        uVar46 = puVar22[4];
        FUN_000264a4(~(puVar22[3] ^ uVar53),uVar53);
        FUN_000264a4(~(uVar46 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar55 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar71 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar61 ^ uVar53),uVar53);
        uVar39 = *(uint *)(uVar60 + extraout_r1_x00930);
        uVar55 = *(uint *)(uVar60 + extraout_r1_x00929);
        uVar32 = *(uint *)(uVar60 + extraout_r1_x00926);
        iVar62 = *(int *)(uVar60 + uVar33);
        uVar44 = *(uint *)(uVar60 + extraout_r1_x00927);
        iVar37 = ((int *)(uVar60 + uVar33))[1];
        uVar50 = *(uint *)(uVar60 + extraout_r1_x00928);
        puVar9[2] = uVar33 + 8;
        uVar46 = *(uint *)(uVar60 + uVar33 + 8);
        puVar9[2] = uVar33 + 0xc;
        uVar61 = *(uint *)(uVar60 + uVar33 + 0xc);
        uVar36 = *puVar9;
        puVar9[2] = uVar33 + 0x10;
        uVar35 = *(uint *)(uVar60 + uVar33 + 0x10);
        puVar9[2] = uVar33 + 0x14;
        sVar12 = *(short *)(uVar60 + uVar33 + 0x14);
        puVar9[2] = uVar33 + 0x16;
        uVar67 = *(uint *)(uVar60 + uVar33 + 0x16);
        puVar9[2] = uVar33 + 0x1a;
        uVar71 = *(uint *)(uVar60 + uVar33 + 0x1a);
        puVar9[2] = uVar33 + 0x1e;
        uVar38 = *(uint *)(uVar60 + uVar33 + 0x1e);
        puVar9[2] = uVar33 + 0x22;
        uVar34 = *(uint *)(uVar60 + uVar33 + 0x22);
        puVar9[2] = uVar33 + 0x26;
        uVar60 = *(uint *)(uVar60 + uVar33 + 0x26);
        puVar9[2] = uVar33 + 0x2a;
        uVar41 = *(uint *)(uVar36 + uVar33 + 0x2a);
        puVar9[2] = uVar33 + 0x2e;
        uVar55 = uVar55 ^ uVar39 & (uVar55 | uVar50 ^ (uVar44 | uVar32));
        FUN_000264a4(uVar55 ^ uVar46,uVar53);
        FUN_000264a4(uVar55 ^ uVar35,uVar53);
        FUN_000264a4(uVar55 ^ uVar67,uVar53);
        FUN_000264a4(uVar55 ^ uVar71,uVar53);
        FUN_000264a4(uVar55 ^ uVar38,uVar53);
        FUN_000264a4(uVar55 ^ uVar34,uVar53);
        FUN_000264a4(uVar55 ^ uVar41,uVar53);
        iVar48 = *(int *)(uVar36 + extraout_r1_x00937);
        if (iVar48 == 0) {
          *(undefined4 *)(uVar36 + extraout_r1_x00931) = 0;
        }
        else {
          uVar46 = *(uint *)(uVar36 + extraout_r1_x00935);
          uVar71 = *(uint *)(uVar36 + extraout_r1_x00933);
          pcVar15 = (char *)(iVar48 + -1);
          do {
            pcVar15 = pcVar15 + 1;
          } while (*pcVar15 != '\0');
          if ((((int)uVar71 < 0) || ((int)uVar46 < (int)uVar71)) ||
             ((uint)((int)pcVar15 - iVar48) < uVar46)) {
            *(undefined4 *)(uVar36 + extraout_r1_x00931) = 0;
          }
          else if (uVar71 == uVar46) {
            *(undefined4 *)(uVar36 + extraout_r1_x00931) = 0;
          }
          else {
            pcVar15 = (char *)(iVar48 + uVar71);
            uVar38 = 7;
            if (*pcVar15 == '-') {
              uVar71 = uVar71 + 1;
              uVar38 = 8;
              if (uVar71 == uVar46) {
                *(undefined4 *)(uVar36 + extraout_r1_x00931) = 0;
                goto LAB_00072f2c;
              }
            }
            uVar88 = 0;
            if ((int)uVar71 < (int)uVar46) {
              iVar16 = uVar46 - uVar71;
              uVar88 = 0;
              pbVar54 = (byte *)(iVar48 + uVar71);
              do {
                uVar46 = (uint)(uVar88 >> 0x20);
                if (((*pbVar54 - 0x3a < 0xfffffff6) ||
                    (0xccccccb < uVar46 && (uint)((uint)uVar88 < 0xcccccccd) <= 0xccccccc - uVar46))
                   || ((uVar71 = *pbVar54 - 0x30, uVar88 == 0xccccccccccccccc && (uVar38 < uVar71)))
                   ) {
                  *(undefined4 *)(uVar36 + extraout_r1_x00931) = 0;
                  goto LAB_00072f2c;
                }
                iVar16 = iVar16 + -1;
                uVar88 = (uVar88 & 0xffffffff) * 10 + CONCAT44(uVar46 * 10,uVar71);
                pbVar54 = pbVar54 + 1;
              } while (iVar16 != 0);
            }
            uVar8 = CONCAT44(-((int)(uVar88 >> 0x20) + (uint)((int)uVar88 != 0)),-(int)uVar88);
            if (*pcVar15 != '-') {
              uVar8 = uVar88;
            }
            *(ulonglong *)(uVar36 + extraout_r1_x00936) = uVar8;
            *(undefined4 *)(*puVar9 + extraout_r1_x00931) = 1;
            *(ulonglong *)(*puVar9 + extraout_r1_x00936) = uVar8;
          }
        }
LAB_00072f2c:
        uVar46 = 0x84222325;
        uVar71 = 0xcbf29ce4;
        if (sVar12 != 0) {
          iVar48 = (int)sVar12;
          iVar16 = 0;
          uVar46 = 0x84222325;
          do {
            uVar88 = (ulonglong)uVar46;
            iVar48 = iVar48 + -1;
            iVar28 = uVar46 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00932 + iVar16);
            iVar16 = iVar16 + 1;
            uVar38 = (uint)*pcVar15;
            uVar46 = (uint)(uVar88 * 0x1b3) ^ uVar38;
            uVar71 = uVar71 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar38 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar34 = *(uint *)(*puVar9 + extraout_r1_x00934);
        uVar38 = (uVar46 | uVar34) * 2;
        bVar82 = uVar38 - (uVar46 + uVar34) == iVar62 &&
                 ((uVar71 | (int)uVar34 >> 0x1f) << 1 | (uVar46 | uVar34) >> 0x1f) -
                 (uVar71 + ((int)uVar34 >> 0x1f) + (uint)CARRY4(uVar46,uVar34) +
                 (uint)(uVar38 < uVar46 + uVar34)) == iVar37;
LAB_00072fd0:
        if (bVar82) {
          uVar61 = uVar60;
        }
        uVar55 = uVar55 ^ uVar61;
        break;
      case 0x81:
        uVar61 = local_114 ^ 0xfffffffb;
        uVar50 = *local_118;
        uVar53 = local_118[1];
        uVar35 = local_118[2];
        FUN_000264a4(~(*(uint *)(uVar50 + (local_114 << 1 | 9) + uVar61) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar50 + (uVar46 << 1 | 0x21) + (uVar46 ^ 0xffffffef)) ^ uVar53),
                     uVar53);
        FUN_000264a4(~(*(uint *)(uVar50 + (uVar46 & 0xc) * 2 + (uVar46 ^ 0xc) * 3 +
                                 (uVar46 << 1 ^ 0xffffffe6) + 2) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar50 + (uVar46 | 4) * 2 + uVar61 + 1) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar50 + (uVar46 ^ 4) + (uVar46 << 1 | 0xfffffff6) + 10) ^ uVar53),
                     uVar53);
        uVar55 = *(uint *)(uVar50 + extraout_r1_97);
        uVar60 = *(uint *)(uVar50 + extraout_r1_96);
        uVar71 = *(uint *)(uVar50 + extraout_r1_95);
        uVar38 = *(uint *)(uVar50 + extraout_r1_94);
        uVar34 = *(uint *)(uVar50 + extraout_r1_93);
        FUN_000264a4(~(*(uint *)(uVar50 + uVar46 * 2 + (uVar46 ^ 8) + (~uVar46 | 8) * 2 + 2) ^
                      uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar50 + (uVar46 | 0x10) + (uVar46 & 0x10)) ^ uVar53),uVar53);
        puVar22 = (uint *)(uVar50 + uVar46);
        uVar61 = *puVar22;
        uVar41 = puVar22[2];
        FUN_000264a4(~(puVar22[4] ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar50 + (uVar46 | 0xc) + (uVar46 & 0xc)) ^ uVar53),uVar53);
        FUN_000264a4(~(uVar41 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar61 ^ uVar53),uVar53);
        uVar46 = *(uint *)(uVar50 + extraout_r1_x00103);
        uVar44 = *(uint *)(uVar50 + extraout_r1_x00102);
        uVar77 = *(uint *)(uVar50 + extraout_r1_x00100);
        uVar32 = *(uint *)(uVar50 + extraout_r1_x00101);
        uVar36 = *(uint *)(uVar50 + uVar35);
        uVar41 = *(uint *)(uVar50 + extraout_r1_99);
        uVar33 = *(uint *)(uVar50 + extraout_r1_98);
        puVar9[2] = uVar35 + 4;
        uVar67 = *(uint *)(uVar50 + uVar35 + 4);
        puVar9[2] = uVar35 + 8;
        uVar39 = *(uint *)(uVar50 + uVar35 + 8);
        puVar9[2] = uVar35 + 0xc;
        iVar37 = (int)*(short *)(uVar50 + uVar35 + 0xc);
        puVar9[2] = uVar35 + 0xe;
        uVar61 = *(uint *)(uVar50 + uVar35 + 0xe);
        puVar9[2] = uVar35 + 0x12;
        uVar81 = *(uint *)(uVar50 + uVar35 + 0x12);
        puVar9[2] = uVar35 + 0x16;
        uVar50 = *(uint *)(uVar50 + uVar35 + 0x16);
        puVar9[2] = uVar35 + 0x1a;
        uVar57 = *puVar9;
        piVar47 = (int *)(uVar57 + uVar35 + 0x1a);
        iVar62 = *piVar47;
        iVar48 = piVar47[1];
        puVar9[2] = uVar35 + 0x22;
        uVar41 = uVar41 & (uVar33 & ~uVar34 | uVar34 & ~uVar33);
        uVar38 = uVar38 | (uVar41 - uVar77) + (uVar77 & ~uVar41) * 2;
        uVar71 = (uVar38 - uVar71) + (uVar71 & ~uVar38) * 2;
        uVar71 = (uVar32 - (uVar32 ^ uVar71)) + (uVar71 & ~uVar32);
        uVar44 = uVar55 | ~uVar71 + (uVar60 | uVar71) * 2 + (uVar71 | ~uVar60) + 2 | uVar44;
        uVar55 = uVar46 & ~uVar44 | uVar44 & ~uVar46;
        FUN_000264a4(uVar55 ^ uVar81,uVar53);
        FUN_000264a4(uVar55 ^ uVar50,uVar53);
        *(undefined4 *)(uVar57 + extraout_r1_x00104) = *(undefined4 *)(uVar57 + extraout_r1_x00105);
        FUN_000264a4(uVar55 ^ uVar36,uVar53);
        FUN_000264a4(uVar55 ^ uVar39,uVar53);
        uVar46 = 0x84222325;
        uVar60 = 0xcbf29ce4;
        if (iVar37 != 0) {
          iVar16 = 0;
          do {
            uVar88 = (ulonglong)uVar46;
            iVar37 = iVar37 + -1;
            iVar28 = uVar46 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00106 + iVar16);
            iVar16 = iVar16 + 1;
            uVar71 = (uint)*pcVar15;
            uVar46 = (uint)(uVar88 * 0x1b3) ^ uVar71;
            uVar60 = uVar60 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar71 >> 0x1f;
          } while (iVar37 != 0);
        }
        uVar38 = *(uint *)(*puVar9 + extraout_r1_x00107);
        uVar71 = (uVar46 | uVar38) * 2;
        if (uVar71 - (uVar46 + uVar38) == iVar62 &&
            ((uVar60 | (int)uVar38 >> 0x1f) << 1 | (uVar46 | uVar38) >> 0x1f) -
            (uVar60 + ((int)uVar38 >> 0x1f) + (uint)CARRY4(uVar46,uVar38) +
            (uint)(uVar71 < uVar46 + uVar38)) == iVar48) {
          uVar61 = uVar67;
        }
        uVar55 = uVar55 ^ uVar61;
        break;
      case 0x86:
        uVar34 = *local_118;
        local_134 = local_118[1];
        uVar41 = local_118[2];
        puVar22 = (uint *)(uVar34 + local_114);
        uVar61 = *puVar22;
        uVar53 = puVar22[1];
        uVar55 = puVar22[2];
        uVar60 = puVar22[4];
        FUN_000264a4(~(puVar22[3] ^ local_134),local_134);
        FUN_000264a4(~(uVar61 ^ local_134),local_134);
        FUN_000264a4(~(uVar53 ^ local_134),local_134);
        FUN_000264a4(~(uVar55 ^ local_134),local_134);
        uVar53 = *(uint *)(uVar34 + extraout_r1_x00260);
        uVar50 = *(uint *)(uVar34 + extraout_r1_x00259);
        uVar55 = *(uint *)(uVar34 + extraout_r1_x00258);
        FUN_000264a4(~(uVar60 ^ local_134),local_134);
        iVar62 = *(int *)(uVar34 + uVar41);
        uVar71 = *(uint *)(uVar34 + extraout_r1_x00261);
        iVar37 = ((int *)(uVar34 + uVar41))[1];
        uVar60 = *(uint *)(uVar34 + extraout_r1_x00257);
        puVar9[2] = uVar41 + 8;
        uVar44 = *(uint *)(uVar34 + uVar41 + 8);
        puVar9[2] = uVar41 + 0xc;
        uVar38 = *(uint *)(uVar34 + uVar41 + 0xc);
        puVar9[2] = uVar41 + 0x10;
        uVar32 = *(uint *)(uVar34 + uVar41 + 0x10);
        puVar9[2] = uVar41 + 0x14;
        uVar61 = *(uint *)(uVar34 + uVar41 + 0x14);
        puVar9[2] = uVar41 + 0x18;
        sVar12 = *(short *)(uVar34 + uVar41 + 0x18);
        puVar9[2] = uVar41 + 0x1a;
        iVar48 = (int)*(short *)(uVar34 + uVar41 + 0x1a);
        puVar9[2] = uVar41 + 0x1c;
        uVar33 = *(uint *)(uVar34 + uVar41 + 0x1c);
        puVar9[2] = uVar41 + 0x20;
        puVar22 = (uint *)(uVar34 + uVar41 + 0x20);
        uVar35 = *puVar22;
        uVar36 = puVar22[1];
        puVar9[2] = uVar41 + 0x28;
        uVar77 = *(uint *)(uVar34 + uVar41 + 0x28);
        puVar9[2] = uVar41 + 0x2c;
        uVar67 = *(uint *)(uVar34 + uVar41 + 0x2c);
        uVar57 = *puVar9;
        puVar9[2] = uVar41 + 0x30;
        uVar39 = *(uint *)(uVar57 + uVar41 + 0x30);
        puVar9[2] = uVar41 + 0x34;
        uVar34 = *(uint *)(uVar57 + uVar41 + 0x34);
        puVar9[2] = uVar41 + 0x38;
        uVar55 = uVar55 ^ uVar53 & (uVar50 ^ uVar60 & uVar71 & uVar55) & uVar60;
        FUN_000264a4(uVar55 ^ uVar38,local_134);
        fVar30 = (float)FUN_000264a4(uVar55 ^ uVar77,local_134);
        uVar50 = *puVar9;
        uVar41 = puVar9[1];
        uVar53 = puVar9[1];
        fmodf(fVar30,__y);
        FUN_000264a4(uVar55 ^ uVar34,uVar41);
        FUN_000264a4(~(*(uint *)(uVar57 + (uVar46 << 1 | 0x11) + (uVar46 ^ 0xfffffff7)) ^ uVar41),
                     uVar41);
        FUN_000264a4(~(*(uint *)(uVar57 + (uVar46 | 0x10) * 2 + (uVar46 ^ 0xffffffef) + 1) ^ uVar41)
                     ,uVar41);
        uVar60 = *(uint *)(uVar50 + extraout_r1_x00264);
        uVar71 = *(uint *)(uVar57 + extraout_r1_x00263);
        FUN_000264a4(~(*(uint *)(uVar57 + uVar46) ^ uVar41),uVar41);
        uVar34 = uVar46 & 0xc;
        uVar38 = ~uVar34;
        FUN_000264a4(~(*(uint *)(uVar57 + uVar34 * 3 + uVar38 + (uVar46 ^ 0xc) + 1) ^ uVar41),uVar41
                    );
        FUN_000264a4(~(*(uint *)(uVar57 + (uVar46 & 8) * 2 + (uVar46 ^ 8)) ^ uVar41),uVar41);
        FUN_000264a4(~(*(uint *)(uVar57 + uVar34 * 2 + uVar38 + (uVar46 | 0xc) + 1) ^ uVar41),uVar41
                    );
        FUN_000264a4(~(*(uint *)(uVar50 + (uVar46 & 8) * 2 + (uVar46 ^ 8)) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar50 + uVar46) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar50 + uVar34 * 3 + uVar38 + (uVar46 ^ 0xc) + 1) ^ uVar53),uVar53
                    );
        FUN_000264a4(~(*(uint *)(uVar50 + (uVar46 & 4) * 2 + (uVar46 ^ 4)) ^ uVar53),uVar53);
        uVar46 = *(uint *)(uVar50 + extraout_r1_x00272);
        uVar53 = *(uint *)(uVar50 + extraout_r1_x00271);
        uVar38 = *(uint *)(uVar50 + extraout_r1_x00270);
        uVar34 = *(uint *)(uVar50 + extraout_r1_x00269);
        uVar41 = *(uint *)(uVar57 + extraout_r1_x00268);
        uVar81 = *(uint *)(uVar57 + extraout_r1_x00267);
        uVar77 = *(uint *)(uVar57 + extraout_r1_x00266);
        uVar57 = *(uint *)(uVar57 + extraout_r1_x00265);
        *(undefined4 *)(uVar50 + extraout_r1_x00262) = extraout_r0;
        FUN_000264a4(uVar55 ^ uVar32,local_134);
        FUN_000264a4(uVar55 ^ uVar33,local_134);
        FUN_000264a4(uVar55 ^ uVar67,local_134);
        uVar67 = *puVar9;
        uVar33 = 0x84222325;
        uVar32 = 0xcbf29ce4;
        if (iVar48 != 0) {
          iVar16 = 0;
          do {
            uVar88 = (ulonglong)uVar33;
            iVar48 = iVar48 + -1;
            iVar28 = uVar33 * 0x100;
            pcVar15 = (char *)(uVar67 + extraout_r1_x00275 + iVar16);
            iVar16 = iVar16 + 1;
            uVar50 = (uint)*pcVar15;
            uVar33 = (uint)(uVar88 * 0x1b3) ^ uVar50;
            uVar32 = uVar32 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar50 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar50 = uVar77 + uVar57 + ~(uVar77 & uVar57) + 1;
        uVar50 = (uVar81 ^ uVar50) + (uVar50 & ~uVar81) + (uVar81 | ~uVar50) + 1;
        uVar50 = uVar77 & ~uVar50 | uVar50 & ~uVar77;
        uVar41 = (uVar41 - uVar50) + (uVar50 & ~uVar41) * 2;
        uVar71 = (uVar71 + uVar41) - (uVar71 | uVar41);
        uVar60 = ((uVar71 | uVar60) - (uVar71 & ~uVar60)) + (uVar71 | ~uVar60) + 1;
        uVar71 = uVar34 | uVar60;
        uVar60 = (~uVar38 + uVar38 * 2) - (uVar38 | uVar71 + ~(uVar71 + (uVar34 ^ uVar60)));
        uVar53 = uVar60 & ~uVar53 | uVar53 & ~uVar60;
        uVar60 = ~uVar46;
        uVar53 = ((uVar53 | uVar46) + uVar60) - (uVar53 | uVar60);
        uVar71 = uVar53 | (int)uVar53 >> 0x1f;
        uVar60 = *(uint *)(uVar67 + extraout_r1_x00274);
        uVar46 = (int)uVar60 >> 0x1f;
        if ((uVar53 & ~(uVar33 ^ uVar60) | (uVar33 ^ uVar60) & ~uVar53) != uVar35 ||
            (uVar71 & ~(uVar32 ^ uVar46) | (uVar32 ^ uVar46) & ~uVar71) != uVar36) {
          uVar61 = 0x84222325;
          uVar38 = 0xcbf29ce4;
          if (sVar12 != 0) {
            iVar16 = (int)sVar12;
            iVar48 = 0;
            do {
              uVar88 = (ulonglong)uVar61;
              iVar16 = iVar16 + -1;
              iVar28 = uVar61 * 0x100;
              pcVar15 = (char *)(uVar67 + extraout_r1_x00273 + iVar48);
              iVar48 = iVar48 + 1;
              uVar34 = (uint)*pcVar15;
              uVar61 = (uint)(uVar88 * 0x1b3) ^ uVar34;
              uVar38 = uVar38 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar34 >> 0x1f
              ;
            } while (iVar16 != 0);
          }
          uVar34 = (uVar60 & ~uVar61) * 2;
          uVar41 = (uVar61 - uVar60) + uVar34;
          uVar60 = (uVar38 - (uVar46 + (uVar61 < uVar60))) +
                   ((~uVar38 & uVar46) << 1 | (uVar60 & ~uVar61) >> 0x1f) +
                   (uint)CARRY4(uVar61 - uVar60,uVar34);
          uVar46 = (uVar53 & ~uVar41) * 2;
          uVar61 = uVar39;
          if ((uVar41 - uVar53) + uVar46 == iVar62 &&
              (uVar60 - (uVar71 + (uVar41 < uVar53))) +
              ((uVar71 & ~uVar60) << 1 | (uVar53 & ~uVar41) >> 0x1f) +
              (uint)CARRY4(uVar41 - uVar53,uVar46) == iVar37) {
            uVar61 = uVar44;
          }
        }
LAB_000726c0:
        uVar55 = uVar55 ^ uVar61;
        uVar53 = local_134;
        break;
      case 0x87:
        uVar39 = *local_118;
        uVar41 = local_114 | 8;
        uVar61 = local_114 & 8;
        uVar53 = local_118[1];
        uVar67 = local_118[2];
        FUN_000264a4(~(*(uint *)(uVar39 + uVar41 * 2 + uVar61 + (~local_114 & 0xfffffff7) + 1) ^
                      uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar39 + (uVar46 | 4) * 2 + (uVar46 | 0xfffffffb) + (~uVar46 | 4) +
                                2) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar39 + (uVar46 & 0x10) * 2 + (~uVar46 | 0xffffffef) +
                                 (uVar46 | 0x10) + 1) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar39 + (uVar46 << 1 | 0x19) + (uVar46 ^ 0xfffffff3)) ^ uVar53),
                     uVar53);
        uVar55 = *(uint *)(uVar39 + extraout_r1_x00319);
        uVar60 = *(uint *)(uVar39 + extraout_r1_x00318);
        uVar71 = *(uint *)(uVar39 + extraout_r1_x00317);
        uVar38 = *(uint *)(uVar39 + extraout_r1_x00316);
        puVar22 = (uint *)(uVar39 + uVar46);
        FUN_000264a4(~(*puVar22 ^ uVar53),uVar53);
        uVar34 = puVar22[4];
        FUN_000264a4(~(puVar22[3] ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar39 + ((uVar61 | uVar61 << 1) - uVar41) + (uVar46 ^ 8) * 2) ^
                      uVar53),uVar53);
        uVar46 = *(uint *)(uVar39 + extraout_r1_x00322);
        uVar36 = *(uint *)(uVar39 + extraout_r1_x00321);
        uVar35 = *(uint *)(uVar39 + extraout_r1_x00320);
        FUN_000264a4(~(uVar34 ^ uVar53),uVar53);
        uVar33 = *(uint *)(uVar39 + extraout_r1_x00323);
        iVar48 = *(int *)(uVar39 + uVar67);
        iVar37 = ((int *)(uVar39 + uVar67))[1];
        puVar9[2] = uVar67 + 8;
        iVar16 = (int)*(short *)(uVar39 + uVar67 + 8);
        puVar9[2] = uVar67 + 10;
        uVar34 = *(uint *)(uVar39 + uVar67 + 10);
        puVar9[2] = uVar67 + 0xe;
        uVar61 = *(uint *)(uVar39 + uVar67 + 0xe);
        puVar9[2] = uVar67 + 0x12;
        uVar50 = *(uint *)(uVar39 + uVar67 + 0x12);
        puVar9[2] = uVar67 + 0x16;
        uVar44 = *(uint *)(uVar39 + uVar67 + 0x16);
        puVar9[2] = uVar67 + 0x1a;
        uVar41 = *(uint *)(uVar39 + uVar67 + 0x1a);
        puVar9[2] = uVar67 + 0x1e;
        uVar32 = *(uint *)(uVar39 + uVar67 + 0x1e);
        puVar9[2] = uVar67 + 0x22;
        uVar39 = *(uint *)(uVar39 + uVar67 + 0x22);
        uVar38 = uVar33 & uVar35 & uVar38 & uVar71;
        puVar9[2] = uVar67 + 0x26;
        uVar60 = uVar55 & (uVar38 & ~uVar60 | uVar60 & ~uVar38);
        uVar60 = uVar36 & ~uVar60 | uVar60 & ~uVar36;
        uVar46 = uVar60 + (uVar46 | ~uVar60) + 1;
        uVar60 = uVar46 | uVar71;
        iVar62 = uVar46 + uVar71 + 1;
        uVar46 = iVar62 + ~uVar60 & ~uVar55 | uVar55 & uVar60 - iVar62;
        uVar55 = (uVar46 - uVar35) + (uVar35 & ~uVar46) * 2;
        FUN_000264a4(uVar55 ^ uVar50,uVar53);
        FUN_000264a4(uVar55 ^ uVar32,uVar53);
        FUN_000264a4(uVar55 ^ uVar39,uVar53);
        uVar46 = *puVar9;
        *(double *)(uVar46 + extraout_r1_x00324) =
             *(double *)(uVar46 + extraout_r1_x00326) + *(double *)(uVar46 + extraout_r1_x00325);
        FUN_000264a4(uVar55 ^ uVar34,uVar53);
        FUN_000264a4(uVar55 ^ uVar41,uVar53);
        uVar46 = 0x84222325;
        uVar60 = 0xcbf29ce4;
        if (iVar16 != 0) {
          iVar62 = 0;
          do {
            uVar88 = (ulonglong)uVar46;
            iVar16 = iVar16 + -1;
            iVar28 = uVar46 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00327 + iVar62);
            iVar62 = iVar62 + 1;
            uVar71 = (uint)*pcVar15;
            uVar46 = (uint)(uVar88 * 0x1b3) ^ uVar71;
            uVar60 = uVar60 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar71 >> 0x1f;
          } while (iVar16 != 0);
        }
        uVar38 = *(uint *)(*puVar9 + extraout_r1_x00328);
        uVar71 = (uVar46 | uVar38) * 2;
        bVar82 = uVar71 - (uVar46 + uVar38) == iVar48 &&
                 ((uVar60 | (int)uVar38 >> 0x1f) << 1 | (uVar46 | uVar38) >> 0x1f) -
                 (uVar60 + ((int)uVar38 >> 0x1f) + (uint)CARRY4(uVar46,uVar38) +
                 (uint)(uVar71 < uVar46 + uVar38)) == iVar37;
        goto LAB_000728d0;
      case 0x8b:
        uVar33 = *local_118;
        uVar65 = local_118[1];
        uVar75 = local_118[2];
        uVar61 = ~local_114;
        FUN_000264a4(~(*(uint *)(uVar33 + (local_114 | 8) * 2 + (local_114 | 0xfffffff7) +
                                 (uVar61 | 8) + 2) ^ uVar65),uVar65);
        FUN_000264a4(~(*(uint *)(uVar33 + (uVar46 << 1 | 9) + (uVar46 ^ 0xfffffffb)) ^ uVar65),
                     uVar65);
        uVar44 = uVar46 | 0xc;
        FUN_000264a4(~(*(uint *)(uVar33 + uVar44 + (uVar46 | 0xfffffff3) + 0xd) ^ uVar65),uVar65);
        uVar32 = uVar46 & 0xc;
        FUN_000264a4(~(*(uint *)(uVar33 + uVar44 * 2 + uVar32 + (~uVar46 & 0xfffffff3) + 1) ^ uVar65
                      ),uVar65);
        iVar37 = uVar33 + uVar32 * 2;
        FUN_000264a4(~(*(uint *)(iVar37 + (uVar46 ^ 0xc) * 3 + (uVar46 << 1 ^ 0xffffffe6) + 2) ^
                      uVar65),uVar65);
        FUN_000264a4(~(*(uint *)(uVar33 + (uVar46 | 4) * 2 + (uVar46 | 0xfffffffb) + (uVar61 | 4) +
                                2) ^ uVar65),uVar65);
        uVar61 = *(uint *)(uVar33 + extraout_r1_34);
        uVar72 = *(uint *)(uVar33 + extraout_r1_32);
        uVar53 = *(uint *)(uVar33 + extraout_r1_33);
        uVar55 = *(uint *)(uVar33 + extraout_r1_31);
        uVar60 = *(uint *)(uVar33 + extraout_r1_30);
        uVar71 = *(uint *)(uVar33 + extraout_r1_29);
        uVar38 = *(uint *)(uVar33 + uVar46);
        FUN_000264a4(~(((uint *)(uVar33 + uVar46))[4] ^ uVar65),uVar65);
        FUN_000264a4(~(uVar38 ^ uVar65),uVar65);
        uVar38 = uVar46 & 8;
        FUN_000264a4(~(*(uint *)(uVar33 + (uVar38 | uVar38 << 1) + ~uVar38 + (uVar46 ^ 8) + 1) ^
                      uVar65),uVar65);
        uVar38 = *(uint *)(uVar33 + extraout_r1_37);
        uVar34 = *(uint *)(uVar33 + extraout_r1_36);
        uVar41 = *(uint *)(uVar33 + extraout_r1_35);
        FUN_000264a4(~(*(uint *)(iVar37 + ~uVar32 + uVar44 + 1) ^ uVar65),uVar65);
        uVar39 = *(uint *)(uVar33 + extraout_r1_38);
        uVar67 = *(uint *)(uVar33 + uVar75);
        uVar44 = ((uint *)(uVar33 + uVar75))[1];
        puVar9[2] = uVar75 + 8;
        uVar32 = *(uint *)(uVar33 + uVar75 + 8);
        uVar80 = *puVar9;
        uVar51 = puVar9[1];
        puVar9[2] = uVar75 + 0xc;
        uVar78 = *(uint *)(uVar33 + uVar75 + 0xc);
        puVar9[2] = uVar75 + 0x10;
        sVar12 = *(short *)(uVar33 + uVar75 + 0x10);
        iVar48 = (int)sVar12;
        puVar9[2] = uVar75 + 0x12;
        uVar50 = *(uint *)(uVar33 + uVar75 + 0x12);
        puVar9[2] = uVar75 + 0x16;
        piVar47 = (int *)(uVar33 + uVar75 + 0x16);
        iVar37 = *piVar47;
        uVar36 = piVar47[1];
        puVar9[2] = uVar75 + 0x1e;
        uVar57 = *(uint *)(uVar33 + uVar75 + 0x1e);
        puVar9[2] = uVar75 + 0x22;
        uVar33 = *(uint *)(uVar80 + uVar75 + 0x22);
        puVar9[2] = uVar75 + 0x26;
        uVar77 = *(uint *)(uVar80 + uVar75 + 0x26);
        puVar9[2] = uVar75 + 0x2a;
        uVar35 = *(uint *)(uVar80 + uVar75 + 0x2a);
        puVar9[2] = uVar75 + 0x2e;
        iVar62 = (int)*(short *)(uVar80 + uVar75 + 0x2e);
        puVar9[2] = uVar75 + 0x30;
        uVar81 = *(uint *)(uVar80 + uVar75 + 0x30);
        puVar9[2] = uVar75 + 0x34;
        uVar79 = *(uint *)(uVar80 + uVar75 + 0x34);
        puVar9[2] = uVar75 + 0x38;
        uVar39 = uVar39 | uVar41;
        uVar71 = (uVar71 | uVar39) - (uVar71 & ~uVar39 | uVar39 & ~uVar71);
        uVar53 = uVar53 | uVar72 ^ ((uVar60 & ~uVar71 | uVar71 & ~uVar60) ^ uVar55) & uVar34;
        uVar53 = ((uVar72 & ~uVar53) * 2 - (uVar72 | ~uVar53)) + (uVar53 | ~uVar72);
        uVar53 = uVar38 & ~uVar53 | uVar53 & ~uVar38;
        uVar60 = (uVar61 ^ uVar53) + uVar53 + (uVar61 | ~uVar53) + 1;
        FUN_000264a4(uVar60 ^ uVar78,uVar65);
        FUN_000264a4(uVar60 ^ uVar35,uVar51);
        uVar55 = *(uint *)(uVar80 + extraout_r1_40);
        uVar71 = ((uint *)(uVar80 + extraout_r1_39))[1];
        uVar61 = *(uint *)(uVar80 + extraout_r1_39) >> (uVar55 & 0xff) |
                 uVar71 << (0x20 - uVar55 & 0xff);
        uVar53 = uVar55 - 0x20;
        if (-1 < (int)uVar53) {
          uVar61 = (int)uVar71 >> (uVar53 & 0xff);
        }
        FUN_000264a4(uVar60 ^ uVar33,uVar51);
        puVar22 = (uint *)(uVar80 + uVar46);
        uVar41 = *puVar22;
        uVar46 = puVar22[2];
        uVar38 = puVar22[3];
        uVar34 = puVar22[1];
        FUN_000264a4(~(puVar22[4] ^ uVar51),uVar51);
        FUN_000264a4(~(uVar41 ^ uVar51),uVar51);
        FUN_000264a4(~(uVar46 ^ uVar51),uVar51);
        uVar46 = *(uint *)(uVar80 + extraout_r1_44);
        FUN_000264a4(~(uVar38 ^ uVar51),uVar51);
        FUN_000264a4(~(uVar34 ^ uVar51),uVar51);
        uVar38 = *(uint *)(uVar80 + extraout_r1_46);
        uVar34 = *(uint *)(uVar80 + extraout_r1_45);
        uVar41 = *(uint *)(uVar80 + extraout_r1_43);
        uVar33 = *(uint *)(uVar80 + extraout_r1_42);
        *(uint *)(uVar80 + extraout_r1_41) = uVar61;
        uVar61 = (int)uVar71 >> (uVar55 & 0xff);
        if (-1 < (int)uVar53) {
          uVar61 = (int)uVar71 >> 0x1f;
        }
        ((uint *)(uVar80 + extraout_r1_41))[1] = uVar61;
        FUN_000264a4(uVar60 ^ uVar32,uVar65);
        FUN_000264a4(uVar60 ^ uVar50,uVar65);
        FUN_000264a4(uVar60 ^ uVar57,uVar65);
        FUN_000264a4(uVar60 ^ uVar77,uVar51);
        FUN_000264a4(uVar60 ^ uVar81,uVar51);
        FUN_000264a4(uVar60 ^ uVar79,uVar51);
        uVar61 = 0x84222325;
        uVar55 = *puVar9;
        uVar53 = 0xcbf29ce4;
        if (iVar62 != 0) {
          iVar16 = 0;
          do {
            uVar88 = (ulonglong)uVar61;
            iVar62 = iVar62 + -1;
            iVar28 = uVar61 * 0x100;
            pcVar15 = (char *)(uVar55 + extraout_r1_51 + iVar16);
            iVar16 = iVar16 + 1;
            uVar60 = (uint)*pcVar15;
            uVar61 = (uint)(uVar88 * 0x1b3) ^ uVar60;
            uVar53 = uVar53 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar60 >> 0x1f;
          } while (iVar62 != 0);
        }
        uVar32 = *(uint *)(uVar55 + extraout_r1_48);
        uVar46 = uVar46 | uVar38 ^ (uVar34 | uVar33 & ~uVar41);
        uVar38 = uVar46 | (int)uVar46 >> 0x1f;
        uVar71 = (int)uVar32 >> 0x1f;
        uVar60 = extraout_r1_52;
        if ((uVar46 & ~(uVar61 ^ uVar32) | (uVar61 ^ uVar32) & ~uVar46) != uVar67 ||
            (uVar38 & ~(uVar53 ^ uVar71) | (uVar53 ^ uVar71) & ~uVar38) != uVar44) {
          uVar61 = 0x84222325;
          uVar53 = 0xcbf29ce4;
          if (sVar12 != 0) {
            iVar62 = 0;
            uVar61 = 0x84222325;
            do {
              uVar88 = (ulonglong)uVar61;
              iVar48 = iVar48 + -1;
              iVar16 = uVar61 * 0x100;
              pcVar15 = (char *)(uVar55 + extraout_r1_47 + iVar62);
              iVar62 = iVar62 + 1;
              uVar60 = (uint)*pcVar15;
              uVar61 = (uint)(uVar88 * 0x1b3) ^ uVar60;
              uVar53 = uVar53 * 0x1b3 + iVar16 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar60 >> 0x1f
              ;
            } while (iVar48 != 0);
          }
          uVar55 = (uVar32 & ~uVar61) * 2;
          uVar60 = (uVar61 - uVar32) + uVar55;
          uVar53 = (uVar53 - (uVar71 + (uVar61 < uVar32))) +
                   ((~uVar53 & uVar71) << 1 | (uVar32 & ~uVar61) >> 0x1f) +
                   (uint)CARRY4(uVar61 - uVar32,uVar55);
          uVar61 = (uVar46 & ~uVar60) * 2;
          iVar62 = (uVar60 - uVar46) + uVar61;
          uVar36 = (uVar53 - (uVar38 + (uVar60 < uVar46))) +
                   ((uVar38 & ~uVar53) << 1 | (uVar46 & ~uVar60) >> 0x1f) +
                   (uint)CARRY4(uVar60 - uVar46,uVar61) ^ uVar36;
          uVar60 = extraout_r1_49;
          local_170 = extraout_r1_50;
          goto LAB_00071844;
        }
        goto LAB_00073114;
      case 0x90:
        uVar77 = *local_118;
        uVar53 = local_118[1];
        uVar61 = local_114 & 8;
        uVar57 = local_118[2];
        FUN_000264a4(~(*(uint *)(uVar77 + (local_114 | 8) * 2 + uVar61 + (~local_114 & 0xfffffff7) +
                                1) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar77 + (uVar46 << 1 | 9) + (uVar46 ^ 0xfffffffb)) ^ uVar53),
                     uVar53);
        FUN_000264a4(~(*(uint *)(uVar77 + (uVar46 ^ 4) + (uVar46 << 1 | 0xfffffff6) + 10) ^ uVar53),
                     uVar53);
        uVar55 = *(uint *)(uVar77 + extraout_r1_x00940);
        uVar60 = *(uint *)(uVar77 + extraout_r1_x00939);
        uVar71 = *(uint *)(uVar77 + extraout_r1_x00938);
        FUN_000264a4(~(*(uint *)(uVar77 + uVar61 * 2 + (uVar46 ^ 8)) ^ uVar53),uVar53);
        puVar22 = (uint *)(uVar77 + uVar46);
        uVar38 = *puVar22;
        FUN_000264a4(~(puVar22[2] ^ uVar53),uVar53);
        uVar61 = uVar46 & 0xc;
        FUN_000264a4(~(*(uint *)(uVar77 + uVar61 * 2 + (uVar46 ^ 0xc)) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)((int)puVar22 + (~uVar46 | 0x10) + (uVar46 | 0x10) + 1) ^ uVar53),
                     uVar53);
        FUN_000264a4(~(uVar38 ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar77 + uVar61 * 3 + ~uVar61 + (uVar46 ^ 0xc) + 1) ^ uVar53),
                     uVar53);
        uVar46 = *(uint *)(uVar77 + extraout_r1_x00946);
        uVar39 = *(uint *)(uVar77 + extraout_r1_x00944);
        uVar41 = *(uint *)(uVar77 + extraout_r1_x00945);
        uVar50 = *(uint *)(uVar77 + extraout_r1_x00943);
        uVar81 = *(uint *)(uVar77 + uVar57);
        uVar34 = *(uint *)(uVar77 + extraout_r1_x00942);
        uVar38 = *(uint *)(uVar77 + extraout_r1_x00941);
        puVar9[2] = uVar57 + 4;
        piVar47 = (int *)(uVar77 + uVar57 + 4);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar57 + 0xc;
        sVar12 = *(short *)(uVar77 + uVar57 + 0xc);
        iVar48 = (int)sVar12;
        puVar9[2] = uVar57 + 0xe;
        uVar32 = *(uint *)(uVar77 + uVar57 + 0xe);
        puVar9[2] = uVar57 + 0x12;
        uVar33 = *(uint *)(uVar77 + uVar57 + 0x12);
        puVar9[2] = uVar57 + 0x16;
        uVar35 = *(uint *)(uVar77 + uVar57 + 0x16);
        puVar9[2] = uVar57 + 0x1a;
        uVar61 = *(uint *)(uVar77 + uVar57 + 0x1a);
        puVar9[2] = uVar57 + 0x1e;
        uVar36 = *(uint *)(uVar77 + uVar57 + 0x1e);
        puVar9[2] = uVar57 + 0x22;
        uVar67 = *(uint *)(uVar77 + uVar57 + 0x22);
        puVar9[2] = uVar57 + 0x26;
        uVar44 = *(uint *)(uVar77 + uVar57 + 0x26);
        puVar9[2] = uVar57 + 0x2a;
        uVar34 = uVar34 & (uVar38 | uVar71);
        uVar55 = uVar50 + ((uVar60 ^ uVar34) + (uVar60 & ~uVar34) + (uVar34 | ~uVar60) + 1 | uVar55
                          | ~uVar50) + 1;
        uVar41 = uVar41 & (uVar39 & ~uVar55 | uVar55 & ~uVar39);
        uVar55 = (uVar46 - uVar41) + (uVar41 & ~uVar46) * 2;
        FUN_000264a4(uVar55 ^ uVar81,uVar53);
        FUN_000264a4(uVar55 ^ uVar35,uVar53);
        uVar13 = CONCAT11(*(undefined1 *)(uVar77 + extraout_r1_x00947),
                          *(undefined1 *)(uVar77 + extraout_r1_x00948));
        FUN_000264a4(uVar55 ^ uVar32,uVar53);
        FUN_000264a4(uVar55 ^ uVar33,uVar53);
        FUN_000264a4(uVar55 ^ uVar36,uVar53);
        FUN_000264a4(uVar55 ^ uVar67,uVar53);
        if (uVar13 < 0x404) {
          if (uVar13 < 0x204) {
            if (uVar13 == 0x104) {
              iVar16 = (int)*(char *)(uVar77 + extraout_r1_x00951);
LAB_00072800:
              uVar83 = VectorSignedToFloat(iVar16,(byte)(in_fpscr >> 0x16) & 3);
              *(undefined4 *)(uVar77 + extraout_r1_x00952) = uVar83;
            }
            else if (uVar13 == 0x108) {
              iVar16 = (int)*(char *)(uVar77 + extraout_r1_x00951);
LAB_00072488:
              uVar86 = VectorSignedToFloat(iVar16,(byte)(in_fpscr >> 0x16) & 3);
              *(undefined8 *)(uVar77 + extraout_r1_x00952) = uVar86;
            }
          }
          else {
            if (uVar13 == 0x204) {
              iVar16 = (int)*(short *)(uVar77 + extraout_r1_x00951);
              goto LAB_00072800;
            }
            if (uVar13 == 0x208) {
              iVar16 = (int)*(short *)(uVar77 + extraout_r1_x00951);
              goto LAB_00072488;
            }
          }
        }
        else if (uVar13 < 0x804) {
          if (uVar13 == 0x404) {
            iVar16 = *(int *)(uVar77 + extraout_r1_x00951);
            goto LAB_00072800;
          }
          if (uVar13 == 0x408) {
            iVar16 = *(int *)(uVar77 + extraout_r1_x00951);
            goto LAB_00072488;
          }
        }
        else if (uVar13 == 0x804) {
          uVar83 = FUN_000267c8(*(undefined4 *)(uVar77 + extraout_r1_x00951),
                                ((undefined4 *)(uVar77 + extraout_r1_x00951))[1]);
          *(undefined4 *)(uVar77 + extraout_r1_x00952) = uVar83;
        }
        else if (uVar13 == 0x808) {
          uVar86 = FUN_00026710(*(undefined4 *)(uVar77 + extraout_r1_x00951),
                                ((undefined4 *)(uVar77 + extraout_r1_x00951))[1]);
          *(undefined8 *)(uVar77 + extraout_r1_x00952) = uVar86;
        }
        uVar60 = 0xcbf29ce4;
        uVar46 = 0x84222325;
        if (sVar12 != 0) {
          iVar16 = 0;
          do {
            uVar88 = (ulonglong)uVar46;
            iVar48 = iVar48 + -1;
            iVar28 = uVar46 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00949 + iVar16);
            iVar16 = iVar16 + 1;
            uVar71 = (uint)*pcVar15;
            uVar46 = (uint)(uVar88 * 0x1b3) ^ uVar71;
            uVar60 = uVar60 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar71 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar38 = *(uint *)(*puVar9 + extraout_r1_x00950);
        uVar71 = (uVar46 | uVar38) * 2;
        bVar82 = uVar71 - (uVar46 + uVar38) == iVar37 &&
                 ((uVar60 | (int)uVar38 >> 0x1f) << 1 | (uVar46 | uVar38) >> 0x1f) -
                 (uVar60 + ((int)uVar38 >> 0x1f) + (uint)CARRY4(uVar46,uVar38) +
                 (uint)(uVar71 < uVar46 + uVar38)) == iVar62;
LAB_000728d0:
        if (bVar82) {
          uVar61 = uVar44;
        }
        uVar55 = uVar55 ^ uVar61;
        break;
      case 0x92:
        uVar35 = *local_118;
        uVar53 = local_118[1];
        uVar33 = local_118[2];
        FUN_000264a4(~(*(uint *)(uVar35 + (local_114 | 4) * 2 + (local_114 | 0xfffffffb) +
                                 (~local_114 | 4) + 2) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar35 + (uVar46 << 1 | 0x21) + (uVar46 ^ 0xffffffef)) ^ uVar53),
                     uVar53);
        uVar55 = *(uint *)(uVar35 + extraout_r1_x00915);
        uVar60 = *(uint *)(uVar35 + extraout_r1_x00914);
        FUN_000264a4(~(*(uint *)(uVar35 + uVar46) ^ uVar53),uVar53);
        uVar61 = uVar46 & 8;
        FUN_000264a4(~(*(uint *)(uVar35 + ((uVar61 | uVar61 << 1) - (uVar46 | 8)) + (uVar46 ^ 8) * 2
                                ) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar35 + (uVar46 & 0x10) * 2 + (uVar46 ^ 0x10)) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar35 + ((uVar46 & 0xc) * 3 - (uVar46 | 0xc)) + (uVar46 ^ 0xc) * 2
                                ) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar35 + ((uVar61 | (uVar46 & 0xfffffff7) + uVar61 * 2) ^ 8)) ^
                      uVar53),uVar53);
        uVar34 = *(uint *)(uVar35 + extraout_r1_x00920);
        uVar61 = *(uint *)(uVar35 + extraout_r1_x00919);
        uVar67 = *(uint *)(uVar35 + extraout_r1_x00918);
        uVar32 = *(uint *)(uVar35 + extraout_r1_x00917);
        uVar41 = *(uint *)(uVar35 + extraout_r1_x00916);
        uVar46 = *(uint *)(uVar35 + uVar33);
        puVar9[2] = uVar33 + 4;
        iVar37 = (int)*(short *)(uVar35 + uVar33 + 4);
        puVar9[2] = uVar33 + 6;
        local_134 = *(uint *)(uVar35 + uVar33 + 6);
        puVar9[2] = uVar33 + 10;
        uVar71 = *(uint *)(uVar35 + uVar33 + 10);
        puVar9[2] = uVar33 + 0xe;
        piVar47 = (int *)(uVar35 + uVar33 + 0xe);
        local_150 = *piVar47;
        local_16c = piVar47[1];
        puVar9[2] = uVar33 + 0x16;
        uVar36 = *(uint *)(uVar35 + uVar33 + 0x16);
        puVar9[2] = uVar33 + 0x1a;
        uVar44 = *(uint *)(uVar35 + uVar33 + 0x1a);
        puVar9[2] = uVar33 + 0x1e;
        uVar38 = *(uint *)(uVar35 + uVar33 + 0x1e);
        puVar9[2] = uVar33 + 0x22;
        local_170 = *(uint *)(uVar35 + uVar33 + 0x22);
        puVar9[2] = uVar33 + 0x26;
        uVar60 = ((uVar60 | ~uVar41) + (uVar41 & ~uVar60) * 2) - (uVar41 | ~uVar60);
        uVar34 = (uVar55 | uVar61 ^ ((uVar60 | uVar32) * 2 - (uVar60 + uVar32) | uVar67)) & uVar34;
        uVar55 = (uVar41 | uVar34) * 2 - (uVar41 + uVar34);
        uVar55 = uVar61 & ~uVar55 | uVar55 & ~uVar61;
        FUN_000264a4(uVar55 ^ uVar36,uVar53);
        FUN_000264a4(uVar55 ^ uVar44,uVar53);
        fVar40 = *(float *)(uVar35 + extraout_r1_x00921);
        fVar30 = *(float *)(uVar35 + extraout_r1_x00922);
        FUN_000264a4(uVar55 ^ uVar71,uVar53);
        *(float *)(uVar35 + extraout_r1_x00923) = fVar30 * fVar40;
        FUN_000264a4(uVar55 ^ uVar46,uVar53);
        FUN_000264a4(uVar55 ^ uVar38,uVar53);
        uVar61 = 0x84222325;
        uVar46 = 0xcbf29ce4;
        if (iVar37 != 0) {
          iVar62 = 0;
          do {
            uVar88 = (ulonglong)uVar61;
            iVar37 = iVar37 + -1;
            iVar48 = uVar61 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00924 + iVar62);
            iVar62 = iVar62 + 1;
            uVar60 = (uint)*pcVar15;
            uVar61 = (uint)(uVar88 * 0x1b3) ^ uVar60;
            uVar46 = uVar46 * 0x1b3 + iVar48 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar60 >> 0x1f;
          } while (iVar37 != 0);
        }
        uVar60 = *(uint *)(*puVar9 + extraout_r1_x00925);
        goto LAB_0007118c;
      case 0x95:
        uVar41 = *local_118;
        uVar53 = local_118[1];
        uVar34 = local_118[2];
        puVar22 = (uint *)(uVar41 + local_114);
        uVar55 = *puVar22;
        uVar61 = puVar22[1];
        uVar46 = puVar22[3];
        uVar60 = puVar22[4];
        FUN_000264a4(~(puVar22[2] ^ uVar53),uVar53);
        FUN_000264a4(~(uVar46 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar60 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar55 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar61 ^ uVar53),uVar53);
        uVar44 = *(uint *)(uVar41 + extraout_r1_90);
        uVar32 = *(uint *)(uVar41 + extraout_r1_89);
        uVar38 = *(uint *)(uVar41 + extraout_r1_86);
        uVar55 = *(uint *)(uVar41 + extraout_r1_88);
        uVar60 = *(uint *)(uVar41 + extraout_r1_87);
        uVar61 = *(uint *)(uVar41 + uVar34);
        puVar9[2] = uVar34 + 4;
        uVar71 = *(uint *)(uVar41 + uVar34 + 4);
        puVar9[2] = uVar34 + 8;
        local_134 = *(uint *)(uVar41 + uVar34 + 8);
        puVar9[2] = uVar34 + 0xc;
        piVar47 = (int *)(uVar41 + uVar34 + 0xc);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar34 + 0x14;
        iVar48 = (int)*(short *)(uVar41 + uVar34 + 0x14);
        puVar9[2] = uVar34 + 0x16;
        uVar46 = *(uint *)(uVar41 + uVar34 + 0x16);
        puVar9[2] = uVar34 + 0x1a;
        uVar55 = uVar44 ^ uVar32 & (uVar60 ^ uVar38 ^ uVar55) ^ uVar55;
        FUN_000264a4(uVar55 ^ uVar61,uVar53);
        FUN_000264a4(uVar55 ^ uVar71,uVar53);
        uVar61 = 0x84222325;
        uVar60 = 0xcbf29ce4;
        if (iVar48 != 0) {
          iVar16 = 0;
          do {
            uVar88 = (ulonglong)uVar61;
            iVar48 = iVar48 + -1;
            iVar28 = uVar61 * 0x100;
            pcVar15 = (char *)(uVar41 + extraout_r1_92 + iVar16);
            iVar16 = iVar16 + 1;
            uVar71 = (uint)*pcVar15;
            uVar61 = (uint)(uVar88 * 0x1b3) ^ uVar71;
            uVar60 = uVar60 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar71 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar38 = *(uint *)(uVar41 + extraout_r1_91);
        uVar71 = (uVar61 | uVar38) * 2;
        bVar82 = uVar71 - (uVar61 + uVar38) == iVar37 &&
                 ((uVar60 | (int)uVar38 >> 0x1f) << 1 | (uVar61 | uVar38) >> 0x1f) -
                 (uVar60 + ((int)uVar38 >> 0x1f) + (uint)CARRY4(uVar61,uVar38) +
                 (uint)(uVar71 < uVar61 + uVar38)) == iVar62;
LAB_0006a25c:
        if (bVar82) {
          local_134 = uVar46;
        }
        uVar55 = uVar55 ^ local_134;
        break;
      case 0x96:
        uVar44 = *local_118;
        uVar33 = local_118[1];
        uVar35 = local_118[2];
        uVar38 = local_114 & 0x10;
        FUN_000264a4(~(*(uint *)(uVar44 + (local_114 | 0x10) * 2 + uVar38 +
                                 (~local_114 & 0xffffffef) + 1) ^ uVar33),uVar33);
        uVar34 = uVar46 & 0xc;
        FUN_000264a4(~(*(uint *)(uVar44 + (uVar46 | 0xc) * 2 + uVar34 + (~uVar46 & 0xfffffff3) + 1)
                      ^ uVar33),uVar33);
        FUN_000264a4(~(*(uint *)(uVar44 + (uVar46 << 1 | 9) + (uVar46 ^ 0xfffffffb)) ^ uVar33),
                     uVar33);
        uVar53 = *(uint *)(uVar44 + extraout_r1_x00890);
        uVar55 = *(uint *)(uVar44 + extraout_r1_x00889);
        uVar60 = *(uint *)(uVar44 + extraout_r1_x00888);
        puVar22 = (uint *)(uVar44 + uVar46);
        uVar71 = *puVar22;
        uVar61 = puVar22[2];
        FUN_000264a4(~(puVar22[1] ^ uVar33),uVar33);
        FUN_000264a4(~(*(uint *)(uVar44 + uVar34 * 3 + ~uVar34 + (uVar46 ^ 0xc) + 1) ^ uVar33),
                     uVar33);
        FUN_000264a4(~(*(uint *)(uVar44 + (uVar38 | uVar38 << 1) + ~uVar38 + (uVar46 ^ 0x10) + 1) ^
                      uVar33),uVar33);
        FUN_000264a4(~(uVar71 ^ uVar33),uVar33);
        FUN_000264a4(~(uVar61 ^ uVar33),uVar33);
        uVar41 = *(uint *)(uVar44 + extraout_r1_x00893);
        uVar36 = *(uint *)(uVar44 + extraout_r1_x00895);
        uVar39 = *(uint *)(uVar44 + extraout_r1_x00892);
        uVar38 = *(uint *)(uVar44 + extraout_r1_x00894);
        uVar34 = *(uint *)(uVar44 + extraout_r1_x00891);
        uVar46 = *(uint *)(uVar44 + uVar35);
        puVar9[2] = uVar35 + 4;
        uVar67 = *(uint *)(uVar44 + uVar35 + 4);
        puVar9[2] = uVar35 + 8;
        piVar47 = (int *)(uVar44 + uVar35 + 8);
        iVar62 = *piVar47;
        iVar37 = piVar47[1];
        puVar9[2] = uVar35 + 0x10;
        uVar32 = *(uint *)(uVar44 + uVar35 + 0x10);
        puVar9[2] = uVar35 + 0x14;
        uVar61 = *(uint *)(uVar44 + uVar35 + 0x14);
        puVar9[2] = uVar35 + 0x18;
        iVar48 = (int)*(short *)(uVar44 + uVar35 + 0x18);
        puVar9[2] = uVar35 + 0x1e;
        uVar71 = *(uint *)(uVar44 + uVar35 + 0x1e);
        puVar9[2] = uVar35 + 0x22;
        uVar60 = ((uVar60 | uVar34) - (uVar34 & ~uVar60)) + (uVar34 | ~uVar60) + 1;
        uVar55 = uVar55 & (~uVar60 + uVar60 * 2) - (uVar60 | ~uVar39);
        uVar53 = uVar55 + (uVar53 | ~uVar55) + 1;
        uVar55 = uVar36 + ((~uVar38 + uVar38 * 2) -
                           (uVar38 | ~((uVar53 - uVar41) + (uVar41 & ~uVar53) * 2)) | ~uVar36) + 1;
        FUN_000264a4(uVar55 ^ uVar67,uVar33);
        FUN_000732f8(&local_b8,uVar44,uVar33,extraout_r1_x00896);
        FUN_000264a4(uVar55 ^ uVar46,uVar33);
        FUN_000264a4(uVar55 ^ uVar71,uVar33);
        uVar46 = 0x84222325;
        uVar53 = 0xcbf29ce4;
        if (iVar48 != 0) {
          iVar16 = 0;
          do {
            uVar88 = (ulonglong)uVar46;
            iVar48 = iVar48 + -1;
            iVar28 = uVar46 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00898 + iVar16);
            iVar16 = iVar16 + 1;
            uVar60 = (uint)*pcVar15;
            uVar46 = (uint)(uVar88 * 0x1b3) ^ uVar60;
            uVar53 = uVar53 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar60 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar71 = *(uint *)(*puVar9 + extraout_r1_x00897);
        uVar60 = (uVar46 | uVar71) * 2;
        if (uVar60 - (uVar46 + uVar71) == iVar62 &&
            ((uVar53 | (int)uVar71 >> 0x1f) << 1 | (uVar46 | uVar71) >> 0x1f) -
            (uVar53 + ((int)uVar71 >> 0x1f) + (uint)CARRY4(uVar46,uVar71) +
            (uint)(uVar60 < uVar46 + uVar71)) == iVar37) {
          uVar61 = uVar32;
        }
        FUN_000264a4(uVar55 ^ uVar61,uVar33);
        uVar60 = extraout_r1_x00899;
        if ((local_b8 & 1) != 0) {
          FUN_00023f68(local_b0,(uint)local_b8 & 0xfffffffe);
          uVar60 = extraout_r1_x00899;
        }
        goto LAB_00073114;
      case 0x9d:
        uVar77 = *local_118;
        uVar53 = local_118[1];
        uVar57 = local_118[2];
        FUN_000264a4(~(*(uint *)(uVar77 + (local_114 & 8) * 2 + (local_114 ^ 8) * 3 +
                                 (local_114 << 1 ^ 0xffffffee) + 2) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar77 + ((uVar46 | 8) * 2 - (uVar46 & 0xfffffff7)) +
                                 (uVar46 | 0xfffffff7) + 1) ^ uVar53),uVar53);
        uVar60 = *(uint *)(uVar77 + extraout_r1_x00901);
        FUN_000264a4(~(*(uint *)(uVar77 + (uVar46 | 0x10) * 2 + (uVar46 ^ 0x10) +
                                 (uVar46 << 1 ^ 0xffffffde) + 2) ^ uVar53),uVar53);
        uVar71 = *(uint *)(uVar77 + extraout_r1_x00902);
        uVar38 = *(uint *)(uVar77 + extraout_r1_x00900);
        FUN_000264a4(~(*(uint *)(uVar77 + (uVar46 & 0x10) * 2 + (uVar46 ^ 0x10)) ^ uVar53),uVar53);
        puVar22 = (uint *)(uVar77 + uVar46);
        uVar61 = *puVar22;
        uVar55 = puVar22[2];
        FUN_000264a4(~(puVar22[3] ^ uVar53),uVar53);
        iVar37 = uVar77 + (uVar46 | 4);
        FUN_000264a4(~(*(uint *)(iVar37 + (uVar46 & 4)) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar77 + (uVar46 & 0xc) * 2 + (uVar46 ^ 0xc)) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(iVar37 + uVar46 + (~uVar46 | 4) + 1) ^ uVar53),uVar53);
        FUN_000264a4(~(uVar55 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar61 ^ uVar53),uVar53);
        uVar55 = *(uint *)(uVar77 + extraout_r1_x00906);
        uVar81 = *(uint *)(uVar77 + extraout_r1_x00908);
        uVar50 = *(uint *)(uVar77 + extraout_r1_x00907);
        uVar32 = *(uint *)(uVar77 + uVar57);
        uVar34 = *(uint *)(uVar77 + extraout_r1_x00909);
        uVar46 = *(uint *)(uVar77 + extraout_r1_x00905);
        uVar41 = *(uint *)(uVar77 + extraout_r1_x00904);
        uVar44 = *(uint *)(uVar77 + extraout_r1_x00903);
        puVar9[2] = uVar57 + 4;
        uVar33 = *(uint *)(uVar77 + uVar57 + 4);
        puVar9[2] = uVar57 + 8;
        uVar35 = *(uint *)(uVar77 + uVar57 + 8);
        puVar9[2] = uVar57 + 0xc;
        piVar47 = (int *)(uVar77 + uVar57 + 0xc);
        iVar16 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar57 + 0x14;
        uVar36 = *(uint *)(uVar77 + uVar57 + 0x14);
        uVar39 = *puVar9;
        puVar9[2] = uVar57 + 0x18;
        uVar67 = *(uint *)(uVar77 + uVar57 + 0x18);
        puVar9[2] = uVar57 + 0x1c;
        uVar61 = *(uint *)(uVar77 + uVar57 + 0x1c);
        puVar9[2] = uVar57 + 0x20;
        sVar12 = *(short *)(uVar39 + uVar57 + 0x20);
        iVar48 = (int)sVar12;
        puVar9[2] = uVar57 + 0x22;
        uVar41 = uVar44 & ~uVar41 | uVar41 & ~uVar44;
        uVar38 = uVar41 & ~uVar38 | uVar38 & ~uVar41;
        uVar55 = uVar55 | uVar46 & ~uVar38 | uVar38 & ~uVar46;
        uVar46 = ((uVar60 | uVar55) - (uVar60 & ~uVar55)) + (uVar60 | ~uVar55) + 1;
        uVar46 = (uVar50 | uVar46) * 2 - (uVar50 + uVar46);
        uVar46 = uVar81 & ~uVar46 | uVar46 & ~uVar81;
        uVar46 = uVar46 + (uVar34 | ~uVar46) + 1;
        uVar55 = (~uVar71 + uVar71 * 2) - (uVar71 | -(uVar46 + (uVar34 | ~uVar46)) - 2);
        FUN_000264a4(uVar55 ^ uVar32,uVar53);
        piVar47 = *(int **)(uVar39 + extraout_r1_x00910);
        iVar37 = ((undefined4 *)(uVar39 + extraout_r1_x00910))[1];
        FUN_000264a4(uVar55 ^ uVar33,uVar53);
        FUN_000264a4(uVar55 ^ uVar35,uVar53);
        FUN_000264a4(uVar55 ^ uVar36,uVar53);
        if (piVar47 == (int *)0x0 && iVar37 == 0) {
          iVar28 = 0;
          iVar37 = 0;
        }
        else {
          iVar28 = *piVar47;
          iVar37 = iVar28 >> 0x1f;
        }
        *(int *)(uVar39 + extraout_r1_x00913) = iVar28;
        ((int *)(uVar39 + extraout_r1_x00913))[1] = iVar37;
        uVar46 = 0x84222325;
        uVar60 = 0xcbf29ce4;
        if (sVar12 != 0) {
          iVar37 = 0;
          do {
            uVar88 = (ulonglong)uVar46;
            iVar48 = iVar48 + -1;
            iVar28 = uVar46 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00912 + iVar37);
            iVar37 = iVar37 + 1;
            uVar71 = (uint)*pcVar15;
            uVar46 = (uint)(uVar88 * 0x1b3) ^ uVar71;
            uVar60 = uVar60 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar71 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar38 = *(uint *)(*puVar9 + extraout_r1_x00911);
        uVar71 = (uVar46 | uVar38) * 2;
        if (uVar71 - (uVar46 + uVar38) == iVar16 &&
            ((uVar60 | (int)uVar38 >> 0x1f) << 1 | (uVar46 | uVar38) >> 0x1f) -
            (uVar60 + ((int)uVar38 >> 0x1f) + (uint)CARRY4(uVar46,uVar38) +
            (uint)(uVar71 < uVar46 + uVar38)) == iVar62) {
          uVar61 = uVar67;
        }
        uVar55 = uVar55 ^ uVar61;
        break;
      case 0x9f:
        uVar38 = *local_118;
        uVar53 = local_118[1];
        uVar46 = local_118[2];
        uVar55 = *(uint *)(uVar38 + uVar46);
        local_118[2] = uVar46 + 4;
        uVar60 = *(uint *)(uVar38 + uVar46 + 4);
        local_118[2] = uVar46 + 8;
        uVar61 = *(uint *)(uVar38 + uVar46 + 8);
        local_118[2] = uVar46 + 0xc;
        piVar47 = (int *)(uVar38 + uVar46 + 0xc);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        local_118[2] = uVar46 + 0x14;
        uVar34 = *(uint *)(uVar38 + uVar46 + 0x14);
        local_118[2] = uVar46 + 0x18;
        uVar41 = *(uint *)(uVar38 + uVar46 + 0x18);
        local_118[2] = uVar46 + 0x1c;
        uVar71 = *(uint *)(uVar38 + uVar46 + 0x1c);
        local_118[2] = uVar46 + 0x20;
        iVar48 = (int)*(short *)(uVar38 + uVar46 + 0x20);
        local_118[2] = uVar46 + 0x22;
        FUN_000264a4(~(uVar60 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar34 ^ uVar53),uVar53);
        *(undefined4 *)(uVar38 + extraout_r1_x00108) = *(undefined4 *)(uVar38 + extraout_r1_x00109);
        FUN_000264a4(~(uVar41 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar71 ^ uVar53),uVar53);
        uVar46 = 0x84222325;
        uVar60 = 0xcbf29ce4;
        if (iVar48 != 0) {
          iVar16 = 0;
          do {
            uVar88 = (ulonglong)uVar46;
            iVar48 = iVar48 + -1;
            iVar28 = uVar46 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00111 + iVar16);
            iVar16 = iVar16 + 1;
            uVar71 = (uint)*pcVar15;
            uVar46 = (uint)(uVar88 * 0x1b3) ^ uVar71;
            uVar60 = uVar60 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar71 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar38 = *(uint *)(*puVar9 + extraout_r1_x00110);
        uVar71 = (uVar46 | uVar38) * 2;
        if (uVar71 - (uVar46 + uVar38) == iVar37 &&
            ((uVar60 | (int)uVar38 >> 0x1f) << 1 | (uVar46 | uVar38) >> 0x1f) -
            (uVar60 + ((int)uVar38 >> 0x1f) + (uint)CARRY4(uVar46,uVar38) +
            (uint)(uVar71 < uVar46 + uVar38)) == iVar62) {
          uVar61 = uVar55;
        }
        uVar55 = ~(uVar61 ^ uVar53);
        break;
      case 0xa1:
        uVar67 = local_114 << 1 ^ 0xfffffff6;
        uVar51 = *local_118;
        uVar36 = local_118[1];
        uVar75 = local_118[2];
        uVar53 = (local_114 & 4) << 1 | 2;
        iVar37 = (local_114 ^ 4) * 3;
        FUN_000264a4(~(*(uint *)(uVar51 + uVar53 + iVar37 + uVar67) ^ uVar36),uVar36);
        FUN_000264a4(~(*(uint *)(uVar51 + (uVar46 | 0xc) * 2 + (uVar46 & 0xc) +
                                 (~uVar46 & 0xfffffff3) + 1) ^ uVar36),uVar36);
        uVar55 = *(uint *)(uVar51 + extraout_r1_x00761);
        uVar60 = *(uint *)(uVar51 + extraout_r1_x00760);
        FUN_000264a4(~(*(uint *)(uVar51 + uVar46) ^ uVar36),uVar36);
        uVar80 = uVar46 & 0x10;
        iVar62 = uVar51 + uVar80 * 2;
        FUN_000264a4(~(((uint *)(uVar51 + uVar46))[3] ^ uVar36),uVar36);
        uVar71 = uVar46 & 8;
        uVar38 = uVar71 | uVar71 << 1;
        FUN_000264a4(~(*(uint *)(uVar51 + (uVar38 - (uVar46 | 8)) + (uVar46 ^ 8) * 2) ^ uVar36),
                     uVar36);
        FUN_000264a4(~(*(uint *)(iVar62 + (uVar46 ^ 0x10)) ^ uVar36),uVar36);
        uVar34 = *(uint *)(uVar51 + extraout_r1_x00765);
        uVar41 = *(uint *)(uVar51 + extraout_r1_x00764);
        uVar44 = *(uint *)(uVar51 + extraout_r1_x00763);
        uVar65 = *(uint *)(uVar51 + extraout_r1_x00762);
        FUN_000264a4(~(*(uint *)(iVar62 + ~uVar80 + (uVar46 | 0x10) + 1) ^ uVar36),uVar36);
        uVar78 = *(uint *)(uVar51 + extraout_r1_x00766);
        uVar32 = *(uint *)(uVar51 + uVar75);
        puVar9[2] = uVar75 + 4;
        sVar12 = *(short *)(uVar51 + uVar75 + 4);
        iVar70 = (int)sVar12;
        puVar9[2] = uVar75 + 6;
        uVar33 = *(uint *)(uVar51 + uVar75 + 6);
        puVar9[2] = uVar75 + 10;
        uVar61 = *(uint *)(uVar51 + uVar75 + 10);
        puVar9[2] = uVar75 + 0xe;
        uVar35 = *(uint *)(uVar51 + uVar75 + 0xe);
        puVar9[2] = uVar75 + 0x12;
        uVar39 = *(uint *)(uVar51 + uVar75 + 0x12);
        puVar9[2] = uVar75 + 0x16;
        uVar50 = *(uint *)(uVar51 + uVar75 + 0x16);
        puVar9[2] = uVar75 + 0x1a;
        puVar22 = (uint *)(uVar51 + uVar75 + 0x1a);
        uVar57 = *puVar22;
        uVar77 = puVar22[1];
        puVar9[2] = uVar75 + 0x22;
        uVar81 = *(uint *)(uVar51 + uVar75 + 0x22);
        puVar9[2] = uVar75 + 0x26;
        uVar72 = *(uint *)(uVar51 + uVar75 + 0x26);
        puVar9[2] = uVar75 + 0x2a;
        iVar28 = (int)*(short *)(uVar51 + uVar75 + 0x2a);
        puVar9[2] = uVar75 + 0x2c;
        uVar79 = *(uint *)(uVar51 + uVar75 + 0x2c);
        puVar9[2] = uVar75 + 0x30;
        piVar47 = (int *)(uVar51 + uVar75 + 0x30);
        iVar48 = *piVar47;
        iVar16 = piVar47[1];
        puVar9[2] = uVar75 + 0x38;
        uVar44 = uVar78 ^ uVar65 | uVar44;
        uVar60 = uVar60 + (uVar44 & ~uVar65 | uVar65 & ~uVar44 | ~uVar60) + 1;
        uVar60 = (uVar65 - uVar60) + (uVar60 & ~uVar65) * 2;
        uVar60 = uVar41 & ~uVar60 | uVar60 & ~uVar41;
        uVar60 = uVar60 + (uVar34 | ~uVar60) + 1;
        uVar60 = (uVar60 - (uVar60 ^ uVar78)) + (uVar78 & ~uVar60);
        uVar55 = (uVar55 ^ uVar60) + (uVar60 & ~uVar55) + (uVar55 | ~uVar60) + 1;
        uVar41 = uVar65 & ~uVar55 | uVar55 & ~uVar65;
        FUN_000264a4(uVar41 ^ uVar35,uVar36);
        FUN_000264a4(uVar41 ^ uVar72,uVar36);
        FUN_000264a4(uVar41 ^ uVar79,uVar36);
        uVar34 = *puVar9;
        uVar44 = puVar9[1];
        dVar84 = *(double *)(uVar34 + extraout_r1_x00768);
        iVar62 = uVar34 + (uVar46 | 8);
        dVar85 = *(double *)(uVar34 + extraout_r1_x00767);
        FUN_000264a4(~(*(uint *)(iVar62 + (uVar46 | 0xfffffff7) + 9) ^ uVar44),uVar44);
        FUN_000264a4(~(*(uint *)(uVar34 + uVar53 + iVar37 + uVar67) ^ uVar44),uVar44);
        FUN_000264a4(~(*(uint *)(uVar34 + (uVar46 << 1 | 0x19) + (uVar46 ^ 0xfffffff3)) ^ uVar44),
                     uVar44);
        uVar53 = *(uint *)(uVar34 + extraout_r1_x00772);
        uVar55 = *(uint *)(uVar34 + extraout_r1_x00771);
        uVar60 = *(uint *)(uVar34 + extraout_r1_x00770);
        FUN_000264a4(~(*(uint *)(uVar34 + (uVar80 | uVar80 << 1) + ~uVar80 + (uVar46 ^ 0x10) + 1) ^
                      uVar44),uVar44);
        FUN_000264a4(~(*(uint *)(uVar34 + uVar38 + ~uVar71 + (uVar46 ^ 8) + 1) ^ uVar44),uVar44);
        FUN_000264a4(~(*(uint *)(iVar62 + uVar46 + (~uVar46 | 8) + 1) ^ uVar44),uVar44);
        FUN_000264a4(~(*(uint *)(uVar34 + uVar46) ^ uVar44),uVar44);
        uVar46 = *(uint *)(uVar34 + extraout_r1_x00776);
        uVar71 = *(uint *)(uVar34 + extraout_r1_x00775);
        uVar38 = *(uint *)(uVar34 + extraout_r1_x00774);
        uVar35 = *(uint *)(uVar34 + extraout_r1_x00773);
        *(double *)(uVar34 + extraout_r1_x00769) = dVar85 / dVar84;
        FUN_000264a4(uVar41 ^ uVar32,uVar36);
        FUN_000264a4(uVar41 ^ uVar33,uVar36);
        FUN_000264a4(uVar41 ^ uVar50,uVar36);
        uVar32 = 0x84222325;
        uVar44 = *puVar9;
        uVar34 = 0xcbf29ce4;
        if (iVar28 != 0) {
          iVar37 = 0;
          do {
            uVar88 = (ulonglong)uVar32;
            iVar28 = iVar28 + -1;
            iVar62 = uVar32 * 0x100;
            pcVar15 = (char *)(uVar44 + extraout_r1_x00778 + iVar37);
            iVar37 = iVar37 + 1;
            uVar33 = (uint)*pcVar15;
            uVar32 = (uint)(uVar88 * 0x1b3) ^ uVar33;
            uVar34 = uVar34 * 0x1b3 + iVar62 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar33 >> 0x1f;
          } while (iVar28 != 0);
        }
        uVar38 = (uVar35 - ((uVar35 | ~uVar38) + (uVar38 | uVar35) * 2)) - 2 | uVar71;
        uVar60 = (uVar71 + ((uVar38 - uVar71 & uVar60) - uVar38)) - 1;
        uVar55 = uVar46 | (uVar60 + (~uVar55 ^ uVar60)) - (uVar60 | ~uVar55);
        uVar46 = (uVar55 & ~uVar53 | uVar53 & ~uVar55) ^ uVar46;
        uVar60 = uVar46 | (int)uVar46 >> 0x1f;
        uVar55 = *(uint *)(uVar44 + extraout_r1_x00777);
        uVar53 = (int)uVar55 >> 0x1f;
        if ((uVar46 & ~(uVar32 ^ uVar55) | (uVar32 ^ uVar55) & ~uVar46) != uVar57 ||
            (uVar60 & ~(uVar34 ^ uVar53) | (uVar34 ^ uVar53) & ~uVar60) != uVar77) {
          uVar61 = 0x84222325;
          uVar71 = 0xcbf29ce4;
          if (sVar12 != 0) {
            iVar37 = 0;
            uVar61 = 0x84222325;
            do {
              uVar88 = (ulonglong)uVar61;
              iVar70 = iVar70 + -1;
              iVar62 = uVar61 * 0x100;
              pcVar15 = (char *)(uVar44 + extraout_r1_x00779 + iVar37);
              iVar37 = iVar37 + 1;
              uVar38 = (uint)*pcVar15;
              uVar61 = (uint)(uVar88 * 0x1b3) ^ uVar38;
              uVar71 = uVar71 * 0x1b3 + iVar62 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar38 >> 0x1f
              ;
            } while (iVar70 != 0);
          }
          uVar38 = (uVar55 & ~uVar61) * 2;
          uVar34 = (uVar61 - uVar55) + uVar38;
          uVar55 = (uVar71 - (uVar53 + (uVar61 < uVar55))) +
                   ((~uVar71 & uVar53) << 1 | (uVar55 & ~uVar61) >> 0x1f) +
                   (uint)CARRY4(uVar61 - uVar55,uVar38);
          uVar53 = (uVar46 & ~uVar34) * 2;
          uVar61 = uVar81;
          if ((uVar34 - uVar46) + uVar53 == iVar48 &&
              (uVar55 - (uVar60 + (uVar34 < uVar46))) +
              ((uVar60 & ~uVar55) << 1 | (uVar46 & ~uVar34) >> 0x1f) +
              (uint)CARRY4(uVar34 - uVar46,uVar53) == iVar16) {
            uVar61 = uVar39;
          }
        }
        uVar41 = uVar41 ^ uVar61;
LAB_00071ca8:
        FUN_000264a4(uVar41,uVar36);
        uVar60 = extraout_r1_x00953;
        goto LAB_00073114;
      case 0xaa:
        uVar77 = *local_118;
        uVar53 = local_118[1];
        uVar61 = local_114 | 4;
        uVar60 = local_114 ^ 0xfffffffb;
        uVar44 = local_118[2];
        FUN_000264a4(~(*(uint *)(uVar77 + uVar61 * 2 + uVar60 + 1) ^ uVar53),uVar53);
        uVar32 = *(uint *)(uVar77 + extraout_r1_x00276);
        uVar55 = *(uint *)(uVar77 + (uVar46 | 0x10) + (uVar46 & 0x10));
        FUN_000264a4(~(*(uint *)(uVar77 + uVar61 * 2 + uVar60 + 1) ^ uVar53),uVar53);
        uVar61 = *(uint *)(uVar77 + extraout_r1_x00277);
        FUN_000264a4(~(uVar55 ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar77 + (uVar46 | 8) + (uVar46 & 8)) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar77 + ((uVar46 & 0xc) * 3 - (uVar46 | 0xc)) + (uVar46 ^ 0xc) * 2
                                ) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar77 + uVar46 * 2 + (uVar46 ^ 8) + (~uVar46 | 8) * 2 + 2) ^
                      uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar77 + uVar46) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar77 + (uVar46 & 0x10) * 2 + (uVar46 ^ 0x10)) ^ uVar53),uVar53);
        local_150 = *(uint *)(uVar77 + extraout_r1_x00283);
        uVar50 = *(uint *)(uVar77 + extraout_r1_x00281);
        iVar16 = (int)*(short *)(uVar77 + uVar44);
        uVar57 = *(uint *)(uVar77 + extraout_r1_x00278);
        uVar79 = *(uint *)(uVar77 + extraout_r1_x00280);
        uVar81 = *(uint *)(uVar77 + extraout_r1_x00282);
        uVar60 = *(uint *)(uVar77 + extraout_r1_x00279);
        puVar9[2] = uVar44 + 2;
        uVar33 = *(uint *)(uVar77 + uVar44 + 2);
        puVar9[2] = uVar44 + 6;
        uVar55 = *(uint *)(uVar77 + uVar44 + 6);
        puVar9[2] = uVar44 + 10;
        uVar35 = *(uint *)(uVar77 + uVar44 + 10);
        puVar9[2] = uVar44 + 0xe;
        sVar12 = *(short *)(uVar77 + uVar44 + 0xe);
        iVar28 = (int)sVar12;
        puVar9[2] = uVar44 + 0x10;
        piVar47 = (int *)(uVar77 + uVar44 + 0x10);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar44 + 0x18;
        uVar36 = *(uint *)(uVar77 + uVar44 + 0x18);
        puVar9[2] = uVar44 + 0x1c;
        uVar67 = *(uint *)(uVar77 + uVar44 + 0x1c);
        puVar9[2] = uVar44 + 0x20;
        uVar39 = *(uint *)(uVar77 + uVar44 + 0x20);
        puVar9[2] = uVar44 + 0x24;
        uVar80 = *(uint *)(uVar77 + uVar44 + 0x24);
        puVar9[2] = uVar44 + 0x28;
        uVar71 = *(uint *)(uVar77 + uVar44 + 0x28);
        puVar9[2] = uVar44 + 0x2c;
        uVar38 = *(uint *)(uVar77 + uVar44 + 0x2c);
        puVar9[2] = uVar44 + 0x30;
        puVar22 = (uint *)(uVar77 + uVar44 + 0x30);
        uVar34 = *puVar22;
        uVar41 = puVar22[1];
        puVar9[2] = uVar44 + 0x38;
        uVar44 = uVar32 | uVar57;
        iVar48 = uVar32 + uVar57 + 1;
        uVar60 = (iVar48 - uVar44) + (uVar44 - iVar48 | uVar60);
        uVar60 = (uVar79 - uVar60) + (uVar60 & ~uVar79) * 2;
        uVar60 = (uVar50 | uVar60) - (uVar50 & ~uVar60 | uVar60 & ~uVar50);
        local_150 = uVar61 | (uVar60 + (uVar81 ^ uVar60)) - (uVar60 & ~uVar81) | local_150;
        FUN_000264a4(local_150 ^ uVar80,uVar53);
        FUN_000264a4(local_150 ^ uVar71,uVar53);
        uVar50 = *puVar9;
        uVar60 = puVar9[1];
        uVar61 = *(uint *)(uVar50 + extraout_r1_x00284);
        iVar48 = *(int *)(uVar50 + extraout_r1_x00285);
        FUN_000264a4(local_150 ^ uVar33,uVar53);
        FUN_000264a4(~(((uint *)(uVar77 + uVar46))[2] ^ uVar53),uVar53);
        puVar22 = (uint *)(uVar50 + uVar46);
        uVar71 = *puVar22;
        uVar46 = puVar22[1];
        uVar32 = puVar22[3];
        FUN_000264a4(~(puVar22[4] ^ uVar60),uVar60);
        FUN_000264a4(~(uVar71 ^ uVar60),uVar60);
        FUN_000264a4(~(uVar46 ^ uVar60),uVar60);
        uVar46 = *(uint *)(uVar50 + extraout_r1_x00290);
        uVar60 = *(uint *)(uVar50 + extraout_r1_x00289);
        uVar71 = *(uint *)(uVar50 + extraout_r1_x00288);
        uVar44 = *(uint *)(uVar50 + extraout_r1_x00287);
        FUN_000264a4(~(uVar32 ^ uVar53),uVar53);
        uVar57 = *(uint *)(uVar50 + extraout_r1_x00291);
        *(int *)(uVar50 + extraout_r1_x00286) = iVar48 >> (uVar61 & 0xff);
        FUN_000264a4(local_150 ^ uVar36,uVar53);
        FUN_000264a4(local_150 ^ uVar67,uVar53);
        FUN_000264a4(local_150 ^ uVar39,uVar53);
        uVar33 = 0x84222325;
        uVar61 = *puVar9;
        uVar32 = 0xcbf29ce4;
        if (iVar16 != 0) {
          iVar48 = 0;
          do {
            uVar88 = (ulonglong)uVar33;
            iVar16 = iVar16 + -1;
            iVar70 = uVar33 * 0x100;
            pcVar15 = (char *)(uVar61 + extraout_r1_x00292 + iVar48);
            iVar48 = iVar48 + 1;
            uVar36 = (uint)*pcVar15;
            uVar33 = (uint)(uVar88 * 0x1b3) ^ uVar36;
            uVar32 = uVar32 * 0x1b3 + iVar70 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar36 >> 0x1f;
          } while (iVar16 != 0);
        }
        uVar60 = uVar46 ^ uVar60 & (uVar71 ^ (uVar57 | uVar44)) ^ uVar60;
        uVar44 = uVar60 | (int)uVar60 >> 0x1f;
        uVar71 = *(uint *)(uVar61 + extraout_r1_x00294);
        uVar46 = (int)uVar71 >> 0x1f;
        if ((uVar60 & ~(uVar33 ^ uVar71) | (uVar33 ^ uVar71) & ~uVar60) != uVar34 ||
            (uVar44 & ~(uVar32 ^ uVar46) | (uVar32 ^ uVar46) & ~uVar44) != uVar41) {
          uVar34 = 0x84222325;
          uVar55 = 0xcbf29ce4;
          if (sVar12 != 0) {
            iVar48 = 0;
            do {
              uVar88 = (ulonglong)uVar34;
              iVar28 = iVar28 + -1;
              iVar16 = uVar34 * 0x100;
              pcVar15 = (char *)(uVar61 + extraout_r1_x00293 + iVar48);
              iVar48 = iVar48 + 1;
              uVar41 = (uint)*pcVar15;
              uVar34 = (uint)(uVar88 * 0x1b3) ^ uVar41;
              uVar55 = uVar55 * 0x1b3 + iVar16 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar41 >> 0x1f
              ;
            } while (iVar28 != 0);
          }
          uVar61 = (uVar71 & ~uVar34) * 2;
          uVar41 = (uVar34 - uVar71) + uVar61;
          uVar46 = (uVar55 - (uVar46 + (uVar34 < uVar71))) +
                   ((~uVar55 & uVar46) << 1 | (uVar71 & ~uVar34) >> 0x1f) +
                   (uint)CARRY4(uVar34 - uVar71,uVar61);
          uVar61 = (uVar60 & ~uVar41) * 2;
          uVar55 = uVar38;
          if ((uVar41 - uVar60) + uVar61 == iVar37 &&
              (uVar46 - (uVar44 + (uVar41 < uVar60))) +
              ((uVar44 & ~uVar46) << 1 | (uVar60 & ~uVar41) >> 0x1f) +
              (uint)CARRY4(uVar41 - uVar60,uVar61) == iVar62) {
            uVar55 = uVar35;
          }
        }
LAB_0006d00c:
        uVar55 = local_150 ^ uVar55;
        break;
      case 0xaf:
        uVar81 = *local_118;
        uVar61 = local_118[1];
        uVar77 = local_118[2];
        FUN_000264a4(~(*(uint *)(uVar81 + (local_114 | 4) * 2 + (local_114 & 4) +
                                 (~local_114 & 0xfffffffb) + 1) ^ uVar61),uVar61);
        FUN_000264a4(~(*(uint *)(uVar81 + (uVar46 & 8) * 2 + (uVar46 ^ 8) * 3 +
                                 (uVar46 << 1 ^ 0xffffffee) + 2) ^ uVar61),uVar61);
        uVar60 = *(uint *)(uVar81 + extraout_r1_x00801);
        puVar22 = (uint *)(uVar81 + uVar46);
        uVar53 = *puVar22;
        uVar71 = *(uint *)(uVar81 + extraout_r1_x00800);
        FUN_000264a4(~(puVar22[2] ^ uVar61),uVar61);
        FUN_000264a4(~(*(uint *)(uVar81 + (uVar46 | 0x10) + (uVar46 & 0x10)) ^ uVar61),uVar61);
        uVar55 = uVar46 & 0xc;
        FUN_000264a4(~(*(uint *)(uVar81 + uVar55 * 2 + (uVar46 & 0xfffffff3) + (uVar55 ^ 0xc)) ^
                      uVar61),uVar61);
        FUN_000264a4(~(uVar53 ^ uVar61),uVar61);
        FUN_000264a4(~(*(uint *)(uVar81 + uVar55 * 3 + ~uVar55 + (uVar46 ^ 0xc) + 1) ^ uVar61),
                     uVar61);
        uVar55 = *(uint *)(uVar81 + extraout_r1_x00806);
        uVar38 = *(uint *)(uVar81 + extraout_r1_x00805);
        uVar57 = *(uint *)(uVar81 + extraout_r1_x00803);
        uVar53 = puVar9[1];
        uVar50 = *(uint *)(uVar81 + extraout_r1_x00802);
        iVar28 = *(int *)(uVar81 + uVar77);
        uVar34 = *(uint *)(uVar81 + extraout_r1_x00804);
        iVar16 = ((int *)(uVar81 + uVar77))[1];
        puVar9[2] = uVar77 + 8;
        uVar41 = *(uint *)(uVar81 + uVar77 + 8);
        puVar9[2] = uVar77 + 0xc;
        uVar61 = *(uint *)(uVar81 + uVar77 + 0xc);
        puVar9[2] = uVar77 + 0x10;
        uVar44 = *(uint *)(uVar81 + uVar77 + 0x10);
        puVar9[2] = uVar77 + 0x14;
        uVar32 = *(uint *)(uVar81 + uVar77 + 0x14);
        puVar9[2] = uVar77 + 0x18;
        uVar79 = *(uint *)(uVar81 + uVar77 + 0x18);
        puVar9[2] = uVar77 + 0x1c;
        sVar12 = *(short *)(uVar81 + uVar77 + 0x1c);
        puVar9[2] = uVar77 + 0x1e;
        uVar33 = *(uint *)(uVar81 + uVar77 + 0x1e);
        puVar9[2] = uVar77 + 0x22;
        uVar35 = *(uint *)(uVar81 + uVar77 + 0x22);
        puVar9[2] = uVar77 + 0x26;
        puVar59 = (uint *)(uVar81 + uVar77 + 0x26);
        uVar36 = *puVar59;
        uVar67 = puVar59[1];
        puVar9[2] = uVar77 + 0x2e;
        uVar39 = *(uint *)(uVar81 + uVar77 + 0x2e);
        puVar9[2] = uVar77 + 0x32;
        sVar6 = *(short *)(uVar81 + uVar77 + 0x32);
        puVar9[2] = uVar77 + 0x34;
        uVar60 = uVar60 ^ (uVar57 | uVar71 + (uVar50 | ~uVar71) + 1);
        uVar60 = (uVar60 + ~(uVar60 & uVar34)) - (uVar60 | ~uVar34);
        uVar60 = (uVar38 - uVar60) + (uVar60 & ~uVar38) * 2;
        uVar60 = uVar38 + (uVar38 ^ uVar60) + (uVar60 | ~uVar38) + 1;
        uVar55 = (uVar60 | uVar55) + (uVar55 & ~uVar60) + (uVar60 | ~uVar55) + 1;
        FUN_000264a4(uVar55 ^ uVar79,uVar53);
        uVar34 = *puVar9;
        uVar60 = puVar9[1];
        iVar48 = *(int *)(uVar34 + extraout_r1_x00807);
        iVar37 = ((int *)(uVar34 + extraout_r1_x00807))[1];
        FUN_000264a4(uVar55 ^ uVar41,uVar53);
        FUN_000264a4(uVar55 ^ uVar44,uVar53);
        FUN_000264a4(uVar55 ^ uVar33,uVar53);
        FUN_000264a4(uVar55 ^ uVar35,uVar53);
        uVar38 = *puVar22;
        uVar41 = puVar22[1];
        FUN_000264a4(~(puVar22[3] ^ uVar53),uVar53);
        uVar71 = *(uint *)(uVar81 + extraout_r1_x00812);
        FUN_000264a4(~(uVar38 ^ uVar53),uVar53);
        uVar38 = *(uint *)(uVar81 + extraout_r1_x00813);
        FUN_000264a4(~(uVar41 ^ uVar53),uVar53);
        iVar62 = uVar34 + uVar46;
        uVar44 = *(uint *)(uVar81 + extraout_r1_x00814);
        uVar46 = *(uint *)(iVar62 + 8);
        uVar41 = *(uint *)(iVar62 + 0xc);
        FUN_000264a4(~(*(uint *)(iVar62 + 0x10) ^ uVar53),uVar53);
        uVar33 = *(uint *)(uVar34 + extraout_r1_x00815);
        FUN_000264a4(~(uVar41 ^ uVar53),uVar53);
        uVar41 = *(uint *)(uVar34 + extraout_r1_x00816);
        FUN_000264a4(~(uVar46 ^ uVar60));
        uVar46 = *(uint *)(uVar34 + extraout_r1_x00817);
        if (iVar48 == 0 && iVar37 == 0) {
          iVar48 = 0;
        }
        else {
          pcVar15 = (char *)(iVar48 + -1);
          do {
            pcVar15 = pcVar15 + 1;
          } while (*pcVar15 != '\0');
          iVar48 = (int)pcVar15 - iVar48;
        }
        uVar35 = 0x84222325;
        uVar60 = 0xcbf29ce4;
        *(int *)(uVar34 + extraout_r1_x00810) = iVar48;
        uVar34 = *puVar9;
        if (sVar6 != 0) {
          iVar37 = (int)sVar6;
          iVar62 = 0;
          do {
            uVar88 = (ulonglong)uVar35;
            iVar37 = iVar37 + -1;
            iVar48 = uVar35 * 0x100;
            pcVar15 = (char *)(uVar34 + extraout_r1_x00808 + iVar62);
            iVar62 = iVar62 + 1;
            uVar50 = (uint)*pcVar15;
            uVar35 = (uint)(uVar88 * 0x1b3) ^ uVar50;
            uVar60 = uVar60 * 0x1b3 + iVar48 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar50 >> 0x1f;
          } while (iVar37 != 0);
        }
        uVar46 = uVar46 | uVar41 ^ uVar33 & ~(uVar44 ^ uVar38 & uVar71);
        uVar41 = uVar46 | (int)uVar46 >> 0x1f;
        uVar38 = *(uint *)(uVar34 + extraout_r1_x00809);
        uVar71 = (int)uVar38 >> 0x1f;
        if ((uVar46 & ~(uVar35 ^ uVar38) | (uVar35 ^ uVar38) & ~uVar46) != uVar36 ||
            (uVar41 & ~(uVar60 ^ uVar71) | (uVar60 ^ uVar71) & ~uVar41) != uVar67) {
          uVar60 = 0x84222325;
          uVar61 = 0xcbf29ce4;
          if (sVar12 != 0) {
            iVar62 = (int)sVar12;
            iVar37 = 0;
            do {
              uVar88 = (ulonglong)uVar60;
              iVar62 = iVar62 + -1;
              iVar48 = uVar60 * 0x100;
              pcVar15 = (char *)(uVar34 + extraout_r1_x00811 + iVar37);
              iVar37 = iVar37 + 1;
              uVar44 = (uint)*pcVar15;
              uVar60 = (uint)(uVar88 * 0x1b3) ^ uVar44;
              uVar61 = uVar61 * 0x1b3 + iVar48 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar44 >> 0x1f
              ;
            } while (iVar62 != 0);
          }
          uVar34 = (uVar38 & ~uVar60) * 2;
          uVar44 = (uVar60 - uVar38) + uVar34;
          uVar71 = (uVar61 - (uVar71 + (uVar60 < uVar38))) +
                   ((~uVar61 & uVar71) << 1 | (uVar38 & ~uVar60) >> 0x1f) +
                   (uint)CARRY4(uVar60 - uVar38,uVar34);
          uVar60 = (uVar46 & ~uVar44) * 2;
          uVar61 = uVar39;
          if ((uVar44 - uVar46) + uVar60 == iVar28 &&
              (uVar71 - (uVar41 + (uVar44 < uVar46))) +
              ((uVar41 & ~uVar71) << 1 | (uVar46 & ~uVar44) >> 0x1f) +
              (uint)CARRY4(uVar44 - uVar46,uVar60) == iVar16) {
            uVar61 = uVar32;
          }
        }
        uVar55 = uVar55 ^ uVar61;
        break;
      case 0xb1:
        uVar36 = *local_118;
        uVar53 = local_118[1];
        uVar35 = local_118[2];
        FUN_000264a4(~(*(uint *)(uVar36 + (local_114 | 0xc) * 2 + (local_114 ^ 0xfffffff3) + 1) ^
                      uVar53),uVar53);
        uVar71 = uVar46 & 4;
        iVar37 = uVar36 + uVar71 * 2;
        FUN_000264a4(~(*(uint *)(iVar37 + (uVar46 ^ 4) * 3 + (uVar46 << 1 ^ 0xfffffff6) + 2) ^
                      uVar53),uVar53);
        uVar61 = *(uint *)(uVar36 + extraout_r1_x00369);
        uVar55 = *(uint *)(uVar36 + extraout_r1_x00368);
        uVar60 = uVar46 & 8;
        FUN_000264a4(~(*(uint *)(uVar36 + (uVar60 | uVar60 << 1) + ~uVar60 + (uVar46 ^ 8) + 1) ^
                      uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar36 + (uVar46 & 0xc) * 2 + (uVar46 ^ 0xc)) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(iVar37 + (uVar46 ^ 4)) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar36 + (uVar46 & 0x10) * 2 + (uVar46 ^ 0x10)) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar36 + uVar46) ^ uVar53),uVar53);
        FUN_000264a4(~(*(uint *)(uVar36 + ((uVar71 | (uVar46 & 0xfffffffb) + uVar71 * 2) ^ 4)) ^
                      uVar53),uVar53);
        uVar67 = *(uint *)(uVar36 + extraout_r1_x00375);
        uVar32 = *(uint *)(uVar36 + extraout_r1_x00371);
        uVar41 = *(uint *)(uVar36 + extraout_r1_x00374);
        uVar33 = *(uint *)(uVar36 + extraout_r1_x00372);
        uVar34 = *(uint *)(uVar36 + extraout_r1_x00370);
        uVar46 = *(uint *)(uVar36 + uVar35);
        uVar44 = *(uint *)(uVar36 + extraout_r1_x00373);
        puVar9[2] = uVar35 + 4;
        uVar39 = *(uint *)(uVar36 + uVar35 + 4);
        puVar9[2] = uVar35 + 8;
        iVar62 = (int)*(short *)(uVar36 + uVar35 + 8);
        puVar9[2] = uVar35 + 10;
        uVar60 = *(uint *)(uVar36 + uVar35 + 10);
        puVar9[2] = uVar35 + 0xe;
        uVar71 = *(uint *)(uVar36 + uVar35 + 0xe);
        puVar9[2] = uVar35 + 0x12;
        local_134 = *(uint *)(uVar36 + uVar35 + 0x12);
        puVar9[2] = uVar35 + 0x16;
        piVar47 = (int *)(uVar36 + uVar35 + 0x16);
        local_150 = *piVar47;
        local_16c = piVar47[1];
        puVar9[2] = uVar35 + 0x1e;
        uVar38 = *(uint *)(uVar36 + uVar35 + 0x1e);
        puVar9[2] = uVar35 + 0x22;
        local_170 = *(uint *)(uVar36 + uVar35 + 0x22);
        puVar9[2] = uVar35 + 0x26;
        uVar34 = uVar34 & uVar55;
        uVar55 = (uVar32 - uVar34) + (uVar34 & ~uVar32) * 2;
        uVar55 = uVar55 & ~uVar33 | uVar33 & ~uVar55;
        uVar55 = uVar44 & ~uVar55 | uVar55 & ~uVar44;
        uVar34 = uVar41 ^ uVar55;
        iVar37 = (uVar41 | uVar55) + 1;
        uVar55 = (iVar37 - uVar34) + (uVar34 - iVar37 | uVar67);
        uVar55 = (uVar55 | uVar61) - (uVar61 ^ uVar55);
        FUN_000264a4(uVar55 ^ uVar39,uVar53);
        FUN_000264a4(uVar55 ^ uVar38,uVar53);
        FUN_00026020(*(undefined4 *)(uVar36 + extraout_r1_x00376),
                     ((undefined4 *)(uVar36 + extraout_r1_x00376))[1],
                     *(undefined4 *)(uVar36 + extraout_r1_x00377),
                     ((undefined4 *)(uVar36 + extraout_r1_x00377))[1]);
        FUN_000264a4(uVar55 ^ uVar60,uVar53);
        *(undefined4 *)(uVar36 + extraout_r1_x00378) = extraout_r2;
        ((undefined4 *)(uVar36 + extraout_r1_x00378))[1] = extraout_r3_00;
        FUN_000264a4(uVar55 ^ uVar46,uVar53);
        FUN_000264a4(uVar55 ^ uVar71,uVar53);
        uVar61 = 0x84222325;
        uVar46 = 0xcbf29ce4;
        if (iVar62 != 0) {
          iVar37 = 0;
          do {
            uVar88 = (ulonglong)uVar61;
            iVar62 = iVar62 + -1;
            iVar48 = uVar61 * 0x100;
            pcVar15 = (char *)(*puVar9 + extraout_r1_x00380 + iVar37);
            iVar37 = iVar37 + 1;
            uVar60 = (uint)*pcVar15;
            uVar61 = (uint)(uVar88 * 0x1b3) ^ uVar60;
            uVar46 = uVar46 * 0x1b3 + iVar48 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar60 >> 0x1f;
          } while (iVar62 != 0);
        }
        uVar60 = *(uint *)(*puVar9 + extraout_r1_x00379);
LAB_0007118c:
        uVar71 = (uVar61 | uVar60) * 2;
        bVar82 = uVar71 - (uVar61 + uVar60) == local_150 &&
                 ((uVar46 | (int)uVar60 >> 0x1f) << 1 | (uVar61 | uVar60) >> 0x1f) -
                 (uVar46 + ((int)uVar60 >> 0x1f) + (uint)CARRY4(uVar61,uVar60) +
                 (uint)(uVar71 < uVar61 + uVar60)) == local_16c;
LAB_000730f0:
        if (bVar82) {
          local_170 = local_134;
        }
        uVar55 = uVar55 ^ local_170;
        break;
      case 0xb5:
        uVar67 = *local_118;
        uVar53 = local_118[1];
        uVar50 = local_118[2];
        puVar22 = (uint *)(uVar67 + local_114);
        uVar55 = *puVar22;
        uVar71 = puVar22[1];
        uVar60 = puVar22[2];
        uVar61 = puVar22[4];
        FUN_000264a4(~(puVar22[3] ^ uVar53),uVar53);
        FUN_000264a4(~(uVar55 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar71 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar60 ^ uVar53),uVar53);
        FUN_000264a4(~(uVar61 ^ uVar53),uVar53);
        uVar77 = *(uint *)(uVar67 + extraout_r1_x00552);
        uVar55 = *(uint *)(uVar67 + extraout_r1_x00551);
        uVar44 = *(uint *)(uVar67 + extraout_r1_x00549);
        uVar41 = *(uint *)(uVar67 + extraout_r1_x00550);
        uVar81 = *(uint *)(uVar67 + uVar50);
        uVar60 = *(uint *)(uVar67 + extraout_r1_x00548);
        puVar9[2] = uVar50 + 4;
        uVar61 = *(uint *)(uVar67 + uVar50 + 4);
        puVar9[2] = uVar50 + 8;
        uVar71 = *(uint *)(uVar67 + uVar50 + 8);
        puVar9[2] = uVar50 + 0xc;
        puVar22 = (uint *)(uVar67 + uVar50 + 0xc);
        uVar32 = *puVar22;
        uVar33 = puVar22[1];
        puVar9[2] = uVar50 + 0x14;
        uVar34 = *(uint *)(uVar67 + uVar50 + 0x14);
        puVar9[2] = uVar50 + 0x18;
        uVar35 = *(uint *)(uVar67 + uVar50 + 0x18);
        puVar9[2] = uVar50 + 0x1c;
        uVar36 = *(uint *)(uVar67 + uVar50 + 0x1c);
        puVar9[2] = uVar50 + 0x20;
        piVar47 = (int *)(uVar67 + uVar50 + 0x20);
        iVar37 = *piVar47;
        iVar62 = piVar47[1];
        puVar9[2] = uVar50 + 0x28;
        sVar12 = *(short *)(uVar67 + uVar50 + 0x28);
        puVar9[2] = uVar50 + 0x2a;
        uVar38 = *(uint *)(uVar67 + uVar50 + 0x2a);
        puVar9[2] = uVar50 + 0x2e;
        uVar57 = *puVar9;
        uVar67 = *(uint *)(uVar67 + uVar50 + 0x2e);
        puVar9[2] = uVar50 + 0x32;
        iVar48 = (int)*(short *)(uVar57 + uVar50 + 0x32);
        puVar9[2] = uVar50 + 0x34;
        uVar39 = *(uint *)(uVar57 + uVar50 + 0x34);
        uVar55 = uVar77 ^ uVar55 & (uVar44 ^ uVar60 ^ uVar41) ^ uVar55;
        puVar9[2] = uVar50 + 0x38;
        FUN_000264a4(uVar55 ^ uVar81,uVar53);
        FUN_000264a4(uVar55 ^ uVar71,uVar53);
        uVar77 = *puVar9;
        uVar41 = puVar9[1];
        fVar40 = *(float *)(uVar77 + extraout_r1_x00553);
        fVar30 = *(float *)(uVar77 + extraout_r1_x00554);
        uVar50 = puVar9[1];
        FUN_000264a4(uVar55 ^ uVar38,uVar53);
        FUN_000264a4(~(*(uint *)(uVar57 + ((uVar46 | 8) * 2 - (uVar46 & 0xfffffff7)) +
                                 (uVar46 | 0xfffffff7) + 1) ^ uVar50),uVar50);
        FUN_000264a4(~(*(uint *)(uVar57 + (uVar46 << 1 | 0x19) + (uVar46 ^ 0xfffffff3)) ^ uVar50),
                     uVar50);
        uVar60 = *(uint *)(uVar57 + extraout_r1_x00557);
        uVar71 = *(uint *)(uVar57 + extraout_r1_x00556);
        FUN_000264a4(~(*(uint *)(uVar57 + uVar46) ^ uVar50),uVar50);
        FUN_000264a4(~(*(uint *)(uVar57 + ((uVar46 & 4 | (uVar46 & 0xfffffffb) + (uVar46 & 4) * 2) ^
                                          4)) ^ uVar50),uVar50);
        FUN_000264a4(~(*(uint *)((int)(uVar57 + uVar46) + (~uVar46 | 0xc) + (uVar46 | 0xc) + 1) ^
                      uVar50),uVar50);
        FUN_000264a4(~(*(uint *)(uVar77 + (uVar46 | 0x10) + (uVar46 & 0x10)) ^ uVar41));
        uVar44 = *(uint *)(uVar77 + extraout_r1_x00561);
        uVar38 = *(uint *)(uVar57 + extraout_r1_x00559);
        uVar41 = *(uint *)(uVar77 + extraout_r1_x00560);
        uVar81 = *(uint *)(uVar57 + extraout_r1_x00558);
        FUN_000264a4(~(*(uint *)(uVar57 + (uVar46 & 8) * 2 + (uVar46 ^ 8)) ^ uVar50),uVar50);
        uVar46 = *(uint *)(uVar57 + extraout_r1_x00562);
        *(float *)(uVar77 + extraout_r1_x00555) = fVar30 / fVar40;
        FUN_000264a4(uVar55 ^ uVar34,uVar53);
        FUN_000264a4(uVar55 ^ uVar35,uVar53);
        FUN_000264a4(uVar55 ^ uVar67,uVar53);
        FUN_000264a4(uVar55 ^ uVar39,uVar50);
        uVar67 = *puVar9;
        uVar34 = 0x84222325;
        uVar35 = 0xcbf29ce4;
        if (iVar48 != 0) {
          iVar16 = 0;
          do {
            uVar88 = (ulonglong)uVar34;
            iVar48 = iVar48 + -1;
            iVar28 = uVar34 * 0x100;
            pcVar15 = (char *)(uVar67 + extraout_r1_x00564 + iVar16);
            iVar16 = iVar16 + 1;
            uVar39 = (uint)*pcVar15;
            uVar34 = (uint)(uVar88 * 0x1b3) ^ uVar39;
            uVar35 = uVar35 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar39 >> 0x1f;
          } while (iVar48 != 0);
        }
        uVar46 = uVar46 + (uVar46 ^ uVar81) + (uVar81 | ~uVar46) + 1;
        uVar46 = (uVar81 | uVar46) - (uVar81 ^ uVar46);
        uVar39 = *(uint *)(uVar67 + extraout_r1_x00565);
        uVar46 = (~uVar46 + uVar46 * 2) - (uVar46 | ~uVar38);
        uVar46 = uVar71 & ~uVar46 | uVar46 & ~uVar71;
        uVar46 = (uVar46 - uVar60) + (uVar60 & ~uVar46) * 2;
        uVar44 = uVar44 ^ ~(uVar46 + uVar41) + (uVar41 | uVar46);
        uVar71 = ~uVar44;
        uVar38 = uVar71 | (int)uVar71 >> 0x1f;
        uVar46 = (int)uVar39 >> 0x1f;
        uVar60 = extraout_r1_x00566;
        if ((uVar71 & ~(uVar34 ^ uVar39) | (uVar34 ^ uVar39) & uVar44) != uVar32 ||
            (uVar38 & ~(uVar35 ^ uVar46) | (uVar35 ^ uVar46) & ~uVar38) != uVar33) {
          uVar60 = 0x84222325;
          uVar34 = 0xcbf29ce4;
          if (sVar12 != 0) {
            iVar16 = (int)sVar12;
            iVar48 = 0;
            uVar60 = 0x84222325;
            do {
              uVar88 = (ulonglong)uVar60;
              iVar16 = iVar16 + -1;
              iVar28 = uVar60 * 0x100;
              pcVar15 = (char *)(uVar67 + extraout_r1_x00563 + iVar48);
              iVar48 = iVar48 + 1;
              uVar41 = (uint)*pcVar15;
              uVar60 = (uint)(uVar88 * 0x1b3) ^ uVar41;
              uVar34 = uVar34 * 0x1b3 + iVar28 + (int)(uVar88 * 0x1b3 >> 0x20) ^ (int)uVar41 >> 0x1f
              ;
            } while (iVar16 != 0);
          }
          uVar41 = (uVar39 & ~uVar60) * 2;
          uVar44 = (uVar60 - uVar39) + uVar41;
          uVar60 = (uVar34 - (uVar46 + (uVar60 < uVar39))) +
                   ((~uVar34 & uVar46) << 1 | (uVar39 & ~uVar60) >> 0x1f) +
                   (uint)CARRY4(uVar60 - uVar39,uVar41);
          uVar46 = (uVar71 & ~uVar44) * 2;
          if ((uVar44 - uVar71) + uVar46 == iVar37 &&
              (uVar60 - (uVar38 + (uVar44 < uVar71))) +
              ((uVar38 & ~uVar60) << 1 | (uVar71 & ~uVar44) >> 0x1f) +
              (uint)CARRY4(uVar44 - uVar71,uVar46) == iVar62) {
            uVar61 = uVar36;
          }
          uVar55 = uVar55 ^ uVar61;
          break;
        }
        goto LAB_00073114;
      }
      FUN_000264a4(uVar55,uVar53);
      uVar60 = extraout_r1_x00954;
LAB_00073114:
      local_118[2] = uVar60;
      uVar61 = 0xd3515b13;
      goto switchD_00060e5c_caseD_3;
    }
    if (uVar53 == 0xcb5db9f8) {
      unaff_r4 = (local_14c ^ 0x7f45) + (((local_14c ^ 0x7f45) & 0xffff) / 0xba) * -0xba;
LAB_00060df4:
      uVar61 = 0x8d34a35c;
    }
    else if (uVar53 == 0xd3515b13) {
      local_124[0] = local_158;
      uVar61 = 0x23b9b767;
      iVar43 = 0;
    }
    else if (uVar53 == 0x1adfcbac) {
      if ((uint)local_d6 < (uint)(local_c8 - local_cc >> 3)) {
        uVar61 = 0;
        if (local_f8 == 0) {
          uVar61 = (**(code **)(*local_104 + 100))
                             (local_104,*(undefined4 *)(local_cc + (uint)local_d6 * 8));
        }
        *local_100 = uVar61;
      }
      if (local_f8 != 0) {
        (**(code **)(*local_104 + 0x34))();
        iVar37 = local_f8;
        local_f8 = 0;
        if (iVar37 != 0) {
          local_b8 = CONCAT44(local_b8._4_4_,iVar37);
          if (local_e0 == (int *)0x0) {
LAB_0007323c:
                    /* WARNING: Subroutine does not return */
            FUN_000269a8();
          }
          (**(code **)(*local_e0 + 0x18))(local_e0,&local_b8);
        }
      }
      uVar61 = 0x8b88c633;
    }
    else {
LAB_0006176c:
      uVar60 = *param_1;
      uVar46 = param_1[1];
      uVar55 = *(uint *)(uVar60 + 4);
      FUN_000264a4(~(*(uint *)(uVar60 + (uVar55 | 0x5f) * 2 + (uVar55 & 0x5f) +
                               (~uVar55 & 0xffffffa0) + 1) ^ uVar46),uVar46);
      uVar71 = (uVar55 & 0x5d) + (uVar55 | 0x5d) * 2 + (~uVar55 & 0xffffffa2) + 1;
      uVar13 = *(ushort *)(uVar60 + extraout_r1_27);
      uVar5 = *(ushort *)(uVar60 + uVar71);
      uVar61 = uVar55 ^ 0xffffff98;
      local_124[1] = 0;
      local_124[2] = iVar23;
      local_118 = param_1;
      FUN_000264a4(~(*(uint *)(uVar60 + (uVar55 & 99) * 2 + (uVar55 ^ 99)) ^ uVar46),uVar46);
      pcVar15 = (char *)FUN_00025e6c(DAT_00062568 + 0x61840);
      local_128 = (uVar55 << 1 | 0xcf) + uVar61;
      local_114 = local_128;
      local_108 = iVar24;
      if (*pcVar15 == '\x01') {
        piVar47 = (int *)*puVar14;
      }
      else {
        piVar47 = (int *)0x0;
        local_58 = local_58 & 0xffffffff00000000;
        bVar82 = *(int *)(DAT_0007324c + 0x73010) != 0;
        if (bVar82) {
          uVar61 = *(uint *)(DAT_0007324c + 0x7300c);
        }
        if ((bVar82 && uVar61 != 0) && (uVar46 = getpid(), uVar61 == uVar46)) {
          iVar43 = (**(code **)(**(int **)(DAT_00073250 + 0x73174) + 0x18))
                             (*(int **)(DAT_00073250 + 0x73174),&local_58,0x10006);
          if (iVar43 == -2) {
            local_10c = (int *)0x0;
            local_b8 = *(ulonglong *)(DAT_00073258 + 0x7319c);
            local_b0 = *(uint *)(DAT_00073258 + 0x731a4);
            iVar43 = (**(code **)(**(int **)(DAT_00073254 + 0x731ac) + 0x1c))
                               (*(int **)(DAT_00073254 + 0x731ac),&local_10c,&local_b8);
            piVar47 = local_10c;
            if (iVar43 != 0) {
              piVar47 = (int *)0x0;
            }
          }
          else if (iVar43 == 0) {
            piVar47 = (int *)local_58;
          }
        }
        *puVar14 = piVar47;
        puVar18 = (undefined1 *)FUN_00025e6c(DAT_0007325c + 0x73014);
        *puVar18 = 1;
      }
      iVar43 = 0;
      local_100 = local_124 + 1;
      uVar61 = (uVar5 ^ uVar71) & 0xffff;
      uVar46 = uVar61 ^ 0xffff;
      local_d6 = ~(uVar13 ^ (ushort)extraout_r1_27);
      local_c4 = 0;
      local_c8 = 0;
      local_cc = 0;
      local_d8 = (undefined2)uVar46;
      local_e0 = (int *)0x0;
      local_f8 = 0;
      local_104 = piVar47;
      local_d4 = extraout_r1_28;
      local_d0 = local_128;
      if (uVar61 != 0xffff) {
        iVar43 = uVar46 << 3;
        local_cc = FUN_000a0370(iVar43);
        iVar62 = local_cc + uVar46 * 8;
        local_c4 = iVar62;
        __aeabi_memclr4(local_cc,iVar43);
        local_c8 = iVar62;
      }
      local_c0 = param_1;
      local_bc = local_128;
      if ((param_2 != 0) && (iVar62 = (**(code **)(*piVar47 + 0x2ac))(piVar47,param_2), 0 < iVar62))
      {
        iVar48 = 0;
        do {
          iVar16 = (**(code **)(*local_104 + 0x2b4))(local_104,param_2,iVar48);
          pcVar15 = (char *)FUN_00025e6c(DAT_0006256c + 0x6197c);
          if (*pcVar15 == '\x01') {
            piVar47 = (int *)*puVar14;
          }
          else {
            piVar47 = (int *)0x0;
            local_10c = (int *)0x0;
            bVar82 = *(int *)(DAT_00062b04 + 0x61b60) != 0;
            if (bVar82) {
              iVar43 = *(int *)(DAT_00062b04 + 0x61b5c);
            }
            if ((bVar82 && iVar43 != 0) && (_Var19 = getpid(), iVar43 == _Var19)) {
              iVar43 = (**(code **)(**(int **)(DAT_00062b0c + 0x61bb0) + 0x18))
                                 (*(int **)(DAT_00062b0c + 0x61bb0),&local_10c,0x10006);
              if (iVar43 == -2) {
                local_110 = (int *)0x0;
                local_58 = *(ulonglong *)(DAT_00062b14 + 0x61bd4);
                local_50 = *(undefined4 *)(DAT_00062b14 + 0x61bdc);
                iVar43 = (**(code **)(**(int **)(DAT_00062b10 + 0x61be4) + 0x1c))
                                   (*(int **)(DAT_00062b10 + 0x61be4),&local_110,&local_58);
                piVar47 = local_110;
                if (iVar43 != 0) {
                  piVar47 = (int *)0x0;
                }
              }
              else if (iVar43 == 0) {
                piVar47 = local_10c;
              }
            }
            *puVar14 = piVar47;
            puVar18 = (undefined1 *)FUN_00025e6c(DAT_00062b08 + 0x61b64);
            *puVar18 = 1;
          }
          iVar43 = local_cc;
          local_b0 = uVar25;
          local_ac = piVar47;
          local_a0 = &local_b0;
          if (iVar16 == 0) {
            piVar47 = (int *)0x0;
          }
          else {
            local_b8._0_4_ = iVar16;
            piVar47 = (int *)FUN_000a0370(0x30);
            local_48 = &local_58;
            FUN_0009de44(&local_b0,&local_58);
            piVar47[4] = iVar16;
            *piVar47 = iVar26;
            piVar47[1] = 0;
            piVar47[2] = 0;
            if (local_48 == (ulonglong *)0x0) {
              piVar47[10] = 0;
            }
            else if (local_48 == &local_58) {
              uVar88 = *local_48;
              piVar47[10] = (int)(piVar47 + 6);
              (**(code **)((int)uVar88 + 0xc))();
              if (local_48 == &local_58) {
                iVar28 = 0x10;
              }
              else {
                iVar28 = 0x14;
                if (local_48 == (ulonglong *)0x0) goto LAB_00061a6c;
              }
              (**(code **)((int)*local_48 + iVar28))();
            }
            else {
              piVar47[10] = (int)local_48;
            }
          }
LAB_00061a6c:
          piVar17 = (int *)(iVar43 + iVar48 * 8);
          local_b8._0_4_ = 0;
          *piVar17 = iVar16;
          piVar63 = (int *)piVar17[1];
          piVar17[1] = (int)piVar47;
          if (piVar63 == (int *)0x0) {
LAB_00061ab0:
            local_b8 = (ulonglong)local_b8._4_4_ << 0x20;
          }
          else {
            piVar47 = piVar63 + 1;
            DataMemoryBarrier(0xb);
            do {
              iVar16 = *piVar47;
              bVar82 = (bool)hasExclusiveAccess(piVar47);
            } while (!bVar82);
            *piVar47 = iVar16 + -1;
            DataMemoryBarrier(0xb);
            if (iVar16 != 0) goto LAB_00061ab0;
            (**(code **)(*piVar63 + 8))(piVar63);
            FUN_00019dfe(piVar63);
            iVar16 = (uint)local_b8;
            local_b8 = (ulonglong)local_b8._4_4_ << 0x20;
            if (iVar16 != 0) {
              local_58 = CONCAT44(local_58._4_4_,iVar16);
              if (local_a0 == (uint *)0x0) goto LAB_0007323c;
              (**(code **)(*local_a0 + 0x18))(local_a0,&local_58);
            }
          }
          if (local_a0 == &local_b0) {
            iVar16 = 0x10;
LAB_00061938:
            (**(code **)(*local_a0 + iVar16))();
          }
          else {
            iVar16 = 0x14;
            if (local_a0 != (uint *)0x0) goto LAB_00061938;
          }
          iVar48 = iVar48 + 1;
        } while (iVar48 != iVar62);
      }
      local_124[0] = 0;
      param_1[2] = extraout_r1_28;
      uVar61 = (uVar53 ^ 0x7e93ade5) + (uVar53 << 1 | 0x2d8a434) + 0xfd275bcc;
      iVar43 = iVar37;
    }
  } while( true );
}




// ============================================================
// Function #612
// Name: FUN_00073260
// Address: 00073260
// JNI: NO
// ============================================================


void FUN_00073260(uint param_1,uint *param_2,uint *param_3,uint param_4,int param_5)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  uint *puVar9;
  uint *puVar10;
  uint uVar11;
  uint *puVar12;
  uint *puVar13;
  uint uVar14;
  bool bVar15;
  
  if (param_4 == 0) {
    return;
  }
  uVar14 = 0;
  puVar13 = (uint *)(param_1 + param_5);
  if (param_4 - 0x101 < 0xffffff0f) goto LAB_000732d0;
  bVar15 = (uint)((int)param_3 - (int)param_2) < 0x10;
  if (!bVar15) {
    param_1 = (int)param_3 - (param_1 + param_5);
  }
  if (bVar15 || param_1 < 0x10) goto LAB_000732d0;
  uVar14 = param_4 & 0x1f0;
  puVar9 = param_2;
  puVar10 = param_3;
  uVar11 = uVar14;
  puVar12 = puVar13;
  do {
    uVar1 = *puVar12;
    uVar2 = puVar12[1];
    uVar3 = puVar12[2];
    uVar4 = puVar12[3];
    puVar12 = puVar12 + 4;
    uVar11 = uVar11 - 0x10;
    uVar5 = *puVar9;
    uVar6 = puVar9[1];
    uVar7 = puVar9[2];
    uVar8 = puVar9[3];
    puVar9 = puVar9 + 4;
    *puVar10 = uVar5 ^ uVar1;
    puVar10[1] = uVar6 ^ uVar2;
    puVar10[2] = uVar7 ^ uVar3;
    puVar10[3] = uVar8 ^ uVar4;
    puVar10 = puVar10 + 4;
  } while (uVar11 != 0);
  for (; param_4 != uVar14; uVar14 = uVar14 + 1) {
LAB_000732d0:
    *(byte *)((int)param_3 + uVar14) =
         *(byte *)((int)param_2 + uVar14) ^ *(byte *)((int)puVar13 + (uVar14 & 0xff));
  }
  return;
}




// ============================================================
// Function #613
// Name: FUN_000732f8
// Address: 000732f8
// JNI: NO
// ============================================================


void FUN_000732f8(int *param_1,int param_2,uint param_3,int param_4)

{
  ushort uVar1;
  ushort uVar2;
  ushort uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  uint *puVar10;
  uint uVar11;
  int extraout_r1;
  int extraout_r1_00;
  int extraout_r1_01;
  uint uVar12;
  int iVar13;
  uint *puVar14;
  ushort *puVar15;
  char *pcVar16;
  uint *puVar17;
  uint *puVar18;
  uint uVar19;
  uint uVar20;
  ushort *puVar21;
  bool bVar22;
  
  FUN_000264a4(~(*(uint *)(param_2 + param_4) ^ param_3),param_3);
  FUN_000264a4(~(*(uint *)(param_2 + extraout_r1) ^ param_3),param_3);
  FUN_000264a4(~(((uint *)(param_2 + extraout_r1))[1] ^ param_3),param_3);
  puVar15 = (ushort *)(param_2 + extraout_r1_00);
  uVar1 = *puVar15;
  puVar21 = (ushort *)(param_2 + extraout_r1_01);
  uVar2 = *puVar21;
  uVar3 = uVar2 ^ uVar1;
  uVar20 = (uint)uVar3;
  uVar19 = uVar20 + 2;
  puVar10 = (uint *)FUN_000a0398(uVar19);
  __aeabi_memclr(puVar10,uVar19);
  uVar11 = 0;
  if (uVar20 - 0xff < 0xffffff0f) goto LAB_000733b8;
  uVar12 = (int)puVar10 - (extraout_r1_00 + param_2);
  bVar22 = 0xf < uVar12;
  if (bVar22) {
    uVar12 = (int)puVar10 - (extraout_r1_01 + param_2);
  }
  if (!bVar22 || uVar12 < 0x10) goto LAB_000733b8;
  uVar11 = uVar19 & 0x1f0;
  iVar13 = 0;
  puVar14 = puVar10;
  uVar12 = uVar11;
  do {
    puVar17 = (uint *)((int)puVar21 + iVar13);
    uVar12 = uVar12 - 0x10;
    uVar4 = puVar17[1];
    uVar5 = puVar17[2];
    uVar6 = puVar17[3];
    puVar18 = (uint *)((int)puVar15 + iVar13);
    iVar13 = iVar13 + 0x10;
    uVar7 = puVar18[1];
    uVar8 = puVar18[2];
    uVar9 = puVar18[3];
    *puVar14 = *puVar18 ^ *puVar17;
    puVar14[1] = uVar7 ^ uVar4;
    puVar14[2] = uVar8 ^ uVar5;
    puVar14[3] = uVar9 ^ uVar6;
    puVar14 = puVar14 + 4;
  } while (uVar12 != 0);
  for (; uVar19 != uVar11; uVar11 = uVar11 + 1) {
LAB_000733b8:
    *(byte *)((int)puVar10 + uVar11) =
         *(byte *)((int)puVar15 + uVar11) ^ *(byte *)((int)puVar21 + (uVar11 & 0xff));
  }
  if (uVar20 < 0xb) {
    pcVar16 = (char *)((int)param_1 + 1);
    *(char *)param_1 = (char)uVar3 << 1;
    if (uVar1 == uVar2) goto LAB_0007342c;
  }
  else {
    pcVar16 = (char *)FUN_000a0370((uVar20 | 7) + 1);
    *param_1 = (uVar20 | 7) + 2;
    param_1[1] = uVar20;
    param_1[2] = (int)pcVar16;
  }
  __aeabi_memcpy(pcVar16,(int)puVar10 + 2,uVar20);
LAB_0007342c:
  pcVar16[uVar20] = '\0';
  FUN_00023f74(puVar10);
  return;
}




// ============================================================
// Function #614
// Name: FUN_0007348c
// Address: 0007348c
// JNI: NO
// ============================================================


void FUN_0007348c(int *param_1)

{
  int iVar1;
  
  iVar1 = **(int **)(DAT_000734f0 + 0x734a8);
  (**(code **)(*param_1 + 200))();
  if (**(int **)(DAT_000734f4 + 0x734d4) != iVar1) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}




// ============================================================
// Function #615
// Name: FUN_000734f8
// Address: 000734f8
// JNI: NO
// ============================================================


void FUN_000734f8(int *param_1)

{
  int iVar1;
  
  iVar1 = **(int **)(DAT_0007355c + 0x73514);
  (**(code **)(*param_1 + 0xb0))();
  if (**(int **)(DAT_00073560 + 0x73540) != iVar1) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}




// ============================================================
// Function #616
// Name: FUN_00073564
// Address: 00073564
// JNI: NO
// ============================================================


void FUN_00073564(int *param_1)

{
  int iVar1;
  
  iVar1 = **(int **)(DAT_000735c8 + 0x73580);
  (**(code **)(*param_1 + 0x74))();
  if (**(int **)(DAT_000735cc + 0x735ac) != iVar1) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}




// ============================================================
// Function #617
// Name: FUN_000735d0
// Address: 000735d0
// JNI: NO
// ============================================================


void FUN_000735d0(int *param_1)

{
  int iVar1;
  
  iVar1 = **(int **)(DAT_00073634 + 0x735ec);
  (**(code **)(*param_1 + 0x98))();
  if (**(int **)(DAT_00073638 + 0x73618) != iVar1) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}




// ============================================================
// Function #618
// Name: FUN_0007363c
// Address: 0007363c
// JNI: NO
// ============================================================


void FUN_0007363c(int *param_1)

{
  int iVar1;
  
  iVar1 = **(int **)(DAT_000736a0 + 0x73658);
  (**(code **)(*param_1 + 0xa4))();
  if (**(int **)(DAT_000736a4 + 0x73684) != iVar1) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}




// ============================================================
// Function #619
// Name: FUN_000736a8
// Address: 000736a8
// JNI: NO
// ============================================================


void FUN_000736a8(int *param_1)

{
  int iVar1;
  
  iVar1 = **(int **)(DAT_0007370c + 0x736c4);
  (**(code **)(*param_1 + 0xec))();
  if (**(int **)(DAT_00073710 + 0x736f0) != iVar1) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}




// ============================================================
// Function #620
// Name: FUN_00073714
// Address: 00073714
// JNI: NO
// ============================================================


void FUN_00073714(int *param_1)

{
  int iVar1;
  
  iVar1 = **(int **)(DAT_00073778 + 0x73730);
  (**(code **)(*param_1 + 0xbc))();
  if (**(int **)(DAT_0007377c + 0x7375c) != iVar1) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}




