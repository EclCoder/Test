// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 441-460
// ============================================================

// ============================================================
// Function #441
// Name: FUN_00024084
// Address: 00024084
// JNI: NO
// ============================================================


int FUN_00024084(int param_1,undefined4 param_2,undefined4 param_3)

{
  undefined4 uVar1;
  undefined4 uVar2;
  
  *(undefined4 *)(param_1 + -0x7c) = 0;
  uVar2 = FUN_0001b268();
  *(undefined4 *)(param_1 + -0x70) = uVar2;
  uVar2 = FUN_0001b2bc();
  *(undefined4 *)(param_1 + -0x6c) = uVar2;
  uVar1 = DAT_000240cc;
  uVar2 = DAT_000240c8;
  *(int *)(param_1 + -0x50) = DAT_000240d0 + 0x240b2;
  *(undefined4 *)(param_1 + -0x58) = uVar1;
  *(undefined4 *)(param_1 + -0x54) = uVar2;
  *(undefined4 *)(param_1 + -0x78) = param_2;
  *(undefined4 *)(param_1 + -0x74) = param_3;
  return param_1 + -0x80;
}




// ============================================================
// Function #442
// Name: FUN_000240ec
// Address: 000240ec
// JNI: NO
// ============================================================


void FUN_000240ec(undefined4 param_1,undefined4 param_2,undefined4 param_3)

{
  int iVar1;
  uint *puVar2;
  uint uVar3;
  
  iVar1 = FUN_0001b400();
  *(int *)(iVar1 + 4) = *(int *)(iVar1 + 4) + 1;
  iVar1 = FUN_00024084(param_1,param_2,param_3);
  *(undefined4 *)(iVar1 + 4) = 1;
  FUN_000248ec(iVar1 + 0x28);
  iVar1 = FUN_00024122(iVar1);
  FUN_00024006(iVar1 + 0x28);
  puVar2 = (uint *)FUN_0001b2d4(*(undefined4 *)(iVar1 + 0x14));
  iVar1 = FUN_0001b400();
  if ((*puVar2 >> 8 | puVar2[1] << 0x18) == DAT_00024188 && DAT_00024184 == puVar2[1] >> 8) {
    uVar3 = puVar2[-1];
    if (uVar3 == 0) {
      puVar2[-2] = *(uint *)(iVar1 + 8);
      *(uint **)(iVar1 + 8) = puVar2 + -10;
    }
    puVar2[-1] = uVar3 + 1;
  }
  else {
    if (*(int *)(iVar1 + 8) != 0) {
                    /* WARNING: Subroutine does not return */
      FUN_0001b280();
    }
    *(uint **)(iVar1 + 8) = puVar2 + -10;
  }
                    /* WARNING: Could not recover jumptable at 0x00024178. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)0x24135)(1);
  return;
}




// ============================================================
// Function #443
// Name: FUN_00024122
// Address: 00024122
// JNI: NO
// ============================================================


void FUN_00024122(int param_1)

{
  uint *puVar1;
  int iVar2;
  uint uVar3;
  
  FUN_00024006(param_1 + 0x28);
  puVar1 = (uint *)FUN_0001b2d4(*(undefined4 *)(param_1 + 0x14));
  iVar2 = FUN_0001b400();
  if ((*puVar1 >> 8 | puVar1[1] << 0x18) == DAT_00024188 && DAT_00024184 == puVar1[1] >> 8) {
    uVar3 = puVar1[-1];
    if (uVar3 == 0) {
      puVar1[-2] = *(uint *)(iVar2 + 8);
      *(uint **)(iVar2 + 8) = puVar1 + -10;
    }
    puVar1[-1] = uVar3 + 1;
  }
  else {
    if (*(int *)(iVar2 + 8) != 0) {
                    /* WARNING: Subroutine does not return */
      FUN_0001b280();
    }
    *(uint **)(iVar2 + 8) = puVar1 + -10;
  }
                    /* WARNING: Could not recover jumptable at 0x00024178. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)0x24135)(1);
  return;
}




// ============================================================
// Function #444
// Name: FUN_0002418c
// Address: 0002418c
// JNI: NO
// ============================================================


uint * FUN_0002418c(void)

{
  int iVar1;
  int iVar2;
  int iVar3;
  
  iVar1 = FUN_0001b400();
  iVar2 = *(int *)(iVar1 + 8);
  if (iVar2 != 0) {
    if ((*(uint *)(iVar2 + 0x28) >> 8 | *(uint *)(iVar2 + 0x2c) << 0x18) == DAT_000241d8 &&
        DAT_000241d4 == *(uint *)(iVar2 + 0x2c) >> 8) {
      iVar3 = *(int *)(iVar2 + 0x24) + -1;
      *(int *)(iVar2 + 0x24) = iVar3;
      if (iVar3 == 0) {
        *(undefined4 *)(iVar1 + 8) = *(undefined4 *)(iVar2 + 0x20);
        *(undefined4 *)(iVar2 + 0x20) = 0;
      }
    }
    else {
      *(undefined4 *)(iVar1 + 8) = 0;
    }
    return (uint *)(iVar2 + 0x28);
  }
                    /* WARNING: Subroutine does not return */
  FUN_0001b280();
}




