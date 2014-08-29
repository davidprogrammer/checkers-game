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

    
    val stack1 = new StackPane(); val stack2 = new StackPane(); val stack3 = new StackPane(); val stack4 = new StackPane();
    val stack5 = new StackPane(); val stack6 = new StackPane(); val stack7 = new StackPane(); val stack8 = new StackPane();
    val stack9 = new StackPane(); val stack10 = new StackPane(); val stack11 = new StackPane(); val stack12 = new StackPane();
    val stack13 = new StackPane(); val stack14 = new StackPane(); val stack15 = new StackPane(); val stack16 = new StackPane();
    val stack17 = new StackPane(); val stack18 = new StackPane(); val stack19 = new StackPane(); val stack20 = new StackPane();
    val stack21 = new StackPane(); val stack22 = new StackPane(); val stack23 = new StackPane(); val stack24 = new StackPane();
    val stack25 = new StackPane(); val stack26 = new StackPane(); val stack27 = new StackPane(); val stack28 = new StackPane();
    val stack29 = new StackPane(); val stack30 = new StackPane(); val stack31 = new StackPane(); val stack32 = new StackPane();
    val stack33 = new StackPane(); val stack34 = new StackPane(); val stack35 = new StackPane(); val stack36 = new StackPane();
    val stack37 = new StackPane(); val stack38 = new StackPane(); val stack39 = new StackPane(); val stack40 = new StackPane();
    val stack41 = new StackPane(); val stack42 = new StackPane(); val stack43 = new StackPane(); val stack44 = new StackPane();
    val stack45 = new StackPane(); val stack46 = new StackPane(); val stack47 = new StackPane(); val stack48 = new StackPane();
    val stack49 = new StackPane(); val stack50 = new StackPane(); val stack51 = new StackPane(); val stack52 = new StackPane();
    val stack53 = new StackPane(); val stack54 = new StackPane(); val stack55 = new StackPane(); val stack56 = new StackPane();
    val stack57 = new StackPane(); val stack58 = new StackPane(); val stack59 = new StackPane(); val stack60 = new StackPane();
    val stack61 = new StackPane(); val stack62 = new StackPane(); val stack63 = new StackPane(); val stack64 = new StackPane();

    val stackVect = Vector(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8, stack9, stack10, stack11,
      stack12, stack13, stack14, stack15, stack16, stack17, stack18, stack19, stack20, stack21, stack22, stack23, stack24,
      stack25, stack26, stack27, stack28, stack29, stack30, stack31, stack32, stack33, stack34, stack35, stack36, stack37, stack38,
      stack39, stack40, stack41, stack42, stack43, stack44, stack45, stack46, stack47, stack48, stack49, stack50, stack51, stack52,
      stack53, stack54, stack55, stack56, stack57, stack58, stack59, stack60, stack61, stack62, stack63, stack64);

    stack1.getChildren().addAll(rectOne, circ1); stack2.getChildren().addAll(rectTwo, circlesVector(2)); stack3.getChildren().addAll(rectThree, circ3);
    stack4.getChildren().addAll(rectFour, circ4); stack5.getChildren().addAll(rectFive, circ5); stack6.getChildren().addAll(rectSix, circ6);
    stack7.getChildren().addAll(rectSeven, circ7); stack8.getChildren().addAll(rectEight, circ8); stack9.getChildren().addAll(rectNine, circ9);
    stack10.getChildren().addAll(rectTen, circ10); stack11.getChildren().addAll(rectEleven, circ11); stack12.getChildren().addAll(rectTwelve, circ12);
    stack13.getChildren().addAll(rectThirteen, circ13); stack14.getChildren().addAll(rectFourteen, circ14); stack15.getChildren().addAll(rectFifteen, circ15);
    stack16.getChildren().addAll(rectSixteen, circ16); stack17.getChildren().addAll(rectSeventeen, circ17); stack18.getChildren().addAll(rectEighteen, circ18);
    stack19.getChildren().addAll(rectNineteen, circ19); stack20.getChildren().addAll(rectTwenty, circ20); stack21.getChildren().addAll(rectTwentyOne, circ21);
    stack22.getChildren().addAll(rectTwentyTwo, circ22); stack23.getChildren().addAll(rectTwentyThree, circ23); stack24.getChildren().addAll(rectTwentyFour, circ24);
    stack25.getChildren().addAll(rectTwentyFive, circ25); stack26.getChildren().addAll(rectTwentySix, circ26); stack27.getChildren().addAll(rectTwentySeven, circ27);
    stack28.getChildren().addAll(rectTwentyEight, circ28); stack29.getChildren().addAll(rectTwentyNine, circ29); stack30.getChildren().addAll(rectThirty, circ30);
    stack31.getChildren().addAll(rectThirtyOne, circ31); stack32.getChildren().addAll(rectThirtyTwo, circ32); stack33.getChildren().addAll(rectThirtyThree, circ33);
    stack34.getChildren().addAll(rectThirtyFour, circ34); stack35.getChildren().addAll(rectThirtyFive, circ35); stack36.getChildren().addAll(rectThirtySix, circ36);
    stack37.getChildren().addAll(rectThirtySeven, circ37); stack38.getChildren().addAll(rectThirtyEight, circ38); stack39.getChildren().addAll(rectThirtyNine, circ39);
    stack40.getChildren().addAll(rectForty, circ40); stack41.getChildren().addAll(rectFortyOne, circ41); stack42.getChildren().addAll(rectFortyTwo, circ42);
    stack43.getChildren().addAll(rectFortyThree, circ43); stack44.getChildren().addAll(rectFortyFour, circ34); stack45.getChildren().addAll(rectFortyFive, circ45);
    stack46.getChildren().addAll(rectFortySix, circ46); stack47.getChildren().addAll(rectFortySeven, circ47); stack48.getChildren().addAll(rectFortyEight, circ48);
    stack49.getChildren().addAll(rectFortyNine, circ49); stack50.getChildren().addAll(rectFifty, circ50); stack51.getChildren().addAll(rectFiftyOne, circ51);
    stack52.getChildren().addAll(rectFiftyTwo, circ52); stack53.getChildren().addAll(rectFiftyThree, circ53); stack54.getChildren().addAll(rectFiftyFour, circ54);
    stack55.getChildren().addAll(rectFiftyFive, circ55); stack56.getChildren().addAll(rectFiftySix, circ56); stack57.getChildren().addAll(rectFiftySeven, circ57);
    stack58.getChildren().addAll(rectFiftyEight, circ58); stack59.getChildren().addAll(rectFiftyNine, circ59); stack60.getChildren().addAll(rectSixty, circ60);
    stack61.getChildren().addAll(rectSixtyOne, circ61); stack62.getChildren().addAll(rectSixtyTwo, circ62); stack63.getChildren().addAll(rectSixtyThree, circ63);
    stack64.getChildren().addAll(rectSixtyFour, circ64);

    // root.getChildren().add(rectOne);
    hbox1.getChildren().addAll(stack1, stack2, stack3, stack4, stack5, stack6, stack7, stack8)
    hbox2.getChildren().addAll(stack9, stack10, stack11, stack12, stack13, stack14, stack15, stack16)
    hbox3.getChildren().addAll(stack17, stack18, stack19, stack20, stack21, stack22, stack23, stack24)
    hbox4.getChildren().addAll(stack25, stack26, stack27, stack28, stack29, stack30, stack31, stack32)
    hbox5.getChildren().addAll(stack33, stack34, stack35, stack36, stack37, stack38, stack39, stack40)
    hbox6.getChildren().addAll(stack41, stack42, stack43, stack44, stack45, stack46, stack47, stack48)
    hbox7.getChildren().addAll(stack49, stack50, stack51, stack52, stack53, stack54, stack55, stack56)
    hbox8.getChildren().addAll(stack57, stack58, stack59, stack60, stack61, stack62, stack63, stack64)
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