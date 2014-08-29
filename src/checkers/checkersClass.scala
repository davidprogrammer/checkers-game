package checkers

import javafx.application.Application
import javafx.stage.Stage
import javafx.scene.Scene
import javafx.scene.layout.StackPane
import javafx.scene.shape.Rectangle
import javafx.scene.paint.Color
import javafx.scene.layout.VBox
import javafx.scene.control.TextField
import javafx.scene.control.Button
import javafx.event.EventHandler
import javafx.event.ActionEvent
import javafx.scene.layout.HBox
import javafx.scene.shape.Circle

class ScalaJavaFXApp extends Application {
  println("ScalaJavaFXApp constructor")
  def start(stage: Stage): Unit = {
       
    val circ1 = new Circle; val circ2 = new Circle(25); val circ3 = new Circle; val circ4 = new Circle(25); val circ5 = new Circle;
    val circ6 = new Circle(25); val circ7 = new Circle; val circ8 = new Circle(25); val circ9 = new Circle(25); val circ10 = new Circle;
    val circ11 = new Circle(25); val circ12 = new Circle; val circ13 = new Circle(25); val circ14 = new Circle; val circ15 = new Circle(25);
    val circ16 = new Circle; val circ17 = new Circle; val circ18 = new Circle(25); val circ19 = new Circle; val circ20 = new Circle(25);
    val circ21 = new Circle; val circ22 = new Circle(25); val circ23 = new Circle; val circ24 = new Circle(25); val circ25 = new Circle;
    val circ26 = new Circle; val circ27 = new Circle(25); val circ28 = new Circle; val circ29 = new Circle; val circ30 = new Circle;
    val circ31 = new Circle; val circ32 = new Circle; val circ33 = new Circle; val circ34 = new Circle; val circ35 = new Circle;
    val circ36 = new Circle; val circ37 = new Circle; val circ38 = new Circle; val circ39 = new Circle; val circ40 = new Circle;
    val circ41 = new Circle; val circ42 = new Circle; val circ43 = new Circle; val circ44 = new Circle; val circ45 = new Circle;
    val circ46 = new Circle; val circ47 = new Circle; val circ48 = new Circle; val circ49 = new Circle; val circ50 = new Circle;
    val circ51 = new Circle; val circ52 = new Circle; val circ53 = new Circle; val circ54 = new Circle; val circ55 = new Circle;
    val circ56 = new Circle; val circ57 = new Circle; val circ58 = new Circle; val circ59 = new Circle; val circ60 = new Circle;
    val circ61 = new Circle; val circ62 = new Circle; val circ63 = new Circle; val circ64 = new Circle;

    val circlesVector = Vector(circ1, circ2, circ3, circ4, circ5, circ6, circ7, circ8, circ9, circ10, circ11, circ12, circ13, circ14, circ15, circ16,
      circ17, circ18, circ19, circ20, circ21, circ22, circ23, circ24, circ25, circ26, circ27, circ28, circ29, circ30, circ31, circ32, circ33,
      circ34, circ35, circ36, circ37, circ38, circ39, circ40, circ41, circ42, circ43, circ44, circ45, circ46, circ47, circ48, circ49, circ50,
      circ51, circ52, circ53, circ54, circ55, circ56, circ57, circ58, circ59, circ60, circ61, circ62, circ63, circ64)

   // circ2.setFill(Color.BLACK); circ4.setFill(Color.BLACK); circ6.setFill(Color.BLACK); circ8.setFill(Color.BLACK); circ9.setFill(Color.BLACK);
    //circ11.setFill(Color.BLACK); circ13.setFill(Color.BLACK); circ15.setFill(Color.BLACK); circ18.setFill(Color.BLACK);
    //circ20.setFill(Color.BLACK); circ22.setFill(Color.BLACK); circ24.setFill(Color.BLACK);

    println("start " + stage)

    class space(var number: Int, var lineNumber: Int) {
      var numberOfLine = lineNumber
      var spaceNumber = number
      var isTaken = false
      var isTakenByRed = false
      var isTakenByBlack = false
      var isKing = false

    }

    val spaceOne = new space(1, 1); val spaceTwo = new space(2, 1); val spaceThree = new space(3, 1); val spaceFour = new space(4, 1);
    val spaceFive = new space(5, 1); val spaceSix = new space(6, 1); val spaceSeven = new space(7, 1); val spaceEight = new space(8, 1);
    val spaceNine = new space(9, 2); val spaceTen = new space(10, 2); val spaceEleven = new space(11, 2); val spaceTwelve = new space(12, 2);
    val spaceThirteen = new space(13, 2); val spaceFourteen = new space(14, 2); val spaceFifteen = new space(15, 2); val spaceSixteen = new space(16, 3);
    val spaceSeventeen = new space(17, 3); val spaceEighteen = new space(18, 3); val spaceNineteen = new space(19, 3); val spaceTwenty = new space(20, 3);
    val spaceTwentyOne = new space(21, 3); val spaceTwentyTwo = new space(22, 3); val spaceTwentyThree = new space(23, 3); val spaceTwentyFour = new space(24, 4);
    val spaceTwentyFive = new space(25, 4); val spaceTwentySix = new space(26, 4); val spaceTwentySeven = new space(27, 4); val spaceTwentyEight = new space(28, 4);
    val spaceTwentyNine = new space(29, 4); val spaceThirty = new space(30, 4); val spaceThirtyOne = new space(31, 4); val spaceThirtyTwo = new space(32, 5);
    val spaceThirtyThree = new space(33, 5); val spaceThirtyFour = new space(34, 5); val spaceThirtyFive = new space(35, 5); val spaceThirtySix = new space(36, 5);
    val spaceThirtySeven = new space(37, 5); val spaceThirtyEight = new space(38, 5); val spaceThirtyNine = new space(39, 5);
    val spaceForty = new space(40, 6); val spaceFortyOne = new space(41, 6); val spaceFortyTwo = new space(42, 6); val spaceFortyThree = new space(43, 6);
    val spaceFortyFour = new space(44, 6); val spaceFortyFive = new space(45, 6); val spaceFortySix = new space(46, 6); val spaceFortySeven = new space(47, 6);
    val spaceFortyEight = new space(48, 6); val spaceFortyNine = new space(49, 6); val spaceFifty = new space(50, 6); val spaceFiftyOne = new space(51, 6);
    val spaceFiftyTwo = new space(52, 6); val spaceFiftyThree = new space(53, 6); val spaceFiftyFour = new space(54, 6); val spaceFiftyFive = new space(55, 6);
    val spaceFiftySix = new space(56, 6); val spaceFiftySeven = new space(57, 6); val spaceFiftyEight = new space(58, 6); val spaceFiftyNine = new space(59, 6);
    val spaceSixty = new space(60, 6); val spaceSixtyOne = new space(61, 6); val spaceSixtyTwo = new space(6, 26); val spaceSixtyThree = new space(63, 6);
    val spaceSixtyFour = new space(64, 6);

    val spacesVector = Vector(spaceOne, spaceTwo, spaceThree, spaceFour, spaceFive, spaceSix, spaceSeven, spaceEight, spaceNine, spaceTen,
      spaceEleven, spaceTwelve, spaceThirteen, spaceFourteen, spaceFifteen, spaceSixteen, spaceSeventeen, spaceEighteen, spaceNineteen,
      spaceTwenty, spaceTwentyOne, spaceTwentyTwo, spaceTwentyThree, spaceTwentyFour, spaceTwentyFive, spaceTwentySix, spaceTwentySeven,
      spaceTwentyEight, spaceTwentyNine, spaceThirty, spaceThirtyOne, spaceThirtyTwo, spaceThirtyThree, spaceThirtyFour, spaceThirtyFive,
      spaceThirtySix, spaceThirtySeven, spaceThirtyEight, spaceThirtyNine, spaceForty, spaceFortyOne, spaceFortyTwo, spaceFortyThree,
      spaceFortyFour, spaceFortyFive, spaceFortySix, spaceFortySeven, spaceFortyEight, spaceFortyNine, spaceFifty, spaceFiftyOne, spaceFiftyTwo,
      spaceFiftyThree, spaceFiftyFour, spaceFiftyFive, spaceFiftySix, spaceFiftySeven, spaceFiftyEight, spaceFiftyNine, spaceSixty, spaceSixtyOne,
      spaceSixtyTwo, spaceSixtyThree, spaceSixtyFour)

    //spacesVector(32).isTakenByBlack = true;

    spaceTwo.isTakenByBlack = true; spaceFour.isTakenByBlack = true; spaceSix.isTakenByBlack = true; spaceEight.isTakenByBlack = true;
    spaceNine.isTakenByBlack = true; spaceEleven.isTakenByBlack = true; spaceThirteen.isTakenByBlack = true; spaceFifteen.isTakenByBlack = true;
    spaceEighteen.isTakenByBlack = true; spaceTwenty.isTakenByBlack = true; spaceTwentyTwo.isTakenByBlack = true; spaceTwentyFour.isTakenByBlack = true;
   // spaceTwentySeven.isTaken = false
    //spaceTwentySeven.isTakenByBlack=false
    spaceTwentySeven.isTakenByRed=false
    //start new edit

    val aRange = Range(2, 64, 2)

    //end new edit

    var textField1 = new TextField();
    var textField2 = new TextField();
    val textField3 = new TextField();
    var numOne = 0
    var numTwo = 0
    var blackOrWhite = ""

    val buttonTextFields = new Button;
    buttonTextFields.setText("fields")
    buttonTextFields.setOnAction(new EventHandler[ActionEvent]() {
      override def handle(event: ActionEvent): Unit = {
        numOne = (textField1.getText().toInt);
        numTwo = (textField2.getText().toInt);
        blackOrWhite = (textField3.getText());
      }
    })

    val buttonGo = new Button
    buttonGo.setOnAction(new EventHandler[ActionEvent]() {
      override def handle(event: ActionEvent): Unit = {
        if (spacesVector(numOne).isTakenByBlack && spacesVector(numTwo).isTaken == false && (numOne + numTwo == 7 || numOne + numTwo == 9) &&
          spacesVector(numOne).numberOfLine + 1 == spacesVector(numTwo).numberOfLine && spacesVector(numOne).isKing == false) {
          spacesVector(numOne).isTaken == false
          spacesVector(numOne).isTakenByBlack == false
          spacesVector(numTwo).isTakenByBlack == true

        } else if (spacesVector(numOne).isTakenByBlack == true && (spacesVector(numOne + 7).isTakenByRed == true ||
          spacesVector(numOne + 9).isTakenByRed == true) && spacesVector(numTwo).isTaken == false && (spacesVector(numTwo - 14) == spacesVector(numOne)
            || spacesVector(numTwo - 18) == spacesVector(numOne))) {
          spacesVector(numOne).isTaken == false //and they are two lines apart
          spacesVector(numTwo).isTakenByBlack == true
          if (spacesVector(numOne) == spacesVector(numTwo - 14)) {
            spacesVector(numOne + 7).isTaken == false
            spacesVector(numOne + 7).isTakenByRed == false
          } else if (spacesVector(numOne) == spacesVector(numTwo - 18)) {
            spacesVector(numOne + 9).isTaken == false
            spacesVector(numOne + 9).isTakenByRed == false
          }

        }
        //  else if (spacesVector(numOne).isKing == true && spacesVector(numOne).isTakenByBlack && spacesVector(numTwo).isTaken == false && (numOne + numTwo = 7 || numOne + numTwo = 9) &&
        //      spacesVector(numOne).numberOfLine + 1 = spacesVector(numTwo).numberOfLine && spacesVector(numOne).isKing == false)
        // }
      }
      val aRange = Range(2, 64, 2)
      for (x <- aRange) {
      if (spacesVector(x).isTakenByBlack) {
        circlesVector(x).setFill(Color.BLACK)
      } else if (spacesVector(x).isTakenByRed) {
        circlesVector(x).setFill(Color.RED)
      } else {
        circlesVector(x).setFill(Color.GREY)
      }
    }
    })

    for (x <- aRange) {
      if (spacesVector(x).isTakenByBlack) {
        circlesVector(x).setFill(Color.BLACK)
      } else if (spacesVector(x).isTakenByRed) {
        circlesVector(x).setFill(Color.RED)
      } else {
        circlesVector(x).setFill(Color.GREY)
      }
    }

    //    if(spaceTwo.isTakenByBlack == true){
    //      circ2.setFill(Color.BLACK)
    //    }
    //    if(spaceThirty.isTakenByBlack == true){
    //      circ30.setFill(Color.BLACK)
    //    }

    val rectOne = new Rectangle(0, 0, 50, 50); val rectTwo = new Rectangle(0, 0, 50, 50); val rectThree = new Rectangle(0, 0, 50, 50)
    val rectFour = new Rectangle(0, 0, 50, 50); val rectFive = new Rectangle(0, 0, 50, 50); val rectSix = new Rectangle(0, 0, 50, 50)
    val rectSeven = new Rectangle(0, 0, 50, 50); val rectEight = new Rectangle(0, 0, 50, 50); val rectNine = new Rectangle(0, 0, 50, 50)
    val rectTen = new Rectangle(0, 0, 50, 50); val rectEleven = new Rectangle(0, 0, 50, 50); val rectTwelve = new Rectangle(0, 0, 50, 50)
    val rectThirteen = new Rectangle(0, 0, 50, 50); val rectFourteen = new Rectangle(0, 0, 50, 50); val rectFifteen = new Rectangle(0, 0, 50, 50)
    val rectSixteen = new Rectangle(0, 0, 50, 50); val rectSeventeen = new Rectangle(0, 0, 50, 50); val rectEighteen = new Rectangle(0, 0, 50, 50)
    val rectNineteen = new Rectangle(0, 0, 50, 50); val rectTwenty = new Rectangle(0, 0, 50, 50); val rectTwentyOne = new Rectangle(0, 0, 50, 50)
    val rectTwentyTwo = new Rectangle(0, 0, 50, 50); val rectTwentyThree = new Rectangle(0, 0, 50, 50); val rectTwentyFour = new Rectangle(0, 0, 50, 50)
    val rectTwentyFive = new Rectangle(0, 0, 50, 50); val rectTwentySix = new Rectangle(0, 0, 50, 50); val rectTwentySeven = new Rectangle(0, 0, 50, 50)
    val rectTwentyEight = new Rectangle(0, 0, 50, 50); val rectTwentyNine = new Rectangle(0, 0, 50, 50); val rectThirty = new Rectangle(0, 0, 50, 50)
    val rectThirtyOne = new Rectangle(0, 0, 50, 50); val rectThirtyTwo = new Rectangle(0, 0, 50, 50); val rectThirtyThree = new Rectangle(0, 0, 50, 50)
    val rectThirtyFour = new Rectangle(0, 0, 50, 50); val rectThirtyFive = new Rectangle(0, 0, 50, 50); val rectThirtySix = new Rectangle(0, 0, 50, 50)
    val rectThirtySeven = new Rectangle(0, 0, 50, 50); val rectThirtyEight = new Rectangle(0, 0, 50, 50); val rectThirtyNine = new Rectangle(0, 0, 50, 50)
    val rectForty = new Rectangle(0, 0, 50, 50); val rectFortyOne = new Rectangle(0, 0, 50, 50); val rectFortyTwo = new Rectangle(0, 0, 50, 50)
    val rectFortyThree = new Rectangle(0, 0, 50, 50); val rectFortyFour = new Rectangle(0, 0, 50, 50); val rectFortyFive = new Rectangle(0, 0, 50, 50)
    val rectFortySix = new Rectangle(0, 0, 50, 50); val rectFortySeven = new Rectangle(0, 0, 50, 50); val rectFortyEight = new Rectangle(0, 0, 50, 50)
    val rectFortyNine = new Rectangle(0, 0, 50, 50); val rectFifty = new Rectangle(0, 0, 50, 50); val rectFiftyOne = new Rectangle(0, 0, 50, 50)
    val rectFiftyTwo = new Rectangle(0, 0, 50, 50); val rectFiftyThree = new Rectangle(0, 0, 50, 50); val rectFiftyFour = new Rectangle(0, 0, 50, 50)
    val rectFiftyFive = new Rectangle(0, 0, 50, 50); val rectFiftySix = new Rectangle(0, 0, 50, 50); val rectFiftySeven = new Rectangle(0, 0, 50, 50)
    val rectFiftyEight = new Rectangle(0, 0, 50, 50); val rectFiftyNine = new Rectangle(0, 0, 50, 50); val rectSixty = new Rectangle(0, 0, 50, 50)
    val rectSixtyOne = new Rectangle(0, 0, 50, 50); val rectSixtyTwo = new Rectangle(0, 0, 50, 50); val rectSixtyThree = new Rectangle(0, 0, 50, 50)
    val rectSixtyFour = new Rectangle(0, 0, 50, 50)

    rectOne.setFill(Color.WHITE); rectTwo.setFill(Color.GREY); rectThree.setFill(Color.WHITE); rectFour.setFill(Color.GREY)
    rectFive.setFill(Color.WHITE); rectSix.setFill(Color.GREY); rectSeven.setFill(Color.WHITE); rectEight.setFill(Color.GREY)
    rectNine.setFill(Color.GREY); rectTen.setFill(Color.WHITE); rectEleven.setFill(Color.GREY); rectTwelve.setFill(Color.WHITE)
    rectThirteen.setFill(Color.GREY); rectFourteen.setFill(Color.WHITE); rectFifteen.setFill(Color.GREY); rectSixteen.setFill(Color.WHITE)
    rectSeventeen.setFill(Color.WHITE); rectEighteen.setFill(Color.GREY); rectNineteen.setFill(Color.WHITE); rectTwenty.setFill(Color.GREY)
    rectTwentyOne.setFill(Color.WHITE); rectTwentyTwo.setFill(Color.GREY); rectTwentyThree.setFill(Color.WHITE); rectTwentyFour.setFill(Color.GREY)
    rectTwentyFive.setFill(Color.GREY); rectTwentySix.setFill(Color.WHITE); rectTwentySeven.setFill(Color.GREY); rectTwentyEight.setFill(Color.WHITE)
    rectTwentyNine.setFill(Color.GREY); rectThirty.setFill(Color.WHITE); rectThirtyOne.setFill(Color.GREY); rectThirtyTwo.setFill(Color.WHITE)
    rectThirtyThree.setFill(Color.WHITE); rectThirtyFour.setFill(Color.GREY); rectThirtyFive.setFill(Color.WHITE); rectThirtySix.setFill(Color.GREY)
    rectThirtySeven.setFill(Color.WHITE); rectThirtyEight.setFill(Color.GREY); rectThirtyNine.setFill(Color.WHITE); rectForty.setFill(Color.GREY)
    rectFortyOne.setFill(Color.GREY); rectFortyTwo.setFill(Color.WHITE); rectFortyThree.setFill(Color.GREY); rectFortyFour.setFill(Color.WHITE)
    rectFortyFive.setFill(Color.GREY); rectFortySix.setFill(Color.WHITE); rectFortySeven.setFill(Color.GREY); rectFortyEight.setFill(Color.WHITE)
    rectFortyNine.setFill(Color.WHITE); rectFifty.setFill(Color.GREY); rectFiftyOne.setFill(Color.WHITE); rectFiftyTwo.setFill(Color.GREY)
    rectFiftyThree.setFill(Color.WHITE); rectFiftyFour.setFill(Color.GREY); rectFiftyFive.setFill(Color.WHITE); rectFiftySix.setFill(Color.GREY)
    rectFiftySeven.setFill(Color.GREY); rectFiftyEight.setFill(Color.WHITE); rectFiftyNine.setFill(Color.GREY); rectSixty.setFill(Color.WHITE)
    rectSixtyOne.setFill(Color.GREY); rectSixtyTwo.setFill(Color.WHITE); rectSixtyThree.setFill(Color.GREY); rectSixtyFour.setFill(Color.WHITE);

   
    val hboxLine1 = new HBox;
    val hbox1 = new HBox;
    val hbox2 = new HBox;
    val hbox3 = new HBox;
    val hbox4 = new HBox;
    val hbox5 = new HBox;
    val hbox6 = new HBox;
    val hbox7 = new HBox;
    val hbox8 = new HBox;
    val hbox9 = new HBox;
    val vbox = new VBox;


    val stackVect = Vector(new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,
        new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane,new StackPane);
    
    

    stackVect(0).getChildren().addAll(rectOne, circ1); stackVect(1).getChildren().addAll(rectTwo, circlesVector(2)); stackVect(2).getChildren().addAll(rectThree, circ3);
    stackVect(3).getChildren().addAll(rectFour, circ4); stackVect(4).getChildren().addAll(rectFive, circ5); stackVect(5).getChildren().addAll(rectSix, circ6);
    stackVect(6).getChildren().addAll(rectSeven, circ7); stackVect(7).getChildren().addAll(rectEight, circ8); stackVect(8).getChildren().addAll(rectNine, circ9);
    stackVect(9).getChildren().addAll(rectTen, circ10); stackVect(10).getChildren().addAll(rectEleven, circ11); stackVect(11).getChildren().addAll(rectTwelve, circ12);
    stackVect(12).getChildren().addAll(rectThirteen, circ13); stackVect(13).getChildren().addAll(rectFourteen, circ14); stackVect(14).getChildren().addAll(rectFifteen, circ15);
    stackVect(15).getChildren().addAll(rectSixteen, circ16); stackVect(16).getChildren().addAll(rectSeventeen, circ17); stackVect(17).getChildren().addAll(rectEighteen, circ18);
    stackVect(18).getChildren().addAll(rectNineteen, circ19); stackVect(19).getChildren().addAll(rectTwenty, circ20); stackVect(20).getChildren().addAll(rectTwentyOne, circ21);
    stackVect(21).getChildren().addAll(rectTwentyTwo, circ22); stackVect(22).getChildren().addAll(rectTwentyThree, circ23); stackVect(23).getChildren().addAll(rectTwentyFour, circ24);
    stackVect(24).getChildren().addAll(rectTwentyFive, circ25); stackVect(25).getChildren().addAll(rectTwentySix, circ26); stackVect(26).getChildren().addAll(rectTwentySeven, circ27);
    stackVect(27).getChildren().addAll(rectTwentyEight, circ28); stackVect(28).getChildren().addAll(rectTwentyNine, circ29); stackVect(29).getChildren().addAll(rectThirty, circ30);
    stackVect(30).getChildren().addAll(rectThirtyOne, circ31); stackVect(31).getChildren().addAll(rectThirtyTwo, circ32); stackVect(32).getChildren().addAll(rectThirtyThree, circ33);
    stackVect(33).getChildren().addAll(rectThirtyFour, circ34); stackVect(34).getChildren().addAll(rectThirtyFive, circ35); stackVect(35).getChildren().addAll(rectThirtySix, circ36);
    stackVect(36).getChildren().addAll(rectThirtySeven, circ37); stackVect(37).getChildren().addAll(rectThirtyEight, circ38); stackVect(38).getChildren().addAll(rectThirtyNine, circ39);
    stackVect(39).getChildren().addAll(rectForty, circ40); stackVect(40).getChildren().addAll(rectFortyOne, circ41); stackVect(41).getChildren().addAll(rectFortyTwo, circ42);
    stackVect(42).getChildren().addAll(rectFortyThree, circ43); stackVect(43).getChildren().addAll(rectFortyFour, circ34); stackVect(44).getChildren().addAll(rectFortyFive, circ45);
    stackVect(45).getChildren().addAll(rectFortySix, circ46); stackVect(46).getChildren().addAll(rectFortySeven, circ47); stackVect(47).getChildren().addAll(rectFortyEight, circ48);
    stackVect(48).getChildren().addAll(rectFortyNine, circ49); stackVect(49).getChildren().addAll(rectFifty, circ50); stackVect(50).getChildren().addAll(rectFiftyOne, circ51);
    stackVect(51).getChildren().addAll(rectFiftyTwo, circ52); stackVect(52).getChildren().addAll(rectFiftyThree, circ53); stackVect(53).getChildren().addAll(rectFiftyFour, circ54);
    stackVect(54).getChildren().addAll(rectFiftyFive, circ55); stackVect(55).getChildren().addAll(rectFiftySix, circ56); stackVect(56).getChildren().addAll(rectFiftySeven, circ57);
    stackVect(57).getChildren().addAll(rectFiftyEight, circ58); stackVect(58).getChildren().addAll(rectFiftyNine, circ59); stackVect(59).getChildren().addAll(rectSixty, circ60);
    stackVect(60).getChildren().addAll(rectSixtyOne, circ61); stackVect(61).getChildren().addAll(rectSixtyTwo, circ62); stackVect(62).getChildren().addAll(rectSixtyThree, circ63);
    stackVect(63).getChildren().addAll(rectSixtyFour, circ64);

    // root.getChildren().add(rectOne);
    hbox1.getChildren().addAll(stackVect(0),stackVect(1),stackVect(2),stackVect(3),stackVect(4),stackVect(5),stackVect(6),stackVect(7))
    hbox2.getChildren().addAll(stackVect(8),stackVect(9),stackVect(10),stackVect(11),stackVect(12),stackVect(13),stackVect(14),stackVect(15))
    hbox3.getChildren().addAll(stackVect(16),stackVect(17),stackVect(18),stackVect(19),stackVect(20),stackVect(21),stackVect(22),stackVect(23))
    hbox4.getChildren().addAll(stackVect(24),stackVect(25),stackVect(26),stackVect(27),stackVect(28),stackVect(29),stackVect(30),stackVect(31))
    hbox5.getChildren().addAll(stackVect(32),stackVect(33),stackVect(34),stackVect(35),stackVect(36),stackVect(37),stackVect(38),stackVect(39))
    hbox6.getChildren().addAll(stackVect(40),stackVect(41),stackVect(42),stackVect(43),stackVect(44),stackVect(45),stackVect(46),stackVect(47))
    hbox7.getChildren().addAll(stackVect(48),stackVect(49),stackVect(50),stackVect(51),stackVect(52),stackVect(53),stackVect(54),stackVect(55))
    hbox8.getChildren().addAll(stackVect(56),stackVect(57),stackVect(58),stackVect(59),stackVect(60),stackVect(61),stackVect(62),stackVect(63))
    hbox9.getChildren().addAll(buttonGo, buttonTextFields, textField1, textField2, textField3)
    vbox.getChildren().addAll(hbox1, hbox2, hbox3, hbox4, hbox5, hbox6, hbox7, hbox8, hbox9)
    stage.setScene(new Scene(vbox, 500, 500));
    stage.show();

    //    val stack = new StackPane();
    //     stack.getChildren().addAll(new Rectangle(100,100,Color.BLUE), new Circle(50, Color.GREEN));
    //     stage.setScene(new Scene(stack,100, 100));
    //    stage.show();
    
    
    // }
    //})
  }
      
      
}

object ScalaJavaFXApp {
  def main(args: Array[String]): Unit = {
    println("Launching ScalaJavaFXApp")
    Application.launch(classOf[ScalaJavaFXApp], args: _*)
  }
}