// ============================================================
// Function #445
// Name: FUN_000241dc
// Address: 000241dc
// JNI: NO
// ============================================================


void FUN_000241dc(void)

{
  bool bVar1;
  int *piVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  
  piVar2 = (int *)FUN_0001b414();
  iVar3 = *piVar2;
  if (iVar3 != 0) {
    if ((*(uint *)(iVar3 + 0x28) >> 8 | *(uint *)(iVar3 + 0x2c) << 0x18) != DAT_00024250 ||
        DAT_0002424c != *(uint *)(iVar3 + 0x2c) >> 8) {
      FUN_00024b30((uint *)(iVar3 + 0x28));
      iVar3 = 0;
LAB_0002421e:
      *piVar2 = iVar3;
      return;
    }
    iVar4 = *(int *)(iVar3 + 0x1c);
    if (iVar4 < 0) {
      *(int *)(iVar3 + 0x1c) = iVar4 + 1;
      if (iVar4 == -1) {
        iVar3 = *(int *)(iVar3 + 0x18);
        goto LAB_0002421e;
      }
    }
    else {
      *(int *)(iVar3 + 0x1c) = iVar4 + -1;
      if (iVar4 + -1 == 0) {
        *piVar2 = *(int *)(iVar3 + 0x18);
        if (*(char *)(iVar3 + 0x28) == '\x01') {
          iVar3 = *(int *)(iVar3 + 4);
          FUN_00025804();
          iVar3 = iVar3 + -0x80;
        }
        iVar4 = iVar3 + 0x80;
        if (iVar4 != 0) {
          piVar2 = (int *)(iVar3 + 4);
          DataMemoryBarrier(0x1b);
          do {
            ExclusiveAccess(piVar2);
            iVar5 = *piVar2;
            bVar1 = (bool)hasExclusiveAccess(piVar2);
          } while (!bVar1);
          *piVar2 = iVar5 + -1;
          DataMemoryBarrier(0x1b);
          if (iVar5 == 1) {
            if (*(code **)(iVar3 + 0xc) != (code *)0x0) {
              (**(code **)(iVar3 + 0xc))(iVar4);
            }
            FUN_00024072(iVar4);
            return;
          }
        }
        return;
      }
    }
  }
  return;
}




// ============================================================
// Function #446
// Name: FUN_00024292
// Address: 00024292
// JNI: NO
// ============================================================


uint * FUN_00024292(uint *param_1,undefined4 *param_2,int *param_3)

