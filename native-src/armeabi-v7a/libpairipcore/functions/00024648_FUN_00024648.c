/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00024648
 * Address  : 00024648
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


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


