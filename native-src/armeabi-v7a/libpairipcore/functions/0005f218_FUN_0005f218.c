/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0005f218
 * Address  : 0005f218
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0005f218(int param_1,int param_2)

{
  uint uVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  int iVar4;
  undefined4 uVar5;
  uint uVar6;
  int iVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  undefined1 *puVar10;
  undefined8 *puVar11;
  undefined8 *puVar12;
  uint uVar13;
  undefined8 *puVar14;
  undefined8 *puVar15;
  uint uVar16;
  int iVar17;
  bool bVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 *local_38;
  undefined1 *local_2c;
  int local_28;
  
  local_28 = **(int **)(DAT_0005f768 + 0x5f238);
  FUN_0001ae24(param_1 + 4);
  puVar14 = *(undefined8 **)(param_1 + 0xc);
  puVar15 = *(undefined8 **)(param_1 + 0x10);
  uVar1 = *(uint *)(param_1 + 0x18);
  uVar13 = (int)puVar15 - (int)puVar14;
  iVar7 = 0;
  if (puVar15 != puVar14) {
    iVar7 = ((int)uVar13 >> 2) * 0x55 + -1;
  }
  if (iVar7 == *(int *)(param_1 + 0x1c) + uVar1) {
    if (uVar1 < 0x55) {
      puVar9 = *(undefined8 **)(param_1 + 8);
      puVar11 = *(undefined8 **)(param_1 + 0x14);
      if (uVar13 < (uint)((int)puVar11 - (int)puVar9)) {
        uVar5 = FUN_000a0370(0xff0);
        if (puVar11 == puVar15) {
          if (puVar14 == puVar9) {
            iVar7 = (int)puVar11 - (int)puVar14;
            uVar1 = iVar7 >> 1;
            if (puVar15 == puVar14) {
              uVar1 = 1;
            }
            if (0x3fffffff < uVar1) goto LAB_0005f764;
            iVar4 = FUN_000a0370(uVar1 << 2);
            iVar17 = iVar4 + uVar1 * 4;
            puVar12 = (undefined8 *)(iVar4 + (uVar1 + 3 & 0xfffffffc));
            puVar11 = puVar12;
            if (puVar15 == puVar14) {
LAB_0005f71c:
              bVar18 = puVar14 == (undefined8 *)0x0;
              *(int *)(param_1 + 8) = iVar4;
              *(undefined8 **)(param_1 + 0xc) = puVar12;
              *(undefined8 **)(param_1 + 0x10) = puVar11;
              *(int *)(param_1 + 0x14) = iVar17;
              puVar14 = puVar12;
              if (bVar18) goto LAB_0005f748;
            }
            else {
              puVar11 = (undefined8 *)((int)puVar12 + uVar13);
              puVar15 = puVar12;
              puVar2 = puVar14;
              if ((uVar13 - 4 < 0x1c) || (((uVar1 + 3 & 0x7ffffffc) + iVar4) - (int)puVar14 < 0x10))
              {
LAB_0005f70c:
                do {
                  puVar8 = (undefined8 *)((int)puVar15 + 4);
                  *(undefined4 *)puVar15 = *(undefined4 *)puVar2;
                  puVar15 = puVar8;
                  puVar2 = (undefined8 *)((int)puVar2 + 4);
                } while (puVar8 != puVar11);
                goto LAB_0005f71c;
              }
              uVar16 = (uVar13 - 4 >> 2) + 1;
              uVar13 = uVar16 & 0xfffffffc;
              uVar1 = uVar13;
              do {
                uVar19 = *puVar2;
                uVar20 = puVar2[1];
                puVar2 = puVar2 + 2;
                uVar1 = uVar1 - 4;
                *puVar15 = uVar19;
                puVar15[1] = uVar20;
                puVar15 = puVar15 + 2;
              } while (uVar1 != 0);
              if (uVar16 != uVar13) {
                puVar15 = (undefined8 *)((int)puVar12 + uVar13 * 4);
                puVar2 = (undefined8 *)((int)puVar14 + uVar13 * 4);
                goto LAB_0005f70c;
              }
              *(int *)(param_1 + 8) = iVar4;
              *(undefined8 **)(param_1 + 0xc) = puVar12;
              *(undefined8 **)(param_1 + 0x10) = puVar11;
              *(int *)(param_1 + 0x14) = iVar17;
            }
            FUN_00023f68(puVar9,iVar7);
            puVar14 = *(undefined8 **)(param_1 + 0xc);
          }
LAB_0005f748:
          *(undefined4 *)((int)puVar14 + -4) = uVar5;
          iVar7 = *(int *)(param_1 + 0xc);
          *(int *)(param_1 + 0xc) = iVar7 + -4;
          uVar5 = *(undefined4 *)(iVar7 + -4);
          *(int *)(param_1 + 0xc) = iVar7;
          goto LAB_0005f294;
        }
        *(undefined4 *)puVar15 = uVar5;
        *(int *)(param_1 + 0x10) = *(int *)(param_1 + 0x10) + 4;
      }
      else {
        uVar1 = (int)puVar11 - (int)puVar9 >> 1;
        if (puVar11 == puVar9) {
          uVar1 = 1;
        }
        if (0x3fffffff < uVar1) {
LAB_0005f764:
                    /* WARNING: Subroutine does not return */
          FUN_00026984();
        }
        puVar12 = (undefined8 *)FUN_000a0370(uVar1 << 2);
        local_38 = (undefined8 *)((int)puVar12 + uVar1 * 4);
        puVar9 = (undefined8 *)((int)puVar12 + uVar13);
        uVar5 = FUN_000a0370(0xff0);
        puVar11 = puVar12;
        if (uVar13 == uVar1 * 4) {
          if (puVar12 < puVar9) {
            iVar7 = ((int)uVar13 >> 2) + 1;
            puVar9 = (undefined8 *)((int)puVar9 - ((iVar7 - (iVar7 >> 0x1f)) * 2 & 0xfffffffdU));
          }
          else {
            uVar1 = (int)uVar13 >> 1;
            if (puVar15 == puVar14) {
              uVar1 = 1;
            }
            if (0x3fffffff < uVar1) goto LAB_0005f764;
            puVar11 = (undefined8 *)FUN_000a0370(uVar1 << 2);
            FUN_00023f68(puVar12,uVar13);
            local_38 = (undefined8 *)((int)puVar11 + uVar1 * 4);
            puVar14 = *(undefined8 **)(param_1 + 0xc);
            puVar15 = *(undefined8 **)(param_1 + 0x10);
            puVar9 = (undefined8 *)((int)puVar11 + (uVar1 & 0xfffffffc));
          }
        }
        puVar12 = (undefined8 *)((int)puVar9 + 4);
        *(undefined4 *)puVar9 = uVar5;
        puVar2 = puVar12;
        if (puVar15 != puVar14) {
          do {
            puVar14 = puVar9;
            puVar12 = puVar2;
            if (puVar9 == puVar11) {
              if (puVar2 < local_38) {
                iVar7 = ((int)local_38 - (int)puVar2 >> 2) + 1;
                puVar12 = (undefined8 *)
                          ((int)puVar2 + ((iVar7 - (iVar7 >> 0x1f)) * 2 & 0xfffffffdU));
                puVar14 = (undefined8 *)((int)puVar12 - ((int)puVar2 - (int)puVar9));
                if ((int)puVar2 - (int)puVar9 != 0) {
                  __aeabi_memmove4(puVar14,puVar9);
                }
              }
              else {
                iVar7 = (int)local_38 - (int)puVar9;
                uVar1 = iVar7 >> 1;
                if (iVar7 == 0) {
                  uVar1 = 1;
                }
                if (0x3fffffff < uVar1) goto LAB_0005f764;
                puVar8 = (undefined8 *)FUN_000a0370(uVar1 << 2);
                puVar14 = (undefined8 *)((int)puVar8 + (uVar1 + 3 & 0xfffffffc));
                puVar12 = puVar14;
                if (puVar2 != puVar9) {
                  puVar12 = (undefined8 *)((int)puVar14 + ((int)puVar2 - (int)puVar9));
                  uVar13 = ((int)puVar2 - (int)puVar9) - 4;
                  puVar2 = puVar14;
                  if ((0xb < uVar13) &&
                     (0xf < (int)puVar8 + ((uVar1 + 3 & 0x7ffffffc) - (int)puVar9))) {
                    uVar16 = (uVar13 >> 2) + 1;
                    uVar6 = uVar16 & 0xfffffffc;
                    uVar13 = uVar6;
                    puVar2 = puVar9;
                    puVar3 = puVar14;
                    do {
                      uVar19 = *puVar2;
                      uVar20 = puVar2[1];
                      puVar2 = puVar2 + 2;
                      uVar13 = uVar13 - 4;
                      *puVar3 = uVar19;
                      puVar3[1] = uVar20;
                      puVar3 = puVar3 + 2;
                    } while (uVar13 != 0);
                    if (uVar16 == uVar6) goto LAB_0005f4c4;
                    puVar9 = (undefined8 *)((int)puVar9 + uVar6 * 4);
                    puVar2 = (undefined8 *)((int)puVar14 + uVar6 * 4);
                  }
                  do {
                    puVar3 = (undefined8 *)((int)puVar2 + 4);
                    *(undefined4 *)puVar2 = *(undefined4 *)puVar9;
                    puVar2 = puVar3;
                    puVar9 = (undefined8 *)((int)puVar9 + 4);
                  } while (puVar3 != puVar12);
                }
LAB_0005f4c4:
                local_38 = (undefined8 *)((int)puVar8 + uVar1 * 4);
                FUN_00023f68(puVar11,iVar7);
                puVar11 = puVar8;
              }
            }
            puVar15 = (undefined8 *)((int)puVar15 + -4);
            puVar9 = (undefined8 *)((int)puVar14 - 4);
            *(undefined4 *)puVar9 = *(undefined4 *)puVar15;
            puVar2 = puVar12;
          } while (puVar15 != *(undefined8 **)(param_1 + 0xc));
        }
        iVar7 = *(int *)(param_1 + 8);
        iVar4 = *(int *)(param_1 + 0x14);
        *(undefined8 **)(param_1 + 0x14) = local_38;
        *(undefined8 **)(param_1 + 8) = puVar11;
        *(undefined8 **)(param_1 + 0xc) = puVar9;
        *(undefined8 **)(param_1 + 0x10) = puVar12;
        if (iVar7 != 0) {
          FUN_00023f68(iVar7,iVar4 - iVar7);
        }
      }
    }
    else {
      uVar5 = *(undefined4 *)puVar14;
      *(uint *)(param_1 + 0x18) = uVar1 - 0x55;
      *(undefined4 **)(param_1 + 0xc) = (undefined4 *)((int)puVar14 + 4);
LAB_0005f294:
      FUN_0005f774(param_1 + 8,uVar5);
    }
    puVar14 = *(undefined8 **)(param_1 + 0xc);
    puVar10 = (undefined1 *)0x0;
    if (*(undefined8 **)(param_1 + 0x10) == puVar14) goto LAB_0005f2e0;
  }
  else {
    puVar10 = (undefined1 *)0x0;
    if (puVar15 == puVar14) goto LAB_0005f2e0;
  }
  uVar13 = *(int *)(param_1 + 0x1c) + *(int *)(param_1 + 0x18);
  uVar1 = uVar13 / 0x55;
  puVar10 = (undefined1 *)(*(int *)((int)puVar14 + uVar1 * 4) + uVar1 * -0xff0 + uVar13 * 0x30);
LAB_0005f2e0:
  *puVar10 = 0;
  *(undefined4 *)(puVar10 + 0x28) = 0xffffffff;
  iVar7 = *(int *)(param_2 + 0x28);
  if (iVar7 != -1) {
    local_2c = puVar10;
    (**(code **)(DAT_0005f76c + 0x5f30c + iVar7 * 4))(&local_2c,param_2);
    *(int *)(puVar10 + 0x28) = iVar7;
  }
  *(int *)(param_1 + 0x1c) = *(int *)(param_1 + 0x1c) + 1;
  FUN_0001ae3c(param_1 + 4);
  FUN_0001adc2(param_1);
  if (**(int **)(DAT_0005f770 + 0x5f344) == local_28) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}