{
  uint uVar1;
  undefined4 uVar2;
  uint uVar3;
  int iVar4;
  
  uVar1 = *param_1;
  if (-1 < (int)uVar1) {
    *param_2 = 1;
    *param_3 = (uint)*(byte *)((int)param_1 + 7) * 4 + 4;
    return param_1 + 1;
  }
  uVar3 = (uVar1 & 0xfffffff) >> 0x18;
  if (uVar3 == 0) {
    uVar2 = 1;
    iVar4 = 4;
  }
  else {
    if (uVar3 != 3 && uVar3 != 1) {
      return (uint *)0x0;
    }
    iVar4 = ((uVar1 & 0xffffff) >> 0x10) * 4 + 4;
    uVar2 = 2;
  }
  *param_3 = iVar4;
  *param_2 = uVar2;
  return param_1;
}




// ============================================================
// Function #447
// Name: FUN_000242d8
// Address: 000242d8
// JNI: NO
// ============================================================


undefined8 FUN_000242d8(undefined4 param_1,uint *param_2,uint param_3,uint param_4)

{
  byte bVar1;
  bool bVar2;
  undefined4 uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  int iVar7;
  uint uVar8;
  uint uVar9;
  uint *local_30;
  uint local_2c;
  uint local_28;
  
  bVar2 = false;
  local_2c = 0;
  local_30 = param_2;
  local_28 = param_4;
LAB_000242f0:
  if ((param_4 <= param_3) || (bVar2)) {
    if (local_2c == 0) {
      FUN_00024b9c(param_1,0xe,&local_28);
      FUN_00024bc8(param_1,0xf,local_28);
    }
    uVar3 = 8;
switchD_00024410_caseD_b5:
    return CONCAT44(local_30,uVar3);
  }
  uVar8 = param_3 + 1;
  bVar1 = *(byte *)((int)param_2 + (param_3 ^ 3));
  uVar9 = (uint)bVar1;
  if (-1 < (char)bVar1) {
    FUN_00024b9c(param_1,0xd,&local_28);
    if (uVar9 < 0x40) {
      local_28 = local_28 + uVar9 * 4 + 4;
    }
    else {
      local_28 = (local_28 - (uVar9 * 4 & 0xfc)) - 4;
    }
LAB_0002438a:
    FUN_00024bc8(param_1,0xd);
    bVar2 = false;
    param_3 = uVar8;
    goto LAB_000242f0;
  }
  uVar4 = uVar9 - 0x80 >> 4;
  if (5 < uVar4) goto LAB_0002450a;
  switch(uVar4) {
  case 0:
    if ((param_4 <= uVar8) ||
       (uVar8 = (uVar9 & 0xf) << 0xc | (uint)*(byte *)((int)param_2 + (uVar8 ^ 3)) << 4, uVar8 == 0)
       ) goto LAB_0002450a;
    bVar2 = false;
    FUN_00024648(param_1,0,uVar8,0);
    local_2c = local_2c | (uVar9 & 8) >> 3;
    param_3 = param_3 + 2;
    goto LAB_000242f0;
  case 1:
    if ((uVar9 & 0xf | 2) == 0xf) {
LAB_0002450a:
      return CONCAT44(local_30,9);
    }
    bVar2 = false;
    FUN_00024514(param_1,0,uVar9 & 0xf,0);
    FUN_00024bc8(param_1,0xd,local_28);
    param_3 = uVar8;
    local_30 = &local_28;
    goto LAB_000242f0;
  case 2:
    iVar7 = (uVar9 & 8) * 0x800 + ~(-1 << (uVar9 & 7) + 1) * 0x10;
    uVar3 = 0;
    break;
  case 3:
    bVar2 = true;
    uVar3 = 9;
    switch(uVar9) {
    case 0xb0:
      param_3 = uVar8;
      goto LAB_000242f0;
    case 0xb1:
      if (param_4 <= uVar8) goto switchD_00024410_caseD_b5;
      uVar8 = (uint)*(byte *)((int)param_2 + (uVar8 ^ 3));
      if (0xe < uVar8 - 1) goto LAB_0002450a;
      bVar2 = false;
      FUN_00024648(param_1,0,uVar8,0);
      param_3 = param_3 + 2;
      goto LAB_000242f0;
    case 0xb2:
      uVar4 = 0;
      uVar9 = 0;
      do {
        if (param_4 <= uVar8) goto LAB_0002450a;
        uVar5 = uVar8 ^ 3;
        uVar8 = uVar8 + 1;
        uVar6 = (uint)*(char *)((int)param_2 + uVar5);
        uVar5 = uVar9 & 0xff;
        uVar9 = uVar9 + 7;
        uVar4 = uVar4 | (uVar6 & 0x7f) << uVar5;
      } while ((int)uVar6 < 0);
      FUN_00024b9c(param_1,0xd,&local_28);
      local_28 = local_28 + uVar4 * 4 + 0x204;
      goto LAB_0002438a;
    case 0xb3:
      uVar3 = 1;
      uVar8 = (uint)*(byte *)((int)param_2 + (uVar8 ^ 3));
      uVar4 = uVar8 & 0xf | (uVar8 & 0xf0) << 0xc;
      goto LAB_000243cc;
    case 0xb4:
      uVar3 = 5;
      iVar7 = 0;
      break;
    case 0xb5:
    case 0xb6:
    case 0xb7:
      goto switchD_00024410_caseD_b5;
    default:
      uVar3 = 1;
      goto LAB_00024476;
    }
    break;
  case 4:
    if ((uVar9 & 0xfe) != 200) goto LAB_0002450a;
    bVar1 = *(byte *)((int)param_2 + (uVar8 ^ 3));
    uVar8 = (uint)(bVar1 >> 4);
    uVar4 = bVar1 & 0xf;
    if (uVar9 == 200) {
      uVar8 = uVar8 + 0x10;
    }
    if (0x1f < uVar8 + uVar4) goto LAB_0002450a;
    uVar4 = uVar4 | uVar8 << 0x10;
    uVar3 = 5;
LAB_000243cc:
    FUN_00024648(param_1,1,uVar4 + 1,uVar3);
    bVar2 = false;
    param_3 = param_3 + 2;
    goto LAB_000242f0;
  case 5:
    if ((int)(uVar9 << 0x1c) < 0) goto LAB_0002450a;
    uVar3 = 5;
LAB_00024476:
    FUN_00024648(param_1,1,(uVar9 & 7) + DAT_00024510,uVar3);
    bVar2 = false;
    param_3 = uVar8;
    goto LAB_000242f0;
  }
  bVar2 = false;
  FUN_00024648(param_1,uVar3,iVar7,0);
  param_3 = uVar8;
  goto LAB_000242f0;
}




