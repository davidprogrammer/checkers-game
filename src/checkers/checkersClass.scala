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

class ScalaJavaFXApp extends Application {
  println("ScalaJavaFXApp constructor")
  def start(stage : Stage) : Unit = {
    println("start " + stage)

    class space(var number : Int, var lineNumber : Int) {
      var numberOfLine = lineNumber
      var spaceNumber = number
      var isTaken = false
      var isTakenByWhite = false
      var isTakenByBlack = false
      var isKing = false
       
    }
    
    val spaceOne = new space(1,1);val spaceTwo = new space(2,1);val spaceThree = new space(3,1);val spaceFour = new space(4,1);
    val spaceFive = new space(5,1);
    val spaceSix = new space(6,1)
    val spaceSeven = new space(7,1)
    val spaceEight= new space(8,1)
    val spaceNine = new space(9,2)
    val spaceTen = new space(10,2)
    val spaceEleven = new space(11,2)
    val spaceTwelve = new space(12,2)
    val spaceThirteen = new space(13,2)
    val spaceFourteen = new space(14,2)
    val spaceFifteen = new space(15,2)
    val spaceSixteen = new space(16,3)
    val spaceSeventeen = new space(17,3)
    val spaceEighteen = new space(18,3)
    val spaceNineteen = new space(19,3)
    val spaceTwenty = new space(20,3)
    val spaceTwentyOne = new space(21,3)
    val spaceTwentyTwo = new space(22,3)
    val spaceTwentyThree = new space(23,3)
    val spaceTwentyFour = new space(24,4)
    val spaceTwentyFive = new space(25,4)
    val spaceTwentySix = new space(26,4)
    val spaceTwentySeven = new space(27,4)
    val spaceTwentyEight = new space(28,4)
    val spaceTwentyNine = new space(29,4)
    val spaceThirty = new space(30,4)
    val spaceThirtyOne = new space(31,4)
    val spaceThirtyTwo = new space(32,5)
    val spaceThirtyThree = new space(33,5)
    val spaceThirtyFour = new space(34,5)
    val spaceThirtyFive = new space(35,5)
    val spaceThirtySix = new space(36,5)
    val spaceThirtySeven= new space(37,5)
    val spaceThirtyEight = new space(38,5)
    val spaceThirtyNine = new space(39,5)
    val spaceForty = new space(40,6)
    
    
    val spacesVector = Vector(spaceOne,spaceTwo, spaceThree)
    
    
    var textField1 = new TextField();
    var textField2 = new TextField();
    val textField3 = new TextField();
    
    val numOne =(textField1.getText().toInt);
    val numTwo =(textField2.getText().toInt);
    var blackOrWhite = textField3.getText
    val buttonGo = new Button
    
    buttonGo.setOnAction(new EventHandler[ActionEvent]() {
      override def handle(event: ActionEvent): Unit = {
        if(spacesVector(numOne).isTakenByBlack && spacesVector(numTwo).isTaken == false && (numOne + numTwo = 7 || numOne + numTwo = 9) &&
            spacesVector(numOne).numberOfLine + 1 = spacesVector(numTwo).numberOfLine && spacesVector(numOne).isKing == false){
          spacesVector(numOne).isTaken == false
          spacesVector(numOne).isTakenByBlack == false
          spacesVector(numTwo).isTakenByBlack == true
          
        }
        else if (spacesVector(numOne).isTakenByBlack == true && (spacesVector(numOne+7).isTakenByWhite == true || 
            spacesVector(numOne + 9).isTakenByWhite= true) && spacesVector(numTwo).isTaken == false && (spacesVector(numTwo-14)=spacesVector(numOne)
            || spacesVector(numTwo - 18)= spacesVector(numOne))){spacesVector(numOne).isTaken == false
          spacesVector(numTwo).isTakenByBlack == true
          if(spacesVector(numOne) = spacesVector(numTwo - 14)){
            spacesVector(numOne + 7).isTaken == false
            spacesVector(numOne + 7).isTakenByWhite == false
          }
          else if(spacesVector(numOne) = spacesVector(numTwo - 18)){
            spacesVector(numOne + 9).isTaken == false
            spacesVector(numOne + 9).isTakenByWhite == false
          }
          
        }
//        else if (spacesVector(numOne).isKing == true && spacesVector(numOne).isTakenByBlack && spacesVector(numTwo).isTaken == false && (numOne + numTwo = 7 || numOne + numTwo = 9) &&
//            spacesVector(numOne).numberOfLine + 1 = spacesVector(numTwo).numberOfLine && spacesVector(numOne).isKing == false)
//      }
    }})
    
    val rectOne = new Rectangle(0, 0, 50, 50);val rectTwo = new Rectangle(0,0,50,50);val rectThree = new Rectangle(0,0,50,50)
     val rectFour = new Rectangle(0,0,50,50); val rectFive = new Rectangle(0,0,50,50); val rectSix = new Rectangle(0,0,50,50) 
    val rectSeven = new Rectangle(0,0,50,50);val rectEoght = new Rectangle(0,0,50,50); val rectNine = new Rectangle(0,0,50,50) 
    val rectTen = new Rectangle(0,0,50,50); val rectEleven = new Rectangle(0,0,50,50); val rectTwelve = new Rectangle(0,0,50,50)
     val rectThirteen = new Rectangle(0,0,50,50); val rectFourteen = new Rectangle(0,0,50,50); val rectFifteen = new Rectangle(0,0,50,50)
     val rectSixteen = new Rectangle(0,0,50,50;) val rectSeventeen = new Rectangle(0,0,50,50); val rectEighteen = new Rectangle(0,0,50,50)
     val rectNineteen = new Rectangle(0,0,50,50); val rectTwenty = new Rectangle(0,0,50,50); val rectTwentyOne = new Rectangle(0,0,50,50)
     val rectTwentyTwo = new Rectangle(0,0,50,50); val rectTwentyThree = new Rectangle(0,0,50,50); val rectTwentyFour = new Rectangle(0,0,50,50)
     val rectTwentyFive = new Rectangle(0,0,50,50); val rectTwentySix = new Rectangle(0,0,50,50); val rectTwentySeven = new Rectangle(0,0,50,50)
     val rectTwentyEight = new Rectangle(0,0,50,50); val rectTwentyNine = new Rectangle(0,0,50,50); val rectThirty = new Rectangle(0,0,50,50)
     val rectThirtyOne = new Rectangle(0,0,50,50); val rectThirtyTwo = new Rectangle(0,0,50,50); val rectThirtyThree= new Rectangle(0,0,50,50)
     val rectThirtyFour = new Rectangle(0,0,50,50); val rectThirtyFive = new Rectangle(0,0,50,50); val rectThirtySix= new Rectangle(0,0,50,50)
     val rectThirtySeven = new Rectangle(0,0,50,50); val rectThirtyEight = new Rectangle(0,0,50,50); val rectThirtyNine = new Rectangle(0,0,50,50)
     val rectForty = new Rectangle(0,0,50,50); val rectFortyOne = new Rectangle(0,0,50,50); val rectFortyTwo = new Rectangle(0,0,50,50)
     val rectFortyThree = new Rectangle(0,0,50,50); val rectFortyFour = new Rectangle(0,0,50,50); val rectFortyFive = new Rectangle(0,0,50,50)
     val rectFortySix = new Rectangle(0,0,50,50); val rectFortySeven = new Rectangle(0,0,50,50); val rectFortyEight = new Rectangle(0,0,50,50)
     val rectFortyNine= new Rectangle(0,0,50,50); val rectFifty = new Rectangle(0,0,50,50); val rectFiftyOne = new Rectangle(0,0,50,50)
     val rectFiftyTwo = new Rectangle(0,0,50,50) ;val rectFiftyThree = new Rectangle(0,0,50,50); val rectFiftyFour = new Rectangle(0,0,50,50)
     val rectFiftyFive = new Rectangle(0,0,50,50); val rectFiftySix = new Rectangle(0,0,50,50); val rectFiftySeven = new Rectangle(0,0,50,50)
     val rectFiftyEight = new Rectangle(0,0,50,50); val rectFiftyNine = new Rectangle(0,0,50,50); val rectSixty = new Rectangle(0,0,50,50)
     val rectSixtyOne = new Rectangle(0,0,50,50); val rectSixtyTwo = new Rectangle(0,0,50,50); val rectSixtyThree= new Rectangle(0,0,50,50)
     val rectSixtyFour = new Rectangle(0,0,50,50)
    
     rectOne.setFill(Color.WHITE);rectTwo.setFill(Color.GREY);rectThree.setFill(Color.WHITE);rectFour.setFill(Color.GREY)
     rectFive.setFill(Color.WHITE);rectSix.setFill(Color.GREY);rectSeven.setFill(Color.WHITE);rectEight.setFill(Color.GREY)
     rectNine.setFill(Color.WHITE);rectTen.setFill(Color.GREY);rectEleven.setFill(Color.WHITE);rectTwelve.setFill(Color.GREY)
     rectThirteen.setFill(Color.WHITE);rectFourteen.setFill(Color.GREY);rectFifteen.setFill(Color.WHITE);rectSixteen.setFill(Color.GREY)
     rectSeventeen.setFill(Color.WHITE);rectEighteen.setFill(Color.GREY);rectNineteen.setFill(Color.WHITE);rectTwenty.setFill(Color.GREY)
     rectTwentyOne.setFill(Color.WHITE);rectTwentyTwo.setFill(Color.GREY);rectTwentyThree.setFill(Color.WHITE);rectTwentyFour.setFill(Color.GREY)
     rectTwentyFive.setFill(Color.WHITE);rectTwentySix.setFill(Color.GREY);rectTwentySeven.setFill(Color.WHITE);rectTwentyEight.setFill(Color.GREY)
     rectTwentyNine.setFill(Color.WHITE);rectThirty.setFill(Color.GREY);rectThirtyOne.setFill(Color.WHITE);rectThirtyTwo.setFill(Color.GREY)
     rectThirtyThree.setFill(Color.WHITE);rectThirtyFour.setFill(Color.GREY);rectThirtyFive.setFill(Color.WHITE);rectThirtySix.setFill(Color.GREY)
     rectThirtySeven.setFill(Color.WHITE);rectThirtyEight.setFill(Color.GREY);rectThirtyNine.setFill(Color.WHITE);rectForty.setFill(Color.GREY)
     rectFortyOne.setFill(Color.WHITE);rectFortyTwo.setFill(Color.GREY);rectFortyThree.setFill(Color.WHITE);rectFortyFour.setFill(Color.GREY)
     rectFortyFive.setFill(Color.WHITE);rectFortySix.setFill(Color.GREY);rectFortySeven.setFill(Color.WHITE);rectFortyEight.setFill(Color.GREY
     rectFortyNine.setFill(Color.WHITE); rectFifty.setFill(Color.GREY); rectFiftyOne.setFill(Color.WHITE); rectFiftyTwo.setFill(Color.GREY)
     rectFiftyThree.setFill(Color.WHITE); rectFiftyFour.setFill(Color.GREY); rectFiftyFive.setFill(Color.WHITE); rectFiftySix.setFill(Color.GREY)
     rectFiftySeven.setFill(Color.WHITE); rectFiftyEight.setFill(Color.GREY); rectFiftyNine.setFill(Color.WHITE); rectSixty.setFill(Color.GREY)
     rectSixtyOne.setFill(Color.WHITE);rectSixtyTwo.setFill(Color.WHITE);rectSixtyThree.setFill(Color.WHITE);rectSixtyFour.setFill(Color.WHITE);
     
     val vbox1 = new VBox(8);
     
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
     
     hboxLine1.getChildren().addAll(rectOne, rectTwo, rectThree, rectFour, rectFive, rectSix, rectSeven, rectEight)
     
    //vbox.getChildren().addAll(rectOne)
    
     val root = new StackPane();
    root.getChildren().add(vbox);
    stage.setScene(new Scene(root, 800, 800));
    stage.show();
  }
}


object ScalaJavaFXApp {
  def main(args : Array[String]) : Unit = {
    println("Launching ScalaJavaFXApp")
    Application.launch(classOf[ScalaJavaFXApp], args : _*)
  }
}