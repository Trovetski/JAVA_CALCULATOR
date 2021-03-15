/*     */ import java.awt.Color;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.Font;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.KeyAdapter;
/*     */ import java.awt.event.KeyEvent;
/*     */ import javax.swing.BoxLayout;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.SwingUtilities;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.UnsupportedLookAndFeelException;
/*     */ import javax.swing.border.BevelBorder;
/*     */ 
/*     */ public class calculator {
/*     */   private JFrame frame;
/*     */   
/*     */   private static JTextField textField;
/*     */   
/*  91 */   public static String oper = "";
/*     */   
/*  92 */   public static float num1 = 0.0F;
/*     */   
/*     */   public static float num2;
/*     */   
/*     */   private JButton btnBksp_1;
/*     */   
/*     */   private JButton button_1;
/*     */   
/*     */   private JButton button_4;
/*     */   
/*     */   private JButton button_5;
/*     */   
/*     */   private JButton button_6;
/*     */   
/*     */   private JButton button_7;
/*     */   
/*     */   private JButton button_8;
/*     */   
/*     */   private JButton button_9;
/*     */   
/*     */   private JButton button_10;
/*     */   
/*     */   private JButton button_11;
/*     */   
/*     */   private JButton button_12;
/*     */   
/*     */   private JButton button_14;
/*     */   
/*     */   private JButton button_15;
/*     */   
/*     */   private JButton button_16;
/*     */   
/*     */   private JButton button_17;
/*     */   
/*     */   private JButton button_19;
/*     */   
/*     */   private JButton button_20;
/*     */   
/*     */   private JButton button_21;
/*     */   
/*     */   private JButton button_22;
/*     */   
/*     */   private static JLabel label;
/*     */   
/*     */   public static void main(String[] args) {
/* 119 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/*     */             try {
/* 123 */               calculator window = new calculator();
/* 124 */               window.frame.setVisible(true);
/* 125 */               calci c = new calci();
/* 126 */               Thread t = new Thread(c);
/* 127 */               t.start();
/* 129 */             } catch (Exception e) {
/* 131 */               e.printStackTrace();
/*     */             } 
/*     */           }
/*     */         });
/*     */   }
/*     */   
/*     */   public calculator() {
/* 141 */     initialize();
/*     */   }
/*     */   
/*     */   private void initialize() {
/* 149 */     this.frame = new JFrame("JAVA_CALCI");
/* 150 */     this.frame.setResizable(false);
/* 151 */     this.frame.setBounds(100, 100, 350, 432);
/* 152 */     this.frame.setDefaultCloseOperation(3);
/* 153 */     this.frame.getContentPane().setLayout(new BoxLayout(this.frame.getContentPane(), 0));
/*     */     try {
/* 156 */       UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
/* 157 */       SwingUtilities.updateComponentTreeUI(this.frame);
/* 158 */     } catch (ClassNotFoundException e) {
/* 160 */       e.printStackTrace();
/* 161 */     } catch (InstantiationException e) {
/* 163 */       e.printStackTrace();
/* 164 */     } catch (IllegalAccessException e) {
/* 166 */       e.printStackTrace();
/* 167 */     } catch (UnsupportedLookAndFeelException e) {
/* 169 */       e.printStackTrace();
/*     */     } 
/* 173 */     JPanel panel = new JPanel();
/* 174 */     this.frame.getContentPane().add(panel);
/* 176 */     textField = new JTextField();
/* 177 */     textField.setBackground(Color.WHITE);
/* 178 */     textField.setHorizontalAlignment(4);
/* 179 */     textField.setEditable(false);
/* 180 */     textField.setFont(new Font("Tahoma", 0, 16));
/* 181 */     textField.setDisabledTextColor(Color.BLACK);
/* 182 */     textField.setBounds(12, 13, 320, 40);
/* 183 */     textField.addKeyListener(new KeyAdapter() {
/*     */           public void keyPressed(KeyEvent arg0) {
/* 186 */             if (arg0.getKeyCode() == 10) {
/* 188 */               calculator.setOperation("");
/* 189 */               calculator.textField.setText(String.valueOf(calculator.num1));
/* 190 */               calculator.num1 = 0.0F;
/* 191 */               calculator.num2 = 0.0F;
/* 193 */             } else if (arg0.getKeyCode() < 58 && arg0.getKeyCode() > 47) {
/* 195 */               calculator.textField.setText(String.valueOf(calculator.textField.getText()) + String.valueOf(arg0.getKeyCode() - 48));
/* 197 */             } else if (arg0.getKeyCode() < 106 && arg0.getKeyCode() > 95) {
/* 199 */               calculator.textField.setText(String.valueOf(calculator.textField.getText()) + String.valueOf(arg0.getKeyCode() - 96));
/* 201 */             } else if (arg0.getKeyCode() == 107) {
/* 203 */               calculator.setOperation("+");
/* 205 */             } else if (arg0.getKeyCode() == 109) {
/* 207 */               calculator.setOperation("-");
/* 209 */             } else if (arg0.getKeyCode() == 106) {
/* 211 */               calculator.setOperation("*");
/* 213 */             } else if (arg0.getKeyCode() == 111) {
/* 215 */               calculator.setOperation("/");
/* 217 */             } else if ((((arg0.getKeyCode() == 46) ? 1 : 0) | ((arg0.getKeyCode() == 110) ? 1 : 0)) != 0) {
/* 219 */               calculator.textField.setText(String.valueOf(calculator.textField.getText()) + ".");
/* 221 */             } else if ((((arg0.getKeyCode() == 32) ? 1 : 0) | ((arg0.getKeyCode() == 127) ? 1 : 0)) != 0) {
/* 223 */               calculator.textField.setText("");
/* 224 */               calculator.oper = "";
/* 225 */               calculator.num1 = 0.0F;
/* 226 */               calculator.num2 = 0.0F;
/*     */             } 
/*     */           }
/*     */         });
/* 233 */     panel.setLayout((LayoutManager)null);
/* 234 */     panel.add(textField);
/* 235 */     textField.setColumns(10);
/* 237 */     JButton btnNewButton = new JButton("CE");
/* 238 */     btnNewButton.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/* 240 */             calculator.textField.setText("");
/* 241 */             calculator.oper = "";
/* 242 */             calculator.num1 = 0.0F;
/* 243 */             calculator.num2 = 0.0F;
/*     */           }
/*     */         });
/* 247 */     btnNewButton.setBounds(12, 120, 71, 40);
/* 248 */     panel.add(btnNewButton);
/* 250 */     this.btnBksp_1 = new JButton("BKSP");
/* 251 */     this.btnBksp_1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/*     */             try {
/* 254 */               calculator.textField.setText(calculator.textField.getText().substring(0, calculator.textField.getText().length() - 1));
/* 255 */             } catch (Exception exception) {}
/*     */           }
/*     */         });
/* 261 */     this.btnBksp_1.setBounds(95, 120, 71, 40);
/* 262 */     panel.add(this.btnBksp_1);
/* 264 */     this.button_1 = new JButton("=");
/* 265 */     this.button_1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/* 267 */             calculator.setOperation("");
/* 268 */             calculator.textField.setText(String.valueOf(calculator.num1));
/* 269 */             calculator.num1 = 0.0F;
/* 270 */             calculator.num2 = 0.0F;
/*     */           }
/*     */         });
/* 274 */     this.button_1.setBounds(178, 120, 71, 40);
/* 275 */     panel.add(this.button_1);
/* 277 */     this.button_4 = new JButton("QUIT");
/* 278 */     this.button_4.setBounds(261, 120, 71, 40);
/* 279 */     panel.add(this.button_4);
/* 281 */     this.button_5 = new JButton("7");
/* 282 */     this.button_5.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/* 284 */             calculator.textField.setText(String.valueOf(calculator.textField.getText()) + "7");
/*     */           }
/*     */         });
/* 288 */     this.button_5.setBounds(12, 173, 71, 40);
/* 289 */     panel.add(this.button_5);
/* 291 */     this.button_6 = new JButton("4");
/* 292 */     this.button_6.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/* 294 */             calculator.textField.setText(String.valueOf(calculator.textField.getText()) + "4");
/*     */           }
/*     */         });
/* 298 */     this.button_6.setBounds(12, 226, 71, 40);
/* 299 */     panel.add(this.button_6);
/* 301 */     this.button_7 = new JButton("1");
/* 302 */     this.button_7.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/* 304 */             calculator.textField.setText(String.valueOf(calculator.textField.getText()) + "1");
/*     */           }
/*     */         });
/* 308 */     this.button_7.setBounds(12, 279, 71, 40);
/* 309 */     panel.add(this.button_7);
/* 311 */     this.button_8 = new JButton(".");
/* 312 */     this.button_8.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/* 314 */             calculator.textField.setText(String.valueOf(calculator.textField.getText()) + ".");
/*     */           }
/*     */         });
/* 318 */     this.button_8.setBounds(12, 332, 71, 40);
/* 319 */     panel.add(this.button_8);
/* 321 */     this.button_9 = new JButton("0");
/* 322 */     this.button_9.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/* 324 */             calculator.textField.setText(String.valueOf(calculator.textField.getText()) + "0");
/*     */           }
/*     */         });
/* 328 */     this.button_9.setBounds(95, 332, 71, 40);
/* 329 */     panel.add(this.button_9);
/* 331 */     this.button_10 = new JButton("2");
/* 332 */     this.button_10.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/* 334 */             calculator.textField.setText(String.valueOf(calculator.textField.getText()) + "2");
/*     */           }
/*     */         });
/* 338 */     this.button_10.setBounds(95, 279, 71, 40);
/* 339 */     panel.add(this.button_10);
/* 341 */     this.button_11 = new JButton("5");
/* 342 */     this.button_11.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/* 344 */             calculator.textField.setText(String.valueOf(calculator.textField.getText()) + "5");
/*     */           }
/*     */         });
/* 348 */     this.button_11.setBounds(95, 226, 71, 40);
/* 349 */     panel.add(this.button_11);
/* 351 */     this.button_12 = new JButton("8");
/* 352 */     this.button_12.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/* 354 */             calculator.textField.setText(String.valueOf(calculator.textField.getText()) + "8");
/*     */           }
/*     */         });
/* 358 */     this.button_12.setBounds(95, 173, 71, 40);
/* 359 */     panel.add(this.button_12);
/* 361 */     this.button_14 = new JButton("00");
/* 362 */     this.button_14.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/* 364 */             calculator.textField.setText(String.valueOf(calculator.textField.getText()) + "00");
/*     */           }
/*     */         });
/* 368 */     this.button_14.setBounds(178, 332, 71, 40);
/* 369 */     panel.add(this.button_14);
/* 371 */     this.button_15 = new JButton("3");
/* 372 */     this.button_15.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/* 374 */             calculator.textField.setText(String.valueOf(calculator.textField.getText()) + "3");
/*     */           }
/*     */         });
/* 378 */     this.button_15.setBounds(178, 279, 71, 40);
/* 379 */     panel.add(this.button_15);
/* 381 */     this.button_16 = new JButton("6");
/* 382 */     this.button_16.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/* 384 */             calculator.textField.setText(String.valueOf(calculator.textField.getText()) + "6");
/*     */           }
/*     */         });
/* 388 */     this.button_16.setBounds(178, 226, 71, 40);
/* 389 */     panel.add(this.button_16);
/* 391 */     this.button_17 = new JButton("9");
/* 392 */     this.button_17.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/* 394 */             calculator.textField.setText(String.valueOf(calculator.textField.getText()) + "9");
/*     */           }
/*     */         });
/* 398 */     this.button_17.setBounds(178, 173, 71, 40);
/* 399 */     panel.add(this.button_17);
/* 401 */     this.button_19 = new JButton("-");
/* 402 */     this.button_19.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/* 404 */             calculator.setOperation("-");
/*     */           }
/*     */         });
/* 408 */     this.button_19.setBounds(261, 332, 71, 40);
/* 409 */     panel.add(this.button_19);
/* 411 */     this.button_20 = new JButton("*");
/* 412 */     this.button_20.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/* 414 */             calculator.setOperation("*");
/*     */           }
/*     */         });
/* 418 */     this.button_20.setBounds(261, 279, 71, 40);
/* 419 */     panel.add(this.button_20);
/* 421 */     this.button_21 = new JButton("/");
/* 422 */     this.button_21.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/* 424 */             calculator.setOperation("/");
/*     */           }
/*     */         });
/* 428 */     this.button_21.setBounds(261, 226, 71, 40);
/* 429 */     panel.add(this.button_21);
/* 431 */     this.button_22 = new JButton("+");
/* 432 */     this.button_22.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent arg0) {
/* 434 */             calculator.setOperation("+");
/*     */           }
/*     */         });
/* 438 */     this.button_22.setBounds(261, 173, 71, 40);
/* 439 */     panel.add(this.button_22);
/* 441 */     label = new JLabel("");
/* 442 */     label.setBorder(new BevelBorder(1, null, null, null, null));
/* 443 */     label.setHorizontalTextPosition(0);
/* 444 */     label.setHorizontalAlignment(0);
/* 445 */     label.setForeground(Color.BLACK);
/* 446 */     label.setFont(new Font("Tahoma", 0, 18));
/* 447 */     label.setBackground(Color.DARK_GRAY);
/* 448 */     label.setBounds(12, 66, 320, 40);
/* 449 */     panel.add(label);
/*     */   }
/*     */   
/*     */   public static void setOperation(String s) {
/* 455 */     if (textField.getText().isEmpty()) {
/* 457 */       oper = s;
/* 460 */     } else if (oper.equals("")) {
/* 462 */       num1 = Float.parseFloat(textField.getText());
/* 463 */       oper = s;
/* 464 */       textField.setText("");
/* 466 */     } else if (oper.equals("+")) {
/* 468 */       oper = s;
/* 469 */       num2 = Float.parseFloat(textField.getText());
/* 470 */       num1 += num2;
/* 471 */       textField.setText("");
/* 473 */     } else if (oper.equals("-")) {
/* 475 */       oper = s;
/* 476 */       num2 = Float.parseFloat(textField.getText());
/* 477 */       num1 -= num2;
/* 478 */       textField.setText("");
/* 480 */     } else if (oper.equals("*")) {
/* 482 */       oper = s;
/* 483 */       num2 = Float.parseFloat(textField.getText());
/* 484 */       num1 *= num2;
/* 485 */       textField.setText("");
/* 487 */     } else if (oper.equals("/")) {
/* 489 */       oper = s;
/* 490 */       num2 = Float.parseFloat(textField.getText());
/* 492 */       if (num2 == 0.0F) {
/* 494 */         label.setText("Math Error!");
/* 495 */         num1 = 0.0F;
/*     */       } else {
/* 499 */         num1 /= num2;
/*     */       } 
/* 502 */       textField.setText("");
/*     */     } 
/*     */   }
/*     */   
/*     */   public static String getFieldText() {
/* 512 */     return textField.getText();
/*     */   }
/*     */   
/*     */   public static void setLabelText(String s) {
/* 518 */     label.setText(s);
/*     */   }
/*     */ }