// ============================================================
// Function #448
// Name: FUN_00024514
// Address: 00024514
// JNI: NO
// ============================================================


undefined4 FUN_00024514(undefined4 param_1,int param_2,uint param_3,uint param_4,undefined4 param_5)

{
  int iVar1;
  undefined4 uVar2;
  undefined4 *puVar3;
  
  if (param_2 == 5) {
    if (param_4 != 0 || param_3 != 0) {
      return 2;
    }
    param_3 = 0x8f;
  }
  else {
    if (param_2 == 1) {
      if ((param_4 & 0xfffffffb) != 1) {
        return 2;
      }
      if (param_4 == 1) {
        if (0xf < param_3) {
          return 2;
        }
        FUN_00024cd8(param_1);
      }
      else if (0x1f < param_3) {
        return 2;
      }
      iVar1 = FUN_00024c40(param_1,param_3 + 0x100,param_5);
      goto LAB_00024570;
    }
    if (param_2 != 0) {
      puVar3 = *(undefined4 **)(DAT_0002459c + 0x2457e);
      fprintf((FILE *)*puVar3,(char *)(DAT_000245a0 + 0x2458a),DAT_000245a4 + 0x2458c,
              DAT_000245a8 + 0x2458e);
      fflush((FILE *)*puVar3);
                    /* WARNING: Subroutine does not return */
      abort();
    }
    if ((param_4 != 0) || (0xf < param_3)) {
      return 2;
    }
  }
  iVar1 = FUN_00024b9c(param_1,param_3,param_5);
LAB_00024570:
  uVar2 = 0;
  if (iVar1 != 0) {
    uVar2 = 2;
  }
  return uVar2;
}




// ============================================================
// Function #449
// Name: FUN_000245ac
// Address: 000245ac
// JNI: NO
// ============================================================


undefined4
FUN_000245ac(undefined4 param_1,int param_2,uint param_3,uint param_4,undefined4 *param_5)

{
  int iVar1;
  undefined4 uVar2;
  undefined4 *puVar3;
  
  if (param_2 == 5) {
    if (param_4 != 0 || param_3 != 0) {
      return 2;
    }
    uVar2 = *param_5;
    param_3 = 0x8f;
  }
  else {
    if (param_2 == 1) {
      if ((param_4 & 0xfffffffb) != 1) {
        return 2;
      }
      if (param_4 == 1) {
        if (0xf < param_3) {
          return 2;
        }
        FUN_00024cd8(param_1);
      }
      else if (0x1f < param_3) {
        return 2;
      }
      iVar1 = FUN_00024c6c(param_1,param_3 + 0x100,*param_5,param_5[1]);
      goto LAB_0002460c;
    }
    if (param_2 != 0) {
      puVar3 = *(undefined4 **)(DAT_00024638 + 0x2461a);
      fprintf((FILE *)*puVar3,(char *)(DAT_0002463c + 0x24626),DAT_00024640 + 0x24628,
              DAT_00024644 + 0x2462a);
      fflush((FILE *)*puVar3);
                    /* WARNING: Subroutine does not return */
      abort();
    }
    if ((param_4 != 0) || (0xf < param_3)) {
      return 2;
    }
    uVar2 = *param_5;
  }
  iVar1 = FUN_00024bc8(param_1,param_3,uVar2);
LAB_0002460c:
  uVar2 = 0;
  if (iVar1 != 0) {
    uVar2 = 2;
  }
  return uVar2;
}




// ============================================================
// Function #450
// Name: FUN_00024648
// Address: 00024648
// JNI: NO
// ============================================================


/* WARNING: Restarted to delay deadcode elimination for space: register */

undefined4 FUN_00024648(undefined4 param_1,int param_2,uint param_3,uint param_4)

{
  bool bVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  int iVar4;
  undefined4 uVar5;
  undefined8 *puVar6;
  undefined4 *puVar7;
  uint uVar8;
  uint uVar9;
  ulonglong in_d6;
  undefined8 in_d7;
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  ulonglong local_40;
  undefined8 uStack_38;
  
  local_40 = in_d6;
  uStack_38 = in_d7;
  if (param_2 == 5) {
    if ((param_4 == 0 && param_3 == 0) && (iVar4 = FUN_00024b9c(param_1,0xd,&local_40), iVar4 == 0))
    {
      puVar7 = (undefined4 *)(undefined8 *)local_40;
      local_40 = CONCAT44(local_40._4_4_,(undefined4 *)((int)(undefined8 *)local_40 + 4));
      puVar6 = (undefined8 *)*puVar7;
      FUN_00024bc8(param_1,0xd);
      uVar5 = 0x8f;
LAB_00024766:
      iVar4 = FUN_00024bc8(param_1,uVar5,puVar6);
      if (iVar4 != 0) {
        return 2;
      }
      return 0;
    }
  }
  else if (param_2 == 1) {
    if (((param_4 & 0xfffffffb) == 1) &&
       (iVar4 = FUN_00024b9c(param_1,0xd,(int)&uStack_38 + 4), uVar3 = DAT_000247a0,
       uVar2 = DAT_00024798, iVar4 == 0)) {
      uVar9 = param_3 >> 0x10;
      uVar8 = uVar9 + (param_3 & 0xffff);
      do {
        if (uVar8 <= uVar9) {
          puVar6 = uStack_38._4_4_;
          if (param_4 == 1) {
            puVar6 = (undefined8 *)((int)uStack_38._4_4_ + 4);
            uStack_38 = CONCAT44(puVar6,(undefined4)uStack_38);
          }
          goto LAB_00024762;
        }
        auVar10 = VectorCopyLong(*uStack_38._4_4_,4,1);
        uStack_38 = CONCAT44(uStack_38._4_4_ + 1,(undefined4)uStack_38);
        auVar11._8_8_ = uVar3;
        auVar11._0_8_ = uVar2;
        auVar11 = VectorShiftLeft(auVar10,auVar11,8,1);
        local_40 = auVar11._0_8_ | auVar11._8_8_;
        iVar4 = FUN_000245ac(param_1,1,uVar9,param_4);
        uVar9 = uVar9 + 1;
      } while (iVar4 == 0);
    }
  }
  else {
    if (param_2 != 0) {
      puVar7 = *(undefined4 **)(DAT_000247a8 + 0x24778);
      fprintf((FILE *)*puVar7,(char *)(DAT_000247ac + 0x24784),DAT_000247b0 + 0x24786,
              DAT_000247b4 + 0x24788);
      fflush((FILE *)*puVar7);
                    /* WARNING: Subroutine does not return */
      abort();
    }
    if ((param_4 == 0) && (iVar4 = FUN_00024b9c(param_1,0xd,&local_40), iVar4 == 0)) {
      bVar1 = false;
      for (uVar8 = 0; puVar6 = (undefined8 *)local_40, uVar8 != 0x10; uVar8 = uVar8 + 1) {
        if ((param_3 >> (uVar8 & 0xff) & 1) != 0) {
          local_40 = CONCAT44(local_40._4_4_,(undefined4 *)((int)(undefined8 *)local_40 + 4));
          uStack_38 = CONCAT44(*(undefined4 *)puVar6,(undefined4)uStack_38);
          iVar4 = FUN_000245ac(param_1,0,uVar8,0);
          if (iVar4 != 0) {
            return 2;
          }
          bVar1 = (bool)(bVar1 | uVar8 == 0xd);
        }
      }
      if (bVar1) {
        return 0;
      }
LAB_00024762:
      uVar5 = 0xd;
      goto LAB_00024766;
    }
  }
  return 2;
}




// ============================================================
// Function #451
// Name: FUN_000248ec
// Address: 000248ec
// JNI: NO
// ============================================================


int FUN_000248ec(int param_1)

{
  int iVar1;
  undefined1 auStack_310 [392];
  undefined1 auStack_188 [336];
  undefined4 local_38 [3];
  code *local_2c;
  undefined4 local_24;
  undefined4 local_18;
  
  FUN_00025684(auStack_188);
  *(undefined4 *)(param_1 + 0xc) = 0;
  FUN_00024b54(auStack_310,auStack_188);
  do {
    do {
      iVar1 = FUN_00024ca8(auStack_310,local_38);
      if (iVar1 != 0) goto LAB_0002493c;
    } while (local_2c == (code *)0x0);
    *(undefined4 *)(param_1 + 0x48) = local_38[0];
    *(undefined4 *)(param_1 + 0x4c) = local_18;
    *(undefined4 *)(param_1 + 0x50) = local_24;
    iVar1 = (*local_2c)(0,param_1,auStack_310);
  } while (iVar1 == 8);
  if (iVar1 == 6) {
    FUN_00024954(auStack_188,auStack_310,param_1,0);
    iVar1 = 2;
  }
  else if (iVar1 != 9) {
LAB_0002493c:
    iVar1 = 3;
  }
  return iVar1;
}




// ============================================================
// Function #452
// Name: FUN_00024954
// Address: 00024954
// JNI: NO
// ============================================================


void FUN_00024954(undefined4 param_1,undefined4 param_2,int param_3,uint param_4)

{
  int iVar1;
  undefined4 *puVar2;
  int iVar3;
  undefined4 uVar4;
  undefined4 local_50;
  undefined4 local_4c [3];
  code *local_40;
  undefined4 local_38;
  undefined4 local_2c;
  int local_24;
  
  FUN_00024b54(param_2,param_1);
  iVar3 = 1;
  do {
    uVar4 = 1;
    if (((param_4 & 1) != 0) && (uVar4 = 2, iVar3 == 0)) {
      FUN_00024bc8(param_2,0xffffffff,*(undefined4 *)(param_3 + 0x10));
      param_4 = 0;
    }
    FUN_00024b9c(param_2,0xfffffffe,&local_24);
    iVar1 = FUN_00024ca8(param_2,local_4c);
    if (iVar1 != 0) {
      return;
    }
    if (local_40 != (code *)0x0) {
      *(undefined4 *)(param_3 + 0x48) = local_4c[0];
      *(undefined4 *)(param_3 + 0x4c) = local_2c;
      *(undefined4 *)(param_3 + 0x50) = local_38;
      iVar1 = (*local_40)(uVar4,param_3,param_2);
      if (iVar1 != 8) {
        if (iVar1 == 7) {
          FUN_00024b9c(param_2,0xffffffff,&local_50);
          *(undefined4 *)(param_3 + 0x10) = local_50;
          FUN_00024cc8(param_2);
          return;
        }
        if (iVar1 != 9) {
          return;
        }
                    /* WARNING: Subroutine does not return */
        abort();
      }
      if (local_24 == *(int *)(param_3 + 0x20)) {
        puVar2 = *(undefined4 **)(DAT_00024a18 + 0x249fc);
        fprintf((FILE *)*puVar2,(char *)(DAT_00024a1c + 0x24a08),DAT_00024a20 + 0x24a0a,
                DAT_00024a24 + 0x24a0c);
        fflush((FILE *)*puVar2);
                    /* WARNING: Subroutine does not return */
        abort();
      }
    }
    iVar3 = iVar3 + -1;
  } while( true );
}




// ============================================================
// Function #453
// Name: FUN_00024a88
// Address: 00024a88
// JNI: NO
// ============================================================


void FUN_00024a88(undefined4 param_1,undefined4 param_2,int param_3,code *param_4,undefined4 param_5
                 )

{
  int iVar1;
  undefined4 local_40 [3];
  code *local_34;
  undefined4 local_2c;
  undefined4 local_20;
  
  FUN_00024b54(param_2,param_1);
  while( true ) {
    iVar1 = FUN_00024ca8(param_2,local_40);
    if (iVar1 != 0) {
      return;
    }
    iVar1 = (*param_4)(1,10,param_3,param_3,param_2,param_5);
    if (iVar1 != 0) break;
    if (local_34 != (code *)0x0) {
      *(undefined4 *)(param_3 + 0x48) = local_40[0];
      *(undefined4 *)(param_3 + 0x4c) = local_20;
      *(undefined4 *)(param_3 + 0x50) = local_2c;
      iVar1 = (*local_34)(9,param_3,param_2);
      if (iVar1 == 7) {
        FUN_00024cc8(param_2);
      }
      else if (iVar1 != 8) {
        if (iVar1 == 5) {
          (*param_4)(1,0x1a,param_3,param_3,param_2,param_5);
        }
        return;
      }
    }
  }
  return;
}




// ============================================================
// Function #454
// Name: FUN_00024b00
// Address: 00024b00
// JNI: NO
// ============================================================


undefined4 FUN_00024b00(undefined4 param_1)

{
  int iVar1;
  undefined1 auStack_30 [8];
  undefined4 local_28;
  
  iVar1 = FUN_00024ca8(param_1,auStack_30);
  if (iVar1 != 0) {
    local_28 = 0;
  }
  return local_28;
}




// ============================================================
// Function #455
// Name: FUN_00024b18
// Address: 00024b18
// JNI: NO
// ============================================================


undefined4 FUN_00024b18(undefined4 param_1)

{
  int iVar1;
  undefined4 local_30 [10];
  
  iVar1 = FUN_00024ca8(param_1,local_30);
  if (iVar1 != 0) {
    local_30[0] = 0;
  }
  return local_30[0];
}




// ============================================================
// Function #456
// Name: FUN_00024b30
// Address: 00024b30
// JNI: NO
// ============================================================


void FUN_00024b30(int param_1)

{
  if (*(code **)(param_1 + 8) != (code *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x00024b38. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(param_1 + 8))(1,param_1);
    return;
  }
  return;
}




// ============================================================
// Function #457
// Name: FUN_00024b3c
// Address: 00024b3c
// JNI: NO
// ============================================================


undefined4 FUN_00024b3c(undefined4 param_1,undefined4 param_2)

{
  int iVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  
  iVar1 = FUN_00024ca0(param_2);
  uVar3 = 9;
  if (iVar1 == 0) {
    uVar3 = 5;
  }
  uVar2 = 0;
  if (iVar1 != 1) {
    uVar2 = uVar3;
  }
  return uVar2;
}




// ============================================================
// Function #458
// Name: FUN_00024b54
// Address: 00024b54
// JNI: NO
// ============================================================


undefined4 FUN_00024b54(int *param_1,undefined4 param_2)

{
  int iVar1;
  
  *(undefined1 *)((int)param_1 + 0x4e) = 0;
  *(undefined2 *)(param_1 + 0x13) = 0;
  iVar1 = DAT_00024b94 + 0x24b6a;
  *param_1 = DAT_00024b98 + 0x24b74;
  param_1[1] = iVar1;
  __aeabi_memcpy(param_1 + 2,param_2,0x40);
  param_1[0x12] = 0;
  __aeabi_memclr8(param_1 + 0x14,0x132);
  FUN_00024d8c(param_1,0);
  return 0;
}




// ============================================================
// Function #459
// Name: FUN_00024b9c
// Address: 00024b9c
// JNI: NO
// ============================================================


undefined4 FUN_00024b9c(int *param_1,undefined4 param_2,undefined4 *param_3)

{
  int iVar1;
  undefined4 uVar2;
  
  iVar1 = (**(code **)(*param_1 + 8))(param_1);
  if (iVar1 != 0) {
    uVar2 = (**(code **)(*param_1 + 0xc))(param_1,param_2);
    *param_3 = uVar2;
    return 0;
  }
  return DAT_00024bc4;
}




// ============================================================
// Function #460
// Name: FUN_00024bc8
// Address: 00024bc8
// JNI: NO
// ============================================================


undefined4 FUN_00024bc8(int *param_1,int param_2,undefined4 param_3)

{
  int iVar1;
  undefined4 uVar2;
  undefined1 auStack_38 [16];
  int local_28;
  
  iVar1 = (**(code **)(*param_1 + 8))(param_1);
  uVar2 = DAT_00024c3c;
  if (iVar1 != 0) {
    if (param_2 == -1) {
      (**(code **)(*param_1 + 0x24))(param_1,auStack_38);
      iVar1 = (**(code **)(*param_1 + 0xc))(param_1,0xfffffffe);
      if (local_28 != 0) {
        (**(code **)(*param_1 + 0x10))(param_1,0xfffffffe,local_28 + iVar1);
      }
      (**(code **)(*param_1 + 0x10))(param_1,0xffffffff,param_3);
      (**(code **)(*param_1 + 0x34))(param_1,0);
      uVar2 = 0;
    }
    else {
      (**(code **)(*param_1 + 0x10))(param_1,param_2,param_3);
      uVar2 = 0;
    }
  }
  return uVar2;
